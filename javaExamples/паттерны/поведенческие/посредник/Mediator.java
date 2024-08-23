package паттерны.поведенческие.посредник;

public abstract class Mediator {

    public abstract void send(String message, Colleague sender);
}
