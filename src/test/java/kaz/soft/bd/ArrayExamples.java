package kaz.soft.bd;

public class ArrayExamples {

	public static void main(String[] args) {
		//DataType[] arrayName={-,-,-,-} 
        String[] names = {"dip","Toko","Ayon","Pritam","Dipto","joy"};
		int[] num = {10,20,30,40,52,24,44};
		System.out.println("Array size of names: "+names.length);
		System.out.println("Array size of numbers: "+num.length);
		System.out.println("Here is our output: "+names[5] +" & Numbers: "+num[3]);
		
		for(int i=0; i< names.length; i++) {
			System.out.println(names[i]);
		}
		for(int i=0; i< num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
