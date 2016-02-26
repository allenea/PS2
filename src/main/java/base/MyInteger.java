package base;

public class MyInteger {
	// encapsulated by making private
	private int value;
	
	public  MyInteger(int iValue){
		value = iValue;
	}
	
	public int getValue() {
		return value;
	}
	public boolean isEven(){
		return  (value % 2 == 0) ? true : false;
	}
	
	public boolean isOdd(){
		return !isEven();
	}
	

	public boolean isPrime() {
        if (value == 2 ) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i * i <=value; i += 2)
            if (value % i == 0) return false;
        return true;
	}
	
	public static boolean isEven(int value){
		MyInteger myInt = new MyInteger(value);
		return myInt.isEven();
		
	}
	
	public static boolean isOdd(int value){
		MyInteger myInt = new MyInteger(value);
		return myInt.isOdd();
	}
	
	public static boolean isPrime(int Value) {
        if (Value == 2 ) return true;
        if (Value % 2 == 0) return false;
        for (int i = 3; i * i <= Value; i += 2)
            if (Value % i == 0) return false;
        return true;
	}
	
	public static boolean isEven(MyInteger iValue){
		return MyInteger.isEven(iValue.getValue());
	}
	
	public static boolean isOdd(MyInteger iValue){
		return MyInteger.isOdd(iValue.getValue());
	}
	public static boolean isPrime(MyInteger iValue){
		return MyInteger.isPrime(iValue.getValue());
	}
	
	public boolean equals(int iValue){
		return(value == iValue) ? true: false;
	}
	
    public boolean equals(MyInteger iValue){
        return equals(iValue.getValue());
    }
    
}

