String:
 
1. String is immutable, Immutable means if you create string object then you cannot modify it and It always create new object of string type in memory.
2.Example:

public class StringExample{    
public static void main(String args[]){    
String s1="java";   
char ch[]={'s','t','r','i','n','g','s'};    
String s2=new String(ch);    
String s3=new String("example");    
System.out.println(s1);    
System.out.println(s2);    
System.out.println(s3);    
}}    

Output:java
strings
example
 

String Builder:

1.StringBuilder is mutable, means if create string builder object then you can perform any operation like insert, replace or append without creating new instance for every time.it will update string at one place in memory doesnt create new space in memory.
2. Example:

public class Test{  
    public static void main(String[] args){  
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);  
    }  
}  

Output:hellojava