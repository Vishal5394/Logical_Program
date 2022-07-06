package logical;

public class Stop_Watch {
	public static long start =0;
	public static   long stop =0;
	public static  long elapseTime =0;
	
	public static void main(String[] args) {
		start =System.currentTimeMillis();
		System.out.println("Start Time is: "+start);
		
		stop =System.currentTimeMillis();
		System.out.println("Stop Time is: "+stop);
		
		elapseTime = stop - start ;
		
		System.out.println("elapstime is : " + elapseTime+ " Sec");

}}
