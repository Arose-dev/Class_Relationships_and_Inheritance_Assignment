import java.util.*;
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Defines the tasks, sets the priority of the task for the day, and sets the complexity of doing said task
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task t1 = new Task("Ger out of bed", 10);
        t1.setComplexity(2);
        tasks.add(t1);
        Task t2 = new Task("Make and eat Breakfast", 2);
        t2.setComplexity(4);
        tasks.add(t2);
        Task t3 = new Task("Go to school", 6);
        t3.setComplexity(10);
        tasks.add(t3);
        Task t4 = new Task("Drive home", 10);
        t4.setComplexity(8);
        tasks.add(t4);
        Task t5 = new Task("Do Homework", 10);
        t5.setComplexity(9);
        tasks.add((t5));
        Task t6 = new Task("Go to bed", 10);
        t6.setComplexity(2);
        tasks.add(t6);
        //Prints out all of the daily tasks before sorting
        for (int i = 0; i < tasks.size(); i++){
            Task temp = tasks.get(i);
            System.out.println(temp);
        }
        System.out.println();
        System.out.println("Sorted");
        System.out.println();
        //sorts all of the daily tasks
        Collections.sort(tasks);
        //Prints out all of the daily tasks after sorting
        for (int i = 0; i < tasks.size(); i++){
            Task temp = tasks.get(i);
            System.out.println(temp);
        }
    }
}
class Task implements Comparable{ //Creates a comparable interface (required for sorting)
    String task = "";
    int priority = 0;
    int complexity = 0;
    public Task(String inName, int inPriority){
        task = inName;
        priority = inPriority;
    }
    public void setComplexity(int inComplexity){
        complexity = inComplexity;
    }
    public int getComplexity(){
        return complexity;
    }
    public void setPriority(int inPriority){
        priority = inPriority;
    }
    public int getPriority(){
        return priority;
    }


    //Sorts both complexity AND priority of the daily tasks
    @Override
    public int compareTo(Object o){
        Task t2 = (Task)o;
        return Comparator.comparing(Task::getPriority)
        .thenComparing(Task::getComplexity)
        .compare(this, t2);
    }

    //creates a toString method, making it able to print out the tasks
    public String toString(){
        String result = "";
        result = task + ": Priority " + priority + ", Complexity: " + complexity;
        return result;
    }
}


}