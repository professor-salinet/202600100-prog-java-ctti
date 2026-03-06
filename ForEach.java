public class ForEach {
    public static void main (String[] args) {
        String[] frutas = {"Banana","Laranja","Maçã","Pera","Uva"};
        // for (int i = 0; i < frutas.length; i++) {
        for (String fruta : frutas) {
            System.out.println("A fruta é: " + fruta);
        }
    }
}