public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.calculate(1000000, 9.99, 1));
        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 2));
        System.out.println();
        System.out.println(service.calculate(1000000, 9.99, 3));
    }
}