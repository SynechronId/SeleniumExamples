package com.synechron.rakhiyana;

public class SampleProgram extends Sample1 {
	
	private static int i=0; 
	
	
	public void SampleProgram() {
		char ch1 = 88;
		System.out.println(ch1);
	}

	public static void main(String[] args) {
		SampleProgram prgm = new SampleProgram();
		prgm.SampleProgram();
		//System.out.println(Sample1.j+10);
		

	}

}
