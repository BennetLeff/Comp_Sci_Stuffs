public class Vigenere
{
	//declare instance variables for text and keyword
	private String text;
	private String keyword;

	//default constructor
	public Vigenere(){
		text = "";
		keyword = "";
	}
	
	//initialization constructor
	public Vigenere(String text, String key){
		this.text = text;
		keyword = key;
		int track = 0;
		while (keyword.length() < text.length()){
			keyword += keyword.charAt(track);
			track++;
		}
	}
	
	//modifier method for text
	public void setText(String t){
		text = t;
	}
	
	//modifier method for keyword
	public void setKeyword(String t){
		keyword = t;
	}
	
	//accessor method for text
	public String getText(){
		return text;
	}
	
	//accessor method for keyword
	public String getKey(){
		return keyword;
	}
	
	//encrypt method
		//return a String
		//no parameters
	public String encrypt(){
		String encrypt = "";
		for (int i = 0; i < text.length(); i++){
			encrypt += (char) (((text.charAt(i) + keyword.charAt(i)) % 26) + 65);
		}
		return encrypt;
	}
	
	//decrypt method
		//return a String
		//no parameters
	
	public String decrypt(){
		String decrypted = "";
		String encrypted = encrypt();
		for (int i = 0; i < encrypted.length(); i++){
			if ((((encrypted.charAt(i) - keyword.charAt(i)) % 26) + 65) >= 65)
				decrypted += (char) (((encrypted.charAt(i) - keyword.charAt(i)) % 26) + 65);
			else
				decrypted += (char) (((encrypted.charAt(i) - keyword.charAt(i)) % 26) + 91);
		}
		return decrypted;
	}
	
	//toString() method
	
}