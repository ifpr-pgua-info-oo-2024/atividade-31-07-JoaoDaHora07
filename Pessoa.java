import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    protected String nome;
    protected String genero;
    protected Date dataNascimento;
    protected double altura;
    protected double peso;



    

    public Pessoa(String nome, String genero, String dataNascimento, double altura, double peso) throws ParseException {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = convertStringToDate(dataNascimento);
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getNascimento() {
        return dataNascimento;
    }
    public void setNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public static String convertDateToString(Date dataNascimento){
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
        


        return sdf.format(dataNascimento);
        

    }

    public static Date convertStringToDate(String dataNascimento) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);

        return sdf.parse(dataNascimento);
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", genero=" + genero + ", nascimento=" + convertDateToString(dataNascimento) + ", altura=" + altura
                + ", peso=" + peso + "]";
    }

    public int calcularIdade() throws ParseException{
        
        Date dataAtual = new Date();
        

        Date firstDate = dataAtual;
        Date secondDate = dataNascimento;

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies,TimeUnit.MILLISECONDS);

        return (int) diff/365;
    }

    

    

    
}

