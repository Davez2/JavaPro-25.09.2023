import Competition.*;
import Figures.*;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Triangle(4, 5), new Square(6)};

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println(totalArea);

        Participant[] participants = {new Human(150,3), new Cat(105,2), new Robot(70,1)};
        Obstacle[] obstacles = {new RunningTask(100), new WallTask(2)};

        for (Participant p : participants) {
            for (Obstacle o : obstacles) {

                if (o instanceof RunningTask) {
                    if (p.getMaxRunDistance() >= o.getLength()) {
                        p.run();
                        System.out.printf("Учасник %s пройшов перешкоду %s на дистанції %d%n",
                                p.getClass().getSimpleName(),
                                o.getClass().getSimpleName(),
                                o.getLength());
                    } else {
                        System.out.printf("Учасник %s не пройшов перешкоду %s на дистанції %d. Пройдено %d%n",
                                p.getClass().getSimpleName(),
                                o.getClass().getSimpleName(),
                                o.getLength(),
                                p.getMaxRunDistance());
                        break;
                    }
                }
                if (o instanceof WallTask) {
                    if (p.getMaxJumpDistance() >= o.getHeight()) {
                        p.jump();
                        System.out.printf("Учасник %s пройшов перешкоду %s на дистанції %d%n",
                                p.getClass().getSimpleName(),
                                o.getClass().getSimpleName(),
                                o.getHeight());
                    } else {
                        System.out.printf("Учасник %s не пройшов перешкоду %s на дистанції %d. Пройдено %d%n",
                                p.getClass().getSimpleName(),
                                o.getClass().getSimpleName(),
                                o.getHeight(),
                                p.getMaxJumpDistance());
                        break;
                    }
                }
            }
        }
    }
}