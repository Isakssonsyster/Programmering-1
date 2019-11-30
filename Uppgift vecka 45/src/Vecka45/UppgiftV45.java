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
		
		//Fr�ga 1
		System.out.println(volumeToMass(SolidTable.IRON,0.008) + "kg");
		
		//Fr�ga 2
		System.out.println(svtDistance(2.7,3000));
		
		//Fr�ga 3
		System.out.println(heat(FluidTable.WATER,4,78));
		
		//Fr�ga 4
		System.out.println(pressureUnderWater(75));
		
		//Fr�ga 5
		System.out.println(velocityToHeight(16.67) + 1.8);
		
		//Fr�ga 6
		System.out.println(power(319112.5,4.8));
		
		//Fr�ga 7
		double h = 12;
		double counter = 0;
		
			while(h > 0.5) {
				
				h = h * 0.99;
				counter ++;
			}
			
		System.out.println(counter);
		
		
		//Fr�ga 8 - En bil �ker i 50 km/h i 20 sekunder p� en rakstr�cka hur stor �r accelerationen?
		System.out.println(acceleration(13.89, 20));
		
		
		/*
		 Fr�ga 9 - En boll som v�ger 0,5 kg faller fr�n en viss h�jd med accelerationen 10 m/s^2
		 		   vilken kraft har bollen i fallet?
		 */
		System.out.println(force(0.5 , 10));
		
		
		/*
		  Fr�ga 10 - Tomas puttar p� ett bord med en kraft p� 2 newton under 10 sekunder,
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
	 
	 
	 * F�rst gjorde jag en metod som r�knade ut farenheit till celsius och gjorde en
	   variabel fahrenheit
	   
	 * Sedan gjorde jag en variabel som hette FarenheitToCelsius och r�knade ut celsius
	 
	 * Sedan returnar den svaret, allts� vad det blir i celsius
	 
	 * Celsius = C
	 
	 */
	
	//Metod 2
	public static double kelvinToCelsius(double kelvin) {
		
		
		double kelvinToCelsius = kelvin-273.15;
		return kelvinToCelsius;
		
		
	}
	
	/*
	  
	  
	 * F�rst skapade jag en metod som r�knar ut kelvin till celsius
	 
	 * Sedan skapade jag en variabel vid namn kelvinToCelsius som r�knar 
	   ut kelvin till celsius
	   
	 * Till sist returnar den kelvinToCelsius, allts� svaret
	 
	 * Celsius = C
	   
	   
	 */
	
	//Metod 3
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double fluidPressure = fluid.density * g_swe * deep;
		return fluidPressure;
		
	}
	
	/*
	  
	 
	 * F�rst skapade jag en metod som r�knar ut v�tsketrycket p� en
	   v�tskas djup
	   
	 * Sedan skapade jag en variabel vid namn fluidPressure som r�knar
	   ut trycket
	   
	 * double fluidPressure = fluid.density * g_swe * deep =
	   densiteten p� en v�tska(kg/m^3 * tyngdaccelerationen(m/s^2) * djupet(m)
	   
	 * Tryck = N/m^2
	   
	   
	 */
	
	//Metod 4
	public static double pressureUnderWater(double deep) {
		
		double pressureUnderWater = FluidTable.WATER.density * g_swe * deep;
		return pressureUnderWater;
		
	}
	
	/*
	  
	  
	 * F�rst skapade jag en metod som r�knar ut v�tsketrycket p� vattnets
	   djup
	   
	 * Sedan skapade jag en variabel vid namn pressureUnderWater
	 
	 * double pressureUnderWater = FluidTable.WATER.density * g_swe * deep =
	   vatten densitet(kg/m^3) * tyngdaccelerationen(m/s^2) * djupet(m)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	 
	 * Tryck = N/m^2
	 
	 */
	
	//Metod 5
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = Math.pow(velocity, 2) * mass / 2;
		return kineticEnergy;
		
	}
	
	/*
	  
	  
	 * F�rst skapade jag en metod som r�knar ut
	   kinetisk energi
	   
	 * Sedan skapade jag en variabel vid namn kineticEnergy som r�knar ut
	   den kinetiska energin 
	   
	 * double kineticEnergy = Math.pow(velocity, 2) * mass / 2 =
	   Hastigheten(m/s)^2 * massan (kg) / 2
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	 
	 * Kinetisk Energi = Ek
	  
	 */

	//Metod 6
	public static double potentialEnergy(double mass, double height) {
		
		double potentialEnergy = mass * g_swe * height;
		return potentialEnergy;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut potentiell
	   energi
	   
	 * Sedan skapade jag en variabel som heter potentialEnergy
	   och den r�knar ut den potentiella energin
	   
	 * double potentialEnergy = mass * g_swe *height =
	   massan(kg) * tyngdaccelerationen(m/s^2) * h�jden(m)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Potentiell Energi = Ep
	  
	 */
	
	//Metod 7
	public static double fallSpeed(double height) {
		
		double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe ;
		return fallSpeed;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut hastigheten
	   som ett f�rem�l faller i
	   
	 * Sedan skapade jag en variabel som heter fallSpeed
	   och den r�knar ut den potentiella energin
	   
	 * double fallSpeed = Math.sqrt((2*height) / g_swe) * g_swe =
	   h�jden(m) * 2 / tyngdaccelerationen(m/s^2) * tyngdaccelerationen(m/s^2)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Hastighet = m/s
	  
	 */

	//Metod 8
	public static double delta(double first, double last) {
			
		double delta = last - first;
		return delta;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut deltan av
	   tv� tal
	   
	 * Sedan skapade jag en variabel som heter delta och
	   den r�knar ut skillnaden mellan tv� tal
	   
	 * double delta = last - first = sista talet - f�rsta talet
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	  
	 */
	
	//Metod 9
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		double volumeToMass = fluid.density * volume;
		return volumeToMass;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som omvandlar volymen i
	   en v�tska till massan i den v�tskan
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det fr�n volym till massa
	   
	 * double volumeToMass = fluid.density * volume =
	   densitet i flytande format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Massa = kg
	  
	 */
	
	//Metod 10
	public static double volumeToMass(GasTable gas, double volume) {
		
		double volumeToMass = gas.density * volume;
		return volumeToMass;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som omvandlar volymen i
	   en gas till massan i den gasen
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det fr�n volym till massa
	   
	 * double volumeToMass = gas.density * volume =
	   densitet i gas format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Massa = kg
	  
	 */

	//Metod 11
	public static double volumeToMass(SolidTable solid, double volume) {
		
		double volumeToMass = solid.density * volume;
		return volumeToMass;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som omvandlar volymen i
	   en fast form till massan i den fasta formen
	   
	 * Sedan skapade jag en variabel som heter volumeToMass som omvandlar
	   det fr�n volym till massa
	   
	 * double volumeToMass = solid.density * volume =
	   densitet i fast format(kg/m^3) * volymen(m^3)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Massa = kg
	  
	 */
	
	//Metod 12
	public static double svtVelocity(double distance, double time) {
		
		double svtVelocity = distance / time;
		return svtVelocity;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	  hastigheten med hj�lp av str�ckan och tiden
	   
	 * Sedan skapade jag en variabel som heter svtVelocity
	   som r�knar ut hastigheten
	   
	 * double svtVelocity = distance / time = str�ckan(m) / tiden(s)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Hastighet = m/s
	  
	 */

	//Metod 13
	public static double svtDistance(double velocity, double time) {
		
		double svtDistance = velocity * time;
		return svtDistance; 
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	  str�ckan med hj�lp av hastigheten och tiden
	   
	 * Sedan skapade jag en variabel som heter svtDistance
	   som r�knar ut str�ckan
	   
	 * double svtVelocity = velocity * time = hastigheten(m/s) * tiden(s)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Str�cka = m
	  
	  
	 */
	
	//Metod 14
	public static double svtTime(double distance, double velocity) {
		
		double svtTime = distance / velocity; 
		return svtTime;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   tiden med hj�lp av str�ckan och hastigheten
	   
	 * Sedan skapade jag en variabel som heter svtTime
	   som r�knar ut tiden
	   
	 * double svtVelocity = distance / velocity = str�ckan(m) / hastigheten(m/s)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Tid = s
	  
	 */
	
	//Metod 15
	public static double work(double force, double distance) {
		
		double work = force * distance;
		return work;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   arbetet i fysiken 
	   
	 * Sedan skapade jag en variabel som heter work
	   som r�knar ut arbetet
	   
	 * double svtVelocity = force * distance = kraften(N) * str�ckan(m)
	   
	 * Till sist returnar jag variabeln som d� �r svaret 
	 
	 * Arbete = Nm/J 
	  
	  
	 */
	
	//Metod 16
	public static double power(double work, double time) {
		
		double power = work / time;
		return power;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   effekten i fysiken 
	   
	 * Sedan skapade jag en variabel som heter power
	   som r�knar ut effekten
	   
	 * double svtVelocity = work / time = Arbetet(J) * tiden(s)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Effekt = W
	  
	 */
	
	//Metod 17
	public static double heat(SolidTable solid, double mass, double deltaT) {
		
		double heat = solid.heatCapacity * mass * deltaT;
		return heat;
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   hur mycket energi som beh�vs f�r att v�rma upp en fast form
	   
	 * Sedan skapade jag en variabel som heter heat
	   som r�knar ut hur mycket energi som beh�vs
	   
	 * double heat =solid.heatCapacity * mass * deltaT = 
	   v�rmekapaciteten p� fasta former(C) * massan(kg) * f�r�ndringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Energi = J
	  
	 */
	  
	//Metod 18
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		
		double heat = fluid.heatCapacity * mass * deltaT;
		return heat;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   hur mycket energi som beh�vs f�r att v�rma upp en v�tska
	   
	 * Sedan skapade jag en variabel som heter heat
	   som r�knar ut hur mycket energi som beh�vs
	   
	 * double heat =fluid.heatCapacity * mass * deltaT = 
	   v�rmekapaciteten p� v�tskor(C) * massan(kg) * f�r�ndringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Energi = J
	  
	 */
	  
	//Metod 19
	public static double heat(GasTable gas, double mass, double deltaT) {
		
		double heat = gas.heatCapacity * mass * deltaT;
		return heat;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som r�knar ut 
	   hur mycket energi som beh�vs f�r att v�rma upp en gas
	   
	 * Sedan skapade jag en variabel som heter heat
	   som r�knar ut hur mycket energi som beh�vs
	   
	 * double heat = gas.heatCapacity * mass * deltaT = 
	   v�rmekapaciteten p� gaser(C) * massan(kg) * f�r�ndringen i temperaturen(C)
	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Energi = J
	  
	 */
	
	//Metod 20
	public static double velocityToHeight(double velocity) {
		
		double velocityToHeight = Math.pow(velocity, 2) / (2 *  g_swe);
		return velocityToHeight;
		
	}
	
	/*
	  
	  
	 * F�rst b�rjar jag med att skapa en metod som omvandlar
	   hastigheten till h�jden
	   
	 * Sedan skapade jag en variabel som heter velocityToHeight
	   som r�knar ut h�jden
	   
	 * double velocityToHeight = Math.pow(velocity, 2) / (2 * g_swe) = 
	  (hastigheten(m/s)^2) / (2 * tyngdaccelerationen(m/s^2))
	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * H�jd = m
	  
	 */
	
	//Metod 21
	public static double acceleration(double velocity, double time) {
		
		double acceleration = velocity / time;
		return acceleration;
	}
	
	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut accelerationen
	   
	 * Sedan skapade jag en variabel som heter acceleration
	   som r�knar ut accelerationen
	   
	 * double acceleration = velocity / time = 
	   hastigheten(m/s) / tiden(s)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Acceleration = m/s^2
	  
	 */
	
	//Metod 22
	public static double time(double acceleration, double velocity) {
		
		double time = acceleration / velocity;
		return time;
		
	}
	
	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut tiden 
	  med hj�lp av acceleration och hastigheten
	   
	 * Sedan skapade jag en variabel som heter time
	   som r�knar ut tiden
	   
	 * double time = acceleration / velocity = 
	  accelerationen(m/s^2)  / hastigheten(m/s)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Tiden = s
	  
	 */
	
	//Metod 23
	public static double velocity(double time, double acceleration) {
		
		double velocity = time * acceleration;
		return velocity;
	} 

	
	
	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut hastigheten 
	  med hj�lp av acceleration och tiden
	   
	 * Sedan skapade jag en variabel som heter velocity
	   som r�knar ut hastigheten
	   
	 * double time = tim * acceleration = tiden(s) * accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Hastigheten = m/s
	  
	 */
	
	//Metod 24
	public static double force(double mass, double acceleration) {
		
		double force = mass * acceleration;
		return force;
		
	}
	
	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut kraften
	  med hj�lp av acceleration och massan p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter force
	   som r�knar ut kraften
	   
	 * double time = mass * acceleration = mass(kg) * accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Force = N
	  
	 */
	
	//Metod 25
	public static double massForce(double force, double acceleration) {
		
		double mass = force / acceleration;
		return mass;
		
	}
	
	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut massan
	  med hj�lp av acceleration och kraften p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter mass som r�knar ut massan
	   
	 * double time = force / acceleration = force(N) / accelerationen(m/s^2)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Massa = kg
	  
	 */
	
	//Metod 26
	public static double accelerationForce(double force, double mass) {
		
		double acceleration = force / mass;
		return acceleration;
		
	}

	/*
	* F�rst b�rjar jag med att skapa en metod som r�knar ut accelerationen
	  med hj�lp av massan och kraften p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter acceleration
	   som r�knar ut accelerationen
	   
	 * double acceleration = force / mass = force(N) / massan(kg)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	   
	 * Acceleration = m/s^2
	  
	 */

	//Metod 27
	public static double impuls(double force, double deltaTime) {
		
		double impuls = force * deltaTime;
		return impuls;
		
	}
	
	/*
	 
	 
	* F�rst b�rjar jag med att skapa en metod som r�knar ut impulsen
	  med hj�lp av f�r�ndringen i tiden och kraften p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter impuls
	   som r�knar ut impulsen
	   
	 * double impuls = force * deltaTime = kraften(N) * f�r�ndringen i tiden (s)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	  
	 */

	//Metod 28
	public static double forceImpuls(double impuls, double deltaTime) {
		
		double forceImpuls = impuls / deltaTime;
		return forceImpuls;
		
	}
	
	/*
	 
	 
	* F�rst b�rjar jag med att skapa en metod som r�knar ut kraften
	  med hj�lp av f�r�ndringen i tiden och impulsen p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter forceImpuls
	   som r�knar ut kraften
	   
	 * double force = impuls / deltaTime = impuls / f�r�ndringen i tiden (s)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	 
	 * Kraften = N
	  
	  
	 */

	//Metod 29
	public static double deltaTImpuls(double impuls, double force) {
		
		double deltaTImpuls = impuls / force;
		return deltaTImpuls;
		
	}
	
	/*
	 
	 
	* F�rst b�rjar jag med att skapa en metod som r�knar ut kraften
	  med hj�lp av f�r�ndringen i tiden och impulsen p� f�rem�let
	   
	 * Sedan skapade jag en variabel som heter forceImpuls
	   som r�knar ut kraften
	   
	 * double deltaTImpuls = impuls / force = impuls / kraften (N)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	 * Tiden = s
	  
	  
	 */
	
	//Metod 30
	public static double rorelseMangd(double mass, double velocity) {
		
		double rorelseMangd = mass * velocity;
		return rorelseMangd;
		
	}

	/*
	 
	 
	* F�rst b�rjar jag med att skapa en metod som r�knar ut r�relsem�ngden
	  med hj�lp av f�rem�lets massa och hastighet
	   
	 * Sedan skapade jag en variabel som heter rorelseMangd
	   som r�knar ut ett f�rem�ls r�relsem�ngd
	   
	 * double rorelseMangd = mass * velocity = massan(kg) / hastighet(m/s)
	   	  	   
	 * Till sist returnar jag variabeln som d� �r svaret
	  
	  
	 */

	
}
