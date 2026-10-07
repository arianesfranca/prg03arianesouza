/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.entity;

import java.util.ArrayList;
import java.util.List;
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
    
    @Test
    public void construtorComTodosOsCamposDevePreencherTudo() {
        Usuario usuario = new Usuario("Carlos", "33333333333", "Masculino", "10/05/1990",
                "71988888888", "carlos@email.com", "carlos", "senha123");

        assertEquals("Carlos", usuario.getNome());
        assertEquals("Masculino", usuario.getGenero());
        assertEquals("carlos@email.com", usuario.getEmail());
}
    @Test
    public void doisUsuariosComMesmoLoginDevemSerIguaisParaAColecao() {
        Usuario usuario1 = new Usuario("Ana", "11111111111", "ana", "123456");
        Usuario usuario2 = new Usuario("Ana Paula", "22222222222", "ana", "senhaDiferente");

        List<Usuario> lista = new ArrayList<>();
        lista.add(usuario1);

    assertTrue(lista.contains(usuario2));
}
}