public class Light {
	private String room;
	public Light(String room) {
		this.room = room;
	}
	public void on() {
		System.out.println("The " + room + "'s light was turned on");
	}
	public void off() {}
}
