public class main{
	public static void main(String[] args) {
		
		Stock stock = new Stock(100, 104);
		Message message = new Message(stock.getAmountProduct());
		
		if(stock.getAvailability() == true)
			message.setMessageAmount();
		else
			message.setMessageError();
			
		System.out.println(message.getTime());
		System.out.println(message.getMessage());
	
	}
}