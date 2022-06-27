package com.belajar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelajarJavadocApplication {
	/**
	 * <p> This is a simple description of the method. . .
	 * <a href ="http://www.supermanisthegreatest.com">superman!</a>
	 * </p>
	 * @param incomingDamage the ammount of incoming damage
	 * @return the amount of health hero has after attack
	 * @see <a href="http://www.link_to_jira/HERO-402">HERO-402></a>
	 * @since 1.0
	 */
	public int successfullyAttacked(int incomingDamage){
		return 0;
	}
	public static void main(String[] args) {
		SpringApplication.run(BelajarJavadocApplication.class, args);
	}

}
