//package OOPS.constructorOverloadingPolymorphism;

public class Vehicle {
    

    Vehicle(){

    }
    Vehicle(int x){
		System.out.println("Vehicle int-Arg Constructor");
	}
	Vehicle(double x){
		System.out.println("Vehicle double-Arg Constructor");
	}
	Vehicle(String x){
		System.out.println("Vehicle String-Arg Constructor");
	}

    Vehicle(char x){
		System.out.println("Vehicle char-Arg Constructor");
	}

}
// if not availble and not made construcor and if we call then the give error