package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 12, 23, 53);
        Square square = new Square("Квадрат", 54);
        Rectangle rectangle = new Rectangle("Прямоугольник", 2, 4);
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Bagira");

        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {

                System.out.println(((Figure) drawables[i]).getName() + " Периметр равен == " +
                        ((Figure) drawables[i]).calculatePerimerter());
            } else if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());
            }
            drawables[i].draw();
        }




        System.out.println("--------------------------");
        createObject("snake");
        createObject("crocodile");
        createObject("lizard");

    }
        public static Object createObject (String className){
            Snake snake1 = new Snake(3, true, 43);
            Crocodile crocodile = new Crocodile(43, "River", 23);
            Lizard lizard = new Lizard(3, "Green");
            Printable[] reptile = {snake1, crocodile, lizard};
            switch (className) {
                case "snake":
                    snake1.print();
                    return snake1;
                case "crocodile":
                    crocodile.print();
                    return crocodile;
                case "lizard":
                    lizard.print();
                    return lizard;
            }
            return reptile;
        }
    }
