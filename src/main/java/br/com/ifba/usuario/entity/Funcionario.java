/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

/**
 *
 * @author ariia
 */

// Funcionario e um Usuario com permissao para alterar qualquer parte do sistema
public class Funcionario extends Usuario {

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, String login, String senha) {
        super(nome, cpf, login, senha);
    }

    // sobrescreve a descricao com o resultado proprio do Funcionario
    public String getDescricao() {
        return "Funcionario: " + getNome() + " - acesso total ao sistema";
    }
}