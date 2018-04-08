import java.util.Scanner;

/**
 * Galli Cricket Scoring Program
 * @author palanivel
 * @version 1.0
 * 
 */
public class TeamScore {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		/*
		 * Get input as no of balls bowled	
		 */
		System.out.println("Input:");
		String[] input = new String[in.nextInt()];
		in.nextLine();

		// Variable to save score
		int score = 0;
		
		// Variable to save previous ball
		String prevBall = "";

		
		for (int i = 0; i < input.length; i++) {
			String currBall = in.nextLine();

			/*
			 * Calculating Team Score Logic 
			 */
			if (currBall.equals("1")) {
				/*
				 *  Increment score if batsmen touchs ball with bat 
				 */
				score++;
			} else if (currBall.equals("0")) { 
				/*
				 *  Decrement score by 2 if current ball & previous ball 
				 *  score was 0 as batsman considered out
				 */
				if (prevBall.equals("0")) {
					score = score - 2;
					prevBall = "";
					continue;
				}
			} else if (currBall.equalsIgnoreCase("w")) {
				/*
				 *  Decrement score by 2 if its wicket
				 */
				score = score - 2;
			}
			prevBall = currBall;
		}

		// Output final team score
		System.out.println("Output:" + score);
		in.close();
	}
}
