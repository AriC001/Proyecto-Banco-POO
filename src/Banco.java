import java.util.List;

public class Banco {
    protected String name;
    protected int nroClientes = 0;
    protected int nroEmpleados = 0;
    protected int nroCorredores = 0;
    private List<Cliente> clientes;
    private List<Empleados> empleados;

    public Banco(String name,List<Empleados> empleados, List<Cliente> clientes) {
        this.clientes = clientes;
        this.empleados = empleados;
        this.name = name;
    }



    public Banco(int nroCorredores) {
        this.nroCorredores += nroCorredores;
    }

    public int getClientes(){
        return nroClientes;
    }
}

