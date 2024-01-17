public class Location{
	private String name;
	private int latitude;
	private int longtitude;
	
	public Location(String name,int latitude, int longtitude){
		this.name=name;
		this.latitude=latitude;
		this.longtitude=longtitude;
	}
	public String getName(){
		return name;
	}
	public int getLatitude(){
		return latitude;
	}
	public int getLongtitude(){
		return longtitude;
	}
	public String getAll(){
		String latitudeStr=Integer.toString(latitude);
		String longtitudeStr=Integer.toString(longtitude);
		return name+"  "+latitudeStr+"  "+longtitude;
	}
	
}