package com.mphasis;
public class App {
	
    public static void main(String[] args) {
    	
    	//Singleton design pattern
//        DBConnection conn1=DBConnection.getInstance();
//        System.out.println(conn1.hashCode());
//        DBConnection conn2=DBConnection.getInstance();
//        System.out.println(conn2.hashCode());
//        DBConnection conn3=DBConnection.getInstance();
//        System.out.println(conn3.hashCode());
    	
    	
    	//Factory pattern
//    	Shape s=ShapesFactory.getShape("square");
//    	s.draw();
//    	
//
//    	Shape s1=ShapesFactory.getShape("circle");
//    	s1.draw();
    	
    	
    	//abstract factory pattern
    	
//    	GUIFactory gui=new WinFactory();
//    	Button button=gui.createButton();
//    	CheckBox checkBox=gui.createCheckBox();
//    	button.click();
//    	checkBox.check();
    	
    	
    	//Builder pattern
//    	Pizza pizza=new Pizza.Builder("medium")
//    			.cheese(true)
//    			.olives(false)
//    			.build();
//    	
//    	System.out.println(pizza);
    	
    	//template method design pattern
    	
//    	DrinkMaker tea=new TeaMaker();
//    	tea.prepareDrink();
//    	
//    	DrinkMaker coffee=new CoffeeMaker();
//    	coffee.prepareDrink();
    	
    	
    	
    	//structural pattern
    	//bridge pattern
    	
//    	Video youtubeHD =new Youtube(new HDProceesing());
//    	youtubeHD.playVideo();
//    	
//    	Video prime4K =new PrimeChannel(new FourKProceesing());
//    	prime4K.playVideo();
    	
    	
    	//proxy pattern
    	
    	Payment netBanking=new NetBanking();
    	netBanking.pay(5000);
    	System.out.println("***************************************");
    	Payment upi=new UPIPayament();
    	upi.pay(80000);
    	
    	
    	//Assignments
    	//1.logger
//    	Logger logger1= Logger.getInstance();
//    	Logger logger2= Logger.getInstance();
//    	logger1.log("logger1 is created");
//    	logger2.log("logger2 is created");
//    	System.out.println(logger1==logger2);
    	
    	//2.ConfigurationManager
    	
//    	ConfigurationManager c1 = ConfigurationManager.getInstance();
//        System.out.println(c1.getSetting("appName"));
//
//        ConfigurationManager c2 = ConfigurationManager.getInstance();
//        System.out.println(c2.getSetting("version"));
//
//        System.out.println( c1 == c2);
    }
}
