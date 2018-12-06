package trywithresources;

public class TryWithResourcesExample_1 {
	public static void main(String[] args) {
		try (Lion lion = new Lion(); Tiger tiger = new Tiger()) {
			lion.hunt();
			tiger.hunt();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally.");
		}
	}

}
