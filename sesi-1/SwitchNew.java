public class SwitchNew {
    public static void main(String[] args) {
        String day = "T";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            case "" -> "Please insert a valid day";
            default -> "Looks like Sunday";
        };
        System.out.println(result);
    }
}