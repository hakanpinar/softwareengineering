package Strategy;

public class Sporter {
    private SchietBehavior schietBehavior;

    public Sporter(SchietBehavior schietBehavior) {
        this.schietBehavior = schietBehavior;
    }

    public void executeSchiet(){
        schietBehavior.schiet();
    }
}
