package HomeWork;

public class CreditCard {
    private String cardnumber;
    private String cardview;
    private String cardowner;
    private int csrdexpirydate;
    private int csrdcvv;

    public CreditCard(String cardnumber, String cardview, String cardowner, int csrdexpirydate, int csrdcvv) {
        this.cardnumber = cardnumber;
        this.cardview = cardview;
        this.cardowner = cardowner;
        this.csrdexpirydate = csrdexpirydate;
        this.csrdcvv = csrdcvv;
    }
    public int cardvalidator(CreditCard card) {
        ValidCard validCard = new ValidCard();
        int rez=0;
        if (!validCard.validcatdnumber(card.cardnumber)) {
            System.out.println("Номер карты указан не корректно!");
            rez++;
        }
        if(!validCard.validdigit(card.cardnumber)){
            System.out.println("Номер карты указан не корректно!");
            rez++;
        }
        if(!validCard.validcardview(card.cardview)){
            System.out.println("Вид карты указан не корректно!");
            rez++;
        }
        if(!validCard.validcardowner(card.cardowner)){
            System.out.println("Владелец карты не указан!");
            rez++;
        }
        if(!validCard.validexpiry(card.csrdexpirydate)){
            System.out.println("Срок действия карты указан не корректно!");
            rez++;
        }
        if(!validCard.validcvv(card.csrdcvv)){
            System.out.println("CVV код карты указан не корректно!");
            rez++;
        }
        return  rez;

    }
    class ValidCard {
        public boolean validcatdnumber(String numb) {
            if (numb.length() == 16) {
                return true;
            } else return false;
        }

        public boolean validcardview(String view) {
            if (view == "Master Card" || view == "VISA" || view == "Belcard") {
                return true;
            } else return false;
        }

        public Boolean validcardowner(String owner) {
            boolean tmp = (owner != "") ? true : false;
            return tmp;
        }

        public boolean validexpiry(int exdate) {
            if (Integer.toString(exdate).length() == 4) {
               /* DateFormat dateformaty=new SimpleDateFormat("yyyy-MM");
                //DateFormat dateformastm=new SimpleDateFormat("MM");
                Date datenow= new Date;*/
                return true;
            } else return false;
        }

        public boolean validcvv(int cvv) {
            if (Integer.toString(cvv).length() == 3) {
                return true;
            } else return false;
        }
        public boolean validdigit(String numbercard){
            return numbercard.matches("[0-9]+");
        }
    }
}
