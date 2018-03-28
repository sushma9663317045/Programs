package Bpgms_patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public static void main(String[] args) {
	
	
		Pattern p = Pattern.compile("^[a-z0-9]{6,14}$");
		Matcher mtch = p.matcher("java2novice");
        if(mtch.matches()){
           System.out.println(true);
        }
      
	
	
	
	}}
