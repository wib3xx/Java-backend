class CheckVotingEligibility{

	public static void main(String[] args){
	
	int age = Integer.parseInt(args[0]);
	
	boolean votingStatus = CheckVotingEligibility.checkAge(age);
	
	}
	private  static boolean checkAge(int age){
	
		if(age >= 18){
			System.out.println("Eligibile for voting");
			} else{
				System.out.println("Not elibile for voting");
				}
				return true;
	} 

}