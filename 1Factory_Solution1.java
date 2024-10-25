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

class Factory{
    public static Transport createTransport(String type){
        if(type.equals("truck")){
            return new Truck();
        }else if(type.equals("ship")){
            return new Ship();
        }else{
            return null;
        }
    }
}

class Example{
    public static void main(String[] args){
        Transport transport1 = Factory.createTransport("truck");
        transport1.send();
        transport1.receive();

        Transport transport2 = Factory.createTransport("ship");
        transport2.send();
        transport2.receive();

        Transport transport3 = Factory.createTransport("truck");
        transport3.send();1
        transport3.receive();
    }
}