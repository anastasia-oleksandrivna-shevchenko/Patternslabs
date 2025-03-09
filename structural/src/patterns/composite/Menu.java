package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
   private List<MenuComponent> menuComponents  = new ArrayList<>();

   public void add(MenuComponent menuComponent) {
       menuComponents.add(menuComponent);
   }
   public void remove(MenuComponent menuComponent) {
       menuComponents.remove(menuComponent);
   }

    @Override
    public void print() {
       System.out.println("Restaurant menu:");
       for (MenuComponent menuComponent : menuComponents) {
           menuComponent.print();
       }
    }

}
