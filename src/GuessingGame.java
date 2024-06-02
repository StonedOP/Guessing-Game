import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int)(Math.random()*100 +1);
        int userAnswer = 0;
        System.out.println("Correct answer " + computerNumber);
        int count = 1;
        while (userAnswer != computerNumber){
            String responce = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100 ","Guessing Game",3);
            userAnswer = Integer.parseInt(responce);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber,count));
            count++;
        }
    }

    private static String determineGuess(int userAnswer, int computerNumber, int count) {
         if (userAnswer < 0 || userAnswer > 100){
             return "Your guess is invalid" + count;
         }
         else if (userAnswer == computerNumber) {
             return "Correct Answer /n Total no. of gusses: "+ count;
         }
         else if (userAnswer > computerNumber) {
             return "Your guess is too high, try again /n Try number: " + count;
         }
         else if (userAnswer > computerNumber) {
             return "Your guess is too low, try again /n Try number: " + count;
         }else {
             return "Your guess is incorrect /n Try number: " + count;
         }
    }
}
