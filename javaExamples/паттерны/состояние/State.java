package javaExamples.паттерны.состояние;

interface State {
    String getName();
    void freeze(StateContext context);
    void heat(StateContext context);
}

