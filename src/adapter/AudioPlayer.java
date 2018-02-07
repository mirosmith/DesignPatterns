package adapter;

public class AudioPlayer implements MediaPlayer {
    
    MediaAdapter adapter;

    @Override
    public void play(String audioType, String name) {
	
	if (audioType.equalsIgnoreCase("mp3")) {
	    System.out.println("Playing mp3 file: " + name);
	}
	else if (audioType.equalsIgnoreCase("vlc")) {
	    adapter = new MediaAdapter("vlc");
	    adapter.play(audioType, name);
	}
	else if (audioType.equalsIgnoreCase("mp4")) {
	    adapter = new MediaAdapter("mp4");
	    adapter.play(audioType, name);
	}
	else {
	    System.out.println("invalid audio type: " + audioType);
	}
	
    }

}
