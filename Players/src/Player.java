import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Player {

    private String name;
    private int valore;

    public Player(String name) {
        this.name = name;
        valore = 0;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public void save() {
        File f = new File("data/" + name + ".dat");

        try (PrintWriter pw = new PrintWriter(f)) {
            pw.print(valore);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        File f = new File("data/" + name + ".dat");
        try (Scanner sc = new Scanner(f)) {
            valore = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", valore=" + valore + "]";
    }

}
