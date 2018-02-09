package state;

public class Main {

    public static void main(String[] args) {
	
	Human katyPerry = new Human(new HappyEmotion());
	
	katyPerry.face();
	katyPerry.behavior();
	
	katyPerry.setEmotion(new SadEmotion());

	katyPerry.face();
	katyPerry.behavior();
    }

}
