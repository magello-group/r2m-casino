package se.r2m.casino;

public class AccountInfo {
	
	private final long accountSaldo;
	private final long pottSaldo;
	
	public AccountInfo(long accountSaldo, long pottSaldo) {
		super();
		this.accountSaldo = accountSaldo;
		this.pottSaldo = pottSaldo;
	}

	public long getAccountSaldo() {
		return accountSaldo;
	}
	
	public long getPottSaldo() {
		return pottSaldo;
	}
}
