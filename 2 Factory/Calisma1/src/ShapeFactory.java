public class ShapeFactory {
    
    public ShapeService getShape(String getShapeType){
        if(getShapeType == null){
            return null;
        }
        else if(getShapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
    
        else if(getShapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        
        else if(getShapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else{
            return null;
        }
    }

}
