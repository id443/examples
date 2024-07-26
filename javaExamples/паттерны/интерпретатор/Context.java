package паттерны.интерпретатор;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Context {

    private static Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> list = new ArrayList<>();
        list.add(new Row("John", "Doe"));
        list.add(new Row("Jan", "Kowalski"));
        list.add(new Row("Dominic", "Doom"));

        tables.put("people", list);
    }

    private String table;
    private String column;
    private Predicate<String> whereFilter;

    List<String> search() {

        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(entry -> Stream.of(entry.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .filter(whereFilter)
                .collect(Collectors.toList());

        clear();

        return result;
    }

    void clear() {
        tables.clear();
    }

    void setTable(String table) {
        this.table = table;
    }

    void setColumn(String column) {
        this.column = column;
    }

    void setFilter(Predicate<String> whereFilter) {
        this.whereFilter = whereFilter;
    }
}
