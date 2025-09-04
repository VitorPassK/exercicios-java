package vitor.exercice.clinica.model;

import java.time.LocalDate;

public class Paciente {
    private int id;
    public String nome;
    public int peso;
    public int altura;
    private LocalDate dataNascimento;
    private String email;

    private double calcularImc(){
        double alturaEmMetros = altura/100.0;
        double imc = peso/(alturaEmMetros*alturaEmMetros);
        return imc;
    }

    private String classificaImc(){
        double imc = calcularImc();
        if(imc<18.5){
            return "Abaixo do peso";
        }else if(imc>=18.5 && imc<25.0){
            return "Peso ideal";
        }else if(imc>=25.0 && imc<30.0){
            return "Acima do Peso";
        }else {
            return "Obesidade";
        }
    }
    public void exibirDadosDoPaciente(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularImc());
        System.out.println("Class. IMC: " + classificaImc());
        System.out.println("-------------------------------");
    }
}
