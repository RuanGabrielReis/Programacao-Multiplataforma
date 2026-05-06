import classes.Pessoa;
import jdk.swing.interop.DragSourceContextWrapper;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<20;i++) {
            Pessoa p1 = new Pessoa();
            System.out.println("Digite o nome da "+(i+1)+"ª pessoa: ");
            p1.setNome(scan.next());
            System.out.println("Digite a idade da "+(i+1)+"ª pessoa: ");
            p1.setIdade(scan.nextInt());
            System.out.println("Digite o salario da "+(i+1)+"ª pessoa: ");
            p1.setSalario(scan.nextDouble());
            System.out.println(p1.imprimirDadosDePessoa());;
            p1 = new Pessoa();
        }
    }
}