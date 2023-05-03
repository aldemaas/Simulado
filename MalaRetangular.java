import java.util.Objects;

public class MalaRetangular implements ItemASerEmbaladoIF{

    private double lado1;
    private double lado2;
    private String material;
    private int peso;


    public MalaRetangular(double lado1, double lado2, String material, int peso) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.material = material;
        this.peso = peso;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public double getArea(){
        return Math.PI * lado1 * lado2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, peso, lado1, lado2);
    }

    @Override
    public String toString() {
        return "Mala retangular de " + material+ ", com área " + getArea()+ " e peso de "+ getPeso() + " gramas.";
    }


}
