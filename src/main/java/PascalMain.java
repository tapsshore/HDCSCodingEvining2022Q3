public class PascalMain {

  public void sumOfARow(int n) {
    if (n < 0 || n > 30) {
      return;
    }
    System.out.print("\n Input " + n + " \n");
    int totalForARow = (1 << n - 1);
    System.out.print(" Output : " + totalForARow + " \n");
  }

  public static void main(String[] args) {
    PascalMain print = new PascalMain();
    print.sumOfARow(5);
    print.sumOfARow(8);
    print.sumOfARow(30);
  }
}
