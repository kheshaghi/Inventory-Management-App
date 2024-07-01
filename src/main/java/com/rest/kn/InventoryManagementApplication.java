package com.rest.kn;

import java.util.Arrays;

import javax.swing.SwingUtilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.rest.kn.ui.Login;

@SpringBootApplication
public class InventoryManagementApplication implements CommandLineRunner{

	@Autowired
	Login login;
	
	public static void main(String[] args) {
//		SpringApplication.run(InventoryManagementApplication.class, args);
		ApplicationContext contexto = new SpringApplicationBuilder(InventoryManagementApplication.class)
                .web(WebApplicationType.NONE)
                .headless(false)
                .bannerMode(Mode.OFF)
                .run(args);
	}
	
	 @Override
	    public void run(String... args) throws Exception {
		 System.out.println(Arrays.toString(args));
	        SwingUtilities.invokeLater(() -> {
	        	login.setVisible(true);
	        });
	    }
	 
}
