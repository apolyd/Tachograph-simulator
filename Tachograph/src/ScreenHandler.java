import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScreenHandler {
	
	int CurrentScreen = 0;
	int LastCountry = 0;
	int LastActivity = 0;
	Vector<String> countriesList = new Vector<String>();
	Vector<String> activitiesList = new Vector<String>();

	public int getCurrentScreen() {
		return CurrentScreen;
	}

	public void setCurrentScreen(int currentScreen) {
		CurrentScreen = currentScreen;
	}

	public ScreenHandler() {
		this.CurrentScreen = 0;
		this.LastCountry = 0;
		this.LastActivity = 0;
		//country list
		this.countriesList.add("Albania");
		this.countriesList.add("Andorra");
		this.countriesList.add("Armenia");
		this.countriesList.add("Austria");
		this.countriesList.add("Azerbaijan");
		this.countriesList.add("Belarus");
		this.countriesList.add("Belgium");
		this.countriesList.add("Bosnia&Herzego.");
		this.countriesList.add("Bulgaria");
		this.countriesList.add("Croatia");
		this.countriesList.add("Cyprus");
		this.countriesList.add("Czech Republic");
		this.countriesList.add("Denmark");
		this.countriesList.add("Estonia");
		this.countriesList.add("European Comm.");
		this.countriesList.add("Faeroe Islands");
		this.countriesList.add("Finland");
		this.countriesList.add("France");
		this.countriesList.add("Georgia");
		this.countriesList.add("Germany");
		this.countriesList.add("Greece");
		this.countriesList.add("Hungary");
		this.countriesList.add("Iceland");
		this.countriesList.add("Ireland");
		this.countriesList.add("Italy");
		this.countriesList.add("Kazakhstan");
		this.countriesList.add("Latvia");
		this.countriesList.add("Lichtenstein");
		this.countriesList.add("Lithuania");
		this.countriesList.add("Luxenbourg");
		this.countriesList.add("Macedonia");
		this.countriesList.add("Malta");
		this.countriesList.add("Monaco");
		this.countriesList.add("Netherlands");
		this.countriesList.add("Norway");
		this.countriesList.add("Poland");
		this.countriesList.add("Portugal");
		this.countriesList.add("Rep. of Moldova");
		this.countriesList.add("Romania");
		this.countriesList.add("Russian Feder.");
		this.countriesList.add("San Marino");
		this.countriesList.add("Slovakia");
		this.countriesList.add("Slovenia");
		this.countriesList.add("Spain");
		this.countriesList.add("Sweden");
		this.countriesList.add("Switzerland");
		this.countriesList.add("Turkey");
		this.countriesList.add("Turkmenistan");
		this.countriesList.add("Ukraine");
		this.countriesList.add("United Kingdom");
		this.countriesList.add("Vatican City");
		this.countriesList.add("Yugoslavia");
		this.countriesList.add("Rest of Europe");
		this.countriesList.add("Rest of World");
		//activities list
		this.activitiesList.add("endshift");
		this.activitiesList.add("chair");
		this.activitiesList.add("questionmark");
		this.activitiesList.add("zero");
		this.activitiesList.add("dualaxes");
		this.activitiesList.add("beginshift");
		
		
	}

	public void setup(JFrame frame, String Button) {
		 
		switch (this.CurrentScreen) {
         case 0://rest until now question
        	 switch (Button) {
             case "Up":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
            	 
             case "Down":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
             case "Ok":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 this.CurrentScreen = 1;
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText("Entries Printout?");
            		 break;
            	 }
            	 else {
            		 this.CurrentScreen = 2;
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText("Add manual Entries?");
            		 break;
            	 }
            	 
        	 }
        	 break;
         case 1://entries printout question
        	 switch (Button) {
        	 case "Up":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
            	 
             case "Down":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
             case "Back":
            	 ((JLabel)frame.getContentPane().getComponent(0)).setText("Rest until now?");
            	 this.CurrentScreen = 0;
            	 break;
             case "Ok":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 this.CurrentScreen = 3;
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText("Confirm Entries?");
            		 break;
            	 }
            	 else {
            		 this.CurrentScreen = 3;
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText("Confirm Entries?");
            		 break;
            	 }
            	 
        	 }
        	 break;
         case 2://Add manual entries
        	 switch (Button) {
        	 case "Up":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
            	 
             case "Down":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
             case "Back":
            	 ((JLabel)frame.getContentPane().getComponent(0)).setText("Rest until now?");
            	 this.CurrentScreen = 0;
            	 break;
             case "Ok":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 this.CurrentScreen = 5;
            		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd");  
          		     LocalDateTime now = LocalDateTime.now();
          		     DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");  
        		     LocalDateTime now2 = LocalDateTime.now();  
          		 //    System.out.println(dtf.format(now));
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText(dtf.format(now));
            		 ((JLabel)frame.getContentPane().getComponent(2)).setFont(new Font("Tahoma", Font.PLAIN, 25));
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(dtf2.format(now2));
            		 ((JLabel)frame.getContentPane().getComponent(0)).setBounds(200, 100, 312, 39);
            		 ((JLabel)frame.getContentPane().getComponent(2)).setBounds(200, 150, 312, 29);
            		 ((JLabel)frame.getContentPane().getComponent(12)).setIcon(new ImageIcon("endshift.png"));
            		 ((JLabel)frame.getContentPane().getComponent(13)).setText("End");
            		 ((JLabel)frame.getContentPane().getComponent(14)).setText("Shift");
            		 ((JLabel)frame.getContentPane().getComponent(12)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(1)).setVisible(false);
            		 
            		 break;
            	 }
            	 else {
            		 this.CurrentScreen = 4;
            		 ((JLabel)frame.getContentPane().getComponent(0)).setText("Begin Country");
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(countriesList.get(LastCountry));
            		 ((JLabel)frame.getContentPane().getComponent(1)).setVisible(false);
            		 break;
            	 }
        	 }
        	 break;
         case 3://Confirm entries question
        	 switch (Button) {
        	 case "Up":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
            	 
             case "Down":
            	 if(((JLabel)frame.getContentPane().getComponent(1)).getText().equalsIgnoreCase("yes")) {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText(" NO");
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(1)).setText("YES");
            	 }
            	 break;
             case "Back":
            	 ((JLabel)frame.getContentPane().getComponent(0)).setText("Entries Printout?");
            	 this.CurrentScreen = 1;
            	 break;
        	 }
        	 break;
         case 4://begin country question
        	 switch (Button) {
        	 case "Up":
            	 this.LastCountry++;
            	 if(this.LastCountry<this.countriesList.size()) {
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(countriesList.get(LastCountry));
            	 }
            	 else {
            		 this.LastCountry = 0;
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(countriesList.get(LastCountry));
            	 }
            	 break;
            	 
             case "Down":
            	 this.LastCountry--;
            	 if(this.LastCountry<0) {
            		 this.LastCountry = this.countriesList.size() - 1;
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(countriesList.get(LastCountry));
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(2)).setText(countriesList.get(LastCountry));
            	 }
            	 break;
             case "Back":
            	//fill out later
            	 break;
        	 }
        	 break;
         case 5://add manual entries stuff
        	 switch (Button) {
        	 case "Up":
        		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(false);
        		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(false);
            	 this.LastActivity++;
            	 if(this.LastActivity<this.activitiesList.size()) {
            		 ((JLabel)frame.getContentPane().getComponent(12)).setIcon(new ImageIcon(this.activitiesList.get(this.LastActivity)+".png"));
            		 
            	 }
            	 else {
            		 this.LastActivity = 0;
            		 ((JLabel)frame.getContentPane().getComponent(12)).setIcon(new ImageIcon(this.activitiesList.get(this.LastActivity)+".png"));
            	 }
            	 
            	 if(this.activitiesList.get(LastActivity).equals("beginshift")) {
            		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(true);
        			 ((JLabel)frame.getContentPane().getComponent(13)).setText("Begin");
            		 ((JLabel)frame.getContentPane().getComponent(14)).setText("Shift");
        		 }
            	 else if(this.activitiesList.get(LastActivity).equals("endshift")) {
            		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(13)).setText("End");
            		 ((JLabel)frame.getContentPane().getComponent(14)).setText("Shift");
            	 }
            	 break;
            	 
             case "Down":
            	 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(false);
        		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(false);
            	 this.LastActivity--;
            	 if(this.LastActivity<0) {
            		 this.LastActivity = this.activitiesList.size() - 1;
            		 ((JLabel)frame.getContentPane().getComponent(12)).setIcon(new ImageIcon(this.activitiesList.get(this.LastActivity)+".png"));
            	 }
            	 else {
            		 ((JLabel)frame.getContentPane().getComponent(12)).setIcon(new ImageIcon(this.activitiesList.get(this.LastActivity)+".png"));
            	 }
            	 
            	 if(this.activitiesList.get(LastActivity).equals("beginshift")) {
            		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(true);
        			 ((JLabel)frame.getContentPane().getComponent(13)).setText("Begin");
            		 ((JLabel)frame.getContentPane().getComponent(14)).setText("Shift");
        		 }
            	 else if(this.activitiesList.get(LastActivity).equals("endshift")) {
            		 ((JLabel)frame.getContentPane().getComponent(13)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(14)).setVisible(true);
            		 ((JLabel)frame.getContentPane().getComponent(13)).setText("End");
            		 ((JLabel)frame.getContentPane().getComponent(14)).setText("Shift");
            	 }
            	 break;
             case "Back":
            	//fill out later
            	 break;
        	 }
        	 break;
        	 
        	 
	}
}
}