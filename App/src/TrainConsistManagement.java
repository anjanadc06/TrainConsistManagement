import java.util.*;
public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("   UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================\n");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println("\nUC7 operations completed successfully...");
    }
}