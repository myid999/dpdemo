package demo.dp.c.command;

/**
 *concrete command 
 *
 */

public     class LightOffCommand implements Command {
    private Light myLight;
    public LightOffCommand (Light L) {
           myLight = L;
    }
    public void execute() {
           myLight.turnOff();
    }
}
