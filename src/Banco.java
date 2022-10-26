public class Banco {
    protected int nroClientes = 0;
    protected int nroEmpleados = 0;
    protected int nroCorredores = 0;

    public Banco() {
    }

    public Banco(int nroClientes, int nroEmpleados) {
        this.nroClientes += nroClientes;
        this.nroEmpleados += nroEmpleados;
    }
    public Banco(int nroCorredores) {
        this.nroCorredores += nroCorredores;
    }

    public int getClientes(){
        return nroClientes;
    }
}

