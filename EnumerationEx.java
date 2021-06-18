public class EnumerationEx{
   enum Days{
       SUNDAY,
       MONDAY,
       TUESDAY,
       WEDNESDAY,
       THURSDAY,
       FRIDAY,
       SATURDAY
   } 
   public static void main(String args[]){
    System.out.println("Days of the week using Enumeration:");
    System.out.println("Index of direction SOUTH is "+Days.valueOf("MONDAY").ordinal());
    for(Days d:Days.values()){
        System.out.println(d);
    }
}
}