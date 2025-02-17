import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        List<Agent> agents;
        agents = names.stream().map(name -> new Agent(name.split(" ")[0], name.split(" ")[1]))
        			  .collect(Collectors.toList());

        showAgents(agents);
        
        System.out.println(LongStream.range(1,5).findAny().toString());
        // Explanation of LongStream.range method : 
        // https://www.javabrahman.com/java-8/java-8-how-to-use-range-rangeclosed-methods-of-intstream-longstream-with-examples/
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}