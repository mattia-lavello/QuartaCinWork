public class Players {
    public static void main(String[] args) throws Exception {

        Player p1 = new Player("Tizio");
        Player p2 = new Player("Caio");
        p1.setValore(150);
        p2.load();

        System.out.println(p1);
        System.out.println(p2);
        p1.save();
        p2.save();

        Team team = new Team("Squadrone");
        team.add(p1);
        team.add(p2);
        System.out.println(team);
        team.salvaTeam();
        team.caricaTeam();
        System.out.println(team);

        Team team2 = new Team("Squadrone2");
        team2.caricaTeam();
        System.out.println(team2);
    }
}
