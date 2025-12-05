import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		int num = (int)(Math.random()*100), guess, count = 1;
		System.out.println("I am thinking a number, can you guess it?");

		do {
			System.out.print("Your guess: ");
			guess = s.nextInt();
			if (guess == num) {
				System.out.println("Correct");
			} else if (guess < num) {
				System.out.println("Your guess is too small\n");
				count++;
			} else {
				System.out.println("Your guess is too big\n");
				count++;
			}

		} while (guess != num);

		System.out.println("You found it in " + count + " tries.");
	}
}