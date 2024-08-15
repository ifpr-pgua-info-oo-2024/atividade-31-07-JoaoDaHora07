import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) throws ParseException {
        Academia academia1 = new Academia("EspacoSport","Joe biden", "4166666666");
        Academia academia2 = new Academia("Centro Esportivo Caopi","John kennedy", "4155555555");

        SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy");
        Date data = format.parse("12/07/2007");

        academia1.alunos.add(new Aluno("Jayson Tatum","Alto","12/07/2007"));
        academia1.alunos.add(new Aluno("MF DOOM","Baixo","10/01/2009"));
        academia1.alunos.add(new Aluno("Michael Jordan","Medio","10/01/2009"));
        academia2.alunos.add(new Aluno("Anthony Davis","Alto","10/01/2009"));
        academia2.alunos.add(new Aluno("Anthony Edwards","Baixo","10/01/2009"));
        academia2.alunos.add(new Aluno("Lebron James","Medio","10/01/2009"));


        System.out.println(academia1.getNome());
        System.out.println(academia1.getEndereco());
        System.out.println(academia1.getTelefone());

        System.out.println(academia2.getNome());
        System.out.println(academia2.getEndereco());
        System.out.println(academia2.getTelefone());

        academia1.setNome("LianaAquafit");
        academia1.setEndereco("Trump");
        academia1.setTelefone("4144444444");

        academia2.setNome("LianaAquafit");
        academia2.setEndereco("George Washington");
        academia2.setTelefone("4133333333");

        System.out.println(academia1.getNome());
        System.out.println(academia1.getEndereco());
        System.out.println(academia1.getTelefone());

        System.out.println(academia2.getNome());
        System.out.println(academia2.getEndereco());
        System.out.println(academia2.getTelefone());

        for(Aluno aluno: academia1.alunos){
            System.out.println(aluno.toString());
            System.out.println();


        }

        for(Aluno aluno: academia2.alunos){
            System.out.println(aluno.toString());
            System.out.println();

        }

        System.out.println(academia1.alunos.get(1).calcularIdade());

    }
        
}



        
        
 
    
 

