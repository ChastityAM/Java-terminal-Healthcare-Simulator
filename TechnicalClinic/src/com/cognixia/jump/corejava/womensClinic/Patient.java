package com.cognixia.jump.corejava.womensClinic;


import java.util.concurrent.ThreadLocalRandom;

public class Patient {
	// Attributes
	protected String[] nameArray = {"Susan", "Louise", "Kalina", "Chloe", "Nika", "Brittani", "Kayla", "Luseen", "Miriam", "Diana", "Amythest", "Evelyn"};
	public static int patientWaiting = 12;
	protected String name = nameArray[(int)(Math.random() * patientWaiting)];
	protected String[] bloodTypeArray = {"A+", "B-", "O+", "AB-", "AB+","A-", "B+", "O-"};
	protected int bloodTypeCounter = 8;
	protected String bloodType = bloodTypeArray[(int)(Math.random() * bloodTypeCounter)];
	protected String[] temperatureArray = {"96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106"};
	protected int temperatureCounter = 11;
	protected String temperature = temperatureArray[(int)(Math.random() * temperatureCounter)];
	protected String[] heightArray = {"60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72"};
	protected int heightCounter = 13;
	protected String height = heightArray[(int)(Math.random() * heightCounter)];
	protected String[] weightArray = {"160", "120", "130", "140", "150", "170", "180"};
	protected int weightCounter = 7;
	protected String weight = weightArray[(int)(Math.random() * weightCounter)];
	boolean sick = ThreadLocalRandom.current().nextBoolean();
	boolean pregnant = ThreadLocalRandom.current().nextBoolean();

    public Patient() {	
	}
	//Overloaded constructor 
	public Patient(String name, String bloodType, String height, String weight, String temperature, boolean sick, boolean pregnant) {
		this.name = name;
		this.bloodType = bloodType;
		this.height = height;
		this.weight = weight;
		this.temperature = temperature;
		this.sick = sick;
		this.pregnant = pregnant;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public boolean isSick() {
		return sick;
	}
	public void setSick(boolean sick) {
		this.sick = sick;
	}
	public boolean isPregnant() {
		return pregnant;
	}
	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

	public void getSick() {
		this.sick = true;
	}
	public void isHealthy() {
		this.sick = false;
	}
}

