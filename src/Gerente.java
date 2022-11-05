import java.time.Duration;

public class Gerente extends Empleados implements OperacionesCajero{


    public Gerente(String n, int c, int s) {
        super(n, c, s);
    }
    public Gerente() {
        super();
    }


    public void rankUp(Empleados e){
        if(e.cargo < 2){e.cargo++;}
    }

    @Override
    public boolean atenderCliente(Cliente cl) {
        String[] info = cl.getInfoOperacion().split(" ");
        int monto = Integer.parseInt(info[0]);
        char moneda = info[1].charAt(0);
        switch (cl.getOperacion()){
            case "Deposito" -> {
                return deposito(cl,monto,moneda);
            }
            case "Ingresar cheque" -> {
                return transaccion(cl,monto,moneda);
            }
            case "Transferencia" -> {
                return transaccion(cl,(-monto),moneda);
            }
        }
        return false;
    }

    public boolean deposito(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(0));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                return true;
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return deposito(cl,monto,moneda);
            }else{
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
    }

    public boolean transaccion(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(0));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                cl.setAtendido();
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                cl.setAtendido();
                return true;
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return transaccion(cl,monto,moneda);
            }else {
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
    }
}
