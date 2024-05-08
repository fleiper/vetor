package maiooito;
import java.util.Scanner;
public class vetorativ {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String a[] = new String [5];
		
		
		for (int i =0; i <5; i++) {
			System.out.println("me diga o nome" +i);
			a[i]= ler.next();
		}
		for (int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}




}


