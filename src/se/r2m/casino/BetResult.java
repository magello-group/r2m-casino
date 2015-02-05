package se.r2m.casino;

public class BetResult {
	
	private AccountInfo accountInfo;
	
	private int betWin;
	private long potWin;
	
	private int betNumber;
	private int resultNumber;
	
	public BetResult(AccountInfo accountInfo, int betWin, long potWin, int betNumber, int resultNumber) {
		super();
		this.accountInfo = accountInfo;
		this.betWin = betWin;
		this.potWin = potWin;
		this.betNumber = betNumber;
		this.resultNumber = resultNumber;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public int getBetWin() {
		return betWin;
	}

	public void setBetWin(int betWin) {
		this.betWin = betWin;
	}

	public long getPotWin() {
		return potWin;
	}

	public void setPotWin(long potWin) {
		this.potWin = potWin;
	}

	public int getBetNumber() {
		return betNumber;
	}

	public void setBetNumber(int betNumber) {
		this.betNumber = betNumber;
	}

	public int getResultNumber() {
		return resultNumber;
	}

	public void setResultNumber(int resultNumber) {
		this.resultNumber = resultNumber;
	}
	
	
}
