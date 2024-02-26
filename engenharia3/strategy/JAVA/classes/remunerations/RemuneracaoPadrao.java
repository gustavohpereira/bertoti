package classes.remunerations;


public class RemuneracaoPadrao implements RemunerationInterface{
    public int bonificar(int salario, int tempo) {
        return salario + (salario * tempo );
    }
    
}
