/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe de dominio Solicitante - pessoa que solicita a segunda via
public class Solicitante {

    private String nome;
    private String telefone;
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public Solicitante() {
    }

    public Solicitante(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // adiciona uma solicitacao sem expor a lista para fora da classe
    public void addSolicitacao(Solicitacao solicitacao) {
        solicitacoes.add(solicitacao);
    }

    public List<Solicitacao> getSolicitacoes() {
        return Collections.unmodifiableList(solicitacoes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}