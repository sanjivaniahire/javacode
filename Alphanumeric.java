public class Main {
    public static void main(String[] args) {
        String str="4PREP2INSTAA6";

        int sum=0;
        for(int i=0;i<str.length();i++){            
          if(str.charAt(i)>='0' &&  str.charAt(i)<='9'){
                sum+=(str.charAt(i)-'0');
            }
        }
        System.out.println("Sum of all digits  " +sum );
    }
}