package model;
import java.awt.Point;
import java.util.ArrayList;
public class Warehouse {

	public Point robotCoordinates;
	public Point storageCoordinates;
	public Point chargingCoordintates;
	public Point packingCoordinates;
	
	private ArrayList<Robot> robotList;
	private ArrayList<ChargingPod> chargeList;
	private ArrayList<StorageShelf> storageList;
	private ArrayList<PackingStation> packingList;

	
	public Warehouse(){
		/*
		this.chargingCoordintates=chargingCoordintates;
		this.robotCoordinates=robotCoordinates;
		this.storageCoordinates=storageCoordinates;
		this.packingCoordinates=packingCoordinates;
		*/
		robotList = new ArrayList<Robot>();
		chargeList = new ArrayList<ChargingPod>();
		storageList = new ArrayList<StorageShelf>();
		packingList = new ArrayList<PackingStation>();
	}
	
	public void addRobot(int x, int y, int batteryLevel, int chargeRate) {
		Robot robot = new Robot();
		robotList.add(robot);
		for(int i = 0; i < robotList.size(); i++) {
			robotList.get(i).updateBattery(batteryLevel);
			System.out.println(robotList.get(i).getID());
		}
		
		
		ChargingPod chargePod = new ChargingPod();
		chargeList.add(chargePod);
		for(int i = 0; i < chargeList.size(); i++) {
			chargeList.get(i).updateChargeRate(chargeRate);
		}
	}	
	
	public void addStorage(int x, int y) {
		StorageShelf storage = new StorageShelf();
		storageList.add(storage);
	}
	
	public void addPacking(int x, int y) {
		PackingStation packing = new PackingStation();
		packingList.add(packing);
	}
	
	public void removeRobot(int i) {
		robotList.remove(i);
	}
	
	public void removeStorage() {
	
	}
	
	public void removePacking() {
		
	}
	
	public void removeAll() {
		for(int i = 0; i < robotList.size(); i++) {
			robotList.remove(i);
		}
		for(int i = 0; i < chargeList.size(); i++) {
			chargeList.remove(i);
		}
		for(int i = 0; i < storageList.size(); i++) {
			storageList.remove(i);
		}
		for(int i = 0; i < packingList.size(); i++) {
			packingList.remove(i);
		}
		if(!robotList.isEmpty()) {
		robotList.remove(0);
		}
		if(!chargeList.isEmpty()) {
		chargeList.remove(0);
		}
		if(!storageList.isEmpty()) {
		storageList.remove(0);
		}
		if(!packingList.isEmpty()) {
		packingList.remove(0);
		}
	}

}
