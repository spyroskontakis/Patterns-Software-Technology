//Factory
/*Makes objects(of Ship,Truck) of the same family (Transport)
*/

class Truck{
    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }
}

class Ship{
    public void send(){
        //send products
    }
    public void receive(){
        //receive products
    }
}

class Example{
    public static void main(String[] args){
        Truck transport1 = new Truck();
        transport1.send();
        transport1.receive();

        Truck transport2 = new Ship();
        transport2.send();
        transport2.receive();
        
        Truck transport3 = new Truck();
        transport3.send();
        transport3.receive();
    }
}