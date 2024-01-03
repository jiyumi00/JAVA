class Dictionary{
	private static String[] kor={"사랑","아기","돈","미래","희망"};
	private static String[] eng={"love","baby","money","future","hope"};
	public static String kor2Eng(String word){
		boolean result=false;
		int index=0;
		for(int i=0;i<kor.length;i++){
			if(word.equals(kor[i])){
				result=true;
				index=i;
			}
		}
		if(result==true){
			return word+"는 "+eng[index];
		}
		else{
			return word+"는 저의 사전에 없습니다";
		}
	}
}