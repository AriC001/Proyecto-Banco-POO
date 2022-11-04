public interface OperacionesCajero extends Operaciones {



    boolean atenderCliente(Cliente cl, int monto,char moneda);

    public boolean deposito(Cliente cl, int monto, char moneda);

    public boolean transaccion(Cliente cl, int monto,char moneda);
}
