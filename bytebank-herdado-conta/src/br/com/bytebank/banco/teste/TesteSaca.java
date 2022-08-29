package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExcption;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200);

        try{
            conta.saca(210);
        }catch (SaldoInsuficienteExcption ex){
            System.out.println("Ex:" + ex.getMessage());
        }

        System.out.println(conta.getSaldo());

    }
}
