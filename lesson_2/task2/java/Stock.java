class Stock implements IDecreaseProduct{
	private int amountProduct;
	private int amountProductBuy;
	
	public Stock(int amountProduct, int amountProductBuy){
		this.amountProductBuy = amountProductBuy;
		this.amountProduct = amountProduct;
	}
	
	@Override
	public void setNewAmount(){
		amountProduct = amountProduct - amountProductBuy;
	}
	
	public boolean getAvailability(){
		if(amountProduct > amountProductBuy){
			setNewAmount();
			return true;
		}
		else return false;
	}
	
	public int getAmountProduct(){
		setNewAmount();
		return amountProduct;
	}
}