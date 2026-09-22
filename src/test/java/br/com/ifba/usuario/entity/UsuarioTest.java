/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void deveAutenticarComCredenciaisCorretas() {
        Usuario usuario = new Usuario("Ariane", "12345678901", "ariane", "123456");

        assertTrue(usuario.autenticar("ariane", "123456"));
    }

    @Test
    public void naoDeveAutenticarComSenhaIncorreta() {
        Usuario usuario = new Usuario("Ariane", "12345678901", "ariane", "123456");

        assertFalse(usuario.autenticar("ariane", "senhaErrada"));
    }
}