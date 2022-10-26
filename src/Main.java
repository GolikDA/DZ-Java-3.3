public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; // сумма кредита
        double percent = 9.99; // процентная ставка
        double term = 36; // количество месяцев
        double payment = service.calculate(credit, percent, term);
        System.out.println("Ежемесячный платеж " + payment);
    }

}