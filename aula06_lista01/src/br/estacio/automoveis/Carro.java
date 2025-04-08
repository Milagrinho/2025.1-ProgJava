
package br.estacio.automoveis;

import java.util.List;

public class Carro {
    private String modelo;
    private Motor motor;
    private List<Pneu> pneus;

    public Carro(String modelo, Motor motor, List<Pneu> pneus) {
        this.modelo = modelo;
        this.motor = motor;
        this.pneus = pneus;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public List<Pneu> getPneus() {
        return pneus;
    }

    public void setPneus(List<Pneu> pneus) {
        this.pneus = pneus;
    }
    
}
