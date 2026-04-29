
public class MainClass {

	public static void main(String[] args) {
		
		
		HotstarFree free = new HotstarFree();
		ConnectManager.manager(free);
		
		HotstarVip vip = new HotstarVip();
		ConnectManager.manager(vip);
		
		HotstarPremium p = new HotstarPremium();
		ConnectManager.manager(p);
		
		
		// TODO Auto-generated method stub

	}

}
