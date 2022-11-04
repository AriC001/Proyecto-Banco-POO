public class Gerente extends Empleados implements OperacionesCajero{


    public Gerente(String n, int c, int s) {
        super(n, c, s);
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
                System.out.println("hola");
                return deposito(cl,monto,moneda);
            }
            case "Ingresar cheque" -> {
                return transaccion(cl,monto,moneda);
            }
            case "Transferencia" -> {
                return transaccion(cl,-monto,moneda);
            }
        }
        return false;
    }

    public boolean deposito(Cliente cl, int monto,char moneda) {
        if(!this.busy){
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 4;
            this.tiempoOcupadoSec = this.getSeconds() + 0;
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                System.out.println(cl.getSaldoPesos());
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                System.out.println(cl.getSaldoDolares());
                return true;
            }
        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return deposito(cl,monto,moneda);
            }else{
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
    }

    public boolean transaccion(Cliente cl, int monto,char moneda) {
        if(!this.busy){
            this.busy = true;
            this.tiempoOcupadoMin = this.getMinutes() + 4;
            this.tiempoOcupadoSec = this.getSeconds() + 0;
            if(moneda == 'p'){
                if(Math.abs(monto) >= 100000){
                    int saldo = cl.getSaldoPesos();
                    saldo += monto;
                    cl.setSaldoPesos(saldo);
                    System.out.println(cl.getSaldoPesos());
                    return true;
                }else {
                    //cajero
                }
            }else{
                if(Math.abs(monto) >= 10000){
                    int saldo = cl.getSaldoDolares();
                    saldo += monto;
                    cl.setSaldoDolares(saldo);
                    System.out.println(cl.getSaldoDolares());
                    return true;
                }else {
                    //cajero
                }
            }
        }else{
            if(this.tiempoOcupadoMin < this.getMinutes() || this.tiempoOcupadoMin == this.getMinutes() && this.tiempoOcupadoSec <= this.getSeconds()){
                this.busy = false;
                return transaccion(cl,monto,moneda);
            }else {
                System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado.");
                return false;
            }
        }
        return false;
    }
}
