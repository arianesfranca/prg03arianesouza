/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.com.ifba.usuario.repositorio;

import br.com.ifba.usuario.entity.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepositorioUsuarioEmMemoriaTest {

    @Test
    public void cadastrarUmUsuarioDeveAparecerEmListarTodos() {
        RepositorioUsuarioEmMemoria repositorio = new RepositorioUsuarioEmMemoria();
        Usuario usuario = new Usuario("Ana", "11111111111", "ana", "123456");

        repositorio.cadastrar(usuario);

        assertEquals(1, repositorio.listarTodos().size());
    }

    @Test
    public void buscarPorLoginDeveDevolverOUsuarioCerto() {
        RepositorioUsuarioEmMemoria repositorio = new RepositorioUsuarioEmMemoria();
        Usuario ana = new Usuario("Ana", "11111111111", "ana", "123456");
        Usuario bia = new Usuario("Bia", "22222222222", "bia", "654321");

        repositorio.cadastrar(ana);
        repositorio.cadastrar(bia);

        assertEquals(bia, repositorio.buscarPorLogin("bia"));
    }

    @Test
    public void buscarPorLoginComLoginInexistenteDeveDevolverNull() {
        RepositorioUsuarioEmMemoria repositorio = new RepositorioUsuarioEmMemoria();
        Usuario ana = new Usuario("Ana", "11111111111", "ana", "123456");

        repositorio.cadastrar(ana);

        assertNull(repositorio.buscarPorLogin("naoExiste"));
    }

    @Test
    public void cadastrarLoginDuplicadoDeveLancarExcecao() {
        RepositorioUsuarioEmMemoria repositorio = new RepositorioUsuarioEmMemoria();
        Usuario ana = new Usuario("Ana", "11111111111", "ana", "123456");
        Usuario outraAna = new Usuario("Ana Paula", "22222222222", "ana", "outraSenha");

        repositorio.cadastrar(ana);

        assertThrows(IllegalArgumentException.class, () -> repositorio.cadastrar(outraAna));
    }

    @Test
    public void doisUsuariosDiferentesComMesmoLoginSaoIguaisParaAColecao() {
        Usuario usuario1 = new Usuario("Ana", "11111111111", "ana", "123456");
        Usuario usuario2 = new Usuario("Ana Paula", "22222222222", "ana", "senhaDiferente");

        assertEquals(usuario1, usuario2);
    }
}