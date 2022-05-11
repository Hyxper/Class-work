import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Init {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<User>();

        int userCount = 3;

        for (int i = 0; i < userCount; i++) {

            User temp;
            Scanner input = new Scanner(System.in);

            if(i==0){
                temp = new Student();
                System.out.print("Please enter your desired name: ");
                temp.name = input.nextLine();
                users.add(temp);
            } else if (i==1) {
                temp = new Tutor();
                System.out.print("Please enter your desired name: ");
                temp.name = input.nextLine();
                users.add(temp);
            }else{
                temp = new Admin();
                System.out.print("Please enter your desired name: ");
                temp.name = input.nextLine();
                users.add(temp);
            }
        }

        users.forEach((e)->{e.printName();e.printRole();e.sayLine(e.voiceLine);});

    }
}
