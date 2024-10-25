interface Command{
    public void execute();
}

public class Light{
    public void on() {
        System.out.println("Light is on");
    }
    public void off(){
        System.out.println("Light is off");
    }
}

public class Stereo{
    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCD(){
        System.out.println("CD is set for CD input");
    }
    public void setDVD(){
        System.out.println("DVD is set for DVD input");
    }
    public void setVolume(int volume){
        System.out.println("Volume is set to " + volume);
    }
}

public class lightAndStereoOn implements Command{
    private Light light = new Light();
    private Stereo stereo = new Stereo();

    public void execute(){
        light.on();
        stereo.on();
    }
}

public class StereoOnWithCommand implements Command{
    private Stereo stereo = new Stereo();

    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(12);
    }
}

//Epikalestis
public class Invoker{
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    public void addCommand(String commands, Command command){
        commands.put(commandKey, command);
    }

    public void issueCommand(String commandKey){
        commands.get(commandKey).execute();
    }
    public void runAllComands(){
        for (Command command : commands.values){
            command.execute();
        }
    }
}

public class Example{
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.addCommand("LightAndStereoOnCommand", new LightAndStereoOnCommand());
        invoker.addCommand("StereoOnWithCommand", new StereoOnWithCommand());

        invoker.issueCommand("LightAndStereoOnCommand");
        invoker.issueCommand("StereoOnWithCommand");
    }
}