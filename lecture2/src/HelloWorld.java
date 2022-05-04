
public class HelloWorld {
    public static void main(String[] args){


        PrinterClass myPrinter = new PrinterClass("first obj", 1234);

        myPrinter.changeWords();

        System.out.println(myPrinter.words);

        PrinterClass myPrinterTwoElectricBoogaloo = new PrinterClass("second obj", 789);

        myPrinterTwoElectricBoogaloo.changeWords();

        System.out.println(myPrinterTwoElectricBoogaloo.words);

        System.out.println(myPrinter.numbers+myPrinterTwoElectricBoogaloo.numbers);

        PrinterClass deflt = new PrinterClass();
    }
}
