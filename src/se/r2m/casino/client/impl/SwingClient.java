package se.r2m.casino.client.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import se.r2m.casino.AccountCredentials;
import se.r2m.casino.BetResult;
import se.r2m.casino.client.CasinoClient;

public class SwingClient extends JFrame {
	
	private static final long serialVersionUID = 5362384697706830544L;

	private static CasinoClient casinoClient = new EmptyCasinoClient();
	
	private JLabel result = new JLabel("Pick a Number");
	
    public SwingClient(CasinoClient client) {
    	
       setTitle("Casino Client");
       setSize(800, 260);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       JPanel panel = new JPanel();
       panel.setLayout(new GridBagLayout());
       this.add(panel);
       
       result.setBackground(Color.RED);
       result.setSize(new Dimension(1000, 1000));
    
       GridBagConstraints c = new GridBagConstraints();
       //c.weightx = 1;
       c.gridwidth = 5;
       c.fill = GridBagConstraints.HORIZONTAL;
       c.gridx = 0;
       c.gridy = 0;
       c.ipadx = 60;
       panel.add(result, c);

       for (int i = 1; i<=35; i++) {
           JButton b = new JButton(" " + i + " ");
           b.setVerticalTextPosition(AbstractButton.CENTER);
           b.setHorizontalTextPosition(AbstractButton.LEADING);
           b.setPreferredSize(new Dimension(700, 30));
           c.gridwidth = 1;
           c.gridx = ((i-1) % 5);
           c.gridy = (i-1) / 5 + 1;
           panel.add(b, c);
           
           b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				System.out.println(b.getText());
				int chosenNumber = Integer.valueOf(b.getText().trim());
				BetResult betresult = client.placeBet(new AccountCredentials() {}, chosenNumber, 1);
				result.setText(
						"You played " +
						betresult.getBetNumber() +
						". Winning number was " + 
						betresult.getResultNumber() + 
						" and you won " +
						betresult.getBetWin() +
						" with a bonus win of " +
						betresult.getPotWin() +
						" and your account has " +
						betresult.getAccountInfo().getAccountSaldo());
			}
		});
       }
    }
 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingClient ex = new SwingClient(casinoClient);
                ex.setVisible(true);
            }
        });
    }


}