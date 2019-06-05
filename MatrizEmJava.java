package matrizdin;

import java.util.Scanner;

public class MatrizEmJava {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe o nº de linhas:");
        int numLinhas = leia.nextInt();
        
        System.out.println("Informe o nº de colunas:");
        int numColunas = leia.nextInt();
        
        int[][] matriz = new int[numLinhas][numColunas];
        
        
        //Preenche
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println
                ("Informe um número na posição ["+linha+"]["+coluna+"]:");
                matriz [linha][coluna] = leia.nextInt();
            }
        }
        
        //Percorre
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna]+"\t");
            }
            System.out.println("");
        }
        
    }
    
}
