public class Cliente implements Operaciones{
    private String name;
    private int dNI;
    private int saldoPesos;
    private int saldoDolares;
    private String operacion;
    private String infoOperacion;
    Banco cliente;
    //private String accountType;

    public Cliente(String name, int dNI, int saldoPesos, int saldoDolares,int valAcc,String op,int monto,char moneda) {
        //super(1,0);
        //this.cliente = cliente;
        //cliente.nroClientes +=1;
        this.operacion = op;
        this.name = name;
        this.dNI = dNI;
        this.saldoPesos = saldoPesos;
        this.saldoDolares = saldoDolares;
        this.infoOperacion = monto + " " + moneda;
        if(valAcc > 0){
            Coorporativo a = new Coorporativo();
            a.Acciones((valAcc));
        }
    }


    public void imprimirDatos(){
        System.out.print("Nombre: "+this.name + " DNI: " +this.dNI +" Saldo Pesos: "+this.saldoPesos+" Saldo Dolares: "+this.saldoDolares);
        Coorporativo a = new Coorporativo();
        if( a.getValorAcciones() >0){
        System.out.println("Valor Acciones: " + a.getValorAcciones());}
    }

    @Override
    public boolean atenderCliente(Cliente cl) {
        return false;
    }

    /*public void delete(){
        this.cliente.nroClientes -=1;
    }*/



    public class Coorporativo{
        private int valorAcciones = 0;

        public void Acciones(int valorAcciones) {
            this.valorAcciones = valorAcciones;
            //Asiganar un corredor???
        }

        public int getValorAcciones() {
            return valorAcciones;
        }
    }

    public int getSaldoPesos() {
        return saldoPesos;
    }

    public void setSaldoPesos(int saldoPesos) {
        this.saldoPesos = saldoPesos;
    }

    public int getSaldoDolares() {
        return saldoDolares;
    }

    public void setSaldoDolares(int saldoDolares) {
        this.saldoDolares = saldoDolares;
    }
    public String getOperacion() {
        return this.operacion;
    }

    public String getInfoOperacion() {
        return infoOperacion;
    }

    public void setInfoOperacion(String infoOperacion) {
        this.infoOperacion = infoOperacion;
    }

    public String getName(){
        return this.name;
    }

    /*public void Oper(){
        Operaciones op = new Operaciones();
        switch(random){
            case 1 -> op.deposito(this.Cliente);  //no se si se puede hacer esto
        }
    }*/
}
