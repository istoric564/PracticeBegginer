package Day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Bobo");
        User user2 = new User("Gogo");
        user1.sendMessage(user2,"Hello");
        user2.sendMessage(user1,"Hi!");
        user1.subscribe(user2);
        System.out.println(user1.subscriptions);
        System.out.println(user1.isFriend(user2));
        MessageDataBase.showDialog(user1,user2);
        System.out.println();
    }
}
