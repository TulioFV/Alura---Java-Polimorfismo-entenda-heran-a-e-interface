public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel g){

        boolean autenticou = g.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sitema!");
        }else{
            System.out.println("Nao entrar no sitema!");
        }
    }
}
