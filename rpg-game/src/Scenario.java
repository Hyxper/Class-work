public class Scenario {
    String levelName, description;


    public void printDesc(){
        System.out.println(description);
    }


}

class Crypt extends Scenario{
    public Crypt() {
        levelName = "Crypt";
        description = "A spooky crypt";
    }

}

class OldLab extends Scenario{
    public OldLab() {
        levelName = "Old Lab";
        description = "An old lab";
    }

}

class ExecutionHall extends Scenario{
    public ExecutionHall() {
        levelName = "The Execution Hall";
        description = "OMG SO MUCH BLOOD";
    }

}