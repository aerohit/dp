public class Stereo {
	private String room;

	public Stereo(String room) {
		this.room = room;
	}

	public void on() {
		System.out.println("Turning the stereo on in " + room);
	}
	
	public void off() {
		System.out.println("Turning the stereo off");
	}
	
	public void setCd() {
		System.out.println("Setting the stereo cd");
	}
	
	public void setDvd() {
		System.out.println("Setting the stereo dvd");
	}
	
	public void setRadio() {
		System.out.println("Setting the stereo on radio");
	}
	
	public void setVolume(int level) {
		System.out.println("Setting the stereo volume to " + level);		
	}
}
