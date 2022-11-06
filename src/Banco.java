import java.util.List;

public class Banco {
    protected String name;
    protected int nroClientes = 0;
    protected int nroEmpleados = 0;
    protected int nroCorredores = 0;
    private List<Cliente> clientes;
    private List<Empleados> empleados;
    private int reservas = 10000000;

    public Banco(String name,List<Empleados> empleados, List<Cliente> clientes) {
        this.name = name;
        this.empleados = empleados;
        this.clientes = clientes;
        nroClientes= clientes.size();
        nroEmpleados= empleados.size();
    }


    public void getClientes() throws InterruptedException {
            for(int j = 0; j < clientes.size();j++){
                clientes.get(j).imprimirDatos();
                Thread.sleep(500);
            }
        }

    public int getNroClientes() {
        return nroClientes;
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public void getEmpleado() {
            for(int j = 0; j < empleados.size();j++){
                empleados.get(j).imprimirDatos();
            }
    }

    public void prestamo(int monto){
        this.reservas -= monto;
    }

    public int getReservas(){
        return this.reservas;
    }

    public void showPrestamos(List<Cliente> clientes){
        for(Cliente cliente: clientes ){
            String[] tipo = cliente.getOperacion().split(" ");
            String[] info = cliente.getInfoOperacion().split(" ");
            if(cliente.getAtendido() == true && tipo[0].equals("Prestamo")){
                System.out.println("\u001B[38;5;226m"+cliente.getOperacion()+"\u001B[0m" + " otorgado por un monto de: $" + Integer.parseInt(info[0]));
            }
        }
    }

    public void deleteCl(Cliente clienteAEliminar){
        for(Cliente cliente : this.clientes){
            if(cliente.equals(clienteAEliminar)){ //Comprobación para verificar si el cliente que nos mandan realmente es cliente del banco
                this.clientes.remove(clienteAEliminar);
            }
        }
    }
}

