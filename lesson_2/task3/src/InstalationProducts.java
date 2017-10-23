
public class InstalationProducts implements IProduct{

    IProductPart body;
    IProductPart tower;
    IProductPart engine;

    InstalationProducts(ProductBody body, ProductEngine engine, ProductTower tower){
        this.body = body;
        this.engine = engine;
        this.tower = tower;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {
        System.out.println("Сэр, корпус установлен полностью, сэр");
        System.out.println();
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        System.out.println("Сэр, двигатель установлен полностью, сэр");
        System.out.println();
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        System.out.println("Сэр, башня установлена полностью, сэр");
        System.out.println();
    }

    InstalationProducts(){}
}
