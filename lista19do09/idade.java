package idade;
import java.util.Scanner;
public class idade {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int i=1;
	int id;
	int r;
	do {
		System.out.println("Qual ano você nasceu? ");
		int n= in.nextInt();
		System.out.println("Qual ano estamos? ");
		int a= in.nextInt();
		id = a-n;
		if (id >=18) {
			System.out.println("maior de idade");
			
	}else {
		System.out.println("menor de idade");
	}System.out.println("deseja continuar? 1= sim 2= não");
	  r = in.nextInt();
	}while(r == 1 );
	System.out.println("Obrigado");
	
	
}

}

