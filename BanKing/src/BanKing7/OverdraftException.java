package BanKing7;

public class OverdraftException extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	private double deficit;//表示所取的钱与余额的差额

	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String msg,double deficit){
		super(msg);
		this.deficit=deficit;
	}

}
