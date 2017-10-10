
public class CreatureFirstPart implements ILineStep{

    @Override
    public IProductPart buildProductPart() {
        System.out.println("Сэр, корпус прибыл, сэр");
        return new ProductBody("корпус");
    }
}
