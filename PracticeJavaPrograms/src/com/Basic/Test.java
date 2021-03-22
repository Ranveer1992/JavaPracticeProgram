package com.Basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	private static boolean checkAlphabeticRegax(String userName) {
		System.out.println("alsdfjadskljfldsakjfk");
		//LOG.debug("UserProfileDetailModify_Modify Inside checkAlphabeticRegax ::");
		//String regex = "^[a-zA-Z]+$";
		String regex = "[<>'\"&]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(userName);
		boolean lstatus = matcher.matches();
		System.out.println("aslkdkfjkdsaljfdas");
		//LOG.debug("UserProfileDetailModify_Modify Inside checkAlphabeticRegax lstatus ::" + lstatus);
		return lstatus;
	}
	
	private static boolean checkLetter(String userName){
		boolean lstatus = true;
		if(userName.lastIndexOf('<') != -1 || userName.lastIndexOf('>') != -1 || userName.lastIndexOf('"') != -1 || userName.lastIndexOf('&') != -1 || userName.lastIndexOf("'") != -1 ) {
			lstatus = false;
		}
        return lstatus;
    }
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		String userName ="laksdfjklasjf@";
		boolean lstatus =checkLetter(userName);
		System.out.println("lstatus --> " + lstatus);
	}

}
