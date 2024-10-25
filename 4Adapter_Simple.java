interface Target{
    void request();
}

class Adaptee{
    public void specificRequest(){
        // ...
    }
}


public class Adapter extends Target{
    Adaptee adaptee; 

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    
    public void request(){
        this.adaptee.spesificRequest();
    }
}

public class Client{
    Target target = new Adapter(new Adaptee());
    
    public void doWork(Target target){
        target.request();
    }
}

