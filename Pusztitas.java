public class Pusztitas {

    static int osszegyujtes(int[] viragok, int kapacitas) {
        int osszeg = 0;
        for (int i = 0; i < viragok.length; i++) {
            osszeg += viragok[i];
        }

        if (osszeg % kapacitas == 0) {
            return osszeg / kapacitas;
        }

        return osszeg / kapacitas + 1;
    }

}
