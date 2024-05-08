package maiooito;
import java.util.Scanner;
public class ativetor {
	//================================DADOS INCIAIS=================================================================
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int a [] = new int [5];
		int soma=0;
		//================================LEITURA DE DADOS==========================================================

		for (int i =0; i <5; i++) {
			System.out.println("informe o "+i+ "° valor: ");
			a[i]= ler.nextInt();
			soma = soma + a [i];
			System.out.println("a soma desse valor é de: "+soma);
		}
		//==================================if==============================================================
		if (soma>15) {
			System.out.println("resultado está superior ao numero 15");
		}

	}
}

