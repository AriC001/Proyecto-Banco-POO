public abstract class Operaciones extends Banco {
    public Operaciones() {
        super(0,0);
    }
    public Operaciones(int nroCl,int nroEmp) {
        super(nroCl,nroEmp);
    }
    abstract void deposito();
    abstract void transaccion();
    abstract void prestamo();
    abstract void mantenerCaja();
    abstract void darAsesoramiento();
    abstract void otros();
}
