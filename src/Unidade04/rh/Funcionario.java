package Unidade04.rh;

public abstract class Funcionario {




    public static void main(String[] args) {

        Funcionario antonio = new Professor();
        Funcionario andre = new Administrativo();
        Funcionario pedro = new Diretor();

        pedro.verificarTipoFuncionario(pedro);
        antonio.verificarTipoFuncionario(antonio);

        ((Diretor)pedro).departamento = "RH";


        //exemplo de Casting de tipos primitivos
        char a = 'a';  int b = 'b'; float c = 100;
        int d = (int) 5.197;  float e = 5.0F;
        int f = (a+5); char g = (char) 110.5;

        Professor professor = new Professor();
        Autenticavel autenticavel = professor;
        Cidadao cidadao = professor;
        Contribuinte contribuinte = professor;

    }


    public abstract void getBonificacao();

    void verificarTipoFuncionario(Funcionario objeto){
        if (objeto instanceof Diretor){
            System.out.println("Diretor");
        } else if (objeto instanceof Professor){
            System.out.println("Professor");
        } else {
            System.out.println("Administrativo");
        }
    }


}
