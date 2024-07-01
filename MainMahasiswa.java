public class MainMahasiswa {
   public static void main(String[] args) 
   { 
      MahasiswaLat2a mhs1 = new MahasiswaLat2a();
      mhs1.setNim("0012");
      mhs1.setNama("Frisca");
      mhs1.setProdi("Informatika");
      mhs1.setSks(12);
      mhs1.setIpk(4.0);
      System.out.println("DATA MAHASISWA");
      
      System.out.println("Nim = "+ mhs1.getNim());
      System.out.println("Nama = "+ mhs1.getNama());
      System.out.println("Prodi = "+ mhs1.getProdi());
      System.out.println("Sks = "+ mhs1.getSks());
      System.out.println("Ipk = "+ mhs1.getIpk());
    }
}