package pack;

public class Hi {

	public static void main(String[] args) {
		int[] a = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
		int max = 0;
		int min = 0;
		int j = 0;
		int h = 0;
		
		for (int i = 1; i < a.length; i++) {

			if (a[max] < a[i]) {
				max = i;
				j = i;
			}
		}
		System.out.println("최대값 " + a[max]);
		System.out.println( (j+1) + "번째");
		
		System.out.println("------------------------");
		
		for (int i = 1; i < a.length; i++) {

			if (a[min] > a[i]) {
				min = i;
				h = i;
			}
		}
		System.out.println("최소값 " + a[min]);
		System.out.println( (h+1) + "번째");
	}

}