package Singleton;

public class App {
    public static void main(String[] args){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
