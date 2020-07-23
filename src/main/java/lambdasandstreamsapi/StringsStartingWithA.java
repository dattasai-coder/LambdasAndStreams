package lambdasandstreamsapi;
import java.util.stream.Stream;
public class StringsStartingWithA {
	public static void main(String[] args) {
		Stream<String> values = Stream.of("aka","bat", "aaa","age","Aunty","axe");
		values.filter(s -> s.startsWith("a") && s.length() == 3) 
        .peek(s -> System.out.println(s)) 
        .count();
	}
}