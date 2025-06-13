package oops;

public class Rectangle {
        double height;
        double width;

        public Rectangle(){
            height = 10.0;
            width = 10.0;
        }

        public Rectangle(double height, double width){
            this.height = height;
            this.width = width;
        }

        double perimeter(){
            return 2*(height+width);
        }

        double area(){
            return height*width;
        }
    }

    
