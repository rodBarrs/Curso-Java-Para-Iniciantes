package Unidade02;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        int x = 0;
//        while (x<10){
//            System.out.println("X: "+ x);
//            x++;
//        }
//
//        do {
//            System.out.println("X: "+ x);
//            x++;
//        } while (x < 10);

        for (x =0;x < 10;x++){
            System.out.println("X: "+x);
        }
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        for (int y: vetor){
            System.out.println(y);
        }
    }
}
