public class SuperMercado extends Lampada {

    Lampada corLampada;
    
    public void tipoLampada(){
        System.out.println("Escolha o tipo de lampada que deseja: ");
        System.out.println("1- Lampada colorida.");
        System.out.println("2- Lampada branca.");
        System.out.println("3- Lampada amarela.\n");

        switch (getCorLampada()) {
            case 1: System.out.println("A lampada colorida foi selecionada.\n");
            break;

            case 2: System.out.println("A lampada branca foi selecionada.\n");
            break;

            case 3: System.out.println("A lampada amarela foi selecionada.\n");
            break;
        
            default:System.out.println("Número indisponivel.");
                break;
        }
    }

    public void InformocaoLampada(){
        System.out.println("==================== INFORMAÇÕES DA LAMPADA DESEJADA ===================== " );
        double preco;
        if(!isEstoque() && (getCorLampada() < 4 && getCorLampada() >= 1)) {
            System.out.println("Há esse tipo de lampada no estoque. ");
        }
        else{
            System.out.println("Não há esse tipo de lampada no estoque.");
        }

        
        switch (getCorLampada()) {
            case 1: preco = 12.50;
            System.out.println("A lampada colorida custa: " + preco);
            break;

            case 2:preco = 9.00;
            System.out.println("A lampada branca custa: " + preco);
            break;

            case 3:preco = 8.50;
            System.out.println("A lampada amarela custa: " + preco);
            break;
        
            default:System.out.println("Número indisponivel.");
                break;
        }
        System.out.println("===========================================================================");
    }
}
