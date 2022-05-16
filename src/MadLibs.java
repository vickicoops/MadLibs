import java.util.Scanner;
public class MadLibs {

    public static void main(String[] args) {

        Scanner colourInput = new Scanner(System.in);
        Scanner pastVerbInput = new Scanner(System.in);
        Scanner adjectiveInput = new Scanner(System.in);
        Scanner nounInput = new Scanner(System.in);

        String colour = "";
        String pastVerb = "";
        String adjective = "";
        String noun = "";

        System.out.println("Type a colour");
        colour = colourInput.next();

        System.out.println("Type a past tense verb");
        pastVerb = pastVerbInput.next();

        System.out.println("Type an adjective");
        adjective = adjectiveInput.next();

        System.out.println("Type a noun");
        noun = nounInput.next();

        System.out.print("The " + colour + " dragon " + pastVerb + " at the " + adjective + " knight who rode in on a sturdy giant " + noun);

    }

}
