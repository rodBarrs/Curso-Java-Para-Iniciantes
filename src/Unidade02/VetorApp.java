package Unidade02;

public class VetorApp {


    public static void main(String[] args) {
        int fibo[] = new int[20];

        fibo[0] = 1;
        fibo[1] = fibo[0];
        fibo[2] = fibo[0] + fibo[1];

        for (int i =3; i < 20; i++){
            fibo[i] = fibo[i - 1] + fibo [i - 2];
        }

        for (int f: fibo){
            System.out.print(f+",");
        }
        System.out.println();
        //vetor de objetos
        String vetor[] = new String[10];
        vetor[0] = new String ("Rodrigo");
        vetor[1] = new String ("Renan");

        for (String z: vetor){
            System.out.print(z+",");
        }
        System.out.println();

        int matriz[][] = new int[3][3];

        matriz[0][0] = 100;


    }

}
