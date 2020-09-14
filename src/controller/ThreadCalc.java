package controller;

public class ThreadCalc extends Thread {
	
	private int[] vetor = new int[5];
	int linha;
	
	public ThreadCalc(int[] vetor, int linha){
		this.vetor = vetor;
		this.linha = (linha+1);
	}
	
	public void run() {
		int soma = 0;
		for (int i = 0; i<this.vetor.length; i++) {
			soma = soma + vetor[i];
		}
		System.out.println("Thread id#" + getId());
		System.out.println("Linha: " + this.linha);
		System.out.println("Soma: " + soma + "\n");
		
		
	}
	
	

}
