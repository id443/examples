package паттерны.порождающие.объектныйПул;

public class DemoPO {
    public static void main(String[] args) {
        PooledObjectPool pop = new PooledObjectPool();
        PooledObject  po = pop.getObject();
        po.setTemp1("temp1");
        po.setTemp1("temp11");
        System.out.println(po.getTemp1());

    }
}
