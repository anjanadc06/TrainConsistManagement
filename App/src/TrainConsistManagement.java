import java.util.LinkedHashSet;
import java.util.Set;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("   UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=====================================\n");
        // Create LinkedHashSet
        Set<String> formation = new LinkedHashSet<>();
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");
        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);
        System.out.println("\nUC5 operations completed successfully...");
    }
}
