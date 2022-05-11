import java.lang.reflect.Array;
import java.util.Scanner;

abstract class Character {
    String charName = null, bio = null;
    protected String characterClass = null;
    Integer strength = null, dexterity = null, intellect = null;


    abstract void setAttributes();

    public Integer[] getAttributes(){
        Integer[] attributes = {strength,dexterity,intellect};
        return attributes;
    }
    public void printAttributes(){
        System.out.println("your strength is "+strength);
        System.out.println("your dexterity is "+dexterity);
        System.out.println("your intellect is "+intellect);
    }

    public void setName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your desired name: ");
        charName = input.nextLine();
    }

    public void printName(){
        System.out.println("Your name is " + charName +".");
    }

    public String getCharName(){
        return charName;
    }



}


