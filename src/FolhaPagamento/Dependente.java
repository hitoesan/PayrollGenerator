//Classe abstrata da classe Funcionario
//É utilizado para complementar os atributos da classe Funcionario

package FolhaPagamento;


public class Dependente {
    //Atributos
    public int idade;
    
    //Classe construtora
    public Dependente(int idade) {
        this.idade = idade;
    }
    
    public boolean VerificarMenorDeIdade(int idadelimite) {
        if (this.idade <= idadelimite) {
            return true;
        } else {
            return false;
        }
    }
    
}
