public class ResponsableOperativo extends Empleados{


    public ResponsableOperativo(String n, int c, int s) {
        super(n,c,s);
    }

    @Override
    public boolean atenderCliente(Cliente cl, int monto) {
        return false;
    }
}
