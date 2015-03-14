package beangames.greenthumb;

/**
 * Created by jastine on 2015-03-13.
 */
public class Plant {
    private String name;
    private String notifications;
    private String harvestTime;
    private String instructions;

   public String getName(Plant p){

       return p.name;
   }
   
   public String getNotifications(Plant p){
       return p.notifications;
   }
   
   public String getHarvestTime(Plant p){

       return p.harvestTime;
   }

}
