package classes;

import classes.remunerations.RemunerationInterface;

public class Funcionario {

    public  Funcionario (int Salario,int tempo){
        this.salario = Salario;
        this.tempo = tempo;
    }



    private RemunerationInterface bonificacao;
    private int salario;
    private int tempo;


    public void setTempo(int tempo){
        this.tempo = tempo;
    }
    public int getTempo(){
        return this.tempo;
    }


    public void setBonificacao(RemunerationInterface bonificacao){
        this.bonificacao = bonificacao;
    }
    public int realizarbonificacao(){
       int valor = this.bonificacao.bonificar(this.salario, this.tempo);
       return valor;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }

}
