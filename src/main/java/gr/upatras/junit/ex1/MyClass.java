package gr.upatras.junit.ex1;



public class MyClass {
		public String subtract(int x, int y) {
			int z = x - y;
			if (z > 0) {
				return "POSITIVE";
			}
			else if (z < 0) {
				return "NEGATIVE";
			}
			else {
				return "The result is 0, Zero, Miden, Nada";
			}
		}
	}



