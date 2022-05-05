class Player {

    String playerName;

    public Player(String name){
        playerName = name;
    }

    String getName(){
        return  playerName;
    }

    void printName(){
        System.out.println("Players name is: "+playerName);
    }
}
