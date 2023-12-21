public class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public void show(){
		System.out.print(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
	}
	public Song(){
		
	}
	public Song(String title,String artist, int year,String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
}