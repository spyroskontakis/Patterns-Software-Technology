//Singleton
/*Want only one reference, object of a Class */

class Connection{
    private String connectionData;

    //Constructor empty
    public Connection(){

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
        //All objects are in different storage cells
        Connection c1 = new Connection();
        Connection c2 = new Connection();
        Connection c3 = new Connection();
    }
}