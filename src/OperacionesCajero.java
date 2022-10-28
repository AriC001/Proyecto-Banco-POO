public interface OperacionesCajero extends Operaciones {



    void atenderCliente(Cliente cl, String ope, int monto);

    public boolean deposito(Cliente cl, int monto);
}
