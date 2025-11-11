package exceptions;

public class InvalidValue extends Exception{
    public InvalidValue (){
        super("Inseção inválida. Porfavor insira um valor válido.");
    }

    public InvalidValue (String detalhe) {
        super("Inserção inválida: " + detalhe);
    }
}
