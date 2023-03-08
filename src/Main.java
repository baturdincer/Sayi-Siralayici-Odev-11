import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1, sayi2, sayi3, min, orta, max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextDouble();
        System.out.print("Üçüncü sayıyı girin: ");
        sayi3 = scanner.nextDouble();

        if (sayi1 != sayi2 && sayi1 != sayi3 && sayi2 != sayi3) {
            if (sayi1 > sayi2 || sayi1 > sayi3) {
                if (sayi1 > sayi3 && sayi1 > sayi2) {
                    max = sayi1;
                    if (sayi2 > sayi3) {
                        orta = sayi2;
                        min = sayi3;
                    } else {
                        orta = sayi3;
                        min = sayi2;
                    }
                } else {
                    orta = sayi1;
                    if (sayi2 > sayi3) {
                        max = sayi2;
                        min = sayi3;
                    } else {
                        max = sayi3;
                        min = sayi2;
                    }
                }
            } else {
                min = sayi1;
                if (sayi2 > sayi3) {
                    max = sayi2;
                    orta = sayi3;
                } else {
                    max = sayi3;
                    orta = sayi2;
                }
            }

            System.out.println(max+">"+"" +orta+">"+min);

        }
        else{
            if (sayi1 == sayi2 && sayi1 == sayi3 && sayi2 == sayi3) {
                System.out.println(sayi1 + "=" + sayi2 + "=" + sayi3);
            }
            else if (sayi1 == sayi2) {
                if (sayi1>sayi3){
                    System.out.println(sayi1+"="+sayi2+">"+sayi3);
                }
                else if(sayi3>sayi1) {
                    System.out.println(sayi3+">"+sayi2+"="+sayi1);
                }

            }
            else if (sayi1 == sayi3) {
                if (sayi1>sayi2){
                    System.out.println(sayi1+"="+sayi3+">"+sayi2);
                }
                else if (sayi2>sayi1){
                    System.out.println(sayi2+">"+sayi1+"="+sayi3);
                }
            }
            else if(sayi2 == sayi3){
                if (sayi1>sayi2){
                    System.out.println(sayi1+">"+sayi2+"="+sayi3);
                }
                else if (sayi2>sayi1) {
                    System.out.println(sayi2+"="+sayi3+">"+sayi1);
                }
            }
        }

    }
}