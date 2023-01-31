package org.bace;

import javax.activation.DataSource;

import org.openqa.selenium.WebElement;

public class Employee {
	public static void main(String[] args) throws Exception {
		Employee employee = new Employee();
		   
		employee.booking();
	}

	public void booking() throws Exception {

		BaseClassProg baseClass = new BaseClassProg();
		Excel data = new Excel();
	     baseClass.getDriver();
		baseClass.enterAppUrl("http://adactinhotelapp.com/");
		baseClass.maximizeWindow();
		 
		WebElement textUserName = baseClass.findElementId("username");
		String name = data.getDatafromCell("Adactin", 1 , 0);
        baseClass.elementSentKeys(textUserName, name);		 
		WebElement textpass = baseClass.findElementId("password");
		String pass = data.getDatafromCell("Adactin", 1, 1);
		baseClass.elementSentKeys(textpass, pass);
		 
		WebElement btnlogin = baseClass.findElementId("login");
        baseClass.elementClick(btnlogin);	
          // Search Hotel
        WebElement location = baseClass.findElementId("location");
        baseClass.selectOptionByText(location, "Sydney");
        
        WebElement hotel = baseClass.findElementId("hotels");
        baseClass.selectOptionByText(hotel, "Hotel Creek");
         
        WebElement roomtype = baseClass.findElementId("room_type");
        baseClass.selectOptionByText(roomtype, "Deluxe");
        
        WebElement noRoom = baseClass.findElementId("room_nos");
        baseClass.selectOptionByText(noRoom, "2 - Two");
        
        Thread.sleep(1000); 
        WebElement inDate = baseClass.findElementId("datepick_in");
        String txtdate = data.getDatafromCell("Adactin",1,6);
        baseClass.elementSentKeys(inDate, txtdate);
        
        Thread.sleep(1000);
        WebElement outdate = baseClass.findElementId("datepick_out");
        String txtdate1 = data.getDatafromCell("Adactin",1,7);
        baseClass.elementSentKeys(outdate, txtdate1);
        
        WebElement roomAdult = baseClass.findElementId("adult_room");
        baseClass.selectOptionByText(roomAdult, "2 - Two");
        
        WebElement noChild = baseClass.findElementId("child_room");
        baseClass.selectOptionByText(noChild, "0 - None");
        
        WebElement submit = baseClass.findElementId("Submit");
        baseClass.elementClick(submit);
        
        WebElement btnradio = baseClass.findElementId("radiobutton_0");
        baseClass.elementClick(btnradio);
        
        WebElement btncon = baseClass.findElementId("continue");
        baseClass.elementClick(btncon);
        
        WebElement fistName = baseClass.findElementId("first_name");
        String txtName = data.getDatafromCell("Adactin", 1, 10);
        baseClass.elementSentKeys(fistName, txtName);
        
        WebElement lastname = baseClass.findElementId("last_name");
        String txtlast = data.getDatafromCell("Adactin", 1, 11);
        baseClass.elementSentKeys(lastname, txtlast);
        
        WebElement adress = baseClass.findElementId("address");
        String txtAdd = data.getDatafromCell("Adactin", 1, 12);
        baseClass.elementSentKeys(adress, txtAdd);
        
        WebElement ccnum = baseClass.findElementId("cc_num");
        String txtccnum = data.getDatafromCell("Adactin", 1, 13);
        baseClass.elementSentKeys(ccnum, txtccnum);
        
        WebElement cctype = baseClass.findElementId("cc_type");
        baseClass.elementSentKeys(cctype, "VISA");
        
        WebElement expmonth = baseClass.findElementId("cc_exp_month");
        baseClass.elementSentKeys(expmonth, "January");
        
        WebElement expyear = baseClass.findElementId("cc_exp_year");
        baseClass.elementSentKeys(expyear, "2020");
        
        WebElement cccvv = baseClass.findElementId("cc_cvv");
        String txtcccvv = data.getDatafromCell("Adactin", 1, 15);
        baseClass.elementSentKeys(cccvv, txtcccvv);
        
        WebElement clickbtn = baseClass.findElementId("book_now");
        baseClass.elementClick(clickbtn);
     
        Thread.sleep(1000);
        WebElement orderon = baseClass.findElementId("order_no");
        String txtorder = data.getDatafromCell("Adactin", 1, 16);
        baseClass.elementSentKeys(orderon, txtorder);
        
        
	}
       
}
