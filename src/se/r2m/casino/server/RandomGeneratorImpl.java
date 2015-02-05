package se.r2m.casino.server;

import java.util.Random;

public class RandomGeneratorImpl implements RandomGenerator {
	
	private ThreadLocal<Random> random = new ThreadLocal<Random>() {
		@Override
		protected Random initialValue() {
			return new Random();
		}
	};
	
	@Override
	public int generateRandomRouletteNumber() {
		return random.get().nextInt(36);
	}

	@Override
	public boolean payoutPott() {
		return (random.get().nextInt(100_000) == 9672);
	}
}
