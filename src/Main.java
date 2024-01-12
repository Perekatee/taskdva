public class Main {
    public static void main(String[] args) {

        int x = 500;
        int y = 1500;
        int bonus;
        int sum = x+y;
        if (y < 1000) {
            bonus = 0;
        } else {
            bonus = y / 100;
        }

        System.out.println(bonus);
        System.out.println(sum);
    }
}