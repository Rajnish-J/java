import java.util.*;

class tried
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
        try {
            String input = read.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("The number is " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input: not a number");
        }
        finally {
            System.out.println("Program complete.");
        }
	}
}