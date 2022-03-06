import java.util.Scanner;
public class Piramida {
int noRan = sc.nextInt();
int nrRan = 1;

	private int n;
	
	public Piramida(int n) {
		super();
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}

	   
public void print() {  
	for (int i = noRan; n > 0; n--);
	{
		 
        for (int j = 1; j <= n; j++)
        {
            System.out.print(" ");
        }
        for (int j = 1; j <= nrRan; j++)
        {
            System.out.print(nrRan+" ");
        }

        System.out.println();


        nrRan++; }
}
	
	 
	public static void main (String[] args) {
		Piramida p = new Piramida(5);
		p.print();
	}
}