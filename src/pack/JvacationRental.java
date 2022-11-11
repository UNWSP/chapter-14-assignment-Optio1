package pack;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JvacationRental {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JVacationrental");
		FlowLayout fl = new FlowLayout(0, 3, 40);    
		frame.getContentPane().setLayout(fl);
		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JRadioButton Parkside = new JRadioButton("Parkside", false); 
	    Parkside.setActionCommand("Park");
	    JRadioButton Poolside = new JRadioButton("Poolside", false);
	    Poolside.setActionCommand("Pool");
	    JRadioButton Lakeside = new JRadioButton("Lakeside", false);
	    Lakeside.setActionCommand("Lake");
	    ButtonGroup SideGroup = new ButtonGroup();
	    SideGroup.add(Poolside);
	    SideGroup.add(Parkside);
	    SideGroup.add(Lakeside);
	    frame.add(Parkside);
	    frame.add(Poolside);
	    frame.add(Lakeside);
	    
	    JRadioButton Bedroom1 = new JRadioButton("1 Bedroom", false); 
	    Bedroom1.setActionCommand("1");
	    JRadioButton Bedroom2 = new JRadioButton("2 Bedrooms", false);
	    Bedroom2.setActionCommand("2");
	    JRadioButton Bedroom3 = new JRadioButton("3 Bedrooms", false);
	    Bedroom3.setActionCommand("3");
	    ButtonGroup RoomGroup = new ButtonGroup();
	    RoomGroup.add(Bedroom1);
	    RoomGroup.add(Bedroom2);
	    RoomGroup.add(Bedroom3);
	    frame.add(Bedroom1);
	    frame.add(Bedroom2);
	    frame.add(Bedroom3);

	    JRadioButton Meal = new JRadioButton("Meal", false);
	    Meal.setActionCommand("Meal");
	    JRadioButton NoMeal = new JRadioButton("No Meal", false);
	    NoMeal.setActionCommand("No");
	    ButtonGroup MealGroup = new ButtonGroup();
	    MealGroup.add(Meal);
	    MealGroup.add(NoMeal);
	    frame.add(Meal);
	    frame.add(NoMeal);
	    
	    JButton submit = new JButton("Submit");
	    frame.add(submit);
	    frame.pack();
	    frame.setVisible(true);
	    submit.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 JFrame frame2 = new JFrame("JVacationrental");
	        	 int totalCost = 0;
	        	 switch (SideGroup.getSelection().getActionCommand()){
	        	 case "Park":
	        		  totalCost += 600;
	        		  break;
	        	 case "Pool":
	        		 totalCost += 750;
	        		 break;
	        	 case "Lake":
	        		 totalCost += 825;
	        		 break;
	        	 }
	        	 switch (RoomGroup.getSelection().getActionCommand()){
	        	 case "1":
	        		  totalCost += 75;
	        		  break;
	        	 case "2":
	        		 totalCost += (75 *2);
	        		 break;
	        	 case "3":
	        		 totalCost += (75 *3);
	        		 break;
	        	 }
	        	 switch (SideGroup.getSelection().getActionCommand()){
	        	 case "Meal":
	        		  totalCost += 200;
	        		  break;
	        	 case "NoMeal":
	        		 break;
	        	 }
	        	 JLabel cost = new JLabel("Your total cost is $" + totalCost);
	        	 frame2.setSize(300,300);
	        	 frame2.add(cost);
	        	 frame2.setVisible(true);
	         }
	    });
	         
	         
	    
	    
	    
	    
	}

}
