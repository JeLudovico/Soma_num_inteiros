import java.util.Scanner;

  public class leitor_numeros_inteiros {
	  public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println(" Soma =" + soma);
		
		sc.close();
		
	}
	
}
  
  //https://github.com/JeLudovico/Soma_de_numeros_inteiros.git