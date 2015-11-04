/**
 * 
 */

/**
 * @author LAB
 *
 */
public class Listing_Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((char)(65+Math.random()*26));
		int startingValue = 65;// 'A' is 65
		int endingValue = 90-startingValue+1;/* 'Z' is 90,
		and we wanted to cover the range, so we added 1 more to ensure
		we would cover A through Z.*/
		/* From page 122 a + Math.random()*b gives us a random
		* number between a and a+b excluding a+b.*/
		int randomNumber; /* Make a new variable and then
		fill it with a random number that is between our starting value
		and ending value. Then print it out. */
		randomNumber = (int)(startingValue + Math.random()*endingValue);
		//System.out.println(randomNumber); // debugging statement.
		char letter = (char)randomNumber; // recast the number to a letter.
		System.out.println(letter); // print it out.
		

	}

}
