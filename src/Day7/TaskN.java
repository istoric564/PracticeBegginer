package Day7;

public class TaskN {
    public static void main(String[] args) {
//        Airplane plane1 = new Airplane("Boeing", 2009, 18, 45000);
//        Airplane plane2 = new Airplane("Sikorsky", 2010, 22, 50000);
//        Airplane.compareAirplanes(plane1,plane2);
        Player player1 = new Player(90);
        Player player2 = new Player(96);
        Player.info();
        Player player3 = new Player(95);
        Player player4 = new Player(92);
        Player.info();
        Player player5 = new Player(100);
        Player player6 = new Player(99);
        Player.info();
        Player player7 = new Player(90);
        Player.info();
        for (int i = 0; i < 100; i++){
            player1.run();
        }
    }
}
