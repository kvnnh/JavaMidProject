
public class Manager extends Pegawai{
	
	private double gajiManager;
	
	public Manager(String kodeKaryawan, String namaKaryawan, String jenisKelamin, String jabatan, double gajiManager) {
		super(kodeKaryawan, namaKaryawan, jenisKelamin, jabatan);
		this.gajiManager = gajiManager;
	}

	public double getGaji() {
		return gajiManager;
	}

	public void setGaji(double gajiManager) {
		this.gajiManager = gajiManager;
	}
}
