package view;

import java.util.Arrays;

import controller.ThreadCalc;

public class Principal {
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][5];
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<5; j++) {
				matriz[i][j] = (int) (Math.random() * (100 - 1)+1);
			}
		}
		System.out.println("Matriz preenchida: " + Arrays.deepToString(matriz) + "\n");
		
		for (int i = 0; i<3; i++) {
			int[] vetor = new int[5];
			for (int j = 0; j<5; j++) {
				vetor[j] = matriz[i][j];
			}
			System.out.println("Vetor a ser itinerado: " + Arrays.toString(vetor));
			ThreadCalc calcvetor = new ThreadCalc(vetor, i);
			calcvetor.run();
		}
		
	}

}
