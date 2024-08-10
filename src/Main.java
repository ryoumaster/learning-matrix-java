import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[5];
        int cont = 0;
        //inverter valor do vetor -->
        int[] vetorInicializado = {1,2,3,4};
        int aux = 0;
        int aux2 = 0;
        int tamVet = vetorInicializado.length - 1;
        //Inverter o vetor
        for(int i = 0; i < vetorInicializado.length/2; i++){
                aux = vetorInicializado[tamVet];
                aux2 = vetorInicializado[i];
                vetorInicializado[i] = aux;
                vetorInicializado[tamVet] = aux2;
                tamVet = tamVet - 1;
        }
        for(int i = 0; i < vetorInicializado.length; i++) {
            System.out.println(vetorInicializado[i]);
        }

        int [][] matriz = {
                {1, 2, 5},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] rotacionar = new int[3][3];
        int diagpri = 0;
        int diagseg = 0;
        int tam = matriz.length;

        //Somar diagonal principal, diagonal secundaria e rotacionar
        for(int i = 0; i < matriz.length; i++){
            diagseg += matriz[i][tam - 1 - i];
            for(int j = 0; j < matriz.length; j++){
                if (j == i){
                    diagpri += matriz[i][j];
                }

                rotacionar[j][tam - 1 - i] = matriz[i][j];
            }
        }
        //Econtrar valor na matriz
        int valor = 5;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] == valor){
                    System.out.println("Valor encontrado na Linha: " + (i + 1) + " e na coluna: " + (j + 1));
                }
            }
        }

        //Imprimir os resultados
        System.out.println("Diagonal primaria: "+diagpri);
        System.out.println("Diagonal Secundaria: "+diagseg);
        System.out.println("Matriz rotacionada");
        for(int i = 0; i < rotacionar.length; i++){
            for(int j = 0; j < rotacionar.length; j++){
                System.out.print(rotacionar[i][j] + " ");
            }
            System.out.println();
        }
    }
}