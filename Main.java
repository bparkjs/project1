package select;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     float w;
     Scanner sc = new Scanner(System.in);
     w = sc.nextFloat();
     if(w <= 50.80f)
     {
         System.out.println("Flyweight");
     }
     else if(w <= 61.23f)
     {
      System.out.println("Lightweight");

     }
     else if(w <= 72.57f)
     {
      System.out.println("Middleweight");
     }
     else if(w <= 88.45)
     {
      System.out.println("Cruiserweight");
     }
     else
     {
      System.out.println("Heavyweight");
     }
 }
}