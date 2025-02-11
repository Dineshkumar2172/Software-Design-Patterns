package payment_service_project_OOPS;

abstract public class Card implements PaymentMethod{

    // NOTE: private members are not accessible outside the class
    // if you want to access these private members outside the class, we need to write a getter method
    // else we can use protected instead of private - these members are accessible both inside the class and in the child class
    //
    // ACCESS MODIFIERS:
    // 1. If we don't mention anything - then its default (or package private) - things are visible within the same package
    // 2. If we write public - then it's visible everywhere
    // 3. If we write private - then it's visible only within the class
    // 4. If we write protected - then it's visible within the class and the child classes that inherits this class
    protected String cardNo;
    private String userName;

    public Card(String cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(){
        return cardNo;
    }

    public String getUserName(){
        return userName;
    }
}
