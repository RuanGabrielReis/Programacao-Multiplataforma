package classes;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private double salario;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void aplicarDesconto() {
        salario = salario - (salario * 0.03);
    }

    public void aplicarBonus() {
        salario = salario + (salario * 0.05);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Salário final: R$ " + salario);
        System.out.println("");
    }
}