// Prototype
/*To make exact copies of objects, instead of directr creation of them */

interface Transport{
    public void send();

    public void receive();
}

class Truck implements Transport{
    private String license;

    public Truck(String license){
        this.license = license;
    }

    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }

    public String getLicense(){
        return license;
    }
}

class Ship implements Transport{
    private String license;

    public Ship(String license){
        this.license = license;
    }

    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }

    public String getLicense(){
        return license;
    }
}

class Example{
    public static void main(String[] args) {
        Truck truck = new Truck("1234");
        Ship ship = new Ship("abcd");

        String license = truck.getLicense();
        Transport transport1 = new Truck(license);
        transport1.send();
        transport1.receive();

        String license2 = ship.getLicense();
        Transport transport2 = new Ship(license2);
        transport2.send();
        transport2.receive();

        String license3 = truck.getLicense();
        Transport transport3 = new Truck(license3);
        transport3.send();
        transport3.receive();
    }
}