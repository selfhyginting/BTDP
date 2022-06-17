public class Switch {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 

        String result = "";
        String day = "F";
        switch (day) {
            case "M":
            case "W":
            case "F" : {
                result = "MWF";
            }
                break;
            case "T":
            case "TH":
            case "S":{
                result = "TTS";
            }
            default:
                break;
        }

        System.out.println("old switch result : ");
        System.out.println(result);  
   
    }
}