//contrato autencavel, que assina esse contrato precisa implementar
//metodo seSenha, metodo autentica

public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
