package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExcption;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteExcption {
		/*
		br.com.bytebank.banco.modelo.Conta conta = new br.com.bytebank.banco.modelo.Conta(1337, 23334);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é : " + br.com.bytebank.banco.modelo.Conta.getTotal());*/
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);

		cc.transfere(10,cp);
		System.out.println("Saldo conta Corrente " + cc.getSaldo());
		System.out.println("Saldo conta Poupanca " + cp.getSaldo());

	}
	
}
