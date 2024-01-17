public class Main {
    public static void main(String[] args) {

        int account = 100;
        int added = 1100;
        int bonus;
        int sum = account + added;
        if (added < 1000) {
            bonus = 0;
        } else {
            bonus = added / 100;
            sum = account + added + bonus;
        }

        System.out.println(bonus);
        System.out.println(sum);
    }
}