package testCoreJava;

public class CoreJava {

	public static void main(String[] args) {
		String t = "hrllo@ \ud835\udd46";
		System.out.println(t);
		int count = t.codePointCount(0, t.length());
		System.out.println(count);
		
		
		StringBuilder f = new StringBuilder();
		f.append("porno");
		System.out.println(f.length());
		f.append(t);
		System.out.println(f.length());
		f.append(t);
		f.append(t);
		
		System.out.println(f.length());
		String r = f.toString();
		int count2 = r.codePointCount(0, r.length());
		System.out.println(count2);
		System.out.println(r);
		
	}

}
