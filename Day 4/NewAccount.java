class IstAccount{  // Metaspace stores class information

public static void main(String[] args){ //Main method goes to metaspace

	String name1 = args[0];           //When main() starts:  All the data btwn {} goes into stack
	String name2 = args[1];           //When main() starts:  All the data btwn {} goes into stack

	int age1 = 21;                    //When main() starts:  All the data btwn {} goes into stack
	int age2 = 24;                    //When main() starts:  All the data btwn {} goes into stack
System.out.println("Account belongs to " + name1 + " and " + name2 + " with age: " + age1+" & " +age2+  " Respectively!!");

	}	
}



// Heap stores objects Ex: String name = new String("Khushu");
// Heap stores ====>   new String("Khushu");