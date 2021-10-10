package Exercícios02.ProjetoSmartphone.Smartphone;

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
