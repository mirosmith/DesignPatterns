package state;

public class HappyEmotion implements Emotion {

    @Override
    public void showSomething() {
	
	System.out.println("I show you happy face.");
    }

    @Override
    public void doSomething() {
	
	System.out.println("I smile all the time.");
    }

}
