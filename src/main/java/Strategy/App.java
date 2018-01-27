package Strategy;

public class App {
    public static void main(String[] args){
        Sporter sporter = new Sporter(new Linkervoet());
        sporter.executeSchiet();
        sporter = new Sporter(new Rechtervoet());
        sporter.executeSchiet();
    }
}
