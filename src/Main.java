public class Main {
    public static void main(String[] args) {

        int account = 500;
        int added = 1500;
        int bonus;
        int sum = account + added;
        if (added < 1000) {
            bonus = 0;
        } else {
            bonus = added / 100;
        }

        System.out.println(bonus);
        System.out.println(sum);
    }
}