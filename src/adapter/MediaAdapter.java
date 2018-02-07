package adapter;

public class MediaAdapter implements MediaPlayer {
    
    AdvancedMediaPlayer advancedPlayer;
    
    public MediaAdapter(String audioType) {
	
	if (audioType.equalsIgnoreCase("vlc")) {
	    advancedPlayer = new VlcPlayer();
	}
	else if (audioType.equalsIgnoreCase("mp4")) {
	    advancedPlayer = new Mp4Player();
	}
	
    }

    @Override
    public void play(String audioType, String name) {
	
	if (audioType.equalsIgnoreCase("vlc")) {
	   advancedPlayer.playVlc(name);
	}
	else if (audioType.equalsIgnoreCase("mp4")) {	  
	    advancedPlayer.playMp4(name);
	}
	
    }
    
    

}
