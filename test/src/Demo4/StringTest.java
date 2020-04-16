package Demo4;

public class StringTest {
	public static void main(String[] args) {
		String s = "  abcdefabc";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.concat("aaa"));
		System.out.println(s.contains("abc"));
		System.out.println(s.equals("abc"));
		System.out.println(s.endsWith("c"));
		System.out.println(s.startsWith("ab"));
		System.out.println(s.indexOf("b"));
		System.out.println(s.lastIndexOf("b"));
		System.out.println(s.replace("c", "*"));
		System.out.println(s.isEmpty());
		String[] a=s.split("ef");
		System.out.println(a[0]+a[1]);
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		char[] b=s.toCharArray(); 
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		byte[] c=s.getBytes();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
