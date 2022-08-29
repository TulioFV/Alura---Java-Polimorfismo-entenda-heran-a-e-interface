package br.com.bytebank.banco.modelo;

//br.com.bytebank.banco.modelo.CalculardorDeImposto => FQN
public class CalculardorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }

}
