package паттерны.поведенческие.состояние;

interface State {
    String getName();
    void freeze(StateContext context);
    void heat(StateContext context);
}

