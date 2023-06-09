package Data;

public class mydto {
		
	private String key;
	private int value;
	
	public mydto(String key,Integer value) {
		this.key =key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
