/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.principal.projetocalculadora.controle;

import br.edu.principal.projetocalculadora.enums.EnumOperacao;

public class calculadoraController {
    private Double total = null; // Mudou de 0.0 para null

    public Double realizaOperacao(EnumOperacao operacao, Double valor){
        if (total == null) {
            total = valor;
        } else {
            switch(operacao) {
                case SOMA:
                    total += valor;
                    break;
                case SUBTRACAO:
                    total -= valor;
                    break;
                case MULTIPLICACAO:
                    total *= valor;
                    break;
                case DIVISAO:
                    if (valor == 0.0) {
                        throw new ArithmeticException("Divisão por zero");
                    }
                    total /= valor;
                    break;
            }
        }
        return total;
    }

    public Double getTotal(){
        return (total != null) ? total : 0.0;
    }

    public void zerar(){
        total = null;
    }
}
