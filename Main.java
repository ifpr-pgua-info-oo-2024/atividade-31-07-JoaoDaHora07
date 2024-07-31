public class Main {
    
    public static void main(String[] args) {
        Academia academia1 = new Academia("EspacoSport","Joe biden", "4166666666");
        Academia academia2 = new Academia("Centro Esportivo Caopi","John kennedy", "4155555555");

        System.out.println(academia1.getNome);
        System.out.println(academia1.getEndereco);
        System.out.println(academia1.getTelefone);

        System.out.println(academia2.getNome);
        System.out.println(academia2.getEndereco);
        System.out.println(academia2.getTelefone);

        academia1.setNome("LianaAquafit");
        academia1.setEndereco("Trump");
        academia1.setTelefone("4144444444");

        academia2.setNome("LianaAquafit");
        academia2.setEndereco("George Washington");
        academia2.setTelefone("4133333333");

        System.out.println(academia1.getNome);
        System.out.println(academia1.getEndereco);
        System.out.println(academia1.getTelefone);

        System.out.println(academia2.getNome);
        System.out.println(academia2.getEndereco);
        System.out.println(academia2.getTelefone);



        
        
 
    }
 
}
