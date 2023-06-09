import java.util.Objects;

public class Estatua implements ItemASerEmbaladoIF{
    public Estatua(String material, double base, double altura, double peso) throws Exception {
        this.material = material;
        this.base = base;
        this.altura = altura;
        this.peso = peso;

        if (material == null){
            throw new Exception("Material tem que ser informado");
        }
        if (material == ""){
            throw new Exception("Material tem que ser informado");

        }
        if (base <= 0){
            throw new Exception("Base/altura tem que ser maior que zero");
        }
        if (altura <= 0){
            throw new Exception("Base/altura tem que ser maior que zero");
        }
        if (peso <= 0){
            throw new Exception("Peso tem que ser maior que zero");
        }
    }

    private String material;
    private double base;
    private double altura;
    private double peso;
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getArea(){
        return altura * base / 2;
    }

    @Override
    public String toString() {
        return "Estatua de " + getMaterial()+ ", com área " + getArea() + " e peso de " + getPeso() + " gramas.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Estatua))
            return false;
       Estatua other = (Estatua) obj;
        return Objects.equals(material, other.material)
                && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
                && Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base)
                && Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura);
    }
}
