public class Cliente extends Banco{
    private String name;
    private int dNI;
    private int saldoPesos;
    private int saldoDolares;
    //private String accountType;

    public Cliente(String name, int dNI, int saldoPesos, int saldoDolares,int valAcc) {
        super(1,0);
        this.name = name;
        this.dNI = dNI;
        this.saldoPesos = saldoPesos;
        this.saldoDolares = saldoDolares;
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

    public void delete(){}//

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
}
