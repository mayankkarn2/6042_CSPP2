import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

/**
 * Class for todoist main.
 */
class TitlException extends Exception {
    public TitlException(String s) {
        super(s);
    }
}
class TimException extends Exception {
    public TimException(String s) {
        super(s);
    }
}
class todException extends Exception {
    public todException(String s) {
        super(s);
    }
}
public class TodoistMain {

    /**
     * Starts a test.
     */
    public static void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
                case "task":
                    testTask(tokens);
                break;
                case "add-task":
                    testAddTask(todo, tokens);
                break;
                case "print-todoist":
                    System.out.println(todo);
                break;
                case "get-next":
                    System.out.println(todo.getNextTask(tokens[1]));
                break;
                case "get-next-n":
                    int n = Integer.parseInt(tokens[2]);
                    Task[] tasks = todo.getNextTask(tokens[1], n);
                    System.out.println(Arrays.deepToString(tasks));
                break;
                case "total-time":
                    System.out.println(todo.totalTime4Completion());
                // break;
                default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public static void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            Task t = createTask(tokens);
            // System.out.println(t);
            if(t.title.equals(null)) {
                // System.out.println("mmm");
                return;
            }
            todo.addTask(t);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        int flag = 0;
        String title = tokens[1];
        try{
            if(title.equals("")){
                throw new TitlException("Title not provided");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
            flag = 1;
        }
        if(flag == 1) {
            // System.out.println("1");
            return null;
        }
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        try {
            if(timeToComplete < 0) {
                throw new TimeException("Invalid timeToComplete");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage()+" "+timeToComplete);
            flag = 1;
        }
        if(flag == 1) {
            return null;
        }
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        try{
            if(!(status.equals("todo") || status.equals("done"))) {
                throw new todException("Invalid status");
            }
        }catch(Exception e) {
            // System.out.println(e.getMessage()+" "+status);
            // flag = 1;
            throw e;
        }
        if(flag == 1) {
            // System.out.println("1");
            return null;
        }
        // System.out.println("llll");
        return new Task(
            title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
