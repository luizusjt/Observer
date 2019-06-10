package usjt_ccp3anmca_observer;

public class IndiceCalorDisplay extends Display{

	private static double ic = 0;
	private static double c1 = -42.379;
	private static double c2 = 2.04901523;
	private static double c3 = 10.14333127;
	private static double c4 = -0.22475541;
	private static double c5 = -6.83783*(10^-3);
	private static double c6 = -5.481717*(10^-2);
	private static double c7 = 1.22874*(10^-3);
	private static double c8 = 8.5282*(10^-4);
	private static double c9 = -1.99*(10^-6);
	
	@Override
	public void display() {
		
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		
		ic = (5/9) 
			* (c1 
				+ c2 * temperature
				+ c3 * humidity
				+ c4 * (temperature*humidity) 
				+ c5 * (temperature*temperature) 
				+ c6 * (humidity*humidity)
				+ c7 * (temperature*temperature*humidity) 
				+ c8 * (temperature*humidity*humidity) 
				+ c9 * (temperature*temperature*humidity*humidity) - 32);
		
		System.out.println("\n----- INDICE DE CALOR -----");
		System.out.println("Temp:"+temperature+" humidade: "+humidity+" pressure: "+pressure);
		System.out.printf("IC: %.10f \n------------------------------\n", ic);
	}
}
