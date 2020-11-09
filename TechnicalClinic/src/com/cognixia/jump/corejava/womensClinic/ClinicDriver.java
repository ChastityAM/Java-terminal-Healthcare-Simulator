package com.cognixia.jump.corejava.womensClinic;

public class ClinicDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to the Women's Clinic. Let's get your information:");
		  Patient[] waitingRoomPatients = new Patient[12];
		  
		  for( int patientCount = 0; patientCount < 12; patientCount++) {
			  waitingRoomPatients[patientCount] = new Patient();
		  }
		  HealthWorker nurse = new HealthWorker();
			nurse.runTests(waitingRoomPatients);
		 
	}

}
