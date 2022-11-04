public class ResponsableOperativo extends Empleados{


    public ResponsableOperativo(String n, int c, int s) {
        super(n,c,s);
    }


    @Override
    public boolean atenderCliente(Cliente cl) {
        String[] info = cl.getInfoOperacion().split(" ");
        int monto = Integer.parseInt(info[0]);
        char moneda = info[1].charAt(0);
        return false;
    }
}
