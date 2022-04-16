public class Uniao<T> extends Conjunto <T> {

    private final Conjunto<T> conjunto_1;
    private final Conjunto<T> conjunto_2;

    public Uniao(Conjunto<T> conjunto1, Conjunto<T> conjunto2){

        this.conjunto_1 = conjunto1;
        this.conjunto_2 = conjunto2;

    }

    @Override

    public Boolean contemElemento(T elemento) {

        return conjunto_1.contemElemento(elemento) || conjunto_2.contemElemento(elemento);
    }

}
