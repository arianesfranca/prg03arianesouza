/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.validar;

import br.com.ifba.usuario.entity.Funcionario;
import br.com.ifba.usuario.entity.Solicitante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ariia
 */

public class ProcessadorUsuarioTest {

    @Test
    public void funcionarioAutenticaEDevolveDescricaoPropria() {
        Funcionario funcionario = new Funcionario("Ana", "11111111111", "ana", "123456");

        String resultado = ProcessadorUsuario.processarLogin(funcionario, "ana", "123456");

        assertEquals("Funcionario: Ana - acesso total ao sistema", resultado);
    }

    @Test
    public void solicitanteAutenticaEDevolveDescricaoDiferente() {
        Solicitante solicitante = new Solicitante("Bia", "22222222222", "bia", "654321", "71999999999");

        String resultado = ProcessadorUsuario.processarLogin(solicitante, "bia", "654321");

        assertEquals("Solicitante: Bia - Tel: 71999999999", resultado);
    }

    @Test
    public void devolveAcessoNegadoQuandoCredenciaisEstaoErradas() {
        Funcionario funcionario = new Funcionario("Ana", "11111111111", "ana", "123456");

        String resultado = ProcessadorUsuario.processarLogin(funcionario, "ana", "senhaErrada");

        assertEquals("Acesso negado para ana", resultado);
    }
}