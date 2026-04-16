import java.util.HashSet;
import java.util.Set;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("   UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");
        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();
        // Add bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        // Duplicate entries
        bogies.add("BG101");
        bogies.add("BG102");
        // Display unique bogies
        System.out.println("\nUC3 operations completed successfully...");
    }
}