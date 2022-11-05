import java.util.List;

public class Banco {
    protected String name;
    protected int nroClientes = 0;
    protected int nroEmpleados = 0;
    protected int nroCorredores = 0;
    private List<Cliente> clientes;
    private List<Empleados> empleados;

    public Banco(String name,List<Empleados> empleados, List<Cliente> clientes) {
        this.name = name;
        this.empleados = empleados;
        this.clientes = clientes;
        nroClientes= clientes.size();
        nroEmpleados= empleados.size();
    }


    public void getClientes(){
        int i = 0;
        try{
            while(this.clientes.get(i) != null){
                Cliente cliente = clientes.get(i);
                cliente.imprimirDatos();
                System.out.println("");
                Thread.sleep(1500);
                i++;
            }
        }catch (Exception e){

        }
    }

    public int getNroClientes() {
        return nroClientes;
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public void getEmpleado(){
        int i = 0;
        try{
            while(this.empleados.get(i) != null){
                Empleados empleado = empleados.get(i);
                empleado.imprimirDatos();
                Thread.sleep(1000);
                i++;
            }
        }catch (Exception e){

        }
    }
}

