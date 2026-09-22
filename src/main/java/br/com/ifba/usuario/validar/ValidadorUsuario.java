/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

/**
 *
 * @author ariia
 */
public class ValidadorUsuario {
        /**
 * Verifica se o texto informado contém alguma palavra proibida.
 */
public static boolean contemPalavraProibida(String texto) {
        // array com as palavras não permitidas
        String[] palavrasProibidas = {"admin", "teste", "root", "senha123"};

        // percorre o array verificando se o texto contém alguma delas
        for (String palavra : palavrasProibidas) {
            if (texto.toLowerCase().contains(palavra)) {
                return true;
            }
        }

        return false;
    }
 // verifica se todos os campos obrigatorios foram preenchidos
    public static boolean camposPreenchidos(String nome, String cpf, String dataNascimento,
            String telefone, String email, String login, String senha, String confirmarSenha) {
        return nome != null && !nome.isEmpty()
                && cpf != null && !cpf.isEmpty()
                && dataNascimento != null && !dataNascimento.isEmpty()
                && telefone != null && !telefone.isEmpty()
                && email != null && !email.isEmpty()
                && login != null && !login.isEmpty()
                && senha != null && !senha.isEmpty()
                && confirmarSenha != null && !confirmarSenha.isEmpty();
    }

    // verifica se o cpf tem 11 digitos numericos
    public static boolean cpfValido(String cpf) {
        if (cpf == null) {
            return false;
        }
        return cpf.matches("\\d{11}");
    }

    // verifica se a senha atende ao tamanho minimo
    public static boolean senhaForte(String senha) {
        if (senha == null) {
            return false;
        }
        return senha.length() >= 6;
    }

    // verifica se a senha e a confirmacao sao iguais
    public static boolean senhasConferem(String senha, String confirmarSenha) {
        if (senha == null || confirmarSenha == null) {
            return false;
        }
        return senha.equals(confirmarSenha);
    }
}
