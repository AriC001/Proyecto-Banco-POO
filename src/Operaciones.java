public interface Operaciones{
    // Empleados emp;
    /*protected int pendDeposito = 0;
    protected int  pendTransaccion = 0;
    protected int  pendPrestamo = 0; //admin?
    protected int pendAsesoramiento = 0;
    protected int pendCaja = 0;

    public Operaciones(String n, int c, int s) {
    }*/
    public boolean atenderCliente(Cliente cl,String op, int monto);
}
