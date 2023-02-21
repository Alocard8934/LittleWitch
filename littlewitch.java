public class LittleWitch {
    public static void main (String[] args) {
        // Geben Sie hier die Uhrzeit ein
        int clock = Integer.parseInt(args[0]);
        
        
        // Geschichte stundenweise aufgeschlüsselt
        if(clock == 6){
            System.out.println("Morgens früh um 6 kommt die kleine Hex.");
        } else if(clock == 7) {
            System.out.println("Morgens früh um 7 schabt sie gelbe Rüben.");
        } else if(clock == 8) {
            System.out.println("Morgens früh um 8 wird Kaffee gemacht.");
        } else if(clock == 9) {
            System.out.println("Morgens früh um 9 geht sie in die Scheun'.");
        } else if(clock == 10) {
          System.out.println("Morgens früh um 10 hackt sie Holz und Spän'.");  
        } else if(clock == 11) {
            System.out.println("Feuert an um 11, kocht dann bis um 12: ");  
        } else {
            System.out.println("Fröschebein und Krebs und Fisch. Hurtig Kinder kommt zu Tisch! ");  
        }
        // Viel Spaß )))))
    }
}