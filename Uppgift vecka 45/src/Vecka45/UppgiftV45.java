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
		
		//Fråga 1
		System.out.println(volumeToMass(SolidTable.IRON,0.008) + "kg");
		
		//Fråga 2
		System.out.println(svtDistance(2.7,3000));
		
		//Fråga 3
		System.out.println(heat(FluidTable.WATER,4,78));
		
		//Fråga 4
		System.out.println(pressureUnderWater(75));
		
		//Fråga 5
		System.out.println(velocityToHeight(16.67) + 1.8);
		
		//Fråga 6
		System.out.println(power(319112.5,4.8));
		
		//Fråga 7
		double h = 12;
		double counter = 0;
		
			while(h > 0.5) {
				
				h = h * 0.99;
				counter ++;
			}
			
		System.out.println(counter);
		
		
		//Fråga 8 - En bil åker i 50 km/h i 20 sekunder på en raksträcka hur stor är accelerationen?
		System.out.println(acceleration(13.89, 20));
		
		
		/*
		 Fråga 9 - En boll som väger 0,5 kg faller från en viss höjd med accelerationen 10 m/s^2
		 		   vilken kraft har bollen i fallet?
		 */
		System.out.println(force(0.5 , 10));
		
		
		/*
		  Fråga 10 - Tomas puttar på ett bord med en kraft på 2 newton under 10 sekunder,
		  vad blir puttens impuls?
		 */
		System.out.println(impuls(2, 10));
		
	}
	
	
	// Metod 1
	public static double FahrenheitToCelsius(double fahrenheit) {
		
		
		double FahrenheitToCelsius = (fahrenheit-32)*5/(9);
		return FahrenheitToCelsius;
		
		
			}
	/*
	 
	 
	 * Först gjorde jag en metod som räknade ut farenheit till celsius och gjorde en
	   variabel fahrenheit
	   
	 * Sedan gjorde jag en variabel som hette FarenheitToCelsius och räknade ut celsius
	 
	 * Sedan returnar den svaret, alltså vad det blir i celsius
	 
	 * Celsius = C
	 
	 */
	
	//Metod 2
	public static double kelvinToCelsius(double kelvin) {
		
		
		double kelvinToCelsius = kelvin-273.15;
		return kelvinToCelsius;
		
		
	}
	
	/*
	  
	  
	 * Först skapade jag en metod som räknar ut kelvin till celsius
	 
	 * Sedan skapade jag en variabel vid namn kelvinToCelsius som räknar 
	   ut kelvin till celsius
	   
	 * Till sist returnar den kelvinToCelsius, alltså svaret
	 
	 * Celsius = C
	   
	   
	 */
	
	//Metod 3
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double fluidPressure = fluid.density * g_swe * deep;
		return fluidPressure;
		
	}
	
	/*
	  
	 
	 * Först skapade jag en metod som räknar ut vätsketrycket på en
	   vätskas djup
	   
	 * Sedan skapade jag en variabel vid namn fluidPressure som räknar
	   ut trycket
	   
	 * double fluidPressure = fluid.density * g_swe * deep =
	   densiteten på en vätska(kg/m^3 * tyngdaccelerationen(m/s^2) * djupet(m)
	   
	 * Tryck = N/m^2
	   
	   
	 */
	
	//Metod 4
	public static double pressureUnderWater(double deep) {
		
		double pressureUnderWater = FluidTable.WATER.density * g_swe * deep;
		return pressureUnderWater;
		
	}
	
	/*
	  
	  
	 * Först skapade jag en metod som räknar ut vätsketrycket på vattnets
	   djup
	   
	 * Sedan skapade jag en variabel vid namn pressureUnderWater
	 
	 * double pressureUnderWater = FluidTable.WATER.density * g_swe * deep =
	   vatten densitet(kg/m^3) * tyngdaccelerationen(m/s^2) * djupet(m)
	   
	 * Till sist returnar jag variabeln som då är svaret
	 
	 * Tryck = N/m^2
	 
	 */
	
	//Metod 5
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = Math.pow(velocity, 2) * mass / 2;
		return kineticEnergy;
		
	}
	
	/*
	  
	  
	 * Först skapade jag en metod som räknar ut
	   kinetisk energi
	   
	 * Sedan skapade jag en variabel vid namn kineticEnergy som räknar ut
	   den kinetiska energin 
	   
	 * double kineticEnergy = Math.pow(velocity, 2) * mass / 2 =
	   Hastigheten(m/s)^2 * massan (kg) / 2
	   
	 * Till sist returnar jag variabeln som då är svaret
	 
	 * Kinetisk Energi = Ek
	  
	 */

	//Metod 6
	public static double potentialEnergy(double mass, double height) {
		
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut potentiell
	   energi
	   
	 * Sedan skapade jag en variabel som heter potentialEnergy
	   och den räknar ut den potentiella energin
	   
	 * double potentialEnergy = mass * g_swe *height =
	   massan(kg) * tyngdaccelerationen(m/s^2) * höjden(m)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Potentiell Energi = Ep
	  
	 */
	
	//Metod 7
	public static double fallSpeed(double height) {
		
		double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe ;
		return fallSpeed;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut hastigheten
	   som ett föremål faller i
	   
	 * Sedan skapade jag en variabel som heter fallSpeed
	   och den räknar ut den potentiella energin
	   
	 * double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe =
	   höjden(m) * 2 / tyngdaccelerationen(m/s^2) * tyngdaccelerationen(m/s^2)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Hastighet = m/s
	  
	 */

	//Metod 8
	public static double delta(double first, double last) {
			
		double delta = last - first;
		return delta;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut deltan av
	   två tal
	   
	 * Sedan skapade jag en variabel som heter delta och
	   den räknar ut skillnaden mellan två tal
	   
	 * double delta = last - first = sista talet - första talet
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	  
	 */
	
	//Metod 9
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		double volumeToMass = fluid.density * volume;
		return volumeToMass;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som omvandlar volymen i
	   en vätska till massan i den vätskan
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det från volym till massa
	   
	 * double volumeToMass = fluid.density * volume =
	   densitet i flytande format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Massa = kg
	  
	 */
	
	//Metod 10
	public static double volumeToMass(GasTable gas, double volume) {
		
		double volumeToMass = gas.density * volume;
		return volumeToMass;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som omvandlar volymen i
	   en gas till massan i den gasen
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det från volym till massa
	   
	 * double volumeToMass = gas.density * volume =
	   densitet i gas format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Massa = kg
	  
	 */

	//Metod 11
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double volumeToMass = solid.density * volume;
		return volumeToMass;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som omvandlar volymen i
	   en fast form till massan i den fasta formen
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det från volym till massa
	   
	 * double volumeToMass = solid.density * volume =
	   densitet i fast format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Massa = kg
	  
	 */
	
	//Metod 12
	public static double svtVelocity(double distance, double time) {
		
		double svtVelocity = distance / time;
		return svtVelocity;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	  hastigheten med hjälp av sträckan och tiden
	   
	 * Sedan skapade jag en variabel som heter svtVelocity
	   som räknar ut hastigheten
	   
	 * double svtVelocity = distance / time = sträckan(m) / tiden(s)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Hastighet = m/s
	  
	 */

	//Metod 13
	public static double svtDistance(double velocity, double time) {
		
		double svtDistance = velocity * time;
		return svtDistance; 
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	  sträckan med hjälp av hastigheten och tiden
	   
	 * Sedan skapade jag en variabel som heter svtDistance
	   som räknar ut sträckan
	   
	 * double svtVelocity = velocity * time = hastigheten(m/s) * tiden(s)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Sträcka = m
	  
	  
	 */
	
	//Metod 14
	public static double svtTime(double distance, double velocity) {
		
		double svtTime = distance / velocity; 
		return svtTime;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   tiden med hjälp av sträckan och hastigheten
	   
	 * Sedan skapade jag en variabel som heter svtTime
	   som räknar ut tiden
	   
	 * double svtVelocity = distance / velocity = sträckan(m) / hastigheten(m/s)
	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Tid = s
	  
	 */
	
	//Metod 15
	public static double work(double force, double distance) {
		
		double work = force * distance;
		return work;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   arbetet i fysiken 
	   
	 * Sedan skapade jag en variabel som heter work
	   som räknar ut arbetet
	   
	 * double svtVelocity = force * distance = kraften(N) * sträckan(m)
	   
	 * Till sist returnar jag variabeln som då är svaret 
	 
	 * Arbete = Nm/J 
	  
	  
	 */
	
	//Metod 16
	public static double power(double work, double time) {
		
		double power = work / time;
		return power;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   effekten i fysiken 
	   
	 * Sedan skapade jag en variabel som heter power
	   som räknar ut effekten
	   
	 * double svtVelocity = work / time = Arbetet(J) * tiden(s)
	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Effekt = W
	  
	 */
	
	//Metod 17
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		double heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   hur mycket energi som behövs för att värma upp en fast form
	   
	 * Sedan skapade jag en variabel som heter heat
	   som räknar ut hur mycket energi som behövs
	   
	 * double heat =solid.heatCapacity * mass * deltaT = 
	   värmekapaciteten på fasta former(C) * massan(kg) * förändringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Energi = J
	  
	 */
	  
	//Metod 18
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   hur mycket energi som behövs för att värma upp en vätska
	   
	 * Sedan skapade jag en variabel som heter heat
	   som räknar ut hur mycket energi som behövs
	   
	 * double heat =fluid.heatCapacity * mass * deltaT = 
	   värmekapaciteten på vätskor(C) * massan(kg) * förändringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Energi = J
	  
	 */
	  
	//Metod 19
	public static double heat(GasTable gas, double mass, double deltaT) {
		
		double heat = gas.heatCapacity * mass * deltaT;
		return heat;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som räknar ut 
	   hur mycket energi som behövs för att värma upp en gas
	   
	 * Sedan skapade jag en variabel som heter heat
	   som räknar ut hur mycket energi som behövs
	   
	 * double heat = gas.heatCapacity * mass * deltaT = 
	   värmekapaciteten på gaser(C) * massan(kg) * förändringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Energi = J
	  
	 */
	
	//Metod 20
	public static double velocityToHeight(double velocity) {
		
		double velocityToHeight = Math.pow(velocity, 2) / (2 *  g_swe);
		return velocityToHeight;
		
	}
	
	/*
	  
	  
	 * Först börjar jag med att skapa en metod som omvandlar
	   hastigheten till höjden
	   
	 * Sedan skapade jag en variabel som heter velocityToHeight
	   som räknar ut höjden
	   
	 * double velocityToHeight = Math.pow(velocity, 2) / (2 * g_swe) = 
	  (hastigheten(m/s)^2) / (2 * tyngdaccelerationen(m/s^2))
	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Höjd = m
	  
	 */
	
	//Metod 21
	public static double acceleration(double velocity, double time) {
		
		double acceleration = velocity / time;
		return acceleration;
	}
	
	/*
	* Först börjar jag med att skapa en metod som räknar ut accelerationen
	   
	 * Sedan skapade jag en variabel som heter acceleration
	   som räknar ut accelerationen
	   
	 * double acceleration = velocity / time = 
	   hastigheten(m/s) / tiden(s)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Acceleration = m/s^2
	  
	 */
	
	//Metod 22
	public static double time(double acceleration, double velocity) {
		
		double time = acceleration / velocity;
		return time;
		
	}
	
	/*
	* Först börjar jag med att skapa en metod som räknar ut tiden 
	  med hjälp av acceleration och hastigheten
	   
	 * Sedan skapade jag en variabel som heter time
	   som räknar ut tiden
	   
	 * double time = acceleration / velocity = 
	  accelerationen(m/s^2)  / hastigheten(m/s)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Tiden = s
	  
	 */
	
	//Metod 23
	public static double velocity(double time, double acceleration) {
		
		double velocity = time * acceleration;
		return velocity;
	} 

	
	
	/*
	* Först börjar jag med att skapa en metod som räknar ut hastigheten 
	  med hjälp av acceleration och tiden
	   
	 * Sedan skapade jag en variabel som heter velocity
	   som räknar ut hastigheten
	   
	 * double time = tim * acceleration = tiden(s) * accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Hastigheten = m/s
	  
	 */
	
	//Metod 24
	public static double force(double mass, double acceleration) {
		
		double force = mass * acceleration;
		return force;
		
	}
	
	/*
	* Först börjar jag med att skapa en metod som räknar ut kraften
	  med hjälp av acceleration och massan på föremålet
	   
	 * Sedan skapade jag en variabel som heter force
	   som räknar ut kraften
	   
	 * double time = mass * acceleration = mass(kg) * accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Force = N
	  
	 */
	
	//Metod 25
	public static double massForce(double force, double acceleration) {
		
		double mass = force / acceleration;
		return mass;
		
	}
	
	/*
	* Först börjar jag med att skapa en metod som räknar ut massan
	  med hjälp av acceleration och kraften på föremålet
	   
	 * Sedan skapade jag en variabel som heter mass som räknar ut massan
	   
	 * double time = force / acceleration = force(N) / accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Massa = kg
	  
	 */
	
	//Metod 26
	public static double accelerationForce(double force, double mass) {
		
		double acceleration = force / mass;
		return acceleration;
		
	}

	/*
	* Först börjar jag med att skapa en metod som räknar ut accelerationen
	  med hjälp av massan och kraften på föremålet
	   
	 * Sedan skapade jag en variabel som heter acceleration
	   som räknar ut accelerationen
	   
	 * double acceleration = force / mass = force(N) / massan(kg)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	   
	 * Acceleration = m/s^2
	  
	 */

	//Metod 27
	public static double impuls(double force, double deltaTime) {
		
		double impuls = force * deltaTime;
		return impuls;
		
	}
	
	/*
	 
	 
	* Först börjar jag med att skapa en metod som räknar ut impulsen
	  med hjälp av förändringen i tiden och kraften på föremålet
	   
	 * Sedan skapade jag en variabel som heter impuls
	   som räknar ut impulsen
	   
	 * double impuls = force * deltaTime = kraften(N) * förändringen i tiden (s)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	  
	 */

	//Metod 28
	public static double forceImpuls(double impuls, double deltaTime) {
		
		double forceImpuls = impuls / deltaTime;
		return forceImpuls;
		
	}
	
	/*
	 
	 
	* Först börjar jag med att skapa en metod som räknar ut kraften
	  med hjälp av förändringen i tiden och impulsen på föremålet
	   
	 * Sedan skapade jag en variabel som heter forceImpuls
	   som räknar ut kraften
	   
	 * double force = impuls / deltaTime = impuls / förändringen i tiden (s)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	 
	 * Kraften = N
	  
	  
	 */

	//Metod 29
	public static double deltaTImpuls(double impuls, double force) {
		
		double deltaTImpuls = impuls / force;
		return deltaTImpuls;
		
	}
	
	/*
	 
	 
	* Först börjar jag med att skapa en metod som räknar ut kraften
	  med hjälp av förändringen i tiden och impulsen på föremålet
	   
	 * Sedan skapade jag en variabel som heter forceImpuls
	   som räknar ut kraften
	   
	 * double deltaTImpuls = impuls / force = impuls / kraften (N)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	 * Tiden = s
	  
	  
	 */
	
	//Metod 30
	public static double rorelseMangd(double mass, double velocity) {
		
		double rorelseMangd = mass * velocity;
		return rorelseMangd;
		
	}

	/*
	 
	 
	* Först börjar jag med att skapa en metod som räknar ut rörelsemängden
	  med hjälp av föremålets massa och hastighet
	   
	 * Sedan skapade jag en variabel som heter rorelseMangd
	   som räknar ut ett föremåls rörelsemängd
	   
	 * double rorelseMangd = mass * velocity = massan(kg) / hastighet(m/s)
	   	  	   
	 * Till sist returnar jag variabeln som då är svaret
	  
	  
	 */

	
}
