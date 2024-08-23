package паттерны.поведенческие.интерпретатор;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}
