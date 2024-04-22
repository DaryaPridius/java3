public class Main {
    public static void main(String[] args) {
        int start = 100;
        int x = 800;
        int bonus;
        if (x > 1000) {
            bonus = x / 100;
        } else {
            bonus = 0;
        }
        int score = start + x;
        System.out.println("Счёт:" + score);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
