
public class CreatureSecondPart implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Сэр, двигатель прибыл, сэр");
        return new ProductEngine("двигатель");
    }
}

