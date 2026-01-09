public class Player {

    String name;
    int valore;

    public Player( String name) {
        this.name = name;
        valore = 0;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", valore=" + valore + "]";
    }

    

}
