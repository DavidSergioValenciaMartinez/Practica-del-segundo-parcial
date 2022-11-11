import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    double p;
    double e;
    double ims;
System.out.println("Ingrese su peso en Kg");
     p=leer.nextDouble();
    System.out.println("Ingrese su estatura en Metros");
     e=leer.nextDouble();
      ims=p/(e*e);
    System.out.println("Su Indice de Masa corporea es de ="+ims);
    if(ims>18 && ims<25){
      System.out.println("Su peso es saludable");
      }else{
    System.out.println("Su peso no es saludable");
  }
}
  }