public class Main{
    public static void main(String[] args){
        // while for ile aynı işlemleri yapabilir.
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        // do-while döngüsü nedir?
        // bu döngüde ilk durumda koşula bakmadan adımları izleme vardır.
        // yani program her halükarda 1 kere çalıştırılır.
        int j = 0;
        do {
            System.out.println(j);
            j+=2;
        } while(j < 100);
    }
}
// while sonsuz döngü açabilir. While kullanmamızın en büyük nedeni belli bir noktaya
// ulaştığımızda döngünün bitmesidir. O zamana kadar döngüdeki işlemleri yapmasıdır.
