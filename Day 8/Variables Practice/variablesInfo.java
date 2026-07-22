class VariablesInfo
{
	int petrolPerLitre = 101; //Instance variable --> Stores in Heap // Can be used between class  and method
	
	
	public static void main(String[] args)
	
	{ //Method starts here
	
	// Local variables lies between Main Method{}   //Stores in Stack
	
	int carPrice = 5000000;
	System.out.println("Price of the car: "+ carPrice);
	
	String carName = "Fortuner";
	System.out.println("Car name: "+ carName);
	
	float carMileage = 28.05f;
	System.out.println("Car's mileage: "+ carMileage);
	
	char carCategory = 'A';
	System.out.println("Category of the car: "+ carCategory);
	
	} //Method ends here
	public  void bharatPetroleum()
	{
		System.out.println("Petrol/L = " + petrolPerLitre);
	}
}