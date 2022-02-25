//Classe main
/*Programa que calcula a folha de pagamento de funcionários concursados e temporários, com base
no tempo de contratação e dependentes menores
*/
package FolhaPagamento;

import java.util.ArrayList; //Uso de ArrayList
import java.util.Scanner; //Entrada de dados


public class FolhaPagamento {
    
    public static ArrayList<Funcionario> Funcionarios; //Declaração do ArrayList
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Funcionarios = new ArrayList<Funcionario>(); //Inicialização do ArrayList
     
        System.out.print("Informe número de funcionários: ");
        int n = teclado.nextInt();
        System.out.println();
        
        if (n > 100 || n < 1) {
            System.out.println("Informe número entre 1 e 100.");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Informe código do funcionário: ");
                int codigoImp = teclado.nextInt();
                
                System.out.print("Informe categoria do funcionário(1 para concursado, 2 para temporário): ");
                int tipo = teclado.nextInt(); 
                
                if (tipo == 1 || tipo == 2) {
                
                    System.out.print("Informe o salário-base: ");
                    double salarioBaseImp = teclado.nextInt();

                    if (tipo == 1) {
                    System.out.print("Informe anos de contratação: ");
                    int anosImp = teclado.nextInt();
                    
                    System.out.print("Informe número de dependentes: ");
                    int ndependentes = teclado.nextInt();
 
                    //Após obtenção dos dados, cria-se um novo objeto 'funcionario'
                    FuncionarioConcursado funcionario = new FuncionarioConcursado(codigoImp, salarioBaseImp, anosImp);
                    
                    for (int c = 0; c < ndependentes; c++) {
                        System.out.print("Informe idade do dependente " + (c + 1) + ": ");
                        int idade = teclado.nextInt();teclado.nextLine();
                        funcionario.AssociaDependente(idade);
                    }

                    Funcionarios.add(funcionario);
                    System.out.print("\n");
                    
                    } else {
                        //Else utilizado somente para personalizar 'anos' dos concursados e 'meses' dos temporários
                        System.out.print("Informe meses de contratação: ");
                        int mesesImp = teclado.nextInt();
                        
                        System.out.print("Informe número de dependentes: ");
                        int ndependentes = teclado.nextInt();
                    
                        //Após obtenção dos dados, cria-se um novo objeto 'funcionario'
                        FuncionarioTemporario funcionario = new FuncionarioTemporario(codigoImp, salarioBaseImp, mesesImp);

                        for (int c = 0; c < ndependentes; c++) {
                        System.out.print("Informe idade do dependente " + (c + 1) + ": ");
                        int idade = teclado.nextInt();teclado.nextLine();
                        funcionario.AssociaDependente(idade);
                        }

                        //Adiciona-se o objeto 'funcionário' ao ArrayList
                        Funcionarios.add(funcionario);
                        System.out.print("\n");
                    }
    
                } else {
                    //Caso valor informado seja diferente de 1 ou 2
                    System.out.print("\nInforme valor válido.\n");
                    break;
                }
            }        
        }
        
        //Imprime o código do funcionário associado ao seu salário
        System.out.println("\nFuncionários: ");
        for (Funcionario item: Funcionarios) {
            item.Imprimir();
            
        }

    }
    
}
