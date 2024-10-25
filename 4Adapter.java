//Adapter
/*Enable two incompatible interfaces to work together */
public interface Target{
    void request(int data);
}

public class TargetImplementation implements Target{
    public void request(int data){
        // ...
    }
}

public class Client{
    private int data;

    public void doWork(Target targetObject){    
        targetObject.request(data);
    }
}

public class Main{
    public static void main(String[] args) {
        Client client = new Client();

        Target target = new TargetImplementation();
        client.doWork(target);
    }
}