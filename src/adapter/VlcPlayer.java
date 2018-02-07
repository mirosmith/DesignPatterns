package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String name) {
	
	System.out.println("Playing vlc file: " + name);
	
    }

    @Override
    public void playMp4(String name) {
	//nothing	
    }    
    

}
