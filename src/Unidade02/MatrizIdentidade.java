package Unidade02;

public class MatrizIdentidade {

    public static void main(String[] args) {

        int matriz [][] = new int[3][3];

        for (int x = 0; x <= 2; x++){
            for (int j = 0; j <=2; j++){
                if (x != j) {
                    matriz[x][j] = 0;
                }else {
                    matriz[x][j] = 1;
                }
            }
        }

        for (int x = 0; x <= 2; x++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(matriz[x][j] +" ");
            }
            System.out.println();
        }


    }
}
