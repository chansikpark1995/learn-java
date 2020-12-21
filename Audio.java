package sec01.exam04;

public class Audio implements RemoteControl {
	
	private int volume;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio Å´");
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio ²û");
	}

	
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
	if(volume>RemoteControl.MAX_VOLUME) {
		this.volume = RemoteControl.MAX_VOLUME;
		}
	else if(volume<RemoteControl.MIN_VOLUME)
		this.volume = RemoteControl.MIN_VOLUME;
		}
	
}