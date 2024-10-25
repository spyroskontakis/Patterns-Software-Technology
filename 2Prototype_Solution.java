interface Transport{
    public void send();
    public void receive();

    public Transport clone();

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

    public Transport clone(){
        return new Truck(license);
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

    public Transport clone(){
        return new Ship(license);
    }
}

class Manager{
    private HashMap<String, Transport> transports = new HashMap<String, Transport>();

    public Manager(){
        transports.put("truck", new Truck("1234"));
        transports.put("ship", new Ship("abcd"));
    }

    public Transport createTransport(String Type){
        return transports.get(type).clone();
    }
}

class Example{
    public static void main(String[] args){
        Manager manager = new Manager();
        Transport transport1 = manager.createTransport("truck");
        transport1.send();
        transport1.receive();

        Transport transport2 = manager.createTransport("ship");
        transport2.send();
        transport2.receive();

        Transport transport3 = manager.createTransport("truck");
        transport3.send();
        transport3.receive();
    }
}