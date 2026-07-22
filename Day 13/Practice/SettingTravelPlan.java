/* If I have more than 10k then I will go by flight → Condition - 1
If I have less than 10k and more than 5k then I will go by train Condition - 2
If I have less than 5k and more than 1k then I go by bus Condition - 3
Otherwise I will not travel Condition - 4 */

class SettingTravelPlan{

public static void main(String[] args){
	
	int amount = Integer.parseInt(args[0]);
	SettingTravelPlan.settingDecision(amount);
	
	
	}
	public static void settingDecision(int amount)
	{
		if(amount >= 10000){
			System.out.println("I will go by Flight");
			}else if(amount <= 10000 && amount >= 5000 ){
				System.out.println("I will plan to go from train");
				}else if(amount <= 5000 && amount >= 1000){
				System.out.println("I will plan to go from a bus");
				}else{
					System.out.println("I will not go anywhere because I gave no budget plan");
					}
    }
}