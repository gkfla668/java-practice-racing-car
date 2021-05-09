package racingCar;

import utils.RandomUtils;

public class Car {
	private static final int MIN_VALUE = 0;
	private static final int MOVING_DISTANCE = 4;
	private static final int MAX_VALUE = 9;

	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	public int getRandomNum(){
		return RandomUtils.nextInt(MIN_VALUE, MAX_VALUE);
	}

	public void moveOrStop(int randomNumber){
		if(randomNumber >= MOVING_DISTANCE) {
			this.position++;
		}
	}

	public String getName(){
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	public void raceOutput() {
		System.out.print(this.name);
		System.out.print(" : ");

		for (int i = 0; i < this.position; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public void race() {
		moveOrStop(getRandomNum());
		raceOutput();
	}
}
