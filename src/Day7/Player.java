package Day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;


    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (stamina == 0){
            countPlayers--;
        }
    }

    public int getStamina() {
        return stamina;
    }
    void run(){
        stamina--;
        if(stamina == 0){
            System.out.println("Игрок уходит с поля. Выносливость равна " + this.stamina);
        }
    }
   public static void info(){
        if (countPlayers < 6){
            System.out.println("Команды не полные. На поле есть еще " + (6 - countPlayers ) + "мест");
        }else {
            System.out.println("На поле нет свободных мест. ");
        }
    }
}
