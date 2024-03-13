package Aula2;

public class FuncaoRecursiva {
	
	public static int funcao(int recursiva) {
		if (recursiva == 1) {
			return 1;
		}
		return recursiva + funcao(recursiva -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(funcao(5));
	}

}
