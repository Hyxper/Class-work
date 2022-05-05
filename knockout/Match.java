import java.util.Random;
class Match {

    Player p1;
    Player p2;

    public Match(Player playerOne, Player playerTwo) {
        System.out.println("match between " + playerOne.playerName + " and " + playerTwo.playerName);
        p1 = playerOne;
        p2 = playerTwo;
    }

    Player returnWinner() {
        Random dice = new Random();
        int result = dice.nextInt(101);

        if (result > 50) {
            System.out.println(result + " was rolled, " + p1.getName() + " wins!");
            return p1;
        } else {
            System.out.println(result + " was rolled, " + p2.getName() + " wins!");
            return p2;
        }
    }
}