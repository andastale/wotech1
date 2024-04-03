public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //winter, spring, summer, fall
    //warm jacket, t-shirt, swimming suite, rain coat
    String season = "cool";
    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }
    else{
      System.out.println("I do not recognise this season!");
    }
  }
}
