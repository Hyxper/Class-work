
import java.sql.Array;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class Tournament {

    public static void main(String[] args) {

        int playerPerMatch = 2;   // could be a constant


        int playerCount = 8;

        int noOfRounds = (int) Math.floor(Math.log(playerCount) / Math.log(playerPerMatch));

        ArrayList<Player>[] brackets = new ArrayList[noOfRounds];

        Player[][] tournArray = new Player[noOfRounds][];

        int playersPerRound = playerCount;

        for (int i = 0; i < noOfRounds; i++) {

//              brackets[i] = new ArrayList<>();
            tournArray[i] = new Player[playersPerRound];
            playersPerRound = playersPerRound / 2;
        }
        // populate first round (first array element)

        for (int i = 0; i < tournArray[0].length; i++) {

            tournArray[0][i] = new Player("Payer " + i);

        }
        System.out.println(tournArray[0][1].playerName);

//        System.out.println(Arrays.toString(brackets));

//         brackets[0].add(new Player("Andrew"));
//         brackets[0].add(new Player("Drew"));
//         brackets[0].add(new Player("Mic"));
//         brackets[0].add(new Player("Claude"));
//         brackets[0].add(new Player("Jack"));
//         brackets[0].add(new Player("Adam"));
//         brackets[0].add(new Player("Bruce"));
//         brackets[0].add(new Player("Warren"));

//
//        int x = 0;
//
//        for (int i = 0; i < playerCount/playerPerMatch; i++) {
//             Match myMatch = new Match(brackets[0].get(x),brackets[0].get(x+1));
//             myMatch.returnWinner();
//             x+=2;
//        }


//         System.out.println(Arrays.toString(brackets));
//        brackets[0].remove(5);
//        System.out.println(Arrays.toString(brackets));

//        brackets[0].get(0).getName();

    }
}
