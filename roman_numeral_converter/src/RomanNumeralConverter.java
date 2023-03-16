import java.util.Scanner;

public class RomanNumeralConverter {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args) {

        String I;
        String II;
        String III;
        String IV;
        String V;
        String VI;
        String VII;
        String VIII;
        String iX;
        String X;
        System.out.println("=================================================");
        System.out.println("Welcome to the Roman Numeral to Integer Converter");
        System.out.println("=================================================");

        System.out.println("Enter a Roman Numeral I to X: ");
        String rn = scan.nextLine();
        int integer = romanNumeralConverter(rn);
        printInteger(integer);
    }
    public static int romanNumeralConverter(String character) {
        int integer = 0;
        switch (character) {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
        //    default: System.out.println("Entry not found");
        }
        return integer;
    }
    public static void printInteger(int value){
        System.out.println(value);
    }
}
