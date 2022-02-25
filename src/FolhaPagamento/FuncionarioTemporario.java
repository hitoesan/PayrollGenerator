//Classe filha da Classe Funcionario

package FolhaPagamento;

//Extends indica que a classe herda da Classe Funcionario
public class FuncionarioTemporario extends Funcionario {

    //Método construtor
    public FuncionarioTemporario(int codigo, double salariobase, int tempo) {
        super(codigo, salariobase, tempo);
    }
  
    //Sobrepõe classe já existente da classe mãe
    @Override
    public double CalcularSalario() {
        return salariobase + (15 * tempo) + (50 * this.NumMenorDeIdade(18)); //Utiliza método da classe mãe
    }
    
    //Imprime o valor do salário
    @Override
    public void Imprimir() {
    super.Imprimir(); //Chama o método da classe mãe pelo uso de super
    System.out.printf("%.2f", this.CalcularSalario());
    System.out.print("\n");
    }
    
}
