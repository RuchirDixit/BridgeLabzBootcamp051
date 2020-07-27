public class Hello {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Hello Mars");
			System.out.println("This is master branch");
			try{
					Thread.sleep(60000);
				}catch(Exception ex){
					System.out.println(ex);
				}
		}
	}
}
