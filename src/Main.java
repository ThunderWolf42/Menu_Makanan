import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Menu {
    static Scanner jawab = new Scanner(System.in);
    static int hargaMakanan = 0;
    static int hargaMinuman = 0;
    static boolean sudahBayar= false;
    static List<String> selectedMakanan = new ArrayList<>();
    static List<String> selectedMinuman = new ArrayList<>();

    public static void MenuMakanan() {
        System.out.println("");
        System.out.println("Menu Makanan");
        System.out.println("============");
        System.out.println("1. Nasi");
        System.out.println("2. Ayam");
        System.out.println("3. Soto");
        System.out.println("4. Selesai Memilih Makanan");
        System.out.println("-------------");

        int pilihanMakanan;
        do {
            System.out.print("Pilihan paket adalah (1-4): ");
            pilihanMakanan = jawab.nextInt();
            if (pilihanMakanan >= 1 && pilihanMakanan <= 3) {
                if (pilihanMakanan == 1) {
                    hargaMakanan += 4000;
                    selectedMakanan.add("Nasi");
                } else if (pilihanMakanan == 2) {
                    hargaMakanan += 8000;
                    selectedMakanan.add("Ayam");
                } else if (pilihanMakanan == 3) {
                    hargaMakanan += 9000;
                    selectedMakanan.add("Soto");
                }
            }
        } while (pilihanMakanan != 4);
    }

    public static void MenuMinuman() {
        System.out.println("");
        System.out.println("Menu Minuman");
        System.out.println("============");
        System.out.println("1. Teh tawar");
        System.out.println("2. Teh manis");
        System.out.println("3. Jus");
        System.out.println("4. Selesai Memilih Minuman");
        System.out.println("-------------");

        int pilihanMinuman;
        do {
            System.out.print("Pilihan paket adalah (1-4): ");
            pilihanMinuman = jawab.nextInt();
            if (pilihanMinuman >= 1 && pilihanMinuman <= 3) {
                if (pilihanMinuman == 1) {
                    hargaMinuman += 4000;
                    selectedMinuman.add("Teh tawar");
                } else if (pilihanMinuman == 2) {
                    hargaMinuman += 8000;
                    selectedMinuman.add("Teh manis");
                } else if (pilihanMinuman == 3) {
                    hargaMinuman += 9000;
                    selectedMinuman.add("Jus");
                }
            }
        } while (pilihanMinuman != 4);
    }

    public static void Bayar() {
        System.out.println("");
        System.out.println("Makanan yang dipesan:");
        for (String makanan : selectedMakanan) {
            System.out.println("- " + makanan);
        }

        System.out.println("Minuman yang dipesan:");
        for (String minuman : selectedMinuman) {
            System.out.println("- " + minuman);
        }

        int totalBayar = hargaMakanan + hargaMinuman;
        System.out.println("");
        System.out.println("Total yang dibayar = Rp. " + totalBayar);
        sudahBayar = true;


    }

    public static void PeriksaJawaban(int pilihan) {
        switch (pilihan) {
            case 1:
                MenuMakanan();
                MainMenu();
                break;
            case 2:
                MenuMinuman();
                MainMenu();
                break;
            case 3:
                Bayar();
                MainMenu();
                break;
            case 4:
                if (!sudahBayar)
                {
                    System.out.println("Anda harus membayar terlebih dahulu.");
                    MainMenu();
                }
                else {
                    System.out.println("TerimaKasih untuk kunjungan anda , silahkan datang kembali");
                }
                break;
            default:
                break;
        }
    }


    public static void MainMenu() {
        System.out.println("");
        System.out.println("RESTORAN OOP");
        System.out.println("============");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Bayar");
        System.out.println("4. Selesai");
        System.out.println("------------");
        System.out.print("Pilihan anda adalah: ");

        int jawaban = jawab.nextInt();
        PeriksaJawaban(jawaban);
    }

    public static void main(String[] args) {
        MainMenu();
    }
}