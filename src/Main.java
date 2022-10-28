import java.time.LocalTime; // import the LocalTime class
public class Main {
    public static <Empleado> void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        Cliente cl1 = new Cliente("Fernanda Borja",37168938,10000,0,0);
        Cliente cl2 = new Cliente("Nadia Trigo",37970626,10000,0,0); //mandarlo a una "lista" para rechequear despues del siguiente cliente
        Cliente cl3 = new Cliente("Luis Fernando",19592905,10000,0,0);
        Cliente cl4 = new Cliente("Antonio Conde",38262510,10000,0,0);
        Cliente cl5 = new Cliente("Rayan Macia",31238297,10000,0,0);
        Cliente cl6 = new Cliente("Margarita Pedrosa",38049952,10000,0,0);
        Cliente cl7 = new Cliente("Martha Ledesma",24574949,10000,0,0);
        Empleados cajero1 = new Cajero("Alberto",0,50000);
        cajero1.atenderCliente(cl1,"Deposito",10000);
        if(cajero1.atenderCliente(cl2,"Deposito",10000) == false){
            //crear lista
        }
        cajero1.atenderCliente(cl3,"Deposito",10000);
        cajero1.atenderCliente(cl4,"Deposito",10000);
        cajero1.atenderCliente(cl5,"Deposito",10000);
        //System.out.println(banco.getClientes());
        //cl7.delete();
        //System.out.println(banco.getClientes());

        Empleados emp1 = new Gerente("AA",3,300);
    }
}
