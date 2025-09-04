package vitor.exercice.clinica;

import vitor.exercice.clinica.model.Paciente;

public class ClinicaApp {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();
        paciente1.nome = "Pedro";
        paciente1.altura = 178;
        paciente1.peso = 76;
        paciente1.exibirDadosDoPaciente();
        //System.out.println(paciente1);

        Paciente paciente2 = new Paciente();
        paciente2.nome = "Ana Maria";
        paciente2.altura = 172;
        paciente2.peso = 84;
        paciente2.exibirDadosDoPaciente();
        //System.out.println(paciente2);

        Paciente paciente3 = paciente1;
        paciente3.exibirDadosDoPaciente();
    }
}
