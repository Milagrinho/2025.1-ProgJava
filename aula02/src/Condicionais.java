public class Condicionais {
    public static void main(String[] args) {
        int idade = 30;
        
        if (idade >= 18){
            System.out.println("Maior de idade");
        }else{
            //sout + TAB
            System.out.println("Menor de idade");
        }
        
        if(idade >= 16 && idade < 18 || idade >= 65){
            System.out.println("Voto opcional");
        }else if (idade >= 18 && idade < 65){
            System.out.println("Voto obrigatorio");
        }else{
            System.out.println("Não pode votar");
        }
        
        int diaUtil = 4;
        
        switch(diaUtil){
            case 2:
                System.out.println("Segunda-feira");
                
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4: 
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Não é um dia útil!");
        }
    }
}
