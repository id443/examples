package паттерны.структурные.адаптер;

public class Client
{
  public static void eat(Object dish)
  { System.out.println("Ем"); }
  public static void callAmbulance()
  { System.out.println("Скорая помощь"); }
  public static void main(String[] args)
  {
    Chief ch = new ChiefAdapter();
    Object dish = ch.makeBreakfast();
    eat(dish);
    dish = ch.makeLunch();
    eat(dish);
    dish = ch.makeDinner();
    eat(dish);
    callAmbulance();
  }
}