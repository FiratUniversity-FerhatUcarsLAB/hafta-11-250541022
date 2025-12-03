public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); 
        // Bu satır sorunsuz derlenir ve çalışır.
        // Metod çalışır, 42 değerini döndürür ama sonuç hiçbir yerde kullanılmadığı için *yok sayılır*.
        // Derleyici hata vermez. (IDE uyarı verebilir: "Result of getNumber() is ignored")


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7); Bu derlenmez Derleyici şu hatayı verir:
        // "error: void type not allowed here"
        // Çünkü sayHello() hiçbir değer döndürmez (void), bu yüzden + 7 gibi bir ifadede kullanılamaz.
        

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
