package AtividadeMAP;

class Cardapio{
    String pratos;
    Cardapio(String pratos){
        this.pratos=pratos;
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}

public class Menu implements Iterator {

    Cardapio[] pratos;
    int pos = 0;

    public Menu(Cardapio[] pratos){
        this.pratos = pratos;
    }

    public Object next(){
        Cardapio cardapio = pratos[pos];
        pos++;
        return cardapio;
    }
    public boolean hasNext(){
        if(pos >= pratos.length || pratos[pos] == null){
            return false;
        }else{
            return true;
        }
    }
}