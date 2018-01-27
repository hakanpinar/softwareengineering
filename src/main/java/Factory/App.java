package Factory;

public class App {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape shape = factory.getShape("Rectangle");
        shape.draw();
    }
}
