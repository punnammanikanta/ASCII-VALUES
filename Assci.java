
    import java.util.Scanner;
    public class Assci {
    public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      System.out.println("enter the char");
      char character = input.next().charAt(0);
      int asciiValue=(int)character;
      System.out.println(asciiValue);
      input.close();
    }
}

    

