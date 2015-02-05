package se.r2m.casino.client;

import se.r2m.casino.AccountCredentials;
import se.r2m.casino.AccountInfo;
import se.r2m.casino.BetResult;

public interface CasinoClient {
	
	AccountCredentials login(String username, String password);
	void logout(AccountCredentials accountCredentials);
	
	BetResult placeBet(AccountCredentials accountCredentials, int chosenNumber, int betInSEK);
	AccountInfo getAccountInfo(AccountCredentials accountCredentials);
	
}
