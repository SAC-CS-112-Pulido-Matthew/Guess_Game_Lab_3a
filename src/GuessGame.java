import java.util.Scanner;

public class GuessGame
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int randomNumber;
		int number;
		
		randomNumber = (int) (Math.random() * 11 ) + 0;
		
		System.out.print("Enter a guess beteween 0 and 10: ");
		number = input.nextInt();
		
		input.close();
		
		if ((randomNumber == number) && (0 <= number) && (number <= 10) )
		{
			System.out.printf("Correct! %d = %d", randomNumber, number);
		}
		else
		{
			System.out.printf("Incorrect! %d != %d", randomNumber, number);
		}
		if ((randomNumber > number) && (0 <= number) && (number <= 10))
		{
			System.out.printf("Guess is too small! %d > %d", randomNumber, number);
		}
		else
		{
			System.out.print("\nGuess is too big");
		}
		if ((randomNumber < number) && (0 <= number) && (number <= 10))
		{
			System.out.printf("Guess is too big! %d < %d", randomNumber, number);
		}
		else
		{
			System.out.print("\nGuess is too small");
		}
	}
}
