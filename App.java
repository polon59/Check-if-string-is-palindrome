/**
 * App
 */
public class App {

    public static void main(String[] args) {
        App app = new App();

        if (app.handle(args[0])) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
    }


    public boolean handle(String str){
        String[] letters = str.split("");
        String reversed = "";

        for (int i =letters.length-1; i >= 0; i --) {
            reversed += letters[i];
        }

        if (reversed.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}