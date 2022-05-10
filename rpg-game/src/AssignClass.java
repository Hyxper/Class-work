import java.util.Scanner;


/***
 using factory design pattern
 ***/

public class AssignClass {

    public Character getClass (String className) {

        Character selection = null;

        if (className == null) {
            return null;
        }
        if (className.equalsIgnoreCase("WARRIOR")) {
            selection = new Warrior();
        } else if (className.equalsIgnoreCase("THIEF")) {
            selection = new Thief();
        }

        if (selection == null) {
            System.exit(0);
        } else {
            selection.setAttributes();
            selection.setName();
        }

        return selection;
    }
}
