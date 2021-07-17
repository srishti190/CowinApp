package utils;

import Models.Centre;

import java.util.Comparator;

public class COVISHIELDInvectoryComparator implements Comparator<Centre> {
    public int compare(Centre obj1,Centre obj2){
        int QuantityBased=obj2.getVaccineInventory().getCoviShieldQuantity()-obj1.getVaccineInventory().getCoviShieldQuantity();
        return QuantityBased;
    }
}
