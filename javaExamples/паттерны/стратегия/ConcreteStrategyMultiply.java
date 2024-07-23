package паттерны.стратегия;

class ConcreteStrategyMultiply implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }    
}
