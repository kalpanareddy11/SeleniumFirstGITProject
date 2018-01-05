package oopsconcepts;

import org.openqa.selenium.WebDriver;

public class car {
	
	int wheel;
	int Model;
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub

    	 car a= new car();
    	 car b= new car();
    	 car c= new car();
    	 
    	 a.wheel=4;
    	 a.Model=2015;
    	 
    	 b.wheel=4;
    	 b.Model=2016;
    	 
    	 c.wheel=4;
    	 c.Model=2017;
    	 
    	 System.out.println(a.Model);
    	 WebDriver Driver =new FirefoxDriver();
    	 
    			 
    			 
    	 
	}

}
