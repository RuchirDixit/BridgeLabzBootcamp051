public class Hello {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Hello Jupiter");
			System.out.println("Changes undone!");
			try{
					Thread.sleep(60000);
				}catch(Exception ex){
					System.out.println(ex);
				}
		}
	}
}
