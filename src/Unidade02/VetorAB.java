package Unidade02;

public class VetorAB {
    public static void main(String[] args) {

        double A[] = new double [50];
        double B[] = new double [50];

        for (int i =0; i < 50; i++){
            A[i] = i;

            if (i%2 == 0){
                B[i] = 2*A[i];
            }else {
                B[i] = A[i]/2;
            }
        }

        for (double a: A){
            System.out.print(a+"_ ");
        }
        System.out.println();
        for (double b: B){
            System.out.print(b+ "_ ");
        }
    }
}
