import java.util.Scanner;

public class Input
{
    private String curTask; //For the given input "solve for x, x^2 + x + 16", the current task would be "solve for x".
    private String givenValue; //For the given input "solve for x, x^2 + x + 16", the given value would be "x^2 + x + 16"

    public String getInput()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public void parseInput(String input)
    {
        curTask = "";
        givenValue = "";

        for (int x = 0; x < input.indexOf(","); x++)
        {
            curTask += input.charAt(x);
        }

        for (int y = input.indexOf(",")+1; y < input.length(); y++)
        {
            if ((y != input.indexOf(",") + 1) || (input.charAt(y) != ' '))
            {
                givenValue += input.charAt(y);
            }
        }
    }








    ///////////////////// Setters and getters
    public void setCurTask(String newTask)
    {
        curTask = newTask;
    }
    
    public void setGivenValue(String newValue)
    {
        givenValue = newValue;
    }

    public String getCurTask()
    {
        return curTask;
    }

    public String getGivenValue()
    {
        return givenValue;
    }
}