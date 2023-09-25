public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int replenishment = 2200;


        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println( bonus + " бонусов ");
    }
}