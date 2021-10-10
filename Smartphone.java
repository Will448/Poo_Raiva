package Exercícios02.ProjetoSmartphone.Smartphone;

public class Smartphone {

    private Ram ram;
    private Processador processador;
    private Camera camera;
    private Bateria bateria;
    private Tela tela;
    private Aparelho aparelho;

    public Smartphone( Aparelho aparelho,Bateria bateria, Camera camera, Processador processador, Ram ram, Tela tela){
        this.bateria = bateria;
        this.camera = camera;
        this.processador = processador;
        this.ram = ram;
        this.tela = tela;
        this.aparelho = aparelho;
    }

    public void setAparelho(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public Aparelho getAparelho() {
        return this.aparelho;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Processador getProcessador() {
        return this.processador;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ram getRam() {
        return this.ram;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Camera getCamera() {
        return this.camera;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Bateria getBateria() {
        return this.bateria;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    public Tela getTela() {
        return this.tela;
    }


    public void imprimirSmartphone() {

        System.out.println("\nSmartphone " + getAparelho().getAparelho());
        System.out.println("\nMemória Ram:");
        System.out.println("Tipo: " + getRam().getTipo());
        System.out.println( "Quantidade de armazenamento: " + getRam().getQuantidade() + "Gb");
        System.out.println("\nProcessador: ");
        System.out.println("Modelo do processador: " + getProcessador().getModelo());
        System.out.println("Marca do processador: " + getProcessador().getMarca());
        System.out.println("Velocidade do processador: " + getProcessador().getVelocidade());
        System.out.println("\nTela: ");
        System.out.println("Resolução: " + getTela().getResolução());
        System.out.println("Tamanho: " + getTela().getTamanho());
        System.out.println("\nBateria:");
        System.out.println("Capacidade de carga " + getBateria().getCapacidade());
        System.out.println("\nCâmera: ");
        System.out.println("Resolução geral da camera: " + getCamera().getResolução());
    }
}
