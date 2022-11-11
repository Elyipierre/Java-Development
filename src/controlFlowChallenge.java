import java.util.Scanner;

public class controlFlowChallenge {
    public static void main(String[] args) {
        String question = "How many hours are there in a day on planet Earth?";
        String choiceOne = "16";
        String choiceTwo = "24";
        String choiceThree = "36";

        String correctAnswer = choiceTwo;

        //Write a print statement asking the question
        System.out.println(question);
        //Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree);


        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        //retrieve the user's input
        String userInput = input.next();

        // If the user's input matches the correctAnswer then the user is correct and we want to print out a congrats
        // message to the user.
        if(userInput.equals(correctAnswer)) {
            System.out.println("Congrats! That's the answer correct!");
        // If the user's input does not match the correctAnswer then the user is incorrect and we want to print out a
        // a message saying that the user is incorrect
        } else {
            System.out.println("You are incorrect the answer is " + correctAnswer);
        }
    }
}
