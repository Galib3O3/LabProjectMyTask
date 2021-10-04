package oopr;
import java.lang.*;
import java.util.Scanner;

public class Hotel {
    String Hotel,rooms,Area,price,rating,cordinate, number;

    void hotelzone()
    {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\t\t\t     +=|=+ ");
        System.out.println("\t\t\t    ||===||");
        System.out.println("\t\t\t  ||=======||");
        System.out.println("\t\t\t||===========||");
        System.out.println("\t\t\t||H-O-T-E-L-S||");
        System.out.println("\t\t\t||===========||\n");
        System.out.println("\t\t\t1.Humayun Rashid Zone");
        System.out.println("\t\t\t2.Darga gate Zone");
        System.out.println("\t\t\t3.Zindabazar Zone");
        System.out.println("\t\t\t4.Uposhohor Zone");
        System.out.println("\t\t\t5.kazi Bazar Zone\n");
        System.out.println("Select the are you search hotel:");

        Scanner hotel=new Scanner(System.in);
        int hotelzone= hotel.nextInt();
        switch(hotelzone)
        {
            case 1:
                Hotel htel =new Hotel();
                System.out.println("--------------------");
                htel.Hotel="Ali Plaza";
                htel.Area="Kodomtoli";
                htel.rooms="Single room";
                htel.price="2100 taka Per-night";
                htel.rating="8.4 out of 10";
                htel.cordinate="24.878245112994456, 91.87581003962177";
                htel.number="+8801611454439";
                htel.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel1 =new Hotel();
                htel1.Hotel="South City";
                htel1.Area="Kodotoli";
                htel1.rooms="Single room";
                htel1.price="1000 taka Per-night";
                htel1.rating="N/A out of 10";
                htel1.cordinate="24.880457201811847, 91.87535338084498";
                htel1.number="+8801720115611";
                htel1.HOTELinfo();
                System.out.println("--------------------");
                htel1.baCk();
                break;
            case 2:
                Hotel htel02 =new Hotel();
                System.out.println("--------------------");
                htel02.Hotel="Hotel Noor Jahan Grand";
                htel02.Area="Darga Gate";
                htel02.rooms="Dulexs Twin room";
                htel02.price="4866 taka Per-night";
                htel02.rating="8.4 out of 10";
                htel02.cordinate="24.90250365622034, 91.86995982689656";
                htel02.number="+8801930111666";
                htel02.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel03 =new Hotel();
                htel03.Hotel="Payra";
                htel03.Area="Darga Gate";
                htel03.rooms="Twin room";
                htel03.price="853 taka Per-night";
                htel03.rating="4.9 out of 10";
                htel03.cordinate="24.902533195340194, 91.86767814896388";
                htel03.number="+8801300817865";
                htel03.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel04 =new Hotel();
                htel04.Hotel="Farmins Garden";
                htel04.Area="Darga Gate opposite side";
                htel04.rooms="Deluxe Double room";
                htel04.price="4263 taka Per-night";
                htel04.rating="5.5 out of 10";
                htel04.cordinate="24.940015500990345, 91.87524285724153";
                htel04.number="+8801708169697";
                htel04.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel05 =new Hotel();
                htel05.Hotel="Star Pacific";
                htel05.Area="Darga Gate ";
                htel05.rooms="Deluxe Double room";
                htel05.price="1535 taka Per-night";
                htel05.rating="8.4 out of 10";
                htel05.cordinate="24.902234996938155, 91.86871113377447";
                htel05.number="+8801777799466";
                htel05.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel06 =new Hotel();
                htel06.Hotel="The Grand Hotel BD";
                htel06.Area="Darga Gate ";
                htel06.rooms="Deluxe Double room";
                htel06.price="1023 taka Per-night";
                htel06.rating="7.8 out of 10";
                htel06.cordinate="24.901923699174187, 91.86968476256318";
                htel06.number="+8801970793366";
                htel06.HOTELinfo();
                System.out.println("--------------------");
                htel06.baCk();

                break;

            case 3:
                Hotel htel2 =new Hotel();
                System.out.println("--------------------");
                htel2.Hotel="Grand Palace Hotel & Resorts Sylhet";
                htel2.Area="Jallar par";
                htel2.rooms="Deluxe Double room";
                htel2.price="8056 taka Per-night";
                htel2.rating="7.4 out of 10";
                htel2.cordinate="24.894202789863787, 91.86553647605386";
                htel2.number="+8801713558866";
                htel2.HOTELinfo();
                System.out.println("--------------------");


                Hotel htel3 =new Hotel();
                htel3.Hotel="Richmond Hotel";
                htel3.Area="Jallar par";
                htel3.rooms="Executive Suite";
                htel3.price="1,652 taka Per-night";
                htel3.rating="4.7 out of 10";
                htel3.cordinate="24.89742170061356, 91.86816825284427";
                htel3.number="+880821719076";
                htel3.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel4 =new Hotel();
                htel4.Hotel="Grand View 1&2";
                htel4.Area="Hawrapara";
                htel4.rooms="Deluxe Queen room";
                htel4.price="2813 taka Per-night";
                htel4.rating="7.7 out of 10";
                htel4.cordinate="24.89581423508186, 91.87273696818137";
                htel4.number="+8801404033002";
                htel4.HOTELinfo();
                System.out.println("--------------------");
                htel4.baCk();

                break;


            case 4:
                Hotel htel01 =new Hotel();
                System.out.println("--------------------");
                htel01.Hotel="ROSE VIEW";
                htel01.Area="Sobhanighat";
                htel01.rooms="Super Deluxe  room";
                htel01.price="7000 taka Per-night";
                htel01.rating="9.5 out of 10";
                htel01.cordinate="24.88632559023294, 91.88138561055095";
                htel01.number="+880821721835";
                htel01.HOTELinfo();
                System.out.println("--------------------");


                Hotel htel7 =new Hotel();
                htel7.Hotel="Valley Garden";
                htel7.Area="Sobhanighat";
                htel7.rooms="Twin room";
                htel7.price="3150 taka Per-night";
                htel7.rating="4.1 out of 10";
                htel7.cordinate="24.89036160277835, 91.87871305283073";
                htel7.number="+8801938844500";
                htel7.HOTELinfo();
                System.out.println("--------------------");


                Hotel htel8 =new Hotel();
                htel8.Hotel="Mira Garden";
                htel8.Area="Naiorpul";
                htel8.rooms="Deluxe Twin room";
                htel8.price="5200 taka Per-night";
                htel8.rating="8.4 out of 10";
                htel8.cordinate="24.895114263988326, 91.87974149149363";
                htel8.number="+880821719281";
                htel8.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel9 =new Hotel();
                htel9.Hotel="Jatra Flagship Sylhet City Centar";
                htel9.Area="Uposhohor";
                htel9.rooms="Deluxe room";
                htel9.price="2302 taka Per-night";
                htel9.rating="9.1 out of 10";
                htel9.cordinate="24.887124110310825, 91.88536363569693";
                htel9.number="+8801309552872";
                htel9.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel10 =new Hotel();
                htel10.Hotel="Grand Surma";
                htel10.Area="Syed Burhan Uddin Road";
                htel10.rooms="De4luxe Double Room";
                htel10.price="1535 taka Per-night";
                htel10.rating="6.8 out of 10";
                htel10.cordinate="24.884286752963757, 91.88228576447312";
                htel10.number="+8801707180152";
                htel10.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel11 =new Hotel();
                htel11.Hotel="Valley Garden";
                htel11.Area="Mira Bazar";
                htel11.rooms="Twin room";
                htel11.price="3150 taka Per-night";
                htel11.rating="4.1 out of 10";
                htel11.cordinate="24.890225350700355, 91.87858430682812";
                htel11.number="+8801938844500";
                htel11.HOTELinfo();
                System.out.println("--------------------");
                htel11.baCk();
                break;

            case 5:
                Hotel htel12 =new Hotel();
                System.out.println("--------------------");
                htel12.Hotel="La Vista ";
                htel12.Area="lamabazar Road";
                htel12.rooms="Deluxe  room";
                htel12.price="2210 taka Per-night";
                htel12.rating="7.2 out of 10";
                htel12.cordinate="24.89443427751424, 91.86063929330246";
                htel12.number="+8801933009977";
                htel12.HOTELinfo();
                System.out.println("--------------------");

                Hotel htel13 =new Hotel();
                htel13.Hotel="East End";
                htel13.Area="Taltola Road";
                htel13.rooms="Deluxe Double room";
                htel13.price="2387 taka Per-night";
                htel13.rating="N/A out of 10";
                htel13.cordinate="24.890889307957572, 91.86386292212944";
                htel13.number="+8801601150654";
                htel13.HOTELinfo();
                System.out.println("--------------------");


                Hotel htel14 =new Hotel();
                htel14.Hotel="Royal Palm";
                htel14.Area="Taltola Road";
                htel14.rooms="Deluxe twin room";
                htel14.price="2387 taka Per-night";
                htel14.rating="N/A out of 10";
                htel14.cordinate="24.8915080712478, 91.86530663567548";
                htel14.number="+8801714113196";
                htel14.HOTELinfo();
                System.out.println("--------------------");
                htel14.baCk();
                break;
            default:

        }
    }
    void HOTELinfo()
    {
        System.out.println("HOTEL:"+Hotel);
        System.out.println("Area:"+Area);
        System.out.println("Rooms:"+rooms);
        System.out.println("Price:"+price);
        System.out.println("Rating:"+rating);
        System.out.println("Coordinate:"+cordinate);
        System.out.println("Number:"+number);
    }
    void baCk()
    {
        System.out.println("Back for more information about hotels press any key ");
        Scanner back =new Scanner(System.in);


        int inputback= back.nextInt();

        hotelzone();

    }


}
