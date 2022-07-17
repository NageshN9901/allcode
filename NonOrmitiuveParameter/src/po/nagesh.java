package po;

public class nagesh {

	
	// public pacage 1same calss 
	//public String n;
	protected  String n;
	protected int yaer=2022;
	static protected String ti="my en";

	public String name="Ngesh";
	private int re=1234;
	public int getMe() {
		return re;
	}
	public void setMe(int me) {
		this.re = me;
	}
	protected  void m1() {
		System.out.println("81");
	}
	public static void main(String[] args) {
		nagesh o =new nagesh();
		o.n="zhajzh";
		System.out.println(o.n);
		o.m1();
		System.out.println(nagesh.ti);// becuse it sattic it clled by class name.methodname or varibkle anme
		System.out.println(o.name);
		System.out.println(o.getMe());
	}
	
//	zhajzh
//	81
//	my en
	//Nagesh
//	1234


}
