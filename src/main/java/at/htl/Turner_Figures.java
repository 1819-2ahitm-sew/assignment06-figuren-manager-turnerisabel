package at.htl;
import javax.swing.text.MutableAttributeSet;
import java.util.Scanner;

public class Turner_Figures {

    public static void main(String[] args) {

       // Erstellen der Superklasse Figure

        abstract class Figure {

            // Erstellen der Subklassen

            public abstract int area();

            public abstract int circumference();

            public abstract String output();
        }

        // Subklasse Square

        class Square extends Figure {
            private int length;

            public Square(int length) {
                this.length = length;
            }

            public int area() {
                return length * length;
            }

            public int circumference() {
                return length * 4;
            }

            public String output() {
                return "Quadrat mit Seitenlänge " + length + ": Fläche -> " + area() + ", Umfang -> " + circumference();
            }
        }

        // Subklasse Rechteck

        class Rectangle extends Figure {

            private int height;
            private int width;

            public Rectangle(int width, int height) {
                this.width = width;
                this.height = height;
            }

            public int area() {
                return width * height;
            }

            public int circumference() {
                return width * 2 + height * 2;
            }

            public String output() {
                return "Rechteck mit der Breite " + width + " und der Höhe " + height + ": Fläche -> " + area() + ", Umfang -> " + circumference();
            }
        }

        // Subklasse Circle

        class Circle extends Figure {

            private int radius;

            public Circle (int radius){
                this.radius = radius;
            }

            public int area() {
                return (int) (Math.PI * (radius * radius));
            }

            public int circumference() {
                return (int) (2 * Math.PI * radius);
            }

            public String output(){
                return "Kreis mit dem Radius " + radius + ": Fläche -> " + area() + ", Umfang -> " + circumference();
            }
        }

        // Subklasse Ellipse

        class Ellipse extends Figure {

            private int hauptachse;
            private int nebenachse;

            public Ellipse(int hauptachse, int nebenachse) {
                this.hauptachse = hauptachse;
                this.nebenachse = nebenachse;
            }

            public int area() {
                return (int) (hauptachse * nebenachse * Math.PI);
            }

            public int circumference() {
                return (int) (Math.PI * (Math.sqrt(2 * (hauptachse * hauptachse * nebenachse * nebenachse))));
            }

            public String output() {
                return "Ellipse mit der Hauptachse " + hauptachse + " und der Nebenachse " + nebenachse + ": Fläche -> " + area() + ", Umfang -> " + circumference();
            }
        }

            // Subklasse Triangle

            class Triangle extends Figure {

                private int side1;
                private int side2;
                private int side3;
                private int height;

                public Triangle(int side1, int side2, int side3, int height) {
                    this.side1 = side1;
                    this.side2 = side2;
                    this.side3 = side3;
                    this.height = height;
                }

                public int area(){
                    return (side1 * height) / 2;
                }

                public int circumference() {
                    return side1 + side2+ side3;
                }

                public String output() {
                    return "Dreieck mit den Seitenlängen " + side1 + ", "+ side2 +", "+ side3 + " und der Höhe "+ height + ": Fläche -> " + area() + ", Umfang -> " + circumference();
                }
            }

            // Array erstellen

            Figure [] figures = new Figure[10];

            // Subklassen mit Werte in Array speichern

             figures[0] = new Square(3);
             figures[1] = new Rectangle(5,4);
             figures[2] = new Circle(5);
             figures[3] = new Ellipse(10, 6);
             figures[4] = new Triangle(3, 4, 5, 6);


             // Bildschirmausgabe

        System.out.println("Datenanzeige: ");
        System.out.println("--------------");


        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                System.out.println(figures[i].output());
            }
        }
    }
}