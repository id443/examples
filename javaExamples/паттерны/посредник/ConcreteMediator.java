package паттерны.посредник;

public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(ConcreteColleague2 colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public void send(String message, Colleague sender) {
        if (sender.equals(colleague1)) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
}
