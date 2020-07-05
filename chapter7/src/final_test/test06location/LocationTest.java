package final_test.test06location;


import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LocationTest {
	public static void main(String[] args) {
		
		HashMap<String, Location> locInfo = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print(">> ");
			String lInfo = sc.nextLine();
			st = new StringTokenizer(lInfo, ", ");
			String locName = st.nextToken();
			int longtitude = Integer.parseInt(st.nextToken());
			int latitude = Integer.parseInt(st.nextToken());
			locInfo.put(locName, new Location(locName, longtitude, latitude));
		}
		System.out.println("----------------------");
		for (String loc : locInfo.keySet())
			System.out.println(locInfo.get(loc));
		System.out.println("----------------------");
		while (true) {
			System.out.print("���� �̸�>> ");
			String locName = sc.next();
			if (locName.equals("�׸�")) {
				sc.close();
				return;
			}
			if (locInfo.get(locName) == null){
				System.out.println(locName + "�� �����ϴ�.");
				continue;
			}
			System.out.println(locInfo.get(locName));
		}
	}
}
