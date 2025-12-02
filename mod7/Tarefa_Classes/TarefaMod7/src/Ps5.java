public class Ps5 {

    private int numeroSerie;
    private int quantidadeGigas;
    private String modelo;

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getQuantidadeGigas() {
        return quantidadeGigas;
    }

    public void setQuantidadeGigas(int quantidadeGigas) {
        this.quantidadeGigas = quantidadeGigas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void cadastrarPs5(int numeroSerie, String modelo, int quantidadeGigas){
        setModelo(modelo);
        setNumeroSerie(numeroSerie);
        setQuantidadeGigas(quantidadeGigas);
    }

    public void ImprimirPs5(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Número de serie: " + this.numeroSerie);
        System.out.println("Quantidade de Gigabytes: " + this.quantidadeGigas);
    }
}
