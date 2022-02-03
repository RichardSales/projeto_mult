import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		
		System.out.println("Digite dois números");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			
			System.out.println("Sao multiplos");
			
			
		}

		else {
			
			System.out.println("Nao sao Multiplos");
		
		
		}
		
		
		sc.close();
	}

}
