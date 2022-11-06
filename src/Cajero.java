import java.time.Duration;

public class Cajero extends Empleados {
    Gerente gerente;
    private final Banco publicEnemy;


    public Cajero(String nombre, int carco, int sueldo,Banco banco) {
        super(nombre,carco,sueldo);
        publicEnemy = banco;
        gerente = new Gerente(publicEnemy);
    }
    @Override
    public boolean atenderCliente(Cliente cl) {
        String[] info = cl.getInfoOperacion().split(" ");
        int monto = Integer.parseInt(info[0]);
        char moneda = info[1].charAt(0);
        switch (cl.getOperacion()){
            case "Deposito","IngresarCheque" -> {
                if(deposito(cl,monto,moneda) == true){
                    subirDeRango();
                    return true;
                }
            }
            case "Transaccion" -> {
                if(transaccion(cl,-monto,moneda) == true){
                    subirDeRango();
                    return true;
                }
            }
        }
        return false;
    }

    public void subirDeRango(){
        if ((int) ((Math.random() * (3 - 1)) + 1) == 1) {
            this.points ++;
            if(points == 5){
                gerente.rankUp(this);
            }
        }
    }


    public boolean deposito(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(12));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                cl.setAtendido();
                System.out.println("\u001B[38;5;10m"+"Deposito realizado"+"\u001B[0m"+" se han Ingresado: $" + monto +"\u001B[38;5;10m"+" pesos"+"\u001B[0m");
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                System.out.println("\u001B[38;5;10m"+"Deposito realizado"+"\u001B[0m"+" se han Ingresado: $" + monto +"\u001B[38;5;10m"+" dolares"+"\u001B[0m");
                cl.setAtendido();
                return true;
            }
        }else{
            if(this.getActualHour().compareTo(tiempoOcupado) >= 0){
                this.busy = false;
                return this.deposito(cl,monto,moneda);
            }else{
                //System.out.println("Empleado: " + this.name + " " + getCargo() + " ocupado." + cl.getName());
                return false;
            }
        }
    }

    public boolean transaccion(Cliente cl, int monto,char moneda) {
        if(this.busy == false){
            this.busy = true;
            this.tiempoOcupado = this.getActualHour().plus(Duration.ofSeconds(15));
            if(moneda == 'p'){
                int saldo = cl.getSaldoPesos();
                saldo += monto;
                cl.setSaldoPesos(saldo);
                cl.setAtendido();
                System.out.println("\u001B[38;5;202m"+"Retiro   realizado"+"\u001B[0m"+" se han retirado :$" + (-monto) + "\u001B[38;5;202m"+" pesos"+"\u001B[0m");
                return true;
            }else{
                int saldo = cl.getSaldoDolares();
                saldo += monto;
                cl.setSaldoDolares(saldo);
                cl.setAtendido();
                System.out.println("\u001B[38;5;202m"+"Retiro   realizado"+"\u001B[0m"+" se han retirado :$" + (-monto) + "\u001B[38;5;202m"+" dolares"+"\u001B[0m");
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
