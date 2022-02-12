package riddleGame;

import java.util.Scanner;

@SuppressWarnings("unused")

public class calculatorClass {


    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("What type of Math would you like to do? (Only the" +
                " math type, please)"); 
        Scanner mathSca = new Scanner(System.in); 

        String mathType = mathSca.nextLine();

        if (mathType.equalsIgnoreCase("Division")) { 

            final int firstNumber = getNumber(mathSca, "You chose division. Enter the number that is " +"being divided" );
            final int secondNumber = getNumber(mathSca, "Next number - Please" + " enter the divisor.");
            final int userAnswer = firstNumber / secondNumber; 

            System.out.println(userAnswer); 

        } else if (mathType.equalsIgnoreCase("Addition")) {
            final int firstNumber = getNumber(mathSca, "You chose addition. " +"Enter the FIRST number " + "that is being added.");
            final int secondNumber = getNumber(mathSca, "Second number please.");
            final int userAnswer = firstNumber + secondNumber;
            System.out.println(userAnswer);

        } else if (mathType.equalsIgnoreCase("Subtraction")) {
            final int firstNumber = getNumber(mathSca,
            "You chose subtraction - Enterthe number your " + "subtracting from");
            final int secondNumber = getNumber(mathSca, "What your subracting" + " from the first number, please");
            final int userAnswer = firstNumber - secondNumber;
            System.out.println(userAnswer);
        }
    }

    static int getNumber(Scanner mathSca, String prompt) {
        System.out.println(prompt);
        int number = mathSca.nextInt();
        return number;
    }
}