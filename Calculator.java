import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Input input = new Input(); //Create new input object

        System.out.println("Enter your request and information to be calculated: ");
        input.parseInput(input.getInput()); //Gathering the input and then separating it into its task (ex. solve for x) and its given value (ex. x^2 + x + 16, 15 + 3, etc.)
        System.out.println("The given task was: " + input.getCurTask());
        System.out.println("The information to be calculated was: " + input.getGivenValue());
    }
}