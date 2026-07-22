class Operators{
	
	public static void main(String[] args){
	
	String marks = args[0];
	String college = args[1];
	
	int applicantMarks = Integer.parseInt(marks);
	

	if(applicantMarks >= 75 || college.equals("IIT BOMBAY") ){
	
		System.out.println("Congratualtions! You are selected for college!");
		
		}
	else{
		System.out.println("You are not eligible for this college because your percentage is "+ applicantMarks+ "%");
		}
	
	}

}