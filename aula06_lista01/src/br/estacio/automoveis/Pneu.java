
package br.estacio.automoveis;

public class Pneu {
    private String marca;
    private int aro;

    public Pneu(String marca, int aro) {
        this.marca = marca;
        this.aro = aro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }
    
    
}
