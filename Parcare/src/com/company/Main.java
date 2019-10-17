package com.company;

public class Main {

    public static void main(String[] args) {
	Parcare1 GreenHils =new Parcare1(2,4,4);
	ParcareSubterana Linella = new ParcareSubterana(3,4,2,2,10);
	System.out.println(GreenHils);
	GreenHils.setnrLocuriOcupate(1);
	System.out.println(GreenHils);
    System.out.println(Linella);
    }
}
