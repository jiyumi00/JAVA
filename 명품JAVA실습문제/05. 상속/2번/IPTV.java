public class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip,int size,int color){
		super(size,color);
		this.ip=ip;
	}
	public String getIP(){
		return ip;
	}
	public void printProperty(){
		System.out.print("나의 IPTV는 "+getIP()+"주소의 ");
		super.printProperty();
	}
}