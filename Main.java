package AtividadeMAP;


public class Main {
    public static void main(String args[]) {

        Cardapio[] itens = new Cardapio[4];

        itens[0] = new Cardapio("Lamen");
        itens[1] = new Cardapio("Sushi");
        itens[2] = new Cardapio("Sashimi");
        itens[3] = new Cardapio("Temaki");

        Iterator menuIt = new Menu(itens);

        while(menuIt.hasNext()){
            Cardapio item = (Cardapio)menuIt.next();
            System.out.println(item.pratos);
        }
    }
}

