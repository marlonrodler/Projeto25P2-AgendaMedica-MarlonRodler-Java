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
public class Paciente {
    private String cpf;
    private String nome;
    private String endereco;
    private String estado;
    private String dtNascimento;
    private String celular;
    private String sexo;
    private ArrayList<Agenda> agendamento;

    public Paciente() {
        this.agendamento = new ArrayList<>();
    }

    public Paciente(String cpf, String nome, String endereco, String estado, String dtNascimento, String celular, String sexo, ArrayList<Agenda> agendamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.estado = estado;
        this.dtNascimento = dtNascimento;
        this.celular = celular;
        this.sexo = sexo;
        this.agendamento = new ArrayList<>();;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        System.out.println("Horarios marcados: ");
        for (int j = 0; j < agendamento.size(); j++) {
            System.out.println("                   "+this.agendamento.get(j).getHorario());
        }
        System.out.println("                      horas.");
    }
}
