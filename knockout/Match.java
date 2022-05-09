import java.util.Random;
class Match {

    Player p1;
    Player p2;

    /**
     *
     * @param playerOne first player that is passed
     * @param playerTwo second player that is passed
     */
    public Match(Player playerOne, Player playerTwo) {
        System.out.println("match between " + playerOne.playerName + " and " + playerTwo.playerName);
        p1 = playerOne;
        p2 = playerTwo;
    }

    /**
     *  Method that returns a passed winner object
     * <a href="https://www.oracle.com/uk/technical-resources/articles/java/javadoc-tool.html">Link</a>
     */
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