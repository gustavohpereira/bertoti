package classes.remunerations;

public class RemuneracaoMedia implements RemunerationInterface {
    public int bonificar(int salario, int tempo) {
        return salario + (salario * tempo * 2 );
    }
}
