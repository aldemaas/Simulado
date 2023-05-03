import java.util.List;

public class ItensAEmbalar {

    public List <ItemASerEmbaladoIF> itens;
    public int adicionaItem(ItemASerEmbaladoIF item){
        itens.add(item);
        return itens.indexOf(item);
    }

    public double calculaQtdDeEmbalar (int posicao){
        return itens.get(posicao).getArea() * itens.get(posicao).getPeso();
    }

    public double calculaQtdeTotalDeEmbalar() {

        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).getArea() * itens.get(i).getPeso();
        }
        return total;
    }
}
