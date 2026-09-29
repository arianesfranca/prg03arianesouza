/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

import br.com.ifba.usuario.entity.Usuario;
/**
 *
 * @author ariia
 */
public class ProcessadorUsuario {
    // recebe o tipo geral (Usuario), nunca o tipo concreto (Funcionario/Solicitante)
    public static String processarLogin(Usuario usuario, String login, String senha) {
        if (usuario.autenticar(login, senha)) {
            return usuario.getDescricao();
        } else {
            return "Acesso negado para " + login;
        }
    }
}
