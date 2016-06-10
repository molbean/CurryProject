package curry;
import java.io.Serializable;
import java.util.ArrayList;
public class Curry implements Serializable{
	
	private int hour, minute;
	private ArrayList<String> product;
	private ArrayList<Integer> q;
	
	
	public Curry(){
		
	}
	public ArrayList<String> getProduct() {
        return product;
    }
	public ArrayList<Integer> getQ() {
        return q;
    }
	public int getHour() {
        return hour;
    }
	public int getMinute(){
		return minute;
	}
	 public void setProduct(ArrayList<String> product) {
	        this.product = product;
	    }
	 public void setQ(ArrayList<Integer> q) {
	        this.q = q;
	    }
	 public void setHour(int hour) {
	        this.hour = hour;
	    }
	 public void setMinute(int minute) {
	        this.minute = minute;
	    }
	 



}
