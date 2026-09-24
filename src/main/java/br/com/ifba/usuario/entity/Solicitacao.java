/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.entity;

/**
 *
 * @author ariia
 */
public class Solicitacao {
    

    private String numero;
    private String dataSolicitacao;
    private String tipoCertidao;
    private StatusSolicitacao status;
    private PessoaRegistrada pessoaRegistrada;
    private String dataImpressao;

    public Solicitacao() {
        this.status = StatusSolicitacao.AGUARDANDO_IMPRESSAO;
    }

    public Solicitacao(String numero, String dataSolicitacao, String tipoCertidao, PessoaRegistrada pessoaRegistrada) {
        this.numero = numero;
        this.dataSolicitacao = dataSolicitacao;
        this.tipoCertidao = tipoCertidao;
        this.pessoaRegistrada = pessoaRegistrada;
        this.status = StatusSolicitacao.AGUARDANDO_IMPRESSAO;
    }

    // registra a impressao da certidao, atualizando o status
    public void registrarImpressao(String dataImpressao) {
        this.dataImpressao = dataImpressao;
        this.status = StatusSolicitacao.IMPRESSA_AGUARDANDO_RETIRADA;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getTipoCertidao() {
        return tipoCertidao;
    }

    public void setTipoCertidao(String tipoCertidao) {
        this.tipoCertidao = tipoCertidao;
    }

    public StatusSolicitacao getStatus() {
        return status;
    }

    public void setStatus(StatusSolicitacao status) {
        this.status = status;
    }

    public PessoaRegistrada getPessoaRegistrada() {
        return pessoaRegistrada;
    }

    public void setPessoaRegistrada(PessoaRegistrada pessoaRegistrada) {
        this.pessoaRegistrada = pessoaRegistrada;
    }

    public String getDataImpressao() {
        return dataImpressao;
    }

    public void setDataImpressao(String dataImpressao) {
        this.dataImpressao = dataImpressao;
    }
}

