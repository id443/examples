package javaExamples.паттерны.слуга;

public class Demo {
    public static void main(String[] args) {
        MoveServant moveServant = new MoveServant();
        Movable movable = new Ellipse();
        movable.setPosition(new Position(0, 0));
        moveServant.moveBy(movable, 10,20);
    }
}
