import java.util.Scanner;
// import java.util.Arrays;
/**
 * Class for question.
 */
class Question {
    /**
     * Gives the question to user.
     */
    private String questiontext;
    /**
     * Stores the 4 choices for each question text.
     */
    private String[] choices;
    /**
     * Gives the correct option for right answer.
     */
    private int correctAnswer;
    /**
     * Provides the max marks to be given for question.
     */
    private int maxMarks;
    /**
     * Penality marks to be deducted when wrong answer is given.
     */
    private int penalty;
    /**
     * Answer given for question.
     */
    private String response;
    /**
     * Constructs the object.
     */
    Question() {

    }
    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    Question(final String question1, final String[] choices1,
        final int correctAnswer1, final int maxMarks1, final int penalty1) {
        questiontext = question1;
        choices = choices1;
        correctAnswer = correctAnswer1;
        maxMarks = maxMarks1;
        penalty = penalty1;
    }
    /**
     * To evaluate if the option is correct or not.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
        if (choices[correctAnswer - 1].equals(choice)) {
            return true;
        }
        return false;
    }
    /**
     * Gets the correct answer.
     *
     * @return     The correct answer.
     */
    public String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }
    /**
     * Gets the question text.
     *
     * @return     The question text.
     */
    public String getQuestionText() {
        return questiontext;
    }
    /**
     * Gets the choice.
     *
     * @return     The choice.
     */
    public String[] getChoice() {
        return choices;
    }
    /**
     * Gets the maximum marks.
     *
     * @return     The maximum marks.
     */
    public int getMaxMarks() {
        return maxMarks;
    }
    /**
     * Gets the penalty.
     *
     * @return     The penalty.
     */
    public int getPenalty() {
        return penalty;
    }
    /**
     * Sets the response.
     *
     * @param      answer  The answer
     */
    public void setResponse(final String answer) {
        response = answer;
    }
    /**
     * Gets the response.
     *
     * @return     The response.
     */
    public String getResponse() {
        return response;
    }
    /**
     * Shows the report of quiz.
     *
     * @return     String with responses
     */
    public String showReport() {
        String s = "";
        s = s + getQuestionText();
        // System.out.println(" ");
        boolean b = evaluateResponse(response);
        if (b) {
            s = s + "\n" + " Correct Answer! - Marks Awarded: " + getMaxMarks();
        } else {
            s = s + "\n" + " Wrong Answer! - Penalty: " + getPenalty();
        }
        return s;
    }
}
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * size of quiz.
     */
    private final int onehundred = 100;
    /**
     * Questions of Quiz.
     */
    private Question[] questions;
    /**
     * size of questions.
     */
    private int size;
    /**
     * Choices numbers.
     */
    private int flagChoice = 0;
    /**
     * Choices length.
     */
    private int flagLengthCh = 0;
    /**
     * Sets the flag choice.
     *
     * @param      val   The value
     */
    public void setFlagChoice(final int val) {
        flagChoice = val;
    }
    /**
     * Gets the flag choice.
     *
     * @return     The flag choice.
     */
    public int getFlagChoice() {
        return flagChoice;
    }
    /**
     * Choice length.
     *
     * @param      val   The value
     */
    public void flagLengthCh(final int val) {
        flagLengthCh = val;
    }
    /**
     * returns choices length.
     *
     * @return     returns flag length.
     */
    public int flagLengthCh() {
        return flagLengthCh;
    }
    /**
     * Constructs the object.
     */
    Quiz() {
        questions = new Question[onehundred];
        size = 0;
    }
    /**
     * Gets the quiz size.
     *
     * @return     The quiz size.
     */
    public int getQuizSize() {
        return size;
    }
    /**
     * Gets the questions.
     *
     * @return     The questions.
     */
    public Question[] getQuestions() {
        return questions;
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public void addQuestion(final Question q) {
        questions[size++] = q;
    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    public Question getQuestion(final int index) {
        return questions[index];
    }
    // /**
    //  * Shows the report.
    //  *
    //  * @return     { description_of_the_return_value }
    //  */
    // public String showReport() {
    //     String s = "";
    //     s = s + getQuestionText();
    //     // System.out.println(" ");
    //     boolean b = evaluateResponse(response);
    //     if(b) {
    //         s = s + "\n"+" Correct Answer! - Marks Awarded: "+getMaxMarks();
    //     }
    //     else {
    //         s = s + "\n"+" Wrong Answer! - Penalty: "+getPenalty();
    //     }
    //     return s;
    // }

}
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
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public static void loadQuestions(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        int c = 0;
        while (c < q) {
            String input = scan.nextLine();
            String[] inputs = input.split(":");
            // System.out.println(Arrays.toString(inputs));
            final int five = 5;
            if (inputs.length != five) {
                System.out.println("Error! Malformed question");
                return;
            } else {
                for (String r : inputs) {
                    // System.out.println(r);
                    if (r.equals("")) {
                        System.out.println("Error! Malformed question");
                        return;
                    }
                }
            }
            String text = inputs[0];
            String[] ch = inputs[1].split(",");
            final int four = 4;
            final int two = 2;
            if (ch.length > four) {
                quiz.flagLengthCh(1);
                System.out.print("trick question  does not have ");
                System.out.println("enough answer choices");
                return;
            }
            if (ch.length < two) {
                System.out.print(text + " does not ");
                System.out.println("have enough answer choices");
                return;
            }
            int ans = Integer.parseInt(inputs[2]);
            // System.out.println(ans);
            final int fours = 4;
            if (ans < 0 || ans > fours) {
                quiz.setFlagChoice(1);
                System.out.print("Error! Correct answer choice ");
                System.out.println("number is out of range for " + text);
                return;
            }
            final int three = 3;
            int max = Integer.parseInt(inputs[three]);
            if (max < 0) {
                System.out.println("Invalid max marks for " + text);
                return;
            }
            final int fourss = 4;
            int pen = Integer.parseInt(inputs[fourss]);
            if (pen > 0) {
                System.out.println("Invalid penalty for " + text);
                return;
            }
            Question q1 = new Question(text, ch, ans, max, pen);
            quiz.addQuestion(q1);
            c++;
        }
        if (quiz.getQuizSize() == 0) {
            System.out.println("Quiz does not have questions");
        } else {
            System.out.println(q + " are added to the quiz");
        }
    }
    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public static void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
        if (quiz.getQuizSize() == 0) {
            return;
        }
        if (quiz.getFlagChoice() == 1) {
            return;
        }
        // System.out.println(q);
        int count1 = 0;
        Scanner sc1 = scan;
        if (quiz.getQuizSize() == 0) {
            return;
        }
        // while(count1 < q) {
            Question[] ques = quiz.getQuestions();
            for (int j = 0; j < quiz.getQuizSize(); j++) {
                Question q1 = ques[j];
                System.out.println(q1.getQuestionText()
                    + "(" + q1.getMaxMarks() + ")");
                String[] chose = q1.getChoice();
                for (int i = 0; i < chose.length; i++) {
                    if (i == chose.length - 1) {
                        System.out.print(chose[i]);
                    } else {
                        System.out.print(chose[i] + "\t");
                    }
                }
                System.out.println("\n");
                String response = scan.nextLine();
                q1.setResponse(response);
            }
            // count1++;
            // System.out.println(count1);
        //}
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report using quiz object.
        if (quiz.getQuizSize() == 0) {
            return;
        }
        if (quiz.getFlagChoice() == 1) {
            return;
        }
        int total = 0;
        Question[] quest = quiz.getQuestions();
        for (int i = 0; i < quiz.getQuizSize(); i++) {
            Question q = quest[i];
            String ret = q.showReport();
            System.out.println(ret);
            if (ret.contains("Marks")) {
                total = total + q.getMaxMarks();
            } else {
                total = total + q.getPenalty();
            }
        }
        System.out.println("Total Score: " + total);
    }
}

