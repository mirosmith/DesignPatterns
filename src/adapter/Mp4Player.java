package adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String name) {
	// nothing	
    }

    @Override
    public void playMp4(String name) {
	
	System.out.println("Playing Mp4 file: " + name);
	
    }

}
