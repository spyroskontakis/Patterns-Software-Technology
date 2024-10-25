class Item{
    private String name;
    private double price;

    //Constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
}

interface PaymentStrategy{
    public void pay();
}

class CreditCardStrategy implements PaymentStrategy{
    private ArrayList<Item> items;
    private String name;
    private int cardNumber;
    private int cvv;
    private String dateOfExpiry;

    //Constructor
    public CreditCardStrategy(ArrayList<Item> items, String name, int cardNumber, int cvv, String dateOfExpiry){
        this.items = items;
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(){
        //pay
    }
}

class PayPalStrategy implements PaymentStrategy{
    private ArrayList<Item> items;
    private String email;
    private String password;

    public PayPalStrategy(ArrayList<Item> items, String email, String password){
        this.items = items;
        this.email = email;
        this.password = password;
    }

    public void pay(){
        //pay
    }
}

class Payment{
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
        // ...
        strategy.pay();
        // ...
    }
}

class Example{
    public static void main(String[] args) {
        Payment payment = new Payment();

        Item item1 = new Item("TV", 1000);
        Item item2 = new Item("XBOX", 400);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(item1);
        items.add(item2);

        PaymentStrategy creditCard = new CreditCardStrategy(items, "George", 1234, 123, "04/09/2024");

        payment.setStrategy(creditCard);
        payment.pay();

        PaymentStrategy payPal = new PayPalStrategy(items, "george@gmail.com", "12345");
        payment.pay();
    }
}