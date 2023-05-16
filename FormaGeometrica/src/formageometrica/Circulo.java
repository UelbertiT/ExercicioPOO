/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formageometrica;

/**
 *
 * @author aluno
 */

class Circulo extends FormaGeometrica {
        private final double raio;
        private double valorPi;
        public Circulo(double raio) {
            this.raio = raio;
        }
        @Override
        public double calcularArea(){
            return valorPi * raio * raio;
        }
}