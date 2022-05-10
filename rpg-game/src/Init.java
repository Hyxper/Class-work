import java.util.Scanner;

public class Init {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your desired class: ");
        String desiredClass = input.nextLine();

        AssignClass assignClass = new AssignClass();

        Character playerCharacter = assignClass.getClass(desiredClass);

        playerCharacter.getName();
        playerCharacter.getAttributes();
    }
}
