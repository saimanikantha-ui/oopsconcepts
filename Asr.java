package hello;

abstract class Vehicle {
	  protected String brand = "Ford";       
	  void honk() {                   
	    System.out.println("Tuut, tuut!");
	  }
	}

	class Car extends Vehicle {
	  private String modelName = "Mustang";    
	  public static void main(String[] args) {
		  

	   
	    Car myCar = new Car();

	
	    myCar.honk();

	   
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	}


