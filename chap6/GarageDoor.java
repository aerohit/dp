public class GarageDoor {
	private String room;

	public GarageDoor(String room) {
		this.room = room;
	}

	public void up() {
		System.out.println("The garage door is moved up");
	}
	
	public void down() {
		System.out.println("The garage door is moved down");
	}
	
	public void stop() {
		System.out.println("The garage door is stopped");
	}
	
	public void lightOn() {
		System.out.println("The garage door lights are turned on");
	}
	
	public void lightOff() {
		System.out.println("The garage door lights are turned off");
	}
}
