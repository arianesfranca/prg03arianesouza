/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03arianesouzaf;

import br.com.ifba.usuario.entity.Funcionario;
import br.com.ifba.usuario.entity.Solicitante;
import br.com.ifba.usuario.validar.ProcessadorUsuario;

/**
 *
 * @author ariia
 */
public class Prg03arianesouzaf {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", "11111111111", "ana", "123456");
        Solicitante solicitante = new Solicitante("Bia", "22222222222", "bia", "654321", "71999999999");

        System.out.println(ProcessadorUsuario.processarLogin(funcionario, "ana", "123456"));
        System.out.println(ProcessadorUsuario.processarLogin(solicitante, "bia", "654321"));
    }
}