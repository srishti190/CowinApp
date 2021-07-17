package utils;

import Models.Centre;

import java.util.Comparator;

public class COVAXInventoryComparator implements Comparator<Centre> {

    @Override
    public int compare(Centre obj1,Centre obj2){
        int quantityBased=obj2.getVaccineInventory().getCovaxQuantity()-obj1.getVaccineInventory().getCovaxQuantity();
        return quantityBased;
    }
}
