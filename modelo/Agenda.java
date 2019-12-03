/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Agenda {
    private int idAgenda;
    private String dataAgendamento;
    private int horario;
    private String situacao;
    private Paciente paci;
    private ArrayList<Receita> receitas;
    private Medico medi;
    private Prontuario pront;

    public Agenda() {
        this.receitas = new ArrayList<>();
    }

    public Agenda(int idAgenda, String dataAgendamento, int horario, String situacao, Paciente paci, ArrayList<Receita> receitas, Medico medi, Prontuario pront) {
        this.idAgenda = idAgenda;
        this.dataAgendamento = dataAgendamento;
        this.horario = horario;
        this.situacao = situacao;
        this.paci = paci;
        this.receitas = new ArrayList<>();
        this.medi = medi;
        this.pront = pront;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Paciente getPaci() {
        return paci;
    }

    public void setPaci(Paciente paci) {
        this.paci = paci;
    }

    public void getReceitas() {
        for (int j = 0; j < receitas.size(); j++) {
            System.out.println(this.receitas.get(j).getDescricao());
        }
    }

    public void setReceitas(Receita receitas) {
        this.receitas.add(receitas);
    }

    public Medico getMedi() {
        return medi;
    }

    public void setMedi(Medico medi) {
        this.medi = medi;
    }

    public Prontuario getPront() {
        return pront;
    }

    public void setPront(Prontuario pront) {
        this.pront = pront;
    }
    
    public void printPaciMed(){
        System.out.println("Paciente: "+this.getPaci().getNome());
        System.out.println("Medico: "+this.getMedi().getNome());
    }
    
    public void printPront(){
        System.out.println("Paciente: "+this.getPaci().getNome());
        System.out.println("Precisa de "+this.getPront().getMedicamentos());
    }
    
    public void printReceitas(){
        for (int j = 0; j < receitas.size(); j++) {
            System.out.println("             "+this.receitas.get(j).getDescricao());
        }
    }
}
