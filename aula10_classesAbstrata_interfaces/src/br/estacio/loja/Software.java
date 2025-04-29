package br.estacio.loja;

public class Software extends Produto implements IAtualizavel{
    private String versao;
    
    public Software(String nome, Double precoBase, 
                                            String versao) {
        super(nome, precoBase);
        this.versao = versao;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
    
    //Final aplicado a funções evita a sua reescrita nas classes filhas
    @Override
    public final double calcularPreco() {
        return getPrecoBase() * 1.35;//+35%
    }   

    @Override
    public void atualizaVersao(String versao) {
        String anterior = this.versao;
        this.versao = versao;
        System.out.printf("Versão anterior [%s], Nova versão [%s]\n", anterior, versao);
    }    
}
