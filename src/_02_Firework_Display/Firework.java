package _02_Firework_Display;

import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework{
	public static final int GRAVITY = 1;
	
	//1. Create an array of Spark objects called sparks. Don't initialize it.
	
	public boolean dead = false;
	Spark[] sparks;
	public Firework() {
		
		//2. Initialize the Spark array to contain 100 Sparks. 
		sparks = new Spark[100];
		//3. Iterate through the sparks and initialize each one to a new Spark.
		//   Make each spark start at the middle bottom of the screen.
	for (int ree=0;ree<sparks.length;ree++) {
		sparks[ree] = new Spark(950, 1000);
	}
	}
	
	public void launch() {
		//4. Iterate through the sparks and reset their x and y location
		//   to their original starting point.
		for (int yesnt=0;yesnt<sparks.length;yesnt++) {
			sparks[yesnt].x=930;
			sparks[yesnt].y=1000;
		}
	}
	
	public void updateSparks() {
		//8. Uncomment this code. See if you can understand what it is doing.
		
		for(int i = 0; i < sparks.length; i++) {

			Spark s = sparks[i];
			s.x += s.xVelocity;
			s.y += s.yVelocity;
			s.yVelocity += GRAVITY;
			
			if(s.yVelocity >= 0 && !s.fire) {
				Random r = new Random();
				s.xVelocity = r.nextInt(40) - 20;
				s.yVelocity += -r.nextInt(10) - 5;
				s.size = r.nextInt(7) + 2;
				s.fire = true;
			}
			
			if(s.y >= FireworkDisplay.HEIGHT) {
				s.dead = true;
			}
		}
		
		for(int i = 0; i < sparks.length; i++) {
			if(!sparks[i].dead) {
				dead = false;
				break;
			}
			dead = true;
		}
	}
	
	public void drawSparks(Graphics g) {
		//5. Iterate through each spark
		for (int uncan=0;uncan<sparks.length;uncan++) {
			g.setColor(sparks[uncan].color);
			g.fillOval(sparks[uncan].x, sparks[uncan].y, sparks[uncan].size, sparks[uncan].size);
		}
			//6. Set the color to the spark's color with g.setColor()
			//7. Fill in an oval using the spark's x, y, and size with g.fillOval()
	}
}
