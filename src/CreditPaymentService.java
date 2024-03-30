public class CreditPaymentService {
    public int calculate(int amountCredit, double interestRate, int creditTerm) {
        double monthlyPayment;
        int creditTermMonth = creditTerm * 12;
        double monthlyRate = interestRate / (100 * 12);
        monthlyPayment = amountCredit * ((monthlyRate * Math.pow((1 + monthlyRate), creditTermMonth)) / (Math.pow((1 + monthlyRate), creditTermMonth) - 1));
        return (int) monthlyPayment;
    }
}
