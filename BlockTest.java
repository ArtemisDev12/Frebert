/* 
Демонстрация работы блока кода. 
Назовите этот файл BlockTest.java . 
*/
class BlockTest {
	public static void main(String[] args) {
		int x, y;
		y = 20;
		// целью этого цикла является блок
		for(x = 0; x < 10; x++) {
			System.out.println("Знaчeниe x: " + x); 
			System.out.println("Значение y: " + y); 
			y = y - 2;
		}
	}
}