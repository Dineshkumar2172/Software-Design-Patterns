package payment_service_project_OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("DineshkumarDebitCard", new DebitCard("76482910349", "Dineshkumar"));
        ps.addPaymentMethod("DineshkumarCreditCard", new CreditCard("673828372649", "Dineshkumar"));
        ps.addPaymentMethod("DineshkumarUPI", new UPI("dinesh876987@upi"));

        ps.makePayment("DineshkumarDebitCard");
        ps.makePayment("DineshkumarCreditCard");
        ps.makePayment("DineshkumarUPI");
    }
}
