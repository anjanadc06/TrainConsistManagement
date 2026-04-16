import java.util.*;

class Coach {
    String id;
    String type;

    public Coach(String id, String type) {
        this.id = id;
        this.type = type;
    }
}

class TrainConsist {
    private LinkedList<Coach> coaches;

    public TrainConsist() {
        coaches = new LinkedList<>();
    }

    public void addFront(Coach c) {
        coaches.addFirst(c);
    }

    public void addEnd(Coach c) {
        coaches.addLast(c);
    }

    public void insertAt(int index, Coach c) {
        if (index >= 0 && index <= coaches.size()) {
            coaches.add(index, c);
        }
    }

    public void removeById(String id) {
        coaches.removeIf(c -> c.id.equals(id));
    }

    public void display() {
        for (Coach c : coaches) {
            System.out.println(c.id + " " + c.type);
        }
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {

        TrainConsist train = new TrainConsist();

        train.addEnd(new Coach("C1", "Engine"));
        train.addEnd(new Coach("C2", "Sleeper"));
        train.addEnd(new Coach("C3", "AC"));

        train.addFront(new Coach("C0", "Guard"));

        train.insertAt(2, new Coach("C1.5", "General"));

        train.display();

        train.removeById("C2");

        train.display();
    }
}
