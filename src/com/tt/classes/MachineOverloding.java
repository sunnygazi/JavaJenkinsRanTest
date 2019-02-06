package com.tt.classes;

public class MachineOverloding {

	
	
	public MachineOverloding() {
		System.out.println("constructor is running");

	}

	
	
	public MachineOverloding(String name) {
		System.out.println("Machine Name " + name);

	}

	
	
	
	public static void main(String[] args) {
		MachineOverloding machine1 = new MachineOverloding();
		MachineOverloding machine2 = new MachineOverloding("computer");

	}
}