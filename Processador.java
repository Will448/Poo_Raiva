package Exercícios02.ProjetoSmartphone.Smartphone;

public class Processador {

        private String marca;
        private String modelo;
        private double velocidade;

        public Processador(String marca, String modelo, double velocidade) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidade = velocidade;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getModelo() {
            return this.modelo;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return this.marca;
        }

        public void setVelocidade(double velocidade) {
            this.velocidade = velocidade;
        }

        public double getVelocidade() {
            return this.velocidade;
        }
    }

