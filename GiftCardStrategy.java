package question_number_3;

public class GiftCardStrategy implements PaymentStrategy {
    private String cardHolderName;
    private String expirationDate;
    private String cardNumber;
    
    public GiftCardStrategy(String nm, String ccNum,  String expiryDate){
        this.cardHolderName=nm;
        this.expirationDate=expiryDate;
        this.cardNumber=ccNum;
    }
    
    @Override
    public void pay(int paymentAmount) {
        System.out.println("Gift Card payment of "+ paymentAmount + " is successful");
    } 
}
