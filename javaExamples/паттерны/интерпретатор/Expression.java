package паттерны.интерпретатор;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}
