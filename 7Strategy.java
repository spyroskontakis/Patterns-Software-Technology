//Strategy
/*Enables selecting an algorithm's behavior at runtime*/

class Item{
    private String name;
    private double price;
    
    //Constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
        
    }
}

class Payment{
    private String strategy;

    public void pay(ArrayList<Item> items, String name, int cardNumber, int cvv, String dateOfExpiry, String email, String password){
        if(strategy.equals("CreditCard")){
            //variables needed: items, name, cardNumber, cvv, dateOfExpiry
            //pay
        }else if(strategy.equals("PayPal")){
            //variables needed: items, email, password
            //pay
        }
    }

    public void setStrategy(String strategy){
        this.strategy = strategy;
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

        payment.setStrategy("CreditCard");
        payment.pay(items, "George", 1234, 123, "04/09/2024", null, null);

        payment.setStrategy("PayPal");
        payment.pay(items, null, 0, 0, null, "george@gmail.com", "12345");
    }
}