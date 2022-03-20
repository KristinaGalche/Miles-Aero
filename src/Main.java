public class Main {
    public static void main(String[] args) {

        int ticketPrice = 120;
        int bonusValue = 20;

        int miles = ticketPrice / bonusValue;

        System.out.println("Количество ваших бонусных миль: " + miles);
    }
}