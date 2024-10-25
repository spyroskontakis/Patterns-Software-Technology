//Command
/*Turns an operation into a stand-alone object called a "command" */
public class Light{
    public void on(){
        System.out.println("Light is on!");
    }
    public void off(){
        System.out.println("Light is off!");
    }
}

public class Stereo{
    public void on(){
        System.out.println("Light is on!");
    }
    public void off(){
        System.out.println("Light is off!");
    }
    
    public void setCD(){
        System.out.println("Stereo is set for CD input");
    }
    public void setDVD(){
        System.out.println("Stereo is set for DVD input");
    }
    public void setRadio(){
        System.out.println("Stereo is set for Radio");
    }
    public void setVolume(int Volume){
        System.out.println("Stereo volume set to " +volume);
    }
}

public class Commands{
    private Light light = new Light();
    private Stereo stereo = new Stereo();

    public void lightAndStereoOn(){
        light.on();
        stereo.on();
    }

    public void stereoWithCD(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(12);
    }
}


public class Example{
    public static void main(String[] args) {
        Command commands = new Commands();

        commands.lightAndStereoOn();
        commands.stereoWithCD();
    }
}