package com.nighthawk.spring_portfolio.mvc.calendar;

/** Simple POJO 
 * Used to Interface with APCalendar
 * The toString method(s) prepares object for JSON serialization
 * Note... this is NOT an entity, just an abstraction
 */
class Year {
   private int year;
   private boolean isLeapYear;
   private int firstDayOfYear;
   private int numberOfLeapYears;
   private int dayOfWeek; 
   private int dayOfYear; 
   private int month; 
   private int day; 
   private int year1;
   private int year2; 
   private int years;


   // zero argument constructor
   public Year() {} 

   /* year getter/setters */
   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
      this.setIsLeapYear(year);
      this.setfirstDayOfYear(year);
      this.setnumberOfLeapYears(year1, year2);

   }

   /* isLeapYear getter/setters */
   public boolean getIsLeapYear(int year) {
      return APCalendar.isLeapYear(year);
   }

   private void setIsLeapYear(int year) {  // this is private to avoid tampering
      this.isLeapYear = APCalendar.isLeapYear(year);
   }

   /* isLeapYearToString formatted to be mapped to JSON */
   public String isLeapYearToString(){
      return ( "{ \"year\": "  +this.year+  ", " + "\"isLeapYear\": "  +this.isLeapYear+ " }" );
   }	
   
    /* standard toString placeholder until class is extended */
   public String toString() { 
     return isLeapYearToString(); 
   }
   

   public int getfirstDayOfYear(int year) {
      return APCalendar.firstDayOfYear(year);
   }

   private void setfirstDayOfYear(int year) {  // this is private to avoid tampering
      this.firstDayOfYear = APCalendar.firstDayOfYear(year);
   }

   /* firstDayOfYearToString formatted to be mapped to JSON */
   public String firstDayOfYearToString(){
      return ( "{ \"year\": "  + this.year +  ", " + "\"firstDayOfYear\": "  +this.firstDayOfYear+ " }" );
   }	

   public int getdayOfYear(int month, int day, int year) {
      return APCalendar.dayOfYear(month, day, year);
   }

   public void setdayOfYear(int month, int day, int year) {  // this is private to avoid tampering
      this.dayOfYear = APCalendar.dayOfYear(month , day , year);
   }

   /* firstDayOfYearToString formatted to be mapped to JSON */
   public String dayOfYearToString(){
      return (  "{ \"dayOfYear\": "  + this.dayOfYear + " }");
   }	

   public int getnumberOfLeapYears(int year1, int year2) {
      return APCalendar.numberOfLeapYears(year1, year2);
   }

   public void setnumberOfLeapYears(int year1, int year2) {  // this is private to avoid tampering
      this.numberOfLeapYears = APCalendar.numberOfLeapYears(year1, year2);
   }

   /* firstDayOfYearToString formatted to be mapped to JSON */
   public String numberOfLeapYearsToString(){
      return ( "{ \"numberOfLeapYears\": "  + this.numberOfLeapYears + " }"  );
   }	

   public int getdayOfWeek(int month, int day, int year) {
      return APCalendar.dayOfWeek(month, day, year);
   }

   public void setdayOfWeek(int month, int day, int year) {  // this is private to avoid tampering
      this.dayOfWeek = APCalendar.dayOfWeek(month, day, year);
   }

   /* firstDayOfYearToString formatted to be mapped to JSON */
   public String dayOfWeekToString(){
      return ( "{ \"dayOfWeek\": "  + this.dayOfWeek + " }"  );
   }	


   public static void main(String[] args) {
      Year year = new Year();
      year.setYear(2022);
      System.out.println(year);
   }
}