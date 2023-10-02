public class FactoryExample {

    /*
    Factory ve AbstractFactory
    eger obyektlerimiz cox olarsa factory evezinde AbstractFactory yaradiriq bunu bash idare kimi dushunmek olar.

     */
    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Circle drawn");
        }
    }

    class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Square drawn");
        }
    }

    class ShapeFactory {
        public Shape createShape(String type) {
            if (type.equalsIgnoreCase("circle")) {
                return new Circle();
            } else if (type.equalsIgnoreCase("square")) {
                return new Square();
            }
            return null;
        }
    }
}
