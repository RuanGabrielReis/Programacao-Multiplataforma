import classes.Pessoa;
import classes.Funcionario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*for (int i = 0; i<20;i++) {
            Pessoa p1 = new Pessoa();
            System.out.println("Digite o nome da "+(i+1)+"ª pessoa: ");
            p1.setNome(scan.next());
            System.out.println("Digite a idade da "+(i+1)+"ª pessoa: ");
            p1.setIdade(scan.nextInt());
            System.out.println("Digite o salario da "+(i+1)+"ª pessoa: ");
            p1.setSalario(scan.nextDouble());
            System.out.println(p1.imprimirDadosDePessoa());;
            p1 = new Pessoa();*/
        
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {

            funcionarios[i] = new Funcionario();

            System.out.println("Funcionário " + (i + 1));

            System.out.print("Nome: ");
            funcionarios[i].setNome(scan.nextLine());

            System.out.print("Data de nascimento (favor digitar no formato AAAA-MM-DD): ");
            funcionarios[i].setDataNascimento(
                    LocalDate.parse(scan.nextLine())
            );

            System.out.print("Salário: ");
            funcionarios[i].setSalario(scan.nextDouble());
            scan.nextLine();

            if (funcionarios[i].getSalario() > 5000) {
                funcionarios[i].aplicarBonus();
            } else {
                funcionarios[i].aplicarDesconto();
            }

            System.out.println();
        }

        System.out.println("Resultado final:");

        for (int i = 0; i < 5; i++) {
            funcionarios[i].mostrarDados();
        }
        scan.close();
    }
}