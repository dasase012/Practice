import java.util.StringJoiner;

class StringJoinerEx {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s:arr)
			sj.add(s);
		
		System.out.println(sj.toString());
		
		
		String message = String.join("-", "Java", "is", "cool");
	     // message returned is: "Java-is-cool"
		System.out.println(message);
		
		String msg = String.join("/", "abc","def","ggg","hhh","123");
		System.out.println(msg);
		
		/*StringJoiner sj2=new StringJoiner(",","<",">");
		System.out.println(sj2.toString());*///==>내가 걍 해본건데 안됨
		
		StringJoiner sj3 = new StringJoiner(":", "[", "]");
		sj3.add("George").add("Sally").add("Fred");
		/*String desiredString = sj3.toString();*///==>이게 왜 있던거지? 
		System.out.println(sj3);
		
		StringJoiner sj4 = new StringJoiner("/","{","}");
		sj4.add("아").add("야").add("오호호");
		System.out.println(sj4);
		
	}
}
