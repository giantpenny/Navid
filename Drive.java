package DriveData;

import java.util.Random;


public class Drive {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen = new Random();
		//Simulation loop, i equals number of drivers 
		for (int i = 0; i < 5000; i++)
		{
		 int spd = gen.nextInt(4)+0;
         int avgspd = gen.nextInt(4)+0;
         int[] speedlimit = { 30, 40, 60, 70 };
         double spdscn = speedlimit[spd];
		 double [] dvrspd=  { spdscn * 0.9, spdscn * 1.0, spdscn * 1.1, spdscn * 1.2, spdscn * 1.3};
		
		 // Printing Driving Scenario Data
		 System.out.println("Driver Number: " + i);
	  	 System.out.println("Simulation scenario: " + spd);	
	  	 System.out.println("Driving Speed Ratio: " + avgspd);
		 System.out.println("Road Speed Limit: " + speedlimit[spd]); 
		 System.out.println("Average Driver Speed: " + dvrspd[avgspd]);
		 System.out.println("=============================================");
		 
		 avgspd = avgspd+avgspd;
		 
		}
	
		
	}
} 
	


		/**
		 String[] driver = {"jim", "jerry", "oakley", "pherra"};
		 
		 int environment = 0;
		 int exp =  5;
		 int perf = 4;
		 int traffic = 0;
		 	 
		 for (int x = 0; x <= 25; x++) {
		 }
			
			 	 
			 
			 //Analyze Simulation Data
			 int skill = (exp * perf);
			 double urgency = (avgspeed[2]/traffic);
			 double speedratio = (avgspeed[2]/speedlimit[2]);
			 double aggression = (speedratio/urgency);
		 
			 //Calculate driver risk assessment
			 double risk = (skill * (urgency*aggression)/(traffic*environment));
			 if (risk < 25){
				 System.out.println("Alert! Risk of collision!");
				 System.out.println("Driver #: " + driver[2]);
				 System.out.println("Risk =  " + risk);
				 System.out.println(speedlimit[2]);
			 } 

	
	
	}
	
	*/

