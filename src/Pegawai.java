
public abstract class Pegawai {
 
	private String kodeKaryawan, namaKaryawan, jenisKelamin, jabatan;

	public Pegawai(String kodeKaryawan, String namaKaryawan, String jenisKelamin, String jabatan) {
		super();
		this.kodeKaryawan = kodeKaryawan;
		this.namaKaryawan = namaKaryawan;
		this.jenisKelamin = jenisKelamin;
		this.jabatan = jabatan;
	}
	
	public String getKodeKaryawan() {
		return kodeKaryawan;
	}

	public void setKodeKaryawan(String kodeKaryawan) {
		this.kodeKaryawan = kodeKaryawan;
	}

	public String getNamaKaryawan() {
		return namaKaryawan;
	}

	public void setNamaKaryawan(String namaKaryawan) {
		this.namaKaryawan = namaKaryawan;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
}
