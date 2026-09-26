/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Solicitante e um Usuario que pode solicitar certidoes e consultar o status
public class Solicitante extends Usuario {

    private String telefone;
    private List<Solicitacao> solicitacoes = new ArrayList<>();

    public Solicitante() {
        super();
    }

    public Solicitante(String nome, String cpf, String login, String senha, String telefone) {
        super(nome, cpf, login, senha);
        this.telefone = telefone;
    }

    public void addSolicitacao(Solicitacao solicitacao) {
        solicitacoes.add(solicitacao);
    }

    public List<Solicitacao> getSolicitacoes() {
        return Collections.unmodifiableList(solicitacoes);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // sobrescreve a descricao com o resultado proprio do Solicitante
    
    public String getDescricao() {
        return "Solicitante: " + getNome() + " - Tel: " + telefone;
    }
}