package maang_prep.behavioral;

interface PaymentStratey {
    void pay(int amount);
}

class CreditCardPaymentService implements PaymentStratey {

    private String cardNumber;

    public CreditCardPaymentService (String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay (int amount) {
        System.out.println("Amount " + amount + " debited from your creditcard " + cardNumber);
    }
}

class PhonepePaymentServices implements PaymentStratey {

    private String upiId;

    public PhonepePaymentServices(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Amount " + amount + " debited from your account - " + upiId);
    }
}

class ShoppingCart {

    private PaymentStratey paymentStratey;

    public void setPaymentStrategy(PaymentStratey paymentStratey) {
        this.paymentStratey =paymentStratey;
    }

    public void checkout(int amount) {
        if ( paymentStratey == null ) {
            System.out.println("Please update your payment method before proceeding");
        } else {
            paymentStratey.pay(amount);
        }
    }
}

public class Strategy {
    // The Strategy Pattern is a behavioral design pattern that allows a class's behavior to be selected at runtime. Instead of implementing multiple behaviors inside a class, it delegates the behavior to different strategy implementations.
    
    // Key Components:
    //      Strategy (Interface) → Defines a common interface for all algorithms (strategies).
    //      Concrete Strategies → Implement the algorithm in different ways.
    //      Context → Maintains a reference to a Strategy and delegates execution to it.

    // 🔹 When to Use Strategy Pattern?
    //      ✅ Multiple algorithms for the same task (sorting, encryption, logging).
    //      ✅ Dynamic behavior selection at runtime (payment methods, shipping costs).
    //      ✅ Avoiding if-else chains in decision-making logic.

    public static void main(String[] args) {
        CreditCardPaymentService creditCard = new CreditCardPaymentService("786287368762");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPaymentStrategy(creditCard);
        shoppingCart.checkout(2349);
    }
}
