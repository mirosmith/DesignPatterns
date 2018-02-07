package adapter;

public class Main {

    public static void main(String[] args) {
	
	AudioPlayer myPlayer = new AudioPlayer();
	
	myPlayer.play("mp4", "Avicii - X You");
	myPlayer.play("vlc", "ACDC - Thunderstruck");
	myPlayer.play("mp3", "Aneta Langerova - Kridla motyli");
	myPlayer.play("mov", "Sia - Chandelier");

    }

}
