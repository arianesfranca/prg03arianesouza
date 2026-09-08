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
}
