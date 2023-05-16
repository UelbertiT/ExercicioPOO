/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formageometrica;

/**
 *
 * @author aluno
 */
class Retangulo extends FormaGeometrica {
        private double comprimento;
        private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
        @Override
        public double calcularArea(){
            return largura * comprimento;
        }
    }


