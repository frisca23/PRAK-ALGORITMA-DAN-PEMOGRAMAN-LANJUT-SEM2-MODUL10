class  MahasiswaLat1
{
  String nim;
  String nama;
  String prodi;
  double ipk;

  public  void setMhs(String nim,String nama,String prodi,double ipk)
  {
    this.nim=nim;
    this.nama=nama;
    this.prodi=prodi;
    this.ipk=ipk;
  }
  public  void tampil()
  {
    System.out.println("Nim = "+nim);
    System.out.println("Nama = "+nama);
    System.out.println("Prodi = "+prodi);
    System.out.println("IPK = "+ipk);
  }
  public static void main(String[] args)
  {
    MahasiswaLat1 mhs = new MahasiswaLat1();
    mhs.setMhs("0012","Frisca","Informatika", 4.0);
    mhs.tampil();
  }
}
