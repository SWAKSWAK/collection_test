package final_test.test06location;


import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LocationTest {
	public static void main(String[] args) {
		
		HashMap<String, Location> locInfo = new HashMap<String, Location>();
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
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
			System.out.print("도시 이름>> ");
			String locName = sc.next();
			if (locName.equals("그만")) {
				sc.close();
				return;
			}
			if (locInfo.get(locName) == null){
				System.out.println(locName + "는 없습니다.");
				continue;
			}
			System.out.println(locInfo.get(locName));
		}
	}
}
