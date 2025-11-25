package com.mphasis;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
	
	public static ConfigurationManager instance;
	 private Map<String, String> settings = new HashMap<>();
	private ConfigurationManager() {
		settings.put("appName", "MyApp");
        settings.put("version", "1.0");
        System.out.println("Settings loaded once!");
	}
        
        public static ConfigurationManager getInstance() {
            if (instance == null) { 
                instance = new ConfigurationManager();
            }
            return instance;
        }
        
        public String getSetting(String key) {
            return settings.get(key);
        }
	
}
