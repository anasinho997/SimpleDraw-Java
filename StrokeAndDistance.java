


import java.util.ArrayList;
import java.util.List;

public class StrokeAndDistance {
	private Stroke s;
	private List<Float> list;
	
	public StrokeAndDistance() {
		list= new ArrayList<Float>();
		s=new Stroke();
		
	}
	
	
	
	public StrokeAndDistance(Stroke s, List<Float> list) {
		super();
		this.s = s;
		this.list = list;
	}



	public Stroke getS() {
		return s;
	}
	public void setS(Stroke s) {
		this.s = s;
	}
	public List<Float> getList() {
		return list;
	}
	public void setList(List<Float> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "StrokeAndDistance [s=" + s + ", list=" + list + "]";
	} 
	
	
	
}
