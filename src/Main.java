import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        Cliente cl1 = new Cliente("Fernanda Borja",37168938,10000,0,0,"Deposito",10000,'p');
        Cliente cl2 = new Cliente("Nadia Trigo",37970626,10000,0,0,"Deposito",5000,'d'); //mandarlo a una "lista" para rechequear despues del siguiente cliente
        /*Cliente cl3 = new Cliente("Luis Fernando",19592905,10000,0,0,"Prestamo PYME 100000");
        Cliente cl4 = new Cliente("Antonio Conde",38262510,10000,0,0,"Deposito");
        Cliente cl5 = new Cliente("Rayan Macia",31238297,10000,0,0,"Deposito");
        Cliente cl6 = new Cliente("Margarita Pedrosa",38049952,10000,0,0,"Deposito");
        Cliente cl7 = new Cliente("Martha Ledesma",24574949,10000,0,0,"Deposito");*/
        Empleados cajero1 = new Cajero("Alberto",0,50000);
        Empleados cajero2 = new Cajero("Albartros",0,50000);
        Empleados admin1 = new Administrativo("Alejandro",2,1000);
        List<Cliente> clientes = new LinkedList<>(); //Creacion de listas para empleados general, escecificos y clientes
        List<Cliente> sinAtenderCl = new LinkedList<>();
        List<Empleados> cajeros = new LinkedList<>();
        List<Empleados> administrativos = new LinkedList<>();
        List<Empleados> empleados = new LinkedList<>();
        clientes.add(cl1);clientes.add(cl2);//clientes.add(cl3);clientes.add(cl4);clientes.add(cl5);clientes.add(cl6);clientes.add(cl7);
        cajeros.add(cajero1);cajeros.add(cajero2);
        administrativos.add(admin1);
        empleados.addAll(cajeros);empleados.addAll(administrativos);
        cajero1.atenderCliente(cl1);
        if(cajero1.atenderCliente(cl2) == false) {
            sinAtenderCl.add(cl2);
        }else{
            serAtendido(sinAtenderCl,cajeros,administrativos);
        }
        serAtendido(sinAtenderCl,cajeros,administrativos);
        /*if(cajero1.atenderCliente(cl3,10000,'d')== false){
            sinAtenderCl.add(cl2);
        }
        cajero1.atenderCliente(cl4,10000,'p');
        cajero1.atenderCliente(cl5,10000,'p');*/
        //System.out.println(banco.getClientes());
        //cl7.delete();
        //System.out.println(banco.getClientes());

        Empleados emp1 = new Gerente("AA",3,300);
    }

    public static void serAtendido(List<Cliente> cl , List<Empleados> cajeros, List<Empleados> ad){
        if(!cl.isEmpty()){
            int[] toRemove = new int[40];
            int cont = 0;
            for(Cliente cliente : cl) {
                switch (cliente.getOperacion()) {
                    case "Deposito" -> {
                        for (Empleados cajero : cajeros) {
                            if (cajero.atenderCliente(cliente) == true) {
                                System.out.println("Atendido 2");
                                toRemove[cont] = cl.indexOf(cliente);
                                cont++;
                                break;
                            }
                        }
                    }
                    case "Prestamo" -> {
                        //return;
                    }
                    case "Transaccion" -> {
                        //return;
                    }
                    default -> {
                        //return;
                    }
                }
            }
            for(int i : toRemove){
                try{if(!cl.isEmpty() && cl.get(i) != null){cl.remove(i);}

                }catch (Exception e){
                    System.out.println(e);
                    break;
                }
            }
        }
    }
    }
