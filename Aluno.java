import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{
   
    private String nivel;
    
    
    
    

    

    public Aluno (String nome, String nivel, String dataNascimento,String genero, double altura, double peso) throws ParseException{
        super(nome, genero, dataNascimento, altura, peso);

        this.nivel = nivel;

    }
    public Aluno (String nome, String nivel, String dataNascimento) throws ParseException{
        this(nome,nivel ,dataNascimento,"Não Informado",0.0,0.0);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNivel() {
        return nivel;
    }
    public void setGraduacao(String nivel) {
        this.nivel = nivel;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Aluno [nome=" + nome + ", nivel=" + nivel + ", dataNascimento=" +simpleDateFormat.format(dataNascimento) + ", genero=" + genero
                + ", altura=" + altura + ", peso=" + peso + "]";
    }

    


    
}
