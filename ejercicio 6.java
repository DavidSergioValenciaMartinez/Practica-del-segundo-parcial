import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese de la personas trabajan en el lugar");
    int tam=sc.nextInt();
    int[] arreglo=new int [tam];
    for(int i=0;i<arreglo.length;i++){
       System.out.println("ingrese el salario de la persona" +i);
      arreglo[i]=sc.nextInt(); 
      }
    System.out.println("Mostrar los salarios");
    for(int y=0;y<arreglo.length;y++) {
       System.out.println("nota" +y+ " =" + arreglo[y]);
      }
    System.out.println("ingrese cuanto paga a sus empleados las horas trabajadas");
    int num_buscado=sc.nextInt();
    for(int e=0;e<arreglo.length;e++) {
      if(arreglo [e] > num_buscado){
    System.out.println("el mejor salario  es " +e);
    }
  }
  }
  }
  