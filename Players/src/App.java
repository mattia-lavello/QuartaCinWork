public class App {
    public static void main(String[] args) throws Exception {

        Player p = new Player("Tizio");
        Player p2 = new Player("Caio");
        p2.setValore(150);
        System.out.println(p);
        System.out.println(p2);
        p.save();
        p2.save();
    }
}
