import java.util.Scanner;


/**
    Adventure is using singleton design principle, there can only be ONE adventure...
 */
public class Adventure {
    Scenario[] levels;
    Integer levelCount;

    private static Adventure adventure;

   private Adventure(){
        while (levelCount == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter how many levels you wish to conquer: ");
            if (input.hasNextInt()) {
                levelCount = input.nextInt();
            } else {
                System.out.println("Not numeric!!!");
            }
        }




    }

    public static Adventure getInstance(){
        if (adventure == null){
            adventure = new Adventure();
        }
        return adventure;
    }


}
