package codeguide;
/**
 * Print details of date.
 * @author Noppawan Kulchol
 *
 */

public class Date {
	
	/**
	 * 
	 * //TODO add modifier that cannot make all attributes are public.
	 */
	/*the number of year*/
	String year;
	
	/*the number of month*/
	String month;
	
	/*the number of day*/
	String day;
	
	/**
	 * First constructor of this class.
	 *  //TODO Initialize all attributes that same as variables in param.
	 */
	public Date(String year, String month, String day){
		
		
	}
	
	/**
	 * Second constructor of this class.
	 *   //TODO Initialize all attributes that same as variables in param..
	 */
	public Date(String month, String day){
		
	}
	
	/**
	 * details of date (year/month/day).
	 * @return detail.of date
	 */
	public String fullDate (){
		return "Year:"+year+" Month:"+month+" Day:"+day;
	}

	/**
	 * details of date (month/day).
	 * @return details of date
	 */
	public String shortDate (){
		return  "Month:"+month+" Day:"+day;
	}
	
	public static void main(String[] args) {
		Date date = new Date("3","4");
		String printDate = date.shortDate();
		System.out.println(printDate);
		String printFullDate = date.fullDate();
		System.out.println(printFullDate);
		
		
		
	}
}
