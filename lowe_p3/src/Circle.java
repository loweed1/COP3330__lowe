    public class Circle extends Shape2D {
        private double radius;
        private String name;

        public Circle(double radius) {
            super();
            this.radius = radius;
            this.name="circle";
        }

        public double getArea() {
            return Math.PI*radius*radius;
        }
        public String getName() {
            return name;
        }
    }
