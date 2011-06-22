public class RemoteControlTest {
	
	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Living room");
		LightOnCommand lightCommand = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor(""); 
		GarageDoorOpenCommand garageCommand = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightCommand);
		remote.pressButton();
		remote.setCommand(garageCommand);
		remote.pressButton();
	}
}
