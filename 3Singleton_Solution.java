class Connection{
    private static Connection instance = null;  //Static, so we ensure that only one instance of the class can ever be created
    private String connectionData;

    private Connection(){                       //Private, so we cant make by hand objects using Construtor

    }

    public static Connection getInstance(){
        if(instance == null)
            instance = new Connection();
        return instance;
    }

    //Getter Setter
    public String getConnectionData(){
        return connectionData;
    }
    public void setConnectionData(String data){
        connectionData = data;
    }
}

class Example{
    public static void main(String[] args) {
        //Pointing in same memory position
        Connection c1 = Connection.getInstance();
        Connection c2 = Connection.getInstance();
        Connection c3 = Connection.getInstance();
    }
}