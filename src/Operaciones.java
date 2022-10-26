public class Operaciones extends Empleados {
    // Empleados emp;
    protected pendDeposito = 0;
    protected pendTransaccion = 0;
    protected pendPrestamo = 0; //admin?
    protected pendAsesoramiento = 0;
    protected pendCaja = 0;

    public Operaciones(String n, int c, int s,Banco banco) {
        super(n, c, s, banco);
    }


    public void deposito(CLiente cl){
        this.pendDeposito+=1;
    }
    public void transaccion(){}
    public void prestamo(){}
    public void mantenerCaja(){}
    public void darAsesoramiento(){}
    public void otros(){}

}
