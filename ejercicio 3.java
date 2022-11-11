import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese el cuantas notas quiere poner");
    int tam=sc.nextInt();
    int[] arreglo=new int [tam];
    for(int i=0;i<arreglo.length;i++){
       System.out.println("ingrese un nota" +i);
      arreglo[i]=sc.nextInt(); 
      }
    System.out.println("Mostrar las notas");
    for(int y=0;y<arreglo.length;y++) {
       System.out.println("nota" +y+ " =" + arreglo[y]);
      }
    int num_buscado=50;
    for(int e=0;e<arreglo.length;e++) {
      if(arreglo [e] > num_buscado){
    System.out.println("la mejor nota es " +e);
  }
}
    }
  }