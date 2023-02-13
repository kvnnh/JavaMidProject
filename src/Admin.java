
public class Admin extends Pegawai{

	private double gajiAdmin;

	public Admin(String kodeKaryawan, String namaKaryawan, String jenisKelamin, String jabatan, double gajiAdmin) {
		super(kodeKaryawan, namaKaryawan, jenisKelamin, jabatan);
		this.gajiAdmin = gajiAdmin;
	}

	public double getGaji() {
		return gajiAdmin;
	}

	public void setGaji(double gajiAdmin) {
		this.gajiAdmin = gajiAdmin;
	}
}
