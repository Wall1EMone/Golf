package Inventory;

import Items.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory(){
        this.items = new ArrayList<>();

        items.add(new Callaway());
        items.add(new Cobra());
        items.add(new Mizuno());
        items.add(new Ping());
        items.add(new TaylorMade());
        items.add(new Titleist());
        items.add(new Wilson());

    }
    public void addItem(Item item){
        items.add(item);
    }
    //Visa alla golfset
    public void showAllItems(){
        if (items.isEmpty()){
            System.out.println("Inget set i lagret");
        }else{
            System.out.println("Golfset är tillgängligt");
            for (int i  = 0; i <items.size(); i++){
                System.out.println((i + 1) + ". " + items.get(i).getName() + " - " + items.get(i).getPrice() + " Kr");//Så det blir snyggare utskrift
            }
        }
    }


}
