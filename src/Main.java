import java.util.Scanner:

public class Main {

    public static void main(String args[]) {
        String question = "what color is the sky?";
        String choiceOne = "green";
        String choiceTwo = "blue";
        String choiceThree = "red";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        
        // Write a print statement giving the answer choices
        System.out.println("you have three choices :"
                          + "choice One = " + choiceOne +
                          "choice Two = " + choiceTwo +
                          "choice Three = " + choiceThree +
                          "please type in the color you think it is.");
        
        

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        String userInput = input.next;
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(userInput.toLowerCase())){
            System.out.println("you are correct!!!");
        }else{
            System.out.println("sorry try again next time.");
        }
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
