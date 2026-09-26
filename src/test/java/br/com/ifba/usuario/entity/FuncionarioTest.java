/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void funcionarioDeveAutenticarUsandoMetodoHerdadoDeUsuario() {
        Funcionario funcionario = new Funcionario("Ana", "11111111111", "ana", "123456");

        assertTrue(funcionario.autenticar("ana", "123456"));
    }

    @Test
    public void funcionarioDeveTerDescricaoPropriaSobrescrita() {
        Funcionario funcionario = new Funcionario("Ana", "11111111111", "ana", "123456");

        assertEquals("Funcionario: Ana - acesso total ao sistema", funcionario.getDescricao());
    }
}