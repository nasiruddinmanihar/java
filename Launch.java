

class Plane
{
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	final public void landing() {
		System.out.println("plan is landing");
	}
}

class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("Cargo plane flies at lower height");
		
	}
	public void carryGoods()
	{
		System.out.println("Cargo plane carry goods");
	}
	
}


public class Launch {

	public static void main(String[] args) {
		
//		CargoPlane cp=new CargoPlane();
//		cp.fly();
//		cp.landing();
		
		Plane p=new CargoPlane();
		p.fly();
		p.landing();
		p.takeOff();
		
		CargoPlane d= (CargoPlane)p;
		d.carryGoods();
		
		
		
		
      
 
	}

}

