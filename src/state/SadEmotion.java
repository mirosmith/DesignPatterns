package state;

public class SadEmotion implements Emotion {

    @Override
    public void showSomething() {
	
	System.out.println("I show you very sad face.");
    }

    @Override
    public void doSomething() {
	
	System.out.println("I weep all day.");
	
    }

}
