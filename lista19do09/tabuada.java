package tabuada;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t, r, i;
		System.out.println("Digite o numero desejado");
		t = in.nextInt();
		for(i= 1; i<11; i++) {
		r = t*i;
		System.out.println(r);
	}

}
}
