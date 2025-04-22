
package exe04;

import java.util.Objects;

public class Automovel {
    private String modelo;
    private String fabricante;
    private int ano;
    private String placa;

    public Automovel(String modelo, String fabricante, int ano, String placa) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automovel{" + "modelo=" + modelo + ", fabricante=" + fabricante + ", ano=" + ano + ", placa=" + placa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.placa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Automovel other = (Automovel) obj;
        return Objects.equals(this.placa, other.placa);
    }
    
    
    
}
