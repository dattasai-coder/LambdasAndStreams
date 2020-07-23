package lambdasandstreamsapi;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream values = IntStream.of(10,20,30,40,50); 
        OptionalDouble ob = values.average(); 
        if (ob.isPresent()) { 
            System.out.println(ob.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
	}

}
