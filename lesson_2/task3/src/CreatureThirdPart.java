public class CreatureThirdPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Сэр, башня прибыла, сэр");
        return new ProductTower("башня") ;
    }
}
