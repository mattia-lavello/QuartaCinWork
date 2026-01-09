import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private String name;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void add(Player p) {
        players.add(p);
    }

    public void salvaTeam() {
        try {
            FileInputStream fis = new FileInputStream("data/" + name + ".bin");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(players);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void caricaTeam() {
        try {
            FileInputStream fis = new FileInputStream("data/" + name + ".bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            players = (ArrayList<Player>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "Team [name=" + name + ", players=" + players + "]";
    }
}
