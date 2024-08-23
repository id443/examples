package паттерны.поведенческие.интерпретатор;

import java.util.List;
import java.util.function.Predicate;

class Where implements Expression {

    private Predicate<String> filter;

    // constructor

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setFilter(filter);
        return ctx.search();
    }
}
