package паттерны.поведенческие.интерпретатор;

import java.util.List;

class From implements Expression {

    private String table;
    private Where where;

    // constructors

    public From(String string, Where where2) {
        this.table = string;
        this.where = where2;
    }

    public From(String string) {
        this.table = string;
        this.where = new Where(null);
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setTable(table);
        if (where == null) {
            return ctx.search();
        }
        return where.interpret(ctx);
    }
}
