package Vecka45;

import java.awt.datatransfer.FlavorTable;
import java.util.Scanner;

public class UppgiftV45 {
	
	static double G = Math.pow(10, -11) * 6.67;
	static double C = Math.pow(10, 8) * 3;
	static double g_swe = 9.82;
	static double p_0 = 1000;
	static double R = 8.31;
	
	public static void main(String[] args) {
		
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		
	}
	
	public static double FahrenheitToCelsius(double fahrenheit) {
		
		double FahrenheitToCelsius = (fahrenheit-32)*5/(9);
		return FahrenheitToCelsius;
		
			}

	public static double kelvinToCelsius(double kelvin) {
		
		double kelvinToCelsius = kelvin-273.15;
		return kelvinToCelsius;
		
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double fluidPressure = FluidTable.WATER.density * g_swe * deep;
		return fluidPressure;
		
	}
	
	

	
}
