package kaz.soft.bd;

import java.util.ArrayList;

//import java.util.ArrayList;
public class ArrayListExamples {

	public static void main(String[] args) {
		//ArrayList <Datatype> name = new ArrayList<Datatype>();
		ArrayList<String> names = new ArrayList<String>();
        System.out.println("Array size: "+names.size());
		names.add("Toko");
		//System.out.println("Size: "+names.size());
		names.add("Ayon");
		names.add("Dip");
		names.add("Joy");
		names.add("Mondol");
		names.add("Dipto");
		System.out.println("size: "+names.size());
        System.out.println("Mention their Names: "+names);
        System.out.println(names.get(3));
   /*     for(int i=0;i<names.size();i++) {
        	System.out.println(names.get(i));
        }*/
	    names.remove(3);
        System.out.println(names);
        names.clear();
        System.out.println(names);
}

}
