class BlinkItRunner{

public static void main(String []ite){
	boolean isAdded = BlinkIt.addItem("Lays");
	System.out.println("item  added: " + isAdded);
	
	isAdded = BlinkIt.addItem("pepsi");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("mazza");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("kurkure");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("cococola");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("curd");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("rasmalai");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("bananna");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("apple");
	System.out.println("item  added: " + isAdded);
	
	 isAdded = BlinkIt.addItem("Dragon Fruit");
	System.out.println("item  added: " + isAdded);
	
	BlinkIt.getItems();
	
	boolean isUpdated = BlinkIt.updateitem("apple","Orange");
	BlinkIt.getItems();
	
	boolean isDeleted = BlinkIt.deleteitem("Dragon Fruit");
	BlinkIt.getItems();
	
	
	





}



}