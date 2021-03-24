package racing;

import java.util.Random;

public class CarRaceingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int ranCar = rand.nextInt(10);//nextint() 공부
				System.out.println(ranCar);//중첩for문 outer횟수 inner n대 자동차
				if(ranCar > 4) {
					System.out.println("go");
				} else if(ranCar < 4) {
					System.out.println("stop");
				}
				//stack class 이용?
				
			}
			
			
		}
	}
}
