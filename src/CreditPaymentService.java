public class CreditPaymentService {
    double calculate(double credit, double percent, double term) {
        double monthPercent = percent / 12 / 100;
        double x = 1 + monthPercent;
        double coefficientA = monthPercent * Math.pow(x, term) / (Math.pow(x, term) - 1);
        int payment = (int) (credit * coefficientA);
        return payment;
    }
}
