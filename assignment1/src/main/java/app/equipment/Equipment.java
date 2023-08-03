package app.equipment;

import java.util.HashMap;
import java.util.Map;

import app.Items.Item;
import app.Items.Slot;

public class Equipment {

    private Map<Slot, Item> equippedItems;

    public Equipment() {
        equippedItems = new HashMap<>();

        for (Slot slot : Slot.values()) {
            equippedItems.put(slot, null);
        }
    }

    public Map<Slot, Item> getEquippedItem() {
        return equippedItems;
    }

    public void setEquippedItem(Map<Slot, Item> equippedItems) {
        this.equippedItems = equippedItems;
    }

    public void equipItem(Item item) {
        equippedItems.put(item.getSlot(), item);
    }

    @Override
    public String toString() {
        return "Equipment [equippedItem=" + equippedItems + "]";
    }
}
