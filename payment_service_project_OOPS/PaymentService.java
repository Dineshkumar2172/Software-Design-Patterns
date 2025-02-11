package payment_service_project_OOPS;

import java.util.HashMap;

public class PaymentService {
    // Storing + Making payment
    // For storing we usually use database, but here we can use in-memeory data structure
    HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService(){
        paymentMethods = new HashMap<>(); // initialize payment method upon creting the instance.
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        // updating payments method with user payment info
        paymentMethods.put(name, pm);
    }

    public void makePayment(String name){ // could add amount as well for input
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay(); // run time polymorphism (or dynamic binding)
    }
}
