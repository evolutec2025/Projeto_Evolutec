/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.principal.projetocalculadora;

import br.edu.principal.projetocalculadora.visao.jFrTela;

/**
 *
 * @author samuel moura
 */
public class ProjetoCalculadora {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrTela().setVisible(true);
            }
        });
    }
}
