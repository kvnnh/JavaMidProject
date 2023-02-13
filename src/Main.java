import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Main {

	Scanner scan = new Scanner(System.in);
	Vector<Pegawai> employee = new Vector<Pegawai>();
	public Main(){
		int pilihan;
		do {
			System.out.println("\n==================================");
			System.out.println("|             MENU:              |");
			System.out.println("==================================");
			System.out.println("1. Insert data karyawan");
			System.out.println("2. View data karyawan");
			System.out.println("3. Update data karyawan");
			System.out.println("4. Delete data karyawan");
			System.out.println("5. Finish");
			System.out.print("Pilihan: ");
			try {
				pilihan = scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				pilihan = -1;
				scan.nextLine();
				System.out.println("Tolong input angka sesuai dengan menu!");
				continue;
			}
				switch (pilihan) {
					case 1:
						insertData();
						 break;
					case 2:
						if(employee.size()>0) {
							viewData();
						}else {
							System.out.println("Data karyawan kosong");
							System.out.print("ENTER to return"); scan.nextLine();
						}	
						break;
					case 3:
						if(employee.size()>0) {
							updateData();
						}else {
							System.out.println("Tidak ada data karyawan yang bisa diupdate");
							System.out.print("ENTER to return"); scan.nextLine();
						}
						break;
					case 4:
						if(employee.size()>0) {
							deleteData();
						}else {
							System.out.println("Tidak ada data karyawan yang bisa dihapus");
							System.out.print("ENTER to return"); scan.nextLine();
						}
						break;
					case 5:
						System.out.println("=================================");
						System.out.println("=         Terima kasih          =");
						System.out.println("=================================");
						break;
					default:
						System.out.println("Tolong input angka sesuai dengan menu!");
						System.out.print("ENTER to return"); scan.nextLine();
						break;
				}
		} while (pilihan != 5);
	}
	
	
	public void insertData() {
		formData(1);
	}
	
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int LENGTH = 4;
	
	public void formData(int i) {
		String kode, nama, jenisKelamin, jabatan;
		double gaji;
		if(i==0) {
		    while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        nama = scan.nextLine();
		        if (nama.length() >= 3) {
		            break;
		        }
		        System.out.println("\n=================================");
		        System.out.println("= Nama karyawan minimal 3 huruf =");
		        System.out.println("=================================\n");
		    }
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
		        jenisKelamin = scan.nextLine();
		        if (jenisKelamin.equals("Laki-laki") || jenisKelamin.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("\n================================================");
		        System.out.println("= Jenis kelamin harus Laki-laki atau Perempuan =");
		        System.out.println("================================================\n");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        jabatan = scan.nextLine();
		        if (jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin")) {
		            break;
		        }
		        System.out.println("\n=================================================");
		        System.out.println("= Jabatan harus Manager, Supervisor, atau Admin =");
		        System.out.println("=================================================\n");
		    }
		}
		else if(i==-1){
		    while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        nama = scan.nextLine();
		        if (nama.length() >= 3) {
		            break;
		        }
		        System.out.println("\n=================================");
		        System.out.println("= Nama karyawan minimal 3 huruf =");
		        System.out.println("=================================\n");
		    }
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
		        jenisKelamin = scan.nextLine();
		        if (jenisKelamin.equals("Laki-laki") || jenisKelamin.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("\n================================================");
		        System.out.println("= Jenis kelamin harus Laki-laki atau Perempuan =");
		        System.out.println("================================================\n");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        jabatan = scan.nextLine();
		        if (jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin")) {
		            break;
		        }
		        System.out.println("\n=================================================");
		        System.out.println("= Jabatan harus Manager, Supervisor, atau Admin =");
		        System.out.println("=================================================\n");
		    }
		    
	    	int jumlahManager = 0;
	    	int jumlahSupervisor = 0;
	    	int jumlahAdmin = 0;
	    	
	    	if (jabatan.equals("Manager")) {
	    		  jumlahManager++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int j = 0; j < 2; j++) {
	    		    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int j = 0; j < LENGTH; j++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  kode = sb.toString();

	    		  gaji = 8000000;

	    		  if(jumlahManager/3 !=0) {
	    		    double bonus = 0.075*gaji;
	    		    gaji += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(jumlahManager/3)) + " karyawan Manager dengan id ");
	    		    for(int z = 0 ; z < (3*(jumlahManager/3))  ; z++) {
	    		      String temp = employee.get(z).getKodeKaryawan();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  Manager m = new Manager(kode, nama, jenisKelamin, jabatan, gaji);
	    		  employee.add(m);
	    		  System.out.println("Berhasil menambahkan karyawan dengan id " + kode);
	    		  System.out.print("ENTER to return"); scan.nextLine();
	    		} 
	    	else if(jabatan.equals("Supervisor")) {
	    		  jumlahSupervisor++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int j = 0; j < 2; j++) {
	    		    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int j = 0; j < LENGTH; j++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  kode = sb.toString();

	    		  gaji = 6000000;

	    		  if(jumlahSupervisor/3 != 0) {
	    		    double bonus = 0.075*gaji;
	    		    gaji += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(jumlahSupervisor/3)) + " karyawan Supervisor dengan id ");
	    		    for(int z = 0 ; z < (3*(jumlahSupervisor/3))  ; z++) {
	    		      String temp = employee.get(z).getKodeKaryawan();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  superVisor s = new superVisor(kode, nama, jenisKelamin, jabatan, gaji);
	    		  employee.add(s);
	    		  System.out.println("Berhasil menambahkan karyawan dengan id " + kode);
	    		  System.out.print("ENTER to return"); scan.nextLine();
	    		}
	    	
		    else if(jabatan.equals("Admin")) {
		    	  jumlahAdmin++;
		    	  Random random = new Random();
		    	  StringBuilder sb = new StringBuilder();
		    	  for (int j = 0; j < 2; j++) {
		    	    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		    	  }
		    	  sb.append("-");
		    	  for (int j = 0; j < LENGTH; j++) {
		    	    sb.append(random.nextInt(10));
		    	  }
		    	  kode = sb.toString();

		    	  gaji = 4000000;
		    	  
		    	  int jumlahAdminSebelumnya = jumlahAdmin - 1;
		    	  if((int)jumlahAdminSebelumnya/3 != 0) {
		    	    double bonus = 0.05*gaji;
		    	    gaji += bonus;
		    	    
		    	    int indexAwal = jumlahAdminSebelumnya - (3*(jumlahAdminSebelumnya/3));
		    	    System.out.print("Bonus sebesar 5% telah diberikan pada dengan id ");
		    	    for(int z = indexAwal ; z < jumlahAdminSebelumnya  ; z++) {
		    	      String temp = employee.get(z).getKodeKaryawan();
		    	      System.out.print(temp + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	  
		    	  Admin a = new Admin(kode,nama,jenisKelamin,jabatan,gaji);
		    	  employee.add(a);
		    	  System.out.println("Berhasil menambahkan karyawan dengan id " + kode);
	    		  System.out.print("ENTER to return"); scan.nextLine();
		    	}
		}
		else {
			while (true) {
		        System.out.print("Input nama karyawan [>= 3]: ");
		        nama = scan.nextLine();
		        if (nama.length() >= 3) {
		            break;
		        }
		        System.out.println("\n===============================================");
		        System.out.println("| Nama karyawan minimal terdiri dari 3 huruf! |");
		        System.out.println("===============================================\n");
		    }
		    while (true) {
		        System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case Sensitive): ");
		        jenisKelamin = scan.nextLine();
		        if (jenisKelamin.equals("Laki-laki") || jenisKelamin.equals("Perempuan")) {
		            break;
		        }
		        System.out.println("\n=================================================");
		        System.out.println("| Jenis kelamin harus Laki-laki atau Perempuan! |");
		        System.out.println("=================================================\n");
		    }
		    while (true) {
		        System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case Sensitive): ");
		        jabatan = scan.nextLine();
		        if (jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin")) {
		            break;
		        }
		        System.out.println("\n=================================================");
		        System.out.println("| Jabatan harus Manager, Supervisor, atau Admin!|");
		        System.out.println("=================================================\n");
		    }
		    
	    	int jumlahManager = 0;
	    	int jumlahSupervisor = 0;
	    	int jumlahAdmin = 0;
	    	
	    	if (jabatan.equals("Manager")) {
	    		  jumlahManager++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int j = 0; j < 2; j++) {
	    		    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int j = 0; j < LENGTH; j++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  kode = sb.toString();

	    		  gaji = 8000000;

	    		  if(jumlahManager/3 !=0) {
	    		    double bonus = 0.075*gaji;
	    		    gaji += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(jumlahManager/3)) + " karyawan Manager dengan id ");
	    		    for(int z = 0 ; z < (3*(jumlahManager/3))  ; z++) {
	    		      String temp = employee.get(z).getKodeKaryawan();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  Manager m = new Manager(kode, nama, jenisKelamin, jabatan, gaji);
	    		  employee.add(m);
	    		} 
	    	else if(jabatan.equals("Supervisor")) {
	    		  jumlahSupervisor++;
	    		  Random random = new Random();
	    		  StringBuilder sb = new StringBuilder();
	    		  for (int j = 0; j < 2; j++) {
	    		    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
	    		  }
	    		  sb.append("-");
	    		  for (int j = 0; j < LENGTH; j++) {
	    		    sb.append(random.nextInt(10));
	    		  }
	    		  kode = sb.toString();

	    		  gaji = 6000000;

	    		  if(jumlahSupervisor/3 != 0) {
	    		    double bonus = 0.075*gaji;
	    		    gaji += bonus;

	    		    System.out.println("Bonus sebesar 7.5% telah diberikan pada " + (3*(jumlahSupervisor/3)) + " karyawan Supervisor dengan id ");
	    		    for(int z = 0 ; z < (3*(jumlahSupervisor/3))  ; z++) {
	    		      String temp = employee.get(z).getKodeKaryawan();
	    		      System.out.print(temp + " ");
	    		    }
	    		    System.out.println();
	    		  }

	    		  superVisor s = new superVisor(kode, nama, jenisKelamin, jabatan, gaji);
	    		  employee.add(s);
	    		}
	    	
		    else if(jabatan.equals("Admin")) {
		    	  jumlahAdmin++;
		    	  Random random = new Random();
		    	  StringBuilder sb = new StringBuilder();
		    	  for (int j = 0; j < 2; j++) {
		    	    sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		    	  }
		    	  sb.append("-");
		    	  for (int j = 0; j < LENGTH; j++) {
		    	    sb.append(random.nextInt(10));
		    	  }
		    	  kode = sb.toString();

		    	  gaji = 4000000;
		    	  
		    	  int jumlahAdminSebelumnya = jumlahAdmin - 1;
		    	  if((int)jumlahAdminSebelumnya/3 != 0) {
		    	    double bonus = 0.05*gaji;
		    	    gaji += bonus;
		    	    
		    	    int indexAwal = jumlahAdminSebelumnya - (3*(jumlahAdminSebelumnya/3));
		    	    System.out.print("Bonus sebesar 5% telah diberikan pada dengan id ");
		    	    for(int z = indexAwal ; z < jumlahAdminSebelumnya  ; z++) {
		    	      String temp = employee.get(z).getKodeKaryawan();
		    	      System.out.print(temp + " ");
		    	    }
		    	    System.out.println();
		    	  }
		    	  
		    	  Admin a = new Admin(kode,nama,jenisKelamin,jabatan,gaji);
		    	  employee.add(a);
		    	}
		}
	}

	public void viewData() {
		 int nomor = 1;
		    int kodeMaxLength = 15;
		    int namaMaxLength = 15;
		    int jenisMaxLength = 15;
		    int jabatanMaxLength = 13;
		    int gajiMaxLength = 7;
		    
		    Collections.sort(employee, new Comparator<Pegawai>() {
		        @Override
		        public int compare(Pegawai pegawai1, Pegawai pegawai2) {
		            return pegawai1.getNamaKaryawan().compareTo(pegawai2.getNamaKaryawan());
		        }
		    });
		    
		    System.out.println("\n------------------------------------------------------------------------------------");
		    System.out.println("| No | Kode Karyawan  | Nama Karyawan  | Jenis Kelamin  |    Jabatan   |    Gaji   |");
		    System.out.println(  "------------------------------------------------------------------------------------");
		    for (Pegawai pegawai2 : employee) {
		        if (pegawai2 instanceof Manager) {
		            Manager x = (Manager) pegawai2;
		            System.out.printf("| %2d ", nomor++);
		            System.out.print("| " + String.format("%1$-" + kodeMaxLength + "s", x.getKodeKaryawan()));
		            System.out.print("| " + String.format("%1$-" + namaMaxLength + "s", x.getNamaKaryawan()));
		            System.out.print("| " + String.format("%1$-" + jenisMaxLength + "s", x.getJenisKelamin()));
		            System.out.print("| " + String.format("%1$-" + jabatanMaxLength + "s", x.getJabatan()));
		            System.out.println("| " + String.format("%1$-" + gajiMaxLength + "s", x.getGaji()) + " |");
			}
			else if(pegawai2 instanceof superVisor){
				superVisor x = (superVisor) pegawai2;
				System.out.printf("| %2d ", nomor++);
	            System.out.print("| " + String.format("%1$-" + kodeMaxLength + "s", x.getKodeKaryawan()));
	            System.out.print("| " + String.format("%1$-" + namaMaxLength + "s", x.getNamaKaryawan()));
	            System.out.print("| " + String.format("%1$-" + jenisMaxLength + "s", x.getJenisKelamin()));
	            System.out.print("| " + String.format("%1$-" + jabatanMaxLength + "s", x.getJabatan()));
	            System.out.println("| " + String.format("%1$-" + gajiMaxLength + "s", x.getGaji()) + " |");
			}
			else {
				Admin x = (Admin) pegawai2;
				System.out.printf("| %2d ", nomor++);
	            System.out.print("| " + String.format("%1$-" + kodeMaxLength + "s", x.getKodeKaryawan()));
	            System.out.print("| " + String.format("%1$-" + namaMaxLength + "s", x.getNamaKaryawan()));
	            System.out.print("| " + String.format("%1$-" + jenisMaxLength + "s", x.getJenisKelamin()));
	            System.out.print("| " + String.format("%1$-" + jabatanMaxLength + "s", x.getJabatan()));
	            System.out.println("| " + String.format("%1$-" + gajiMaxLength + "s", x.getGaji()) + " |");
			}
			    System.out.println(  "------------------------------------------------------------------------------------");
			    		}
	}
	
	public void deleteData() {
		viewData();
		int pilihan;
		do {
			System.out.print("Input nomor urutan karyawan yang ingin dihapus:");
			pilihan = scan.nextInt();
		}while(pilihan < 1 || pilihan > employee.size());
		
		String temp = employee.get(pilihan-1).getKodeKaryawan();
		employee.remove(pilihan-1);
		System.out.println("Karyawan dengan kode " + temp + " berhasil dihapus");
		System.out.print("ENTER to return"); scan.nextLine();
	}
	
	public void updateData() {
		viewData();
		int pilihan;
		do {
			System.out.print("Input nomor urutan karyawan yang ingin diupdate:");
			pilihan = scan.nextInt();
		}while(pilihan < 0 || pilihan > employee.size());	
		
		if (pilihan == 0) {
			scan.nextLine();
			formData(0);
			System.out.println("Data tidak berhasil di update dan tetap menggunakan data yang lama");
			System.out.print("ENTER to return"); scan.nextLine();
		}
		else {
			String temp = employee.get(pilihan-1).getKodeKaryawan();
			employee.remove(pilihan-1);
			scan.nextLine();
			formData(2); 
			System.out.println("Berhasil mengupdate karyawan dengan id " + temp);
			System.out.print("ENTER to return"); scan.nextLine();
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}