package in.asimit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.asimit.beans.Car;

public class App {
	public static void main(String[] args) {
		
		//starting IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car car = context.getBean(Car.class);
		car.drive();
		
		
	}

}
