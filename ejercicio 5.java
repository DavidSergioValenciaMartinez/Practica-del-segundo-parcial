import java.util.Scanner;
public class Main {
	Scanner teclado=new Scanner(System.in);

	private int [] numeros;
	
	public void inicio(){
		
		numeros=new int[2];

		for(int j=0; j<numeros.length; j++){
			
			System.out.println("ingrese el numero");
			int a=teclado.nextInt();
			numeros[j]=a;
			
    } 
	}
	
	public void ordenamiento(){

	for(int i=0; i<numeros.length; i++){
		for(int j=0; j<numeros.length-1; j++){
			if(numeros[j]>numeros[j+1]){
				
				int aux=numeros[j];
				numeros[j]=numeros[j+1];
				numeros[j+1]=aux;
				
      }  
    } 
  }  
  } 

	public void impresion(){
		
		System.out.println("El orden de los numeros son los siguientes: ");
		for(int i=0; i<numeros.length; i++){
			
			System.out.println(numeros[i]);
			
    }
  }
	
	public static void main(String[] args) {
		
		Main Metodo=new Main();
		Metodo.inicio();
		Metodo.ordenamiento();
		Metodo.impresion();
		
  }
}