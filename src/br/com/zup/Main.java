package br.com.zup;

public class Main {

    public static void main(String[] args) {

        boolean executar = true;

        while (executar){

            try {
                executar= Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }

    }
}
