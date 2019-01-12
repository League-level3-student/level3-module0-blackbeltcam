package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static boolean attop = false;

	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int x = 0; x < 5; x++) {
			robots[x] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[x].setX(180 * x + 80);
			robots[x].setY(500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (!attop) {
			for (int z = 0; z < 5; z++) {
				robots[z].setSpeed(7);
				robots[z].move(new Random().nextInt(100));
				if (robots[z].getY() <= 0) {
					System.out.println("atop");
					attop = true;
					break;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
