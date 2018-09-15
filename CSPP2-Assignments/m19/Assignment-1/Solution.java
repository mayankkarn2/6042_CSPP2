import java.util.Scanner;
import java.util.Arrays;
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                // Sysem.out.println(tokens[1]);t
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        // System.out.println("Hi");
        int  count = 0;
        // Scanner sc = s;
        while(count < questionCount) {
            String input = s.nextLine();
            String inputs[] = input.split(":");
            // System.out.println(Arrays.toString(inputs));
            // System.out.println(inputs[0]);
            // System.out.println(quiz.questions[count]);
            if(inputs.length!=5) {
                System.out.println("Error! Malformed question");
                return;
            }
            quiz.questions[count] = inputs[0];
            quiz.choices[count] = inputs[1];
            quiz.correctAns[count] = inputs[2];
            if(quiz.correctAns[count] <1 && quiz.correctAns[count] > 4) {
                System.out.println("Error! Correct answer choice number is out of range for question text 1");
                return;
            }
            quiz.marks[count] = inputs[3];
            quiz.penality[count] = inputs[4];
            count += 1;
            quiz.count += 1;
        }
        if(quiz.count > 0)
            System.out.println(questionCount + " are added to the quiz");
        else {
            System.out.println("Quiz does not have questions");
    }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
    int count1 = 0;
    Scanner sc1 = s;
    if(quiz.count == 0) {
        return;
    }
    while(count1 < answerCount) {
        System.out.println(quiz.questions[count1] + "(" + quiz.marks[count1] + ")");
        String[] options = quiz.choices[count1].split(",");
        int c = 1;
        for(String option : options) {
            if(c == 4) {
                System.out.print(option);
            }
            else {
                System.out.print(option + "\t");
            }
            c++;
        }
        String answer = sc1.nextLine();
        // String[] res = answer.split(" ");
        quiz.responses[count1] = answer;
        count1 += 1;
        System.out.println("\n");
    }
    }


    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        if(quiz.count == 0) {
            return;
        }
        else {
        int total = 0;
        // System.out.println("Hi");
        for(int i = 0; i < (quiz.count); i++) {
            int correctAns = 0;
            int penality = 0;
            // System.out.println(quiz.correctAns[i]);
            System.out.println(quiz.questions[i]);
            // System.out.println(quiz.responses[i]);
            int correct = Integer.parseInt(quiz.correctAns[i]);
            // System.out.println(correct);
            // System.out.println(quiz.choices[correct-1]);
            String[] opt = quiz.choices[i].split(",");
            if(opt[correct-1].equals(quiz.responses[i])) {

                correctAns = Integer.parseInt(quiz.marks[i]);
                System.out.println(" Correct Answer! - Marks Awarded: " + quiz.marks[i]);
            }
            else {
                penality = Integer.parseInt(quiz.penality[i]);
                System.out.println(" Wrong Answer! - Penalty: " + quiz.penality[i]);
            }
            total = total + correctAns + penality;
        }
        System.out.println("Total Score: " + total);
        }
    }
}
