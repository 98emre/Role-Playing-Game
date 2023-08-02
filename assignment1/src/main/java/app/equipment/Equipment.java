package app.equipment;

import java.util.HashMap;
import java.util.Map;

import app.Items.Item;
import app.Items.Slot;

public class Equipment {

    private Map<Slot, Item> equippedItem;

    public Equipment() {
        equippedItem = new HashMap<>();
        equippedItem.put(Slot.BODY, null);
        equippedItem.put(Slot.HEAD, null);
        equippedItem.put(Slot.LEGS, null);
        equippedItem.put(Slot.WEAPON, null);
    }

    @Override
    public String toString() {
        return "Equipment [equippedItem=" + equippedItem + "]";
    }
}
