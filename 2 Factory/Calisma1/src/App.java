public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        ShapeFactory factory = new ShapeFactory();
        ShapeService shapeService = factory.getShape("Circle");
        shapeService.draw();

        shapeService = factory.getShape("Rectangle");
        shapeService.draw();

        ShapeService squareService = factory.getShape("square");
        squareService.draw();

        if(shapeService == squareService){
            System.out.println("gsas");
        }
    }
}
