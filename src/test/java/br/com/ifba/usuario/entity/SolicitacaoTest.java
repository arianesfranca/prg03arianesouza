/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoTest {

    @Test
    public void solicitacaoDeveNascerComStatusAguardandoImpressao() {
        PessoaRegistrada pessoa = new PessoaRegistrada("Joao Silva", "Nascimento");
        Solicitacao solicitacao = new Solicitacao("001", "20/09/2026", "Nascimento", pessoa);

        assertEquals(StatusSolicitacao.AGUARDANDO_IMPRESSAO, solicitacao.getStatus());
    }

    @Test
    public void devePermitirObterAPessoaRegistradaPeloGetter() {
        PessoaRegistrada pessoa = new PessoaRegistrada("Joao Silva", "Nascimento");
        Solicitacao solicitacao = new Solicitacao("001", "20/09/2026", "Nascimento", pessoa);

        assertEquals(pessoa, solicitacao.getPessoaRegistrada());
    }

    @Test
    public void registrarImpressaoDeveAtualizarStatusEData() {
        PessoaRegistrada pessoa = new PessoaRegistrada("Joao Silva", "Nascimento");
        Solicitacao solicitacao = new Solicitacao("001", "20/09/2026", "Nascimento", pessoa);

        solicitacao.registrarImpressao("21/09/2026");

        assertEquals(StatusSolicitacao.IMPRESSA_AGUARDANDO_RETIRADA, solicitacao.getStatus());
        assertEquals("21/09/2026", solicitacao.getDataImpressao());
    }
}