//Classe mãe de FuncionarioConcursado e FuncionarioTemporario

package FolhaPagamento;

import java.util.ArrayList;


public class Funcionario {
    //Atributos
    public int codigo;
    public double salariobase;
    public int tempo;
    public int ndependentes;
    public ArrayList<Dependente> Dependentes; //ArrayList da Classe Dependente
    public int demenor;

    //Construtor
    //this irá se referir à própria classe
    public Funcionario(int codigo, double salariobase, int tempo) {
        this.codigo = codigo;
        this.salariobase = salariobase;
        this.tempo = tempo;
        this.demenor = 0;
        this.Dependentes = new ArrayList<Dependente>();
    }
    
    
    public int NumMenorDeIdade(int idadelimite) {
        for(Dependente item: this.Dependentes) {
            if (item.VerificarMenorDeIdade(idadelimite)) {
                demenor++;
            }
        }
        
        return demenor;
        
    }
    
    //Se número de dependentes for menor que o limite de 5, adiciona-o ao ArrayList Dependentes
    public void AssociaDependente(int idade) {
        if (this.Dependentes.size() < 5) {
            Dependente indiv = new Dependente(idade);
            this.Dependentes.add(indiv);
            
        } else {
            System.out.println("Erro! Limite de 5 dependentes foi atingido.");
        }    
    }
    
    //O programa automaticamente irá procurar pelo método da classe filha
    public double CalcularSalario() {
        return 0;
    }
    
    //Método de impressão do código do funcionário
    public void Imprimir() {
    System.out.print(this.codigo + ": ");
    }
}