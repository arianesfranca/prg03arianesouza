/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.repositorio;
import br.com.ifba.usuario.entity.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ariia
 */

// Guarda os objetos Usuario em memoria, enquanto a aplicacao esta rodando
public class RepositorioUsuarioEmMemoria {

    private final List<Usuario> usuarios = new ArrayList<>();
    private final Map<String, Usuario> porLogin = new HashMap<>();

    public void cadastrar(Usuario usuario) {
    if (porLogin.containsKey(usuario.getLogin())) {
        throw new IllegalArgumentException("Já existe um usuário com o login: " + usuario.getLogin());
    }
    usuarios.add(usuario);
    porLogin.put(usuario.getLogin(), usuario);
}

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    // busca percorrendo a lista com for (mais lenta conforme a lista cresce)
    public Usuario buscarPorLoginComFor(String login) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login)) {
                return usuario;
            }
        }
        return null;
    }

    // busca usando o Map (consulta direta, independente do tamanho)
    public Usuario buscarPorLogin(String login) {
        return porLogin.get(login);
    }
}