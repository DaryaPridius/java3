public class Main {
    public static void main(String[] args) {
        int start = 100;
        int refill = 1100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int score = start + refill;
        System.out.println("Счёт:"+ score);
        System.out.println("Бонусные рубли:" + bonus);
    }
}
