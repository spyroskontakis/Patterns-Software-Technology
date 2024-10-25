// Facade
/* Provides a simplified interface to a complex system */

class Iphone{
    public void modelNo(){
        System.out.println("Iphone 14");
    }
}
class Samsung{
    public void modelNo(){
        System.out.println("Samsung S14");
    }
}
class BlackBerry{
    public void modelNo(){
        System.out.println("BlackBerry Z10");
    }
    public void price(){
        System.out.println("Price is $500");
    }
}

class Facade{
    public void printModels(){
        Iphone i = new Iphone();
        Samsung s = new Samsung();
        BlackBerry b = new BlackBerry();

        i.modelNo();
        s.modelNo();
        b.modelNo();
    }

    public void printPrices(){
        BlackBerry b = new BlackBerry();
        Iphone i = new Iphone();

        i.price();
        b.price();
    }
}

class Client{
    Facade facade = new Facade();

    public void showModels(){
        System.out.println("The available models are: ");
        // ...
        facade.printModels();
        // ...
        // ...
    }

    public void showPrices(){
        // ...
        facede.printPrices();
    }
}