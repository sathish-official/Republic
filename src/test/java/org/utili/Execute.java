package org.utili;

public class Execute extends BaseClass{
public static void main(String[] args) {
	
	launchChrome();
	getUrl("https://www.facebook.com/");
	fullScreen();
	
	LoginPojo l=new LoginPojo();
	fill(l.getUser(), "Sathish");

fill(l.getPass(),"Kumar");

btnlogin(l.getLogin());











}
}
