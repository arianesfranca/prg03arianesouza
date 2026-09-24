/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolicitanteTest {

    @Test
    public void listaDeSolicitacoesDeveCrescerAoAdicionar() {
        Solicitante solicitante = new Solicitante("Maria Souza", "71999999999");
        PessoaRegistrada pessoa = new PessoaRegistrada("Joao Silva", "Nascimento");
        Solicitacao solicitacao = new Solicitacao("001", "20/09/2026", "Nascimento", pessoa);

        solicitante.addSolicitacao(solicitacao);

        assertEquals(1, solicitante.getSolicitacoes().size());
    }

    @Test
    public void solicitanteDeveNascerSemSolicitacoes() {
        Solicitante solicitante = new Solicitante("Maria Souza", "71999999999");

        assertTrue(solicitante.getSolicitacoes().isEmpty());
    }
}