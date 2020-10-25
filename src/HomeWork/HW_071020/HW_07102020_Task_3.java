package HomeWork;

public class HW_07102020_Task_3 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234254757842459", "VISA",
                "IVANOV IVAN", 1222, 458);
        CreditCard.ValidCard validCard=creditCard.new ValidCard();

        int validrez=creditCard.cardvalidator(creditCard);
        if(validrez==0){
            System.out.println("Карта указана корректно!");
        }
    }
}
