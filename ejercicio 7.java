import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		 System.out.println("¿Desea inscribir al estudiante en esta institucion presione 1, Desea saber las notas del alumno presione 2,Desea retirar al estudiante presione 3,Mostrar lista de aprobados pulse 4");
      int i=sc.nextInt();
	if(i==1){
     System.out.println("Ingrese cuantos estudiantes ya estan inscritos");
    int tc=sc.nextInt();
    int[] arreglo=new int [tc];
    if(tc<120){
      System.out.println("puedes inscribir a otro estudiante mas");
      System.out.println("Nombre y apellido del estudiante");
     String nombre=sc.next();
    System.out.println("El codigo del estudiante es su ci:");
    int ci=sc.nextInt();
      }else{
      System.out.println("Te exediste ya no puedes resivir mas estudiantes");
      }
   }else if(i==2){
    System.out.println("Usted desea saber sus notas");
    int prom;
      System.out.println("Ingrese la nota del primer pacial");
      int num1=sc.nextInt();
    System.out.println("Ingrese la nota del segundo pacial");
      int num2=sc.nextInt();
    System.out.println("Ingrese la nota del tercer pacial");
      int num3=sc.nextInt();
    prom=(num1+num2+num3)/3;
    System.out.println("El promedio es: "+prom);
    if(prom>50){
      System.out.println("El estudiante aprobo ");
      }else{
      System.out.println("El estudiante reprobo ");
      
    }
      }else if(i==3){
      System.out.println("Entonces usted quiere retirar a un alumno");
      System.out.println("Nombre del estudiante que desea retirar");
        String NombreaRetirar=sc.next();
        System.out.println("Nombre de la materia que desea retirar");
        String MateriaaRetirar=sc.next();
        System.out.println("El estudiante" +NombreaRetirar+ "ya no esta dentro de la materia" +MateriaaRetirar);
  }else if (i==4){
    System.out.println("Ingrese el nombre y apellido del estudiante");
     String nombre=sc.next();
    System.out.println("Ingrese cuantos estudiantes tiene");
    int prom=sc.nextInt();
    int[] arreglo=new int [prom];
    for(int j=0;j<arreglo.length;j++){
       System.out.println("ingrese un nota final " +nombre);
      arreglo[j]=sc.nextInt(); 
      }
    System.out.println("Mostrar las notas finales");
    for(int y=0;y<arreglo.length;y++) {
       System.out.println(nombre+"nota" +y+ " =" + arreglo[y]);
      }
    int num_buscado=50;
    for(int e=0;e<arreglo.length;e++) {
      if(arreglo [e] > num_buscado){
    System.out.println("Los estudiantes aprobados son " +e);
}else{
        System.out.println("Los estudiantes estarian reprobado  y son " +e);
    }
  }
  }
}
  }