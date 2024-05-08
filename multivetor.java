package maiooito;
import java.util.Scanner;
public class multivetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];
		
		for (int i =0; i <5; i++) {
		System.out.println("Qual é o "+i+"° valor do A");
		a[i]= ler.nextInt();
	}
		for (int i =0; i <5; i++) {
			System.out.println("E o "+i+"° valor do B?" );
			b[i]= ler.nextInt();
		}
		for (int i =0; i <5; i++) {
			c[i]= a[i];
			c[i+5]= b[i];
			
		}
		for (int i =0; i <5; i++) {
			//System.out.println(c[i]);
			System.out.println(c[i+5]);
		}
		
}
}