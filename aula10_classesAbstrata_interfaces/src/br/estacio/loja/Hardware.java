
package br.estacio.loja;

public class Hardware extends Produto implements IConectavel, IAtualizavel{
    //O modificador final em variaveis as transforma em CONSTANTES
    //Por convenção constantes são escritas em CAIXA_ALTA
    private final Fabricantes FABRICANTE;

    public Hardware(Fabricantes fabricante, String nome, 
                    Double precoBase) {
        super(nome, precoBase);
        this.FABRICANTE = fabricante;
    }

    public Fabricantes getFabricante() {
        return FABRICANTE;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 2;//+100%
    }    

    @Override
    public void conectar(Hardware hardware) {
        System.out.printf("Produto [%s] conectado a [%s]\n", getNome(), hardware.getNome());
    }
    
    
    @Override
    public void atualizaVersao(String versao) {
        System.out.println("Versão atual: " + versao);
    }
}
