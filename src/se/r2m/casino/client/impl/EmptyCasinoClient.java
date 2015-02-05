package se.r2m.casino.client.impl;

import se.r2m.casino.AccountCredentials;
import se.r2m.casino.AccountInfo;
import se.r2m.casino.BetResult;
import se.r2m.casino.client.CasinoClient;

public class EmptyCasinoClient implements CasinoClient {

	@Override
	public AccountCredentials login(String username, String password) {
		return null;
	}

	@Override
	public void logout(AccountCredentials accountCredentials) {
	}

	@Override
	public BetResult placeBet(AccountCredentials accountCredentials, int chosenNumber, int betInSEK) {
		BetResult result = new BetResult(new AccountInfo(500, 500), 0, 0, 0, 0);
		return result;
	}

	@Override
	public AccountInfo getAccountInfo(AccountCredentials accountCredentials) {
		return new AccountInfo(500, 500);
	}

}
