import java.util.Scanner;

public class IO {
  //Creates scroll text;
  //thanks to Abheek <3
  private static final int cps = 30;
  public static void scrollPrint(String text) throws InterruptedException {
    for (char c : text.toCharArray()) {
      System.out.print(c);
      Thread.sleep(1000 / cps);
    }
  }

    public static void scrollPrint(String text, int cps) throws InterruptedException {
    for (char c : text.toCharArray()) {
      System.out.print(c);
      Thread.sleep(1000 / cps);
    }
  }
}
