import java.util.Scanner;

public class SplitStringIntoTokens {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      //String[] tokens = s.split("\\s+");
      //String[] tokens = s.split("[\\s!,?._'@]+");
      String[] tokens = s.split("[.]");
      System.out.println(tokens.length);
      for(String el: tokens){
        System.out.println(el);
      }
      scan.close();
    }


  }

