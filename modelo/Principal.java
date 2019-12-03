/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente paci01 = new Paciente();
        Paciente paci02 = new Paciente();
        
        Agenda agend01 = new Agenda();
        Agenda agend02 = new Agenda();
        
        Medico med01 = new Medico();
        Medico med02 = new Medico();
        
        Prontuario pront01 = new Prontuario();
        Prontuario pront02 = new Prontuario();
        
        Receita rece01 = new Receita();
        Receita rece02 = new Receita();
        
        rece01.setIdExame(1);
        rece01.setDescricao("Receita 1");
        rece01.setValor(300.00);
        
        rece02.setIdExame(2);
        rece02.setDescricao("Receita 2");
        rece02.setValor(250.00);
        
        pront01.setConduta("Normal");
        pront01.setSintomas("Dor de cabeça");
        pront01.setHipoteseDiagnostica("Enxaqueca");
        pront01.setMedicamentos("Dorflex");
        
        pront02.setConduta("Urgente");
        pront02.setSintomas("Dores fortes no peito");
        pront02.setHipoteseDiagnostica("Parada Cardiaca");
        pront02.setMedicamentos("Consultar o Medico");
        
        agend01.setDataAgendamento("05/12/2019");
        agend01.setIdAgenda(1);
        agend01.setHorario(13);
        agend01.setSituacao("Espera");
        
        agend02.setDataAgendamento("01/01/2020");
        agend02.setIdAgenda(2);
        agend02.setHorario(15);
        agend02.setSituacao("Pronto");
        
        
        med01.setNome("Thiago");
        med01.setCrm(123);
        med01.setEspecialidade("Geral");
        med01.setCelular("321654987");
        med01.setCidade("Pirajui");
        med01.setContato("thiago@gmail.com");
        med01.setEstado("SP");
        med01.setAgendas(agend01);
        
        med02.setNome("Jose");
        med02.setCrm(321);
        med02.setEspecialidade("Ortopedista");
        med02.setCelular("987564321");
        med02.setCidade("Pirajui");
        med02.setContato("jose@gmail.com");
        med02.setEstado("SP");
        med02.setAgendas(agend02);
        
        
        paci01.setNome("Marlon");
        paci01.setSexo("M");
        paci01.setDtNascimento("25/05/2000");
        paci01.setCpf("123.123.123-12");
        paci01.setCelular("123456789");
        paci01.setEndereco("Rua A");
        paci01.setEstado("SP");
        paci01.setAgendas(agend01);
        
        paci02.setNome("Sara");
        paci02.setSexo("F");
        paci02.setDtNascimento("19/09/1995");
        paci02.setCpf("321.321.321-12");
        paci02.setCelular("123789456");
        paci02.setEndereco("Rua B");
        paci02.setEstado("SP");
        paci02.setAgendas(agend02);
        
        
        
        
        agend01.setMedi(med01);
        agend01.setPaci(paci01);
        agend01.setPront(pront01);
        agend01.setReceitas(rece01);
        
        agend02.setMedi(med02);
        agend02.setPaci(paci02);
        agend02.setPront(pront02);
        agend02.setReceitas(rece02);
        
        System.out.println("***** Pacientes *****");
        
        System.out.println("Paciente 01: "+paci01.getNome());
        System.out.println("Dia(s) do(s) agendamento(s): ");
        paci01.getAgendamento();
        paci01.printHorario();
        System.out.println("\n");
        System.out.println("Paciente 02: "+paci02.getNome());
        System.out.println("Dia(s) do(s) agendamento(s): ");
        paci02.getAgendamento();
        paci02.printHorario();
        
        System.out.println("\n***** Medicos *****");
        
        System.out.println("Medico: "+med01.getNome());
        System.out.println("Dia(s) do(s) agendamento(s): ");
        med01.getAgendamento();
        med01.printHorario();
        System.out.println("\n");
        System.out.println("Medico: "+med02.getNome());
        System.out.println("Dia(s) do(s) agendamento(s): ");
        med02.getAgendamento();
        med02.printHorario();
        
        System.out.println("\n***** Relações Pacientes e Medicos *****");
        System.out.println("Agenda 01:");
        agend01.printPaciMed();
        System.out.println("\nAgenda 02:");
        agend02.printPaciMed();
        
        System.out.println("\n***** Receitas Feitas *****");
        System.out.println("Paciente 01: ");
        agend01.printReceitas();
        System.out.println("\n");
        System.out.println("Paciente 02: ");
        agend02.printReceitas();
        
        System.out.println("\n***** Prontuario Paciente *****");
        agend01.printPront();
        System.out.println("\n");
        agend02.printPront();
    }
    
}
