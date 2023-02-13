
public class superVisor extends Pegawai{
	private double gajiSupervisor;

	public superVisor(String kodeKaryawan, String namaKaryawan, String jenisKelamin, String jabatan, double gajiSupervisor) {
		super(kodeKaryawan, namaKaryawan, jenisKelamin, jabatan);
		this.gajiSupervisor = gajiSupervisor;
	}

	public double getGaji() {
		return gajiSupervisor;
	}

	public void setGaji(double gajiSupervisor) {
		this.gajiSupervisor = gajiSupervisor;
	}
}
