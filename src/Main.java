import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        Cliente cl1 = new Cliente("Fernanda Borja",37168938,337302,0,0,"Deposito",10000,'p');
        Cliente cl2 = new Cliente("Nadia Trigo",37970626,611868,0,0,"Deposito",5000,'d'); //mandarlo a una "lista" para rechequear despues del siguiente cliente
        /*
        Cliente cl3 = new Cliente("Luis Fernando",19592905,274989,0,0,"Prestamo PYME 100000");
        Cliente cl4 = new Cliente("Antonio Conde",38262510,1710,0,0,"Deposito");
        Cliente cl5 = new Cliente("Rayan Macia",31238297,473142,0,0,"Deposito");
        Cliente cl6 = new Cliente("Margarita Pedrosa",38049952,440884,0,0,"Deposito");
        Cliente cl7 = new Cliente("Martha Ledesma",24574949,303128,0,0,"Deposito");
        Cliente cl8 = new Cliente("María Matos", 15830012, 172853,0,0,"Deposito",6000,'p');
        Cliente cl9 = new Cliente("Ignacio Sierra", 22387207, 135085,0,0,"Transaccion",4000,'p');
        Cliente cl10 = new Cliente("César Pinilla", 28381842, 325286,0,0,"Prestamo Hypotecario",700000,'p');
        Cliente cl11 = new Cliente("Ricardo Sosa", 12827379, 225490,0,0,"Transaccion",3000,'p');
        Cliente cl12 = new Cliente("Isabella Conesa", 15739570, 124062,0,0,"Deposito",500,'d');
        Cliente cl13 = new Cliente("Paola Herrero", 27876472, 13798,0,0,"Prestamo Consumo",150000,'p');
        Cliente cl14 = new Cliente("Juan Carlos Vegas", 28914915, 41297,0,0,"Deposito",25000,'p');
        Cliente cl15 = new Cliente("Victorina Gimeno ",  21888908, 58828,0,0,"Deposito",10000,'p');
        Cliente cl16 = new Cliente("Dolores Cruz", 34859032 , 10459,0,0,"Deposito",25000,'p');
        Cliente cl17 = new Cliente("Christian Ramos", 20291201, 148483,0,0,"Deposito",30000,'p');
        Cliente cl18 = new Cliente("Angela Montiel", 36467784, 61012,0,0,"Transaccion",200000,'p');
        Cliente cl19 = new Cliente("Miguel Olmos ", 43609988 , 403406,0,0,"Deposito",1000,'d');
        Cliente cl20 = new Cliente("Casimiro Soriano", 37032858 , 439464,0,0,"Deposito",8000,'p');
        Cliente cl21 = new Cliente("Armando Cobos",  36618195, 329031,0,0,"Deposito",10000,'p');
        Cliente cl22 = new Cliente("Nicolas Moya", 30679961 , 248449,0,0,"Deposito",5500,'d');
        Cliente cl23 = new Cliente("Salvador Parejo", 16998463, 26982,0,0,"Deposito",60000,'p');
        Cliente cl24 = new Cliente("Mayra Rios", 22189494 , 191225,0,0,"Deposito",16000,'p');
        Cliente cl25 = new Cliente("Raquel Alcala", 26121831, 151008,0,0,"Transaccion",85000,'p');
        Cliente cl26 = new Cliente("Elizabeth Arnaiz", 40107190 , 434449,0,0,"Deposito",76000,'p');
        Cliente cl27 = new Cliente("Angela Diaz", 19533650, 16383,0,0,"Deposito",200,'d');
        Cliente cl28 = new Cliente("Jordi Mansill", 42541852, 282099,0,0,"Prestamo PYME",2700000,'p');
        Cliente cl29 = new Cliente("José Cabeza", 20302488, 353566,0,0,"Deposito",1000,'d');
        Cliente cl30 = new Cliente("German Rodenas", 40791965, 31370,0,0,"Deposito",53000,'p');
        Cliente cl31 = new Cliente("Martin Cuellar", 33953936, 85093,0,0,"Deposito",75000,'p');
        Cliente cl32 = new Cliente("Igor Morcillo", 19786885, 2426,0,0,"Deposito",34000,'p');
        Cliente cl33 = new Cliente("Lara Valenzuela", 32669960, 35351,0,0,"Prestamo Hypotecario",560000,'p');
        Cliente cl34 = new Cliente("Claudia Berrocal", 38227620, 41417,0,0,"Deposito",86500,'p');
        Cliente cl35 = new Cliente("Jose Miguel Navarro", 28448970, 61203,0,0,"Prestamo Consumo",700000,'p');
        Cliente cl36 = new Cliente("Luca Campillo", 20346137, 27960,0,0,"Deposito",58000,'p');
        Cliente cl37 = new Cliente("Victor Figueroa", 44606461, 32433,0,0,"Deposito",19000,'p');
        Cliente cl38 = new Cliente("Teodora Silva", 19011620, 190202,0,0,"Deposito",36000,'p');
        Cliente cl39 = new Cliente("Myriam Caro", 37793529, 161556,0,0,"Transaccion",380000,'p');
        Cliente cl40 = new Cliente("Rocio Sacristan", 34566719, 193389,0,0,"Deposito",2000,'d');
        */
        Empleados cajero1 = new Cajero("Alberto Megias",0,50000);
        Empleados cajero2 = new Cajero("Augusto Saiz",0,95000);
        /*
        Empleados cajero3 = new Cajero("Clotilde Mora",0,95000);
        Empleados cajero4 = new Cajero("Lucas Mariscal",0,95000);
        Empleados cajero5 = new Cajero("Josefa Tortosa",0,95000);
        Empleados cajero6 = new Cajero("Rayan Borrego",0,95000);
         */
        Empleados admin1 = new Administrativo("Alejandro",2,120000);
        /*
        Empleados admin2 = new Administrativo("Dina Nogales",2,120000);
        Empleados respOp1 = new Responsable("Nancy Prados",2,120000);
        Empleados respOp2 = new Responsable("Beatriz Peñalver",1,150000)
        Empleados respOp3 = new Responsable("Vicente Sierra",1,150000);
        Empleados gerente1 = new Gerente("Augusto Saiz",3,250000);

         */
        List<Cliente> clientes = new LinkedList<>(); //Creacion de listas para empleados general, escecificos y clientes
        List<Cliente> sinAtenderCl = new LinkedList<>();
        List<Empleados> cajeros = new LinkedList<>();
        List<Empleados> administrativos = new LinkedList<>();
        List<Empleados> empleados = new LinkedList<>();
        clientes.add(cl1);clientes.add(cl2);//clientes.add(cl3);clientes.add(cl4);clientes.add(cl5);clientes.add(cl6);clientes.add(cl7);clientes.add(cl8);clientes.add(cl9);clientes.add(cl10);clientes.add(cl11);clientes.add(cl12);clientes.add(cl13);clientes.add(cl14);clientes.add(cl15);clientes.add(cl16);clientes.add(cl17);clientes.add(cl18);clientes.add(cl19);clientes.add(cl20);clientes.add(cl21);clientes.add(cl22);clientes.add(cl23);clientes.add(cl24);clientes.add(cl25);clientes.add(cl26);clientes.add(cl27);clientes.add(cl28);clientes.add(cl29);clientes.add(cl30);clientes.add(cl31);clientes.add(cl32);clientes.add(cl33);clientes.add(cl34);clientes.add(cl35);clientes.add(cl36);clientes.add(cl37);clientes.add(cl38);clientes.add(cl39);clientes.add(cl40);
        cajeros.add(cajero1);cajeros.add(cajero2);//cajeros.add(cajero3);cajeros.add(cajero4);cajeros.add(cajero5);cajeros.add(cajero6);
        administrativos.add(admin1);//administrativos.add(admin2);
        //responsable.add(respOp1);responsable.add(respOp2);responsable.add(respOp3);
        //gerente.add(gerente1);
        empleados.addAll(cajeros);empleados.addAll(administrativos);//empleados.addAll(responsable); empleados.addAll(gerente);
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
