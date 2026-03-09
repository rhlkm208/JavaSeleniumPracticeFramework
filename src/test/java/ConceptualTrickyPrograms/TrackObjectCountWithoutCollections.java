package ConceptualTrickyPrograms;

public class TrackObjectCountWithoutCollections {
	
	public static int count=0;
	String name;
	
	
	public TrackObjectCountWithoutCollections(String name) {
		this.name=name;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	

	public static void main(String[] args) {
		
		TrackObjectCountWithoutCollections obj1 = new TrackObjectCountWithoutCollections("Rahul");
		TrackObjectCountWithoutCollections obj2 = new TrackObjectCountWithoutCollections("Rohit");
		
		System.out.println(TrackObjectCountWithoutCollections.getCount());

	}

}
