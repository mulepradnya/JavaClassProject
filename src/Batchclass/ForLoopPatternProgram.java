package Batchclass;

public class ForLoopPatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*********
		//*********
		//*********
		//*********
		for (int i=0; i<4; i++) {
			for (int j=0; j<8; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
		
		//*******
		//******
		//*****
		//****
		//***
		//**
		//*
		for (int row=7; row>=1; row--) {
			for (int col=1; col<row; col++) {
				System.out.print("*");
			}
				System.out.println("");
		}

	}

}
