package Service;

import Models.Centre;
import Models.User;
import Models.VaccineInventory;
import Models.VaccineType;
import utils.COVAXInventoryComparator;
import utils.COVISHIELDInvectoryComparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CenterService {
    public static List<Centre> centreList=new ArrayList<>();
    public static Map<String,Centre> centreMap=new HashMap<>();

    public void registerCenter(String centreId,int CovaxQ,int CovishieldQ){
        if(centreMap.containsKey(centreId)) System.out.println("Center already exist");
        else{
            if(CovaxQ<0 || CovishieldQ<0){
                System.out.println("Inventory cannot be negative!");
                return;
            }
            Centre centre=new Centre(centreId,new VaccineInventory(CovaxQ,CovishieldQ));
            centreList.add(centre);
            centreMap.put(centreId,centre);
            System.out.println("New centre has been Successfully added ->"+ centre.toString());
        }
    }
    public void getCentres(String username){
        User user=UserService.registeredUser.get(username);
        if(user==null){
            System.out.println("Queried User does not exist!");
        }
        VaccineType preferredVaccine=user.getPreferredVaccineType();
        if(preferredVaccine == VaccineType.COVAX){
            centreList.sort(new COVAXInventoryComparator());
            for(Centre c : centreList){
                System.out.println(c.getcId()+" ->"+" COVAX -> "+c.getVaccineInventory().getCovaxQuantity());
            }
        }
        if(preferredVaccine==VaccineType.COVISHIELD){
            centreList.sort(new COVISHIELDInvectoryComparator());
            for(Centre c : centreList){
                System.out.println(c.getcId()+" -> "+" COVISHIELD -> "+c.getVaccineInventory().getCoviShieldQuantity());
            }
        }

    }
}
