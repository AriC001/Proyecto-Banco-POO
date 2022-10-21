public class Banco {
    private int nroClientes = 0;
    private int nroEmpleados = 0;
    private int nroCorredores= 0;

    public Banco(int nroClientes, int nroEmpleados) {
        this.nroClientes += nroClientes;
        this.nroEmpleados += nroEmpleados;
    }
    public Banco(int nroCorredores) {
        this.nroCorredores += nroCorredores;
    }
}
