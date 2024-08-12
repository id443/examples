package паттерны.порождающие.абстрактнаяФабрика;

class ProductA2 implements AbstractProductA {
    @Override
       public void interact(AbstractProductB b) {
           System.out.println(this.getClass().getName() + " interacts with " + b.getClass().getName());
       }
   }
