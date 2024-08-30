import java.util.*;
class BlinkIt{
	static String items[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	//creat operation
	public static boolean addItem(String item){
	boolean isItemAdded = false;
	if(item != null && index<items.length){
		items[index]= item;
		index++;
		isItemAdded=true;
	}
	
	return isItemAdded;
	}
	
	//read operation
	public static void getItems(){
		for(int i=0;i<items.length;i++)
			System.out.print("\n"+items[i]);
		
	}
	
	 //update operation
	 public static boolean updateitem(String olditem,String newitem){
		boolean isitemUpdated = false;
		for(int i=0;i<items.length;i++){
			if(olditem == items[i]){
					items[i]	=	newitem;
					System.out.println(olditem+"has been replaced with"+newitem);
					isitemUpdated = true;
			}
		} if(isitemUpdated == false ) 
			System.out.println("nin athra ee iteme irle ila");
	return isitemUpdated;	 
	 }
	 
	 //delete operation
	 public static boolean deleteitem(String itemToBeDeleted){
		 System.out.println("delete started");
		 boolean isitemDeleted = false;
		 int oldIndex,newIndex;
		 for(oldIndex = 0,newIndex =0 ;oldIndex < items.length;oldIndex++){
			 if(items[oldIndex]!=itemToBeDeleted){
				 items[newIndex]=items[oldIndex];
				 newIndex++;
			 }
		 }
		 items = Arrays.copyOf(items,newIndex); if(items!=null){
			 isitemDeleted = true;
			  System.out.println("deleted"+itemToBeDeleted);
		 }
		 if(isitemDeleted==false)
		{
			System.out.println(itemToBeDeleted+"not found");
		}
		 
		return isitemDeleted;
		
	 }

}