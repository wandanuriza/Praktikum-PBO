package Anime;

/**
*
* @author Wanda
*/

public class AttackOnTitan {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       int i;
       int j;

       Thread scoutingLegion = new Thread();
       scoutingLegion.start();
       while(true){

           for(i=1; i<=10; i++){
               System.out.println("Pasukan Penyelidik Berhasil Membunuh Titan ke : " + i);

               try{
                   scoutingLegion.sleep(1000);
               }catch(Exception e){
                   e.getStackTrace();
               }
             if(i==10){
                 System.out.println("Pasukan Penjaga dan Pasukan Polisi Militer Datang Ke TKP ");

             }
  }

       Thread stationaryGuard = new Thread();
       stationaryGuard.start();

           for(j=1; j<=20; j++){
               System.out.println("Pasukan Penjaga Berhasil Menyelamatkan Warga Ke : " + j);
               System.out.println("Pasukan Polisi Militer Membantu Menyelamatkan Warga Ke : " + j);

               try{
                   stationaryGuard.sleep(1000);
               }catch(Exception e){
                   e.getStackTrace();

               }
           }
           break;
   }

   }
}
