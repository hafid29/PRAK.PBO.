package Mobil;
public class Mobil {
	private String merek;
	private int kecepatan;
	private int gear;
        private String warna;
        private String jenis;

	public void setMerek (String newValue)
	{
		merek = newValue;
	}
	public void setWarna (String newValue)
	{
		warna = newValue;
	}
        public void setJenis (String newValue)
	{
		jenis = newValue;
	}
	public void gantiGear(int newValue)
	{
		gear = newValue;
	}
	public void tambahKecepatan (int increment)
	{
		kecepatan = kecepatan + increment;
	}
	public void rem(int decrement)
	{
		kecepatan = kecepatan - decrement;
	}
	public void cetakStatus()
	{
		System.out.println("Merek : " + merek);
		System.out.println("Kecepatan : " + kecepatan);
		System.out.println("Gear : " + gear);
                System.out.println("Warna : " + warna);
                System.out.println("Jenis : " + jenis);
                
	}

}
