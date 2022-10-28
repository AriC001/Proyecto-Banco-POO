public class Administrativo extends Empleados{//implements ATM{


    public Administrativo(String n, int c, int s,Banco banco) {
        super(n,c,s);
    }


    @Override
    public void atenderCliente(Cliente cl, String op, int monto) {

    }
}
