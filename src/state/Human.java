package state;

/**
 * 
 * In State pattern, we create objects which represent various states 
 * and a context object whose behavior varies as its state object changes.
 * 
 */
public class Human {
    
    private Emotion emotion;

    public Human(Emotion emotion) {	
	this.emotion = emotion;
    }    
    
    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public void face() {
	emotion.showSomething();
    }
    
    public void behavior() {
	emotion.doSomething();
    }

}
