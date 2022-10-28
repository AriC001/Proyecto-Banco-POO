public class Cajero extends Empleados implements OperacionesCajero {

    private boolean busy;
    private int tiempoOcupado;

    //if pendDepo >0 esntonces opera, esta como lo hacemos

    public Cajero(String n, int c, int s) {
        super(n,c,s);
        this.busy = false;
        this.tiempoOcupado = 0;
    }
    @Override
    public void atenderCliente(Cliente cl, String ope, int monto) {
        switch (ope){
            case "Deposito" -> {
                if(monto < 100000){
                    System.out.println("hola");
                    deposito(cl,monto);}
            }
        }
    }

    public boolean deposito(Cliente cl, int monto) {
        if(!this.busy){
            this.busy = true;
            tiempoOcupado = getTime() + 3;
            int saldo = cl.getSaldoPesos();
            saldo += monto;
            cl.setSaldoPesos(saldo);
            System.out.println(cl.getSaldoPesos());
            return true;
        }else{
            if(tiempoOcupado <= getTime()){
                this.busy = false;
                deposito(cl,monto);
                return true;
            }else{
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
    }

    @Override
    protected int getTime() {
        return super.getTime();
    }
}
