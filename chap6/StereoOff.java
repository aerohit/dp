public class StereoOff implements Command {
	Stereo stereo;
	
	public StereoOff(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}

}
