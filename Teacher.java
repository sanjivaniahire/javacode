package lab_user_data_delete;


import java.util.LinkedHashMap;
import java.util.Map;


public class Teacher{

public static void main(String[] args) {
Map<Teacher,String> map= new LinkedHashMap<Teacher, String> ();

map.put(new Teacher("Riya Sharma","History"), "history faculty");
map.put(new Teacher("Samiya Kapoor","English"), "english faculty");
map.put(new Teacher("Trisha Malhotra","Psychology"), "psychology faculty");
map.put(new Teacher("Sanjivani Ahire","Java"), "java faculty");

java.util.Scanner sc = new java.util.Scanner(System.in);

System.out.println("Enter the Teacher Name: ");
String tn= sc.nextLine();


System.out.println("Enter the Subject: ");
String sub= sc.nextLine();


System.out.println(map.remove(new Teacher(tn,sub)));

System.out.println(map);
}
}






