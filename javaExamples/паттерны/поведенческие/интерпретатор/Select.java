package паттерны.поведенческие.интерпретатор;

import java.util.List;

class Select implements Expression {

    private String column;
    private From from;

    // constructor

    public Select(String string, From from2) {
        this.column = string;
        this.from = from2;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx);
    }
}
