package progect1 ;
import java.util.Scanner;
public class Progect1 {
public static Scanner in=new Scanner(System.in);  
public static int make_up(){
    int sum=0;
    boolean x;
    do{
           System.out.println("1-بودره اساس\n2- بودره مائي\n3-بودره BB\n4- بودره خدود\n5-بودره الاضاءه "+
           "\n6-بودره مكياجي\n7-كونسيلر\n8-هايلايت\n9-كنتور\n10- فرش البودر\n11-ماسكارا سينس\n12-ماسكارا فلاش\nChoose number to show the cost");
           int choose=in.nextInt();
           switch (choose) {  
                 case 1: sum+=3500;
                 System.out.println("price="+3500);break;
                 case 2: sum+=5000;    
                 System.out.println("price="+5000);break;                 
                 case 3: sum+=3800;    
                 System.out.println("price="+3800);break;                
                 case 4: sum+=2500;    
                 System.out.println("price="+2500);break;               
                 case 5: sum+=3000;   
                 System.out.println("price="+3000);break;                 
                 case 6: sum+=5500; 
                 System.out.println("price="+5500);break;    
                 case 7: sum+=2000;
                 System.out.println("price="+2000);break;
                 case 8: sum+=2500;  
                 System.out.println("price="+2500);break;
                 case 9: sum+=1800;   
                 System.out.println("price="+1800);break;
                 case 10: sum+=700;  
                 System.out.println("price="+700);break;
                 case 11: sum+=4500;   
                 System.out.println("price="+4500);break;
                 case 12: sum+=5000;   
                 System.out.println("price="+5500);break;
                 default:
                 System.out.println("Sorry.. You'r request isn't available"); break; }
                 System.out.println("\n____________________________________________\n"
                         +"Do you want another something?\n Write true or false");
                 x=in.nextBoolean();
                }while(x==true);
                return sum; }
 public static int nails(){
     int sum=0;
     boolean y;
     do{
             System.out.println("1-اظافر صناعي نوع صغير\n2-صناعي نوع كبير \n3- اظافر ملونه شي ان\n4-مناكير شركه فلومر\n5-مناكير شركه  سو لاكي "
             +"\n6-مزيل مناكير\n7-صمغ الاظافر\nChoose  number to show the cost");    
             int choose = in.nextInt();
             switch (choose){
                 case 1: sum+=1500;
                 System.out.println("price="+1500); break;         
                 case 2: sum+=3500;               
                 System.out.println("price="+3500); break;
                 case 3: sum+=1000;
                 System.out.println("price="+1000); break;
                 case 4: sum+=500;
                 System.out.println("price="+500); break;
                 case 5: sum+=600;
                 System.out.println("price="+600); break;
                 case 6: sum+=1000;
                 System.out.println("price="+1000); break;
                 default: System.out.println("Sorry.. You'r request isn't available "); break;  }
                 System.out.println("\n_________________________________________________________\n"+
                         "Do you want another something?\n Write true or false");
                 y=in.nextBoolean();
                 }while(y==true);
                 return sum;   }
 public static int hair(){
int sum=0;
boolean z;
do{
            System.out.println("1-المساكات\n2-تيجان\n3-مشابك\n4-ربالات\n5-امشطه\n6-مملس\n7-استشوار\nChoose number to show the cost");
            int choose= in.nextInt();
            switch (choose){
               case 1: sum+=1200;
               System.out.println("price="+1200); break;
               case 2:sum+=1500;
               System.out.println("price="+1500); break;
               case 3:sum+=1800;
               System.out.println("price="+1800);break;
               case 4: sum+=500;
               System.out.println("price="+500);break;
               case 5:sum+=600;
               System.out.println("price="+600);break;
               case 6:sum+=4500;
               System.out.println("price="+4500);break;
               case 7:sum+=6000;
               System.out.println("price= "+6000);break;
               default: System.out.println("Sorry..You'r request isn't available"); break;  }
               System.out.println("\n___________________________________________________________\n"+
                       "Do you want another something?\n Write true or false");
               z=in.nextBoolean();
               }while(z==true);
              return sum;  }
 public static int perfume (){
     int sum=0;
     boolean n;
     do{
            System.out.println("1-noon\n2-coral black\n3-palme d'or\n4-dinar pink\n5-shliz\n6-عطر عوده \n7-calotin rose\n8-armain code"+
                   "\nChoose number to show the cost" );
            int choose=in.nextInt();
             switch (choose) {
                 case 1:sum+=25000;
                 System.out.println("price="+25000);break;
                 case 2:sum+=15000;
                 System.out.println("price="+15000);break;
                 case 3:sum+=18000;
                 System.out.println("price="+18000);break;
                 case 4:sum+=22000;
                 System.out.println("price="+22000);break;
                 case 5:sum+=10000;
                 System.out.println("price="+10000);break;
                 case 6: sum+=12800; 
                 System.out.println("price="+12800);break;
                 case 7: sum+=11000;
                 System.out.println("price="+11000);break;
                 case 8: sum+=24000;
                 System.out.println("price="+24000);break;
                 default: System.out.println("Sorry.. You'r request isn't available ");break; }
                 System.out.println("\n____________________________________________________\n"+
                         "Do you want another something?\n Write true or false");
                 n=in.nextBoolean();
                 }while(n==true);
                 return sum;       }
 public static int body_care(){
     int sum=0;
     boolean t;
     do{
             System.out.println( "1-كريم ببايا\n2-صابون جيف\n3-صابون دف\n4-كريم جونسون\n5-زبده الشيا\n6-فازلين\n7-كريم جليسوليد"+
                  "\nChoose number to show the cost");
             int choose= in.nextInt();
             switch (choose){
                 case 1: sum+=2900;
                 System.out.println("price="+2900);  break;
                 case 2: sum+=700;  
                 System.out.println("price="+700); break;
                 case 3: sum+=1000;
                 System.out.println("price="+1000); break;
                 case 4: sum+=2000;
                 System.out.println("price="+2000); break; 
                 case 5: sum+=3000;
                 System.out.println("price="+3000);break;
                 case 6: sum+=1500;
                 System.out.println("price="+1500);break;
                 case 7: sum+=6000;
                 System.out.println("price="+6000);break;
                 default: System.out.println("Sorry..You r request isn t available"); break;  }
                System.out.println("\n______________________________________________________\n"+
                        "Do you want another something?\n Write true or false");
                t=in.nextBoolean();
            }while(t==true);
             return sum;     }
 public static int accessories(){
     int sum=0;
     boolean c;
     do{
        System.out.println("1-قلادات\n2-اساور\n3-خواتم\n4-اقراط \n\"5-طقم كريستال\nchoose number to show the cost");
             int choose=in.nextInt();
             switch(choose){
                 case 1: sum+=2000;
                 System.out.println("price="+2000);break;
                 case 2: sum+=1000;
                 System.out.println("price="+1000);break;
                 case 3: sum+=1200;
                 System.out.println("price="+1200);break;
                 case 4: sum+=700;
                 System.out.println("price="+700); break;
                 case 5:sum+=3000;
                 System.out.println("price="+3000); break;
                 default :
                 System.out.println("Your request is not available");  break;  } 
                 System.out.println("\n____________________________________________________\n"+
                         "Do you want another something?\n Write true or false");
                 c=in.nextBoolean();
                 }while(c==true);
             return sum;         }
public static void main (String args[]){
int sum=0;
System.out.println(" _____________________________________\n « Welcom to the best cosmetic store »\n _____________________________________");
    System.out.println("project name : Al-Qaysar cosmetics\nThe Work Of Student : Hanan Al-Sayfy\nSupervision: Eng. Fawzi"+
          "\n________________________________________"  );
    int ch;
    do{
   System.out.println("1-مكياج\n2-العنايه بالاظافر\n3-العنايه بالشعر \n4-العطور\n5-العنايه بالجسم\n6-الاكسسوارات\n7-حسابك\n8-خروج"+
           "\n___________________________________________\nChoose the Section number you want");
   ch=in.nextInt();
        switch (ch){
             case 1:
             sum+=make_up();break;
             case 2:
             sum+=nails();break;
             case 3:
             sum+=hair();break;
             case 4:
             sum+=perfume();break;
             case 5:
             sum+=body_care();break;
             case 6:
             sum+=accessories();break;
             case 7:
             System.out.println("sum total="+sum);break;
             case 8:
             break;
             default:
             System.out.println("You'r request isn't Available"); break;} 
             }while(ch!=8);
 }}