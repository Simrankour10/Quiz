import java.util.Scanner;
import java.util.Random;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[][] questions = {
            {"Which planet is known as the Red Planet?", "Mars"},
            {"What is the chemical formula for water?", "H2O"},
            {"What is the capital of France?", "Paris"},
            {"What is the largest planet in our solar system?", "Jupiter"},
            {"Who is the creator of the Android operating system?", "Google"}
        };

        int score = 0;
        int numberOfQuestions = questions.length;

        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println(questions[i][0]);

            String userAnswer = scanner.nextLine();
            String correctAnswer = questions[i][1];

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
                System.out.println("Correct! Your score is: " + score);
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }

            System.out.println();
        }

        System.out.println("Your final score is: " + score + "/" + numberOfQuestions);
    }
}