import java.util.Arrays;

import java.util.List;

import java.util.Scanner;

public class Driver

{   

public static void main(String[] args)

{   

Scanner in = new Scanner(System.in);

System.out.print("Equation: ");

String text = in.nextLine();

String dup = text;

dup = dup.replaceAll("[^-?0-9]+", " ");

List<String> list = Arrays.asList(dup.trim().split(" "));

if(text.indexOf('+') > 0)

System.out.println(text + " = " + (Integer.valueOf(list.get(0)) + Integer.valueOf(list.get(1))));

else if(text.indexOf('-') > 0)

System.out.println(text + " = " + (Integer.valueOf(list.get(0)) - Integer.valueOf(list.get(1))));

else if(text.indexOf('*') > 0)

System.out.println(text + " = " + (Integer.valueOf(list.get(0)) * Integer.valueOf(list.get(1))));

else if(text.indexOf('/') > 0)

System.out.println(text + " = " + (Float.valueOf(list.get(0)) / Float.valueOf(list.get(1))));

else if(text.indexOf('%') > 0){

if(Integer.valueOf(list.get(1)) == 0)

System.out.println("Error: division by zero");

else

System.out.println(text + " = " + (Integer.valueOf(list.get(0)) % Integer.valueOf(list.get(1))));

}

else if(text.indexOf('^') > 0)

System.out.println(text + " = " + (Math.pow(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)))));

else

System.out.println("Error: no such operator");

}

}