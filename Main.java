package Exercícios02.ProjetoSmartphone.Smartphone;

    //Aluno: Willian Bongiovanni
//Exercício01 para o exercício 1
/*Q01- O que é e para que serve o encapsulamento na programação orientada a objetos? Exemplifique.
R: Encapsulamento é a característica da OO capaz de ocultar partes (dados e detalhes), de implementação interna de
classes, do mundo exterior.Por meio dele, é possível simplificar bastante a programação, bem como proteger
informações sigilosas ou sensíveis. Dominar esse conceito é fundamental, uma vez que com ele é possível deixar o código
mais legível, funcional e reutilizável.
*/

//Exercício01 para o exercício 2
/*Q02 - Desenvolva as classes da lista a seguir. O encapsulamento dos atributos deve ser private e dos
métodos são a seu critério.

CLASSE Ram
• Atributos: tipo (DDR2, DDR3, DDR4) e capacidade (tamanho em Gigabytes da memória)
• Métodos set e get
• Construtor padrão (com valores padrões para tipo e capacidade) e sobrecarga de construtor que altere todos os atributos
public class Ram {

    private String tipo;
    private double quantidade;

    public Ram(String tipo, double quantidade) {
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

}
CLASSE Processador
• Atributos: marca, modelo e velocidade;
• Métodos set e get.
• Construtor padrão e sobrecarga de construtor que altere todos os atributos.
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
CLASSE Tela
• Atributos: tamanho e resolução;
• Métodos set e get.
• Construtor padrão e sobrecarga de construtor que altere todos os atributos.
public class Tela {

    private String resolução;
    private String tamanho;

    public Tela(String resolução, String tamanho) {
        this.resolução = resolução;
        this.tamanho = tamanho;
    }
    public void setResolução(String resolução) {
        this.resolução = resolução;
    }

    public String getResolução() {
        return this.resolução;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}
CLASSE Bateria
• Atributo: capacidade.
• Métodos set e get
• Construtor padrão e sobrecarga de construtor que altere todos os atributos
public class Bateria {

    private String capacidade;

    public Bateria(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getCapacidade() {
        return this.capacidade;
    }
}
CLASSE Camera
• Atributo:resolução
• Métodos set e get
• Construtor padrão e sobrecarga de construtor que altere todos os atributos
public class Camera {

    private String resolução;

    public Camera(String resolução) {

        this.resolução = resolução;
    }

    public void setResolução(String resolução) {
        this.resolução = resolução;
    }

    public String getResolução() {
        return this.resolução;
    }
}
 */
//Exercício01 para o exercício 3
/*Q03 - Utilizando as classes Ram, Processador, Tela, Bateria e Câmera desenvolvidas, crie uma classe
Smartphone que seja composta por tais elementos. Os atributos desta classe são private. Desenvolva
os métodos set, get e um outro que imprima na tela todas as características do smartphone. O nome
do projeto é “ProjetoSmartphone” e do pacote é “PacoteSmartphone”. No main, instancie um iphone
12 e um Samsung S10. Para tal, procure a ficha técnica de tais equipamentos.*/

import Exercícios02.ProjetoSmartphone.Smartphone.Smartphone;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world");

            Aparelho Ap1 = new Aparelho("SamsungS10");
            Ram R1 = new Ram("DDR3", 8);
            Processador P1 = new Processador("SnapDragon", "SAMSUNG Exynos 9 Octa 9820", 2.7);
            Tela T1 = new Tela("1440 x 3040 pixels", "6,4 polegadas de 157,6 x 74,1 x 7,8 mm.");
            Bateria B1 = new Bateria("3400 mAh");
            Camera C1 = new Camera("4000 x 3000 pixel");

            Smartphone samsung = new Smartphone(Ap1, B1, C1, P1, R1, T1);
            samsung.imprimirSmartphone();

            Aparelho Ap2 = new Aparelho("Iphone12");
            Ram R2 = new Ram("DDR4", 4);
            Processador P2 = new Processador("Apple", "A14 Bionic", 3.1);
            Tela T2 = new Tela("1170 x 2532 pixel", "6,1 polegadas .");
            Bateria B2 = new Bateria("2815 mAh");
            Camera C2 = new Camera("4000 x 3000 pixel");

            Smartphone iphone = new Smartphone(Ap2, B2, C2, P2, R2, T2);
            iphone.imprimirSmartphone();

        }
}
