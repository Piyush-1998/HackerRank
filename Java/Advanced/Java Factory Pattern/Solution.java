/* 
interface Food {
	
	public String getType();
}

class Pizza implements Food {
	
	public String getType() {
		
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {

	public String getType() {
		return "Someone ordered a Dessert!";
	}
}


an object that returns another object from some other method call
class FoodFactory {
	public Food getFood(String order) {	
 */
	if(order.equals("pizza")) {
    
		return new Pizza();
	}

	return new Cake();
	}
