public class PartyAffiliation {
    public static void main(String[] args) {
        String menu = "Please chose and enter one of the following options: D, R, or I";
        String userInput = "D";
        System.out.println(menu);
        System.out.println("Testing user input of "+userInput);
        if (userInput.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(userInput.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (userInput.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Person");
        }
        else
        {
            System.out.println(userInput+" is not a valid input");
        }
    }
}