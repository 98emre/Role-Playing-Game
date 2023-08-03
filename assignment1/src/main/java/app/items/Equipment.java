package app.items;

import java.util.HashMap;
import java.util.Map;

import app.types.Slot;

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

    public String toString() {
        StringBuilder sb = new StringBuilder("\n");

        for (Map.Entry<Slot, Item> entry : equippedItems.entrySet()) {
            sb.append(entry.getKey()).append(": ");

            if (entry.getKey() != null) {
                sb.append(entry.getValue()).append("\n");
            } else {
                sb.append("null").append("\n");
            }
        }

        return sb.toString();
    }
}
