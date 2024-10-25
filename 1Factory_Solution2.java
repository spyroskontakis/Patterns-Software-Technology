interface Transport{
    public void send();
    public void receive();
}

class Truck implements Transport{
    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }
}

class Ship implements Transport{
    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }
}

abstract class Factory{
    public void manageTransportation(){
        Transport transport = new Transport();
        transport.send();
        transport.receive();
    }
    protected abstract Transport createTransport();
}

class CreateTruck extends Transport{
    protected Transport createTransport(){
        return new Truck();
    }
}
class CreateShip extends Transport{
    protected Transport createTransport(){
        return new Ship();
    } 
}

class Example{
    public static void main(String[] args) {
        Transport transport1 = new Truck();
        transport1.createTruck();

        Transport transport2 = new Ship();
        transport2.createShip();

        Transport transport3 = new CreateTruck();
        transport3.createTransport();
    }
}