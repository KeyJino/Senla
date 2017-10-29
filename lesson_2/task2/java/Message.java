class Message implements ITime {
	public String message;
	private int amountProduct;
	
	public Message(int amountProduct){
		this.amountProduct = amountProduct;
	}
	
	@Override 
	public String getTime(){
		return "10/10/17";
	}
	
	public void setMessageError(){
		message = "Error, without things";
	}
	
	public void setMessageAmount(){
		message = "Amount products: " + amountProduct; 
	}
	
	public String getMessage(){
		return message;
	}
}