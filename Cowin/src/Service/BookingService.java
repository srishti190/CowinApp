package Service;

import Models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {

    public static List<Booking> bookings=new ArrayList<>();
    public static HashMap<String,List<String>> centreBookingMap=new HashMap<>();

    public void bookslot(String username,String centreId){
        User user=UserService.getRegisteredUser().get(username);
        if(user==null){
            System.out.println("Queried User does not exist!");
            return;
        }
        else{
            VaccineType preferredVaccine=user.getPreferredVaccineType();
            if(preferredVaccine==VaccineType.COVAX){
                Centre centre=CenterService.centreMap.get(centreId);
                int covax_Q=centre.getVaccineInventory().getCovaxQuantity();
                if(user.getisIsbook()==true){
                    System.out.println("Booking already made");
                    System.out.println("false");
                    return;
                }
                else if(user.getisIsbook()==false && covax_Q>0){
                    user.setIsbook(true);
                    System.out.println("True");
                    System.out.println("Vaccine successfully booked for user "+ username);
                    int updated_covax_Q = covax_Q-1;
                    centre.getVaccineInventory().setCovaxQuantity(updated_covax_Q);
                    System.out.println("Updated Covax quantity for centre "+centreId+" is "+updated_covax_Q);
                    Booking booking=new Booking(username,centreId);
                    bookings.add(booking);
                    if(centreBookingMap.get(centreId)==null){
                        List<String> users=new ArrayList<>();
                        users.add(username);
                        centreBookingMap.put(centreId,users);
                    }
                    else{
                        List<String> users=centreBookingMap.get(centreId);
                        users.add(username);
                        centreBookingMap.put(centreId,users);
                    }
                    return;
                }
                else {
                    System.out.println("False");
                    user.setIsbook(false);
                    System.out.println("Vaccine not Available for user "+ username);
                    return;
                }
            }
            if(preferredVaccine==VaccineType.COVISHIELD){
                Centre centre=CenterService.centreMap.get(centreId);
                int covshield_Q=centre.getVaccineInventory().getCoviShieldQuantity();
                if(user.getisIsbook()==true){
                    System.out.println("Booking already made");
                    System.out.println("false");
                    return;
                }
                else if(user.getisIsbook()==false && covshield_Q>0){
                    user.setIsbook(true);
                    System.out.println("True");
                    System.out.println("Vaccine successfully booked for user "+ username);
                    int updated_covshield_Q = covshield_Q-1;
                    centre.getVaccineInventory().setCoviShieldQuantity(updated_covshield_Q);
                    System.out.println("Updated Covishield quantity for centre "+centreId+" is "+updated_covshield_Q);
                    Booking booking=new Booking(username,centreId);
                    bookings.add(booking);
                    if(centreBookingMap.get(centreId)==null){
                        List<String> users=new ArrayList<>();
                        users.add(username);
                        centreBookingMap.put(centreId,users);
                    }
                    else{
                        List<String> users=centreBookingMap.get(centreId);
                        users.add(username);
                        centreBookingMap.put(centreId,users);
                    }
                    return;
                }
                else {
                    System.out.println("False");
                    user.setIsbook(false);
                    System.out.println("Vaccine not booked for user "+ username);
                    return;
                }
            }
        }
    }
    public void getStats(){
        List<Centre> centres=CenterService.centreList;
        for(Centre c: centres){
            System.out.println(c.getcId());
            System.out.println(c.getVaccineInventory().toString());
            List<String> users=centreBookingMap.get(c.getcId());
            if(users!=null){
                for (String username:users){
                    System.out.println(username);
                }
            }
        }
        return;
    }
}
