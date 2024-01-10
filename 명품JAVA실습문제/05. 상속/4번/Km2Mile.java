class Km2Mile extends Converter{
	public Km2Mile(double ratio){
		this.ratio=ratio;
	}
	protected double convert(double src){
		return src/ratio;
	}
	protected String getSrcString(){
		return "Km";
	}
	protected String getDestString(){
		return "mile";
	}
}