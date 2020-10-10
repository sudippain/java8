package com.feature.StreamApi;

interface O{
	void msg(int a);
	
}

/*
 * class lamda1impl implements O{
 * 
 * @Override public void msg() {
 * System.out.println("From msg method of interface of O");
 * 
 * }
 * 
 * }
 */
public class lamda1 {
	
	public static void main(String[] args) {
		O obj;
		O obj2;
		/*
		 * obj = new O() //Anonymous Class //
		 *  {
		 *   public void msg()
		 *    {
		 * System.out.println("From msg method of interface of O"); 
		 * }
		 *  };
		 */
		
		obj =(i) ->System.out.println("From msg method of interface of O ---> "+i);
		
	
		
		obj.msg(6);
		
		
		
	}

}
