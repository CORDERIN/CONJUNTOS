public class Complemento<T> extends Conjunto<T>{

    private final Conjunto<T> conjunto;

    public Complemento(Conjunto<T> conjunto){

        this.conjunto = conjunto;

    }

    @Override

    public Boolean contemElemento(T elemento) {

        return !conjunto.contemElemento(elemento);
    }
}
