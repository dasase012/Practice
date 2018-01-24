import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx5 {
	public static void main(String[] args) {
		//command line���� input file�� ���������� ������ ���α׷��� �����Ѵ�.
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("output.txt"));
		}catch(IOException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		System.out.println(prop);
		Enumeration en = prop.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
