import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        Scanner tdi=new Scanner(System.in);
        char menu;
        do{
            System.out.println("V-Tarjeta Video");
            System.out.println("M.-Tarjeta Madre");
            System.out.println("P.-Fuente de Poder");
            System.out.println("G.-Gabinete");
            System.out.println("D.-Ssd Drivers Disco Duro");
            System.out.println("C.-Cotizar full pc");
            System.out.println("S.-Salir");
            System.out.println("Seleccione la opción");
            menu=tdi.next().toUpperCase().charAt(0);
            System.out.println("Ingrese su Presupuesto");
            int presupuesto=tdi.nextInt();
                    switch  (menu){
                        case 'V': if (presupuesto<=9000) {
                            System.out.println("Su opcion");
                            System.out.println("Tarjeta De Video Gigabyte Geforce Gtx 1650 D6 Oc 4g, $8,887");
                            System.out.println("Tarjeta de video Nvidia Evga SC Gaming GeForce GTX 16 Series GTX 1650 SUPER 04G-P4-1357-KR 4GB, $5,649");
                            }else{
                            if(presupuesto>=9000); {
                            System.out.println("Su opcion");
                            System.out.println("Tarjeta Video Evga Nvidia Geforce Rtx 2060 Sc, 6gb 192-bi, $13,355");
                            System.out.println("Tarjeta de video Nvidia Asus ROG Strix GeForce RTX 30 Series RTX 3060 ROG-STRIX-RTX3060-O12G-GAMING OC Edition 12GB, $28,850");
                            }
                            }
                            System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                            break;
                        case 'M': if (presupuesto<=2000) {
                            System.out.println("Su opcion");
                            System.out.println("Motherboard Am4 A320m-s2h Tarjeta Madre Gigabyte Amd Ddr4, $1,035");
                            }else{
                            if (presupuesto>=2000); { 
                            System.out.println("Su opcion");
                            System.out.println("Motherboard Tarjeta Madre Gigabyte B550m Ds3h Ac Rev 1.0 M.2, $2,790");
                            }
                                    }
                            System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                            break;
                        case 'P': if (presupuesto<=1600) {
                            System.out.println("Su opcion");
                            System.out.println("ASUS ROG-STRIX-550G 80 PLUS Gold, 20+4 pin ATX, 550W, $1,439");
                            }else{
                            if(presupuesto>=1600) {
                            System.out.println("Su opcion");
                            System.out.println("Corsair CX650F RGB, 650 W, 80 Plus Bronce, $2,120");
                            }
                            }
                            System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                            break;
                        case 'G': if (presupuesto<=1000) {
                            System.out.println("Sus opciones");
                            System.out.println("Gabinete Ocelot Gaming OG-C E1 con Ventana, ATX, ATX/Micro-ATX/Mini-ITX, USB 2.0/3.0, $649");
                            }else{
                            if (presupuesto>= 1000); {
                            System.out.println("Su opcion");
                            System.out.println("YEYIAN GABINETE Gamer Blade 2100 Ventana Cristal YNH-B2100 Negro/LED Azul, $1,090");
                            }
                            }
                            System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                            break;
                        case 'D': if (presupuesto<=1100){
                            System.out.println("Su opcion"); 
                            System.out.println("SSD Kingston A400, 960GB, SATA III, 2.5'', 7mm, $1,099");
                            }else{
                            if (presupuesto>= 1100) {
                            System.out.println("Su opcion"); 
                            System.out.println("SSD interno Kingston SA400S37/960G 960GB, $1,165");
                            }
                            }
                            System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                            break;
                        case 'C': if (presupuesto<=20000){
                             System.out.println("Su cotización en base a su presupuesto presupuesto");
                             System.out.println("Tarjeta de video Nvidia Evga SC Gaming GeForce GTX 16 Series GTX 1650 SUPER 04G-P4-1357-KR 4GB, $5,649");
                             System.out.println("Motherboard Am4 A320m-s2h Tarjeta Madre Gigabyte Amd Ddr4, $1,035");
                             System.out.println("ASUS ROG-STRIX-550G 80 PLUS Gold, 20+4 pin ATX, 550W, $1,439");
                             System.out.println("Gabinete Ocelot Gaming OG-C E1 con Ventana, ATX, ATX/Micro-ATX/Mini-ITX, USB 2.0/3.0, $649");
                             System.out.println("SSD Kingston A400, 960GB, SATA III, 2.5'', 7mm, $1,099");
                             System.out.println("La cantidad final en base a los componentes es $9,871");
                             System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                             }else{
                             if (presupuesto>=20000) {
                             System.out.println("Su cotización en base a su presupuesto presupuesto");
                             System.out.println("Tarjeta de video Nvidia Asus ROG Strix GeForce RTX 30 Series RTX 3060 ROG-STRIX-RTX3060-O12G-GAMING OC Edition 12GB, $28,850");
                             System.out.println("Motherboard Tarjeta Madre Gigabyte B550m Ds3h Ac Rev 1.0 M.2, $2,790");
                             System.out.println("Corsair CX650F RGB, 650 W, 80 Plus Bronce, $2,120");
                             System.out.println("YEYIAN GABINETE Gamer Blade 2100 Ventana Cristal YNH-B2100 Negro/LED Azul, $1,090");
                             System.out.println("SSD interno Kingston SA400S37/960G 960GB, $1,165");
                             System.out.println("La cantidad final en base a los componentes es $36,015");
                             System.out.println("file:///C:/Users/kevin/OneDrive/Escritorio/TDI/TDI%20pagina%20principal.html");
                             }
                             }
                        case 'S': System.out.println("Salir");
                        break;
                    }
        }while(menu!=7);
                
    }
    
}