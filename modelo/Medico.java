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
public class Medico {
    private int crm;
    private String nome;
    private String especialidade;
    private String cidade;
    private String estado;
    private String celular;
    private String contato;
    private ArrayList<Agenda> agendamento;

    public Medico() {
        this.agendamento = new ArrayList<>();
    }

    public Medico(int crm, String nome, String especialidade, String cidade, String estado, String celular, String contato, ArrayList<Agenda> agendamento) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.cidade = cidade;
        this.estado = estado;
        this.celular = celular;
        this.contato = contato;
        this.agendamento = new ArrayList<>();
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void getAgendamento() {
        for (int j = 0; j < agendamento.size(); j++) {
            System.out.println(this.agendamento.get(j).getDataAgendamento());
        }
    }
    
    public void setAgendas(Agenda agendamentos) {
        this.agendamento.add(agendamentos);
    }
    
    
    public void printHorario(){
        System.out.println("Id do Agendamento: ");
        for (int j = 0; j < agendamento.size(); j++) {
            System.out.println("                   "+this.agendamento.get(j).getIdAgenda());
        }
    }
    
}
