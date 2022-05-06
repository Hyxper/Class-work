
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class Tournament {

    public static void main(String[] args) {

        final int playerPerMatch = 2; //not necessarily a const
        int playerCount = 8;
        int noOfRounds = (int) (Math.floor(Math.log(playerCount) / Math.log(playerPerMatch)));

        ArrayList<Player>[] brackets = new ArrayList[noOfRounds];

        for (int i = 0; i < noOfRounds; i++) {
            brackets[i] = new ArrayList<>();
        }

//        System.out.println(Arrays.toString(brackets));
//hehe
        brackets[0].add(new Player("Andrew"));
        brackets[0].add(new Player("Drew"));
        brackets[0].add(new Player("Mic"));
        brackets[0].add(new Player("Claude"));
        brackets[0].add(new Player("Jack"));
        brackets[0].add(new Player("Adam"));
        brackets[0].add(new Player("Bruce"));
        brackets[0].add(new Player("Warren"));


        int player = 0;

        outerloop:
        for (int bracket = 0; bracket < noOfRounds; bracket++) {

            System.out.println("Round "+(bracket+1));
            System.out.println("Players are: ");

            brackets[bracket].forEach((e) -> System.out.println(e.getName()));

            for (int i = 0; i < playerCount / playerPerMatch; i++) {
                Match myMatch = new Match(brackets[bracket].get(player), brackets[bracket].get(player + 1));
                if (brackets[bracket].size()==2){
                    System.out.println("Winner is..... "+myMatch.returnWinner().getName());
                    break outerloop;
                }
                brackets[bracket+1].add(myMatch.returnWinner());
                player += 2;
            }

            player = 0;
            playerCount = playerCount - brackets[bracket+1].size();

        }
//         System.out.println(Arrays.toString(brackets));
//        brackets[0].remove(5);
//        System.out.println(Arrays.toString(brackets));

//        brackets[0].get(0).getName();
        System.out.println("End");
    }
}
