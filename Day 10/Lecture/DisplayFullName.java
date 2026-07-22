class DisplayFullName{

public static void main(String[] args){
	
	String obj1 = args[0];
	String obj2 = args[1];
	
	String result = DisplayFullName.showFullName(obj1, obj2);
	
	System.out.println("You full name is: "+ result);
	
	}

static String showFullName(String firstName , String secondName){
	
	String name = firstName + secondName;
	return name;
	}

}