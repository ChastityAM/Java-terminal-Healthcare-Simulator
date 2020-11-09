package com.cognixia.jump.corejava.womensClinic;

public class HealthWorker {
	
	String name;
	public HealthWorker() {
		this.name = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void runTests(Patient [] waitingRoomPatients) {
		 for(int patientWaiting = 0; patientWaiting <12; patientWaiting++) {
			 System.out.println(waitingRoomPatients[patientWaiting].getName());
			  System.out.println(waitingRoomPatients[patientWaiting].getBloodType());
			  System.out.println(waitingRoomPatients[patientWaiting].getHeight()+ " inches tall.");
			  System.out.println(waitingRoomPatients[patientWaiting].getWeight()+ " pounds.");
			  System.out.println("Temperature of " + waitingRoomPatients[patientWaiting].getTemperature()+".");
			  System.out.println("Sick Status " + waitingRoomPatients[patientWaiting].isSick());	
			  System.out.println("Pregnant Status " + waitingRoomPatients[patientWaiting].isPregnant());
		 
			  if(waitingRoomPatients[patientWaiting].isSick()) {
				 System.out.println("The doc will be with you shortly.\n");
				 this.treatSick(waitingRoomPatients[patientWaiting]);
				
			  }
		 }
	}
	public void treatSick(Patient patientWaiting) {
		//for(int patientWaiting = 0; patientWaiting <12; patientWaiting++ ) {
			// if(waitingRoomPatients[patientWaiting].isSick()) {
				 System.out.println("I'm Dr. Pepper, let's see what we've got here\n");
				 System.out.println("Take these 3x/day as needed. ");
			// }
		//}
	}
			 
	

}
