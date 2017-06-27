import java.io.Console;

class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    boolean running = false;

    while(running) {
      System.out.println("Please enter your dimensions. First, Width:");
      int userWidth = Integer.parseInt(myConsole.readLine());
      System.out.println("Height:");
      int userHeight = Integer.parseInt(myConsole.readLine());
      System.out.println("Length:");
      int userLength = Integer.parseInt(myConsole.readLine());
      System.out.println("Weight:");
      int userWeight = Integer.parseInt(myConsole.readLine());


      Parcel userParcel = new Parcel(userWidth, userHeight, userLength, userWeight);
    }
  }
}
