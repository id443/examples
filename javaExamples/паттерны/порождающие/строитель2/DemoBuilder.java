class DemoBuilder {
  public static void main(Args[]){
    NutritionFacts cocaCola = new NutritionFacts
    .Builder(240, 8)
    .calories(100)
    .sodium(35)
    .carbohydrate(27)
    .build();
  }
}
