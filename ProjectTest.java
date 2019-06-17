import java.util.ArrayList;
import java.util.Arrays;

public class ProjectTest {
    public static void main(String[] args){
        Project p1 = new Project("Project 1", "A random project");
        Project p2 = new Project("Project 2", "Another random project");
        Project p3 = new Project("Project 3", "A third random project");

        p1.setInitialCost(30.5);
        p2.setInitialCost(100);
        p3.setInitialCost(19.5);

        System.out.println(Arrays.toString(port1.getProjects().toArray()));
    }
}