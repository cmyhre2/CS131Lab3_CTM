/**
 * This class 
 * 
 * @author Rob Kelley(v1.0) & Chris Myhre(v1.1)
 * @version 1.1 (CS-131 Module 3 Lab)
 * Spring 2023 (03/23/2023)
 */
public class ArrayList<T> {

	private final int DEFAULT_SIZE=5;
   	private int currentItem=0;
   	private T arList[];
	
   	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
		
   		
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

   	
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  
  /**
   * addItem() method uses the variable currentItem to check index currentItem of the array 
   * this method is used on for blank/null elements. If the item is added, the method breaks/
   * terminates and returns true. Otherwise iterates through the whole array with a while loop
   * and returns false if the item couldn't be added. This method returns canAdd, a temp variable
   * to track if the item was added or not. Stays false unless the item can be added.
   * @param item
   * @return canAdd
   */
  	public boolean addItem(T item) {
  		boolean canAdd = false;
  		while(currentItem < arList.length) {
  			if(arList[currentItem]==null) {
  				arList[currentItem]=item;
  				canAdd = true;
  				break;
  			}else {
  	  			currentItem++;
  			}//end if statement
  		}//end while loop
  		return canAdd;
  	}//end addItem()
  	
  	/**
  	 * toString() method puts all ArrayList elements' (by iterating through array) object's instance variables in one StringBuilder
  	 * then returns the StringBuilder sb converted into a string
  	 * @return sb.toString()
  	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("================================================================================");
		for(int i = 0; i < arList.length; i++) {
			if(arList[i]!=null)
			sb.append("\n[Index " + i + "] " + arList[i].toString());
			else
				sb.append("\n[Index " + i + "] " + "null");
		}
		return sb.toString();
	}//end toString()
}//end class
