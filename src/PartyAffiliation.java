public class PartyAffiliation {
    public static void main(String[] args) {
        //Declare Variables
        String menu = "Please chose and enter one of the following options: D, R, or I";
        String userInput = "D";
        //Prompt
        System.out.println(menu);
        //Input
        System.out.println("Testing user input of "+userInput);
        //Output If "D"
        if (userInput.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        //Output If "R"
        else if(userInput.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        //Output If "I"
        else if (userInput.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        //Output If Invalid
        else
        {
            System.out.println(userInput+" is not a valid input");
        }
    }
}