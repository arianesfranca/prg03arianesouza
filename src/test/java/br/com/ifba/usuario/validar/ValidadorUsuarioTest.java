/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.validar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

    // ---- testes de cpfValido ----

    @Test
    public void deveAceitarCpfComOnzeDigitos() {
        assertTrue(ValidadorUsuario.cpfValido("12345678901"));
    }

    @Test
    public void deveRejeitarCpfVazio() {
        assertFalse(ValidadorUsuario.cpfValido(""));
    }

    @Test
    public void deveRejeitarCpfComLetras() {
        assertFalse(ValidadorUsuario.cpfValido("123abc78901"));
    }

    @Test
    public void deveRejeitarCpfNulo() {
        assertFalse(ValidadorUsuario.cpfValido(null));
    }

    // ---- testes de senhaForte ----

    @Test
    public void deveAceitarSenhaComTamanhoMinimo() {
        assertTrue(ValidadorUsuario.senhaForte("123456"));
    }

    @Test
    public void deveRejeitarSenhaMenorQueOMinimo() {
        assertFalse(ValidadorUsuario.senhaForte("123"));
    }

    @Test
    public void deveRejeitarSenhaNula() {
        assertFalse(ValidadorUsuario.senhaForte(null));
    }

    // ---- testes de camposPreenchidos ----

    @Test
    public void deveAceitarTodosOsCamposPreenchidos() {
        assertTrue(ValidadorUsuario.camposPreenchidos(
                "Ariane", "12345678901", "01/01/2000",
                "71999999999", "ariane@email.com", "ariane", "123456", "123456"));
    }

    @Test
    public void deveRejeitarCampoVazio() {
        assertFalse(ValidadorUsuario.camposPreenchidos(
                "", "12345678901", "01/01/2000",
                "71999999999", "ariane@email.com", "ariane", "123456", "123456"));
    }

    @Test
    public void deveRejeitarCampoNulo() {
        assertFalse(ValidadorUsuario.camposPreenchidos(
                null, "12345678901", "01/01/2000",
                "71999999999", "ariane@email.com", "ariane", "123456", "123456"));
    }
}