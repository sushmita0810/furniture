package hackerrank;

import java.util.HashMap;
import hackerrank.Furniture;
import hackerrank.FurnitureOrderInterface;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
      HashMap<Furniture,Integer> hm = new HashMap<>();
	FurnitureOrder() {
        // TODO: Complete the constructorg
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
    	if(hm.containsKey(type))hm.put(type, hm.get(type)+furnitureCount);
    	else hm.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
//    	HashMap<Furniture, Integer> hm2 = hm;
        return hm;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
    	float sum = 0 ;
    	for(Furniture i : hm.keySet())
    	{
    		if(i==Furniture.CHAIR)sum+=hm.get(Furniture.CHAIR)*100.0f;
    		else if(i==Furniture.TABLE)sum+=hm.get(Furniture.TABLE)*250.0f;
    		else if(i==Furniture.COUCH)sum+=hm.get(Furniture.COUCH)*500.0f;

    	}
        return sum;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
	    if(!hm.containsKey(type))return 0;
        return hm.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int count  = 0 ;
    	for(Furniture i : hm.keySet())
    	{
    		if(i==Furniture.CHAIR)count+=hm.get(Furniture.CHAIR);
    		else if(i==Furniture.TABLE)count+=hm.get(Furniture.TABLE);
    		else if(i==Furniture.COUCH)count+=hm.get(Furniture.COUCH);

    	}
        return count;
    }
}
