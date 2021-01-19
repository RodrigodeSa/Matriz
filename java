//Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma matriz de M linhas por N colunas
//contendo inteiros, podendo haver repeticões. Em seguida, ler um numero inteiro X que pertence a matriz
//Para cada ocorrência de X, mostrar os valores a esquerda, direita, acima e abaixo de X. 

package Application;
import java.util.Locale;
import java.util.Scanner;
import Application.Proposto;

public class Proposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		
		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numeros de colunas: ");
		int n = sc.nextInt();
				
		int[][] mat = new int[m][n];
		System.out.println("Insira os números da sua matriz: ");
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o número a ser buscado: ");
		int x = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j < mat.length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Número a esquerda: " + mat[i-1][j]);
					System.out.println("Número a direita: " + mat[i+1][j]);
					System.out.println("Número a acima: " + mat[i][j-1]);
					System.out.println("Número a esquerda: " + mat[i][j+1]);
					System.out.println("------------------");
				}
			}
		}		
		sc.close();
	}
}
