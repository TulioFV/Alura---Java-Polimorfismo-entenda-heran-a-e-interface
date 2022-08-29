package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {

    public static void main(String[] args) {

        try(Conexao cnexao = new Conexao()){
            cnexao.leDados();
        }catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao " +ex);
        }







        //-------------------------------------------------------
       /* br.com.bytebank.banco.modelo.Conexao con = null;
        try {
            con = new br.com.bytebank.banco.modelo.Conexao();
            con.leDados();

        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }finally {
            if(con != null){
                con.close();
            }
       }
   */  }
}
