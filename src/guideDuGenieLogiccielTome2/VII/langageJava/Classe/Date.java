package guideDuGenieLogiccielTome2.VII.langageJava.Classe;

public class Date {

	private int j, m, a;
	
	public Date(int j, int m, int a) {
		this.j = j;
		this.m = m;
		this.a = a;
	}
	
	public String getDate() {
		return (j+ "/" + m + "/" + a);
	}
	
}
