import java.util.Scanner;

public class PrinterClass {

    String words;
    Integer numbers;

    public PrinterClass(String word, Integer number){
        words = word;
        numbers = number;
    }

    public PrinterClass(){
        words = "default const";
        numbers = 1111111111;
        System.out.println("default object instantiated");
    }

    public void printHello(String name) {
        System.out.println(name);
    }

    void printWords(){
        System.out.println("property words is: "+words);
    }

    void printNumbers(){
        System.out.println("property numbers is: "+numbers);
    }

    void changeWords(){
        System.out.println("Word is currently "+words);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        words = input.nextLine();
    }
}

//class AnotherPrinter extends PrinterClass{
//
//
//}