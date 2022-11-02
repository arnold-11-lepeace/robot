package noName;

public class Drone {
	private String ref;
	private boolean started;
	private int posX;
	private int posY;
	private int posZ;
	
	public Drone(String r) {
		ref = r;
		started = false;
		posX = 0;
		posY = 1;
		posZ = 0;
	}
	
	public String reference() {
		return ref;
	}
	public int positionX() {
		return posX;
	}
	public int positionY() {
		return posY;
	}
	public int positionZ() {
		return posZ;
	}
	public void envolDrone() {
		started = false;
	}
	public void deplacementDrone(int dX, int dY, int dZ) {
		if(started) {
			posX = posX + dX;
			posY = posY + dY;
			if (posZ + dZ >= 0) {
				posZ = posZ + dZ;
			}
			else {
				posZ = 0;
				System.out.println("Drone crashed !!!");
			}
		}
		else {
			System.out.println("Drone not started !!!");
		}
	}
	public int distanceAvecorigine() {
		return (int)Math.sqrt(posX * posX + posY * posY + posZ * posZ);
	}
}
