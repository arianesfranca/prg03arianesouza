/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

/**
 *
 * @author ariia
 */

// Classe de dominio PessoaRegistrada - pessoa registrada na certidao
public class PessoaRegistrada {

    private String nome;
    private String tipoRegistro;

    public PessoaRegistrada() {
    }

    public PessoaRegistrada(String nome, String tipoRegistro) {
        this.nome = nome;
        this.tipoRegistro = tipoRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }
}