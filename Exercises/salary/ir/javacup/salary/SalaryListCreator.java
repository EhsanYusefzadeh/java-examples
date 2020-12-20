package ir.javacup.salary;


public abstract class SalaryListCreator {

	protected Encoder encoder;
	
	public SalaryListCreator(Encoder encoder) {
	    this.encoder = encoder;
	}

	public String create(Employee[] employees) {
		String rawStr = doCreate(employees);
		return encoder.encode(rawStr);
	}
	
	protected abstract String doCreate(Employee[] employees);
	
	protected static String addZeroPrefix(String str, int length) {
        if(length == str.length()){
            return str;
        } else if(length < str.length()) {
            return str.substring(0, length);
        } else {
            String result = str;
            for(int i = 0; i < (length - str.length()); i++){
                result = 0 + result;
            }
            return result;
        }
	}

	protected String getRecordSeparator() {
	    return System.lineSeparator();
	}
	
	protected String getItemSeparator() {
	    return " ";
	}
}
