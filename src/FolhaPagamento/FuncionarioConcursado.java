//Classe filha de Funcionario

package FolhaPagamento;

//Extends indica que herda da classe Funcionario
public class FuncionarioConcursado extends Funcionario {

    public FuncionarioConcursado(int codigo, double salariobase, int tempo) {
        super(codigo, salariobase, tempo); //Chama o construtor da classe mãe
    }
    
    //Sobrepõe o método já existente da classe mãe
    @Override
    public double CalcularSalario() {
        return salariobase + (200 * tempo) + (100 * NumMenorDeIdade(21));
    }
    
    //Imprime o valor do salário
    @Override
    public void Imprimir() {
    super.Imprimir(); //Chama o método da classe mãe por meio do super
    System.out.printf("%.2f", this.CalcularSalario());
    System.out.print("\n");
    }
    
}
