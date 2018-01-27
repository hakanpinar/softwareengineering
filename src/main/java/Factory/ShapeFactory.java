package Factory;

public class ShapeFactory {
    public Shape getShape(String type){
        if (type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
