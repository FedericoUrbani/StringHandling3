import java.sql.Array;

public class Tester {

    public static String [] removeFirstAndLastSpace(String [] array){
            String[] provisionalArray=new String[array.length];
        for (int i=0;i<array.length;i++){


            String result = array[i].trim();
            provisionalArray[i]=result;
        }
       return provisionalArray;
    }
    public static void main(String[] args) {

        String[] array1 = {" i want ", " to learn ", " how to code! "};
        String[] array2 = Tester.removeFirstAndLastSpace(array1);
        System.out.println(!(array2[0].compareTo("I want")>(array2[1].compareToIgnoreCase("to learn"))));


    }
}