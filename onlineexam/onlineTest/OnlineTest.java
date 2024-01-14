/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;


class OnlineTest extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JLabel l,log,pass;
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2,b3;
	JButton kode1,kode2,kode3,kode4;
	ButtonGroup bg;
	JLabel nama,pilKode;
	int count=0,current=0,x=1,y=1,now=0;
	private String User;
	private String Pass;
	int m[]=new int[10];	
	OnlineTest(String s)
	{
		super(s);
		log = new JLabel();
		pass = new JLabel();
		tf1=new JTextField();
		tf2=new JTextField();
		b3=new JButton("Submit");
		b3.addActionListener(this);
		add(log);
		add(pass);
		add(tf1);
		add(tf2);
		add(b3);
		login();
		log.setBounds(30,40,450,20);
		pass.setBounds(30,100,450,20);
		tf1.setBounds(50,60,100,20);
		tf2.setBounds(50,120,100,20);
		b3.setBounds(230,240,100,30);
		b3.setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);

	}

	void login(){
		log.setText("Masukkan Username : ");
		User = tf1.getText();
		pass.setText("Masukkan Password : ");
		Pass = tf2.getText();
	}

	public void actionPerformed(ActionEvent e)
	{
		login();
		if(e.getSource()==b3){
			log.setVisible(false);
			pass.setVisible(false);
			tf1.setVisible(false);
			tf2.setVisible(false);
			b3.setVisible(false);
			nama=new JLabel("Selamat Datang, " +User);
			add(nama);
			nama.setBounds(30,10,450,20);
			pilKode=new JLabel("Silahkan Pilih Mata Pelajaran : ");
			add(pilKode);
			pilKode.setBounds(30,30,450,20);
			kode1=new JButton("Pemrograman Web");
			kode2=new JButton("Dasar Pemrograman");
			kode3=new JButton("Dasar Sistem Komputer");
			kode4=new JButton("Basis Data");
			kode1.addActionListener(this);
			kode2.addActionListener(this);
			kode3.addActionListener(this);
			kode4.addActionListener(this);
			add(kode1);add(kode2);add(kode3);add(kode4);
			kode1.setBounds(30,50,200,30);
			kode2.setBounds(30,90,200,30);
			kode3.setBounds(30,130,200,30);
			kode4.setBounds(30,170,200,30);
		}
		if(e.getSource()==kode1){
			nama.setVisible(false);
			pilKode.setVisible(false);
			kode1.setVisible(false);
			kode2.setVisible(false);
			kode3.setVisible(false);
			kode4.setVisible(false);
			l=new JLabel();
			add(l);
			bg=new ButtonGroup();
			for(int i=0;i<5;i++)
			{
				jb[i]=new JRadioButton();
				add(jb[i]);
				bg.add(jb[i]);
			}

			b1=new JButton("Next");
			b2=new JButton("Bookmark");
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1);add(b2);
			pweb();
			l.setBounds(30,40,450,20);
			jb[0].setBounds(50,80,140,20);
			jb[1].setBounds(50,110,140,20);
			jb[2].setBounds(50,140,140,20);
			b1.setBounds(100,240,100,30);
			b2.setBounds(270,240,100,30);
			b1.setBackground(Color.GRAY);
			b2.setBackground(Color.green);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setLocation(250,100);
			setVisible(true);
			setSize(600,350);
		}

		if(e.getSource()==kode2){
			nama.setVisible(false);
			pilKode.setVisible(false);
			kode1.setVisible(false);
			kode2.setVisible(false);
			kode3.setVisible(false);
			kode4.setVisible(false);
			l=new JLabel();
			add(l);
			bg=new ButtonGroup();
			for(int i=0;i<5;i++)
			{
				jb[i]=new JRadioButton();
				add(jb[i]);
				bg.add(jb[i]);
			}
			b1=new JButton("Next");
			b2=new JButton("Bookmark");
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1);add(b2);
			ddp();
			l.setBounds(30,40,450,20);
			jb[0].setBounds(50,80,140,20);
			jb[1].setBounds(50,110,140,20);
			jb[2].setBounds(50,140,140,20);
			b1.setBounds(100,240,100,30);
			b2.setBounds(270,240,100,30);
			b1.setBackground(Color.GRAY);
			b2.setBackground(Color.green);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setLocation(250,100);
			setVisible(true);
			setSize(600,350);
		}

		if(e.getSource()==kode3){
			nama.setVisible(false);
			pilKode.setVisible(false);
			kode1.setVisible(false);
			kode2.setVisible(false);
			kode3.setVisible(false);
			kode4.setVisible(false);
			l=new JLabel();
			add(l);
			bg=new ButtonGroup();
			for(int i=0;i<5;i++)
			{
				jb[i]=new JRadioButton();
				add(jb[i]);
				bg.add(jb[i]);
			}
			b1=new JButton("Next");
			b2=new JButton("Bookmark");
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1);add(b2);
			dsk();
			l.setBounds(30,40,450,20);
			jb[0].setBounds(50,80,140,20);
			jb[1].setBounds(50,110,140,20);
			jb[2].setBounds(50,140,140,20);
			b1.setBounds(100,240,100,30);
			b2.setBounds(270,240,100,30);
			b1.setBackground(Color.GRAY);
			b2.setBackground(Color.green);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setLocation(250,100);
			setVisible(true);
			setSize(600,350);
		}

		if(e.getSource()==kode4){
			nama.setVisible(false);
			pilKode.setVisible(false);
			kode1.setVisible(false);
			kode2.setVisible(false);
			kode3.setVisible(false);
			kode4.setVisible(false);
			l=new JLabel();
			add(l);
			bg=new ButtonGroup();
			for(int i=0;i<5;i++)
			{
				jb[i]=new JRadioButton();
				add(jb[i]);
				bg.add(jb[i]);
			}
			b1=new JButton("Next");
			b2=new JButton("Bookmark");
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b1);add(b2);
			basdat();
			l.setBounds(30,40,850,20);
			jb[0].setBounds(50,80,800,20);
			jb[1].setBounds(50,110,800,20);
			jb[2].setBounds(50,140,800,20);
			b1.setBounds(100,240,100,30);
			b2.setBounds(270,240,100,30);
			b1.setBackground(Color.GRAY);
			b2.setBackground(Color.green);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			setLocation(250,100);
			setVisible(true);
			setSize(800,350);
		}


		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current= current+1;


			if(kode1.isEnabled())
				pweb();
			if(kode2.isEnabled())
				ddp();
			else if(kode3.isEnabled())
				dsk();

			if(current==9)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;

			if(kode1.isEnabled())
				pweb();
			else if(kode2.isEnabled())
				ddp();
			else if(kode3.isEnabled())
				dsk();
			else if(kode4.isEnabled())
				basdat();

			if(current==9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];

			if(kode1.isEnabled())
				pweb();
			else if(kode2.isEnabled())
				ddp();
			else if(kode3.isEnabled())
				dsk();
			else if(kode4.isEnabled())
				basdat();

			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			JOptionPane.showMessageDialog(this,User + " Jawaban benar anda ="+count);
			System.exit(0);
		}
	}
	void pweb() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("1. Apa kepanjangan dari HTML?");
			jb[0].setText("Hyperlink Text Markup Language");
			jb[1].setText("HyperText Markup Language");
			jb[2].setText("High-Level Text Markup Language");
			jb[3].setText("Hypertextual Markup Language");
		}
		if (current == 1) {
			l.setText("2. Tag mana yang digunakan untuk menambahkan gambar dalam HTML?");
			jb[0].setText("<img>");
			jb[1].setText("<pic>");
			jb[2].setText("<image>");
			jb[3].setText("<imagefile>");
		}
		if (current == 2) {
			l.setText("3. CSS digunakan untuk apa dalam pengembangan web?");
			jb[0].setText("Menyimpan data pengguna");
			jb[1].setText("Menyusun struktur dokumen HTML");
			jb[2].setText("Mempercantik tata letak dan desain halaman web");
			jb[3].setText("Mengatur gaya presentasi pada halaman web");
		}
		if (current == 3) {
			l.setText("4. Apa peran JavaScript dalam pemrograman web?");
			jb[0].setText("Menyusun konten halaman web");
			jb[1].setText("Mengatur gaya dan tata letak");
			jb[2].setText("Menambahkan interaktivitas dan dinamisme pada halaman web");
			jb[3].setText("Mengolah data di server");
		}
		if (current == 4) {
			l.setText("5. Apa yang dimaksud dengan HTTP?");
			jb[0].setText("HyperText Transfer Protocol");
			jb[1].setText("HyperText Text Protocol");
			jb[2].setText("HyperTransfer Text Protocol");
			jb[3].setText("HyperText Transport Protocol");
		}
		if (current == 5) {
			l.setText("6. Tag mana yang digunakan untuk membuat hyperlink dalam HTML?");
			jb[0].setText("<link>");
			jb[1].setText("<a>");
			jb[2].setText("<hlink>");
			jb[3].setText("if");
		}
		if (current == 6) {
			l.setText("7. Apa tujuan penggunaan Bootstrap dalam pengembangan web?");
			jb[0].setText("Membuat animasi halaman");
			jb[1].setText("Mempermudah desain responsif dan mobile-friendly");
			jb[2].setText("Menyembunyikan kode sumber");
			jb[3].setText("Mempercepat waktu pemuatan halaman");
		}
		if (current == 7) {
			l.setText("8. Apa yang dimaksud dengan AJAX dalam konteks pemrograman web?");
			jb[0].setText("Asynchronous JavaScript and XML");
			jb[1].setText("Advanced JavaScript and XML");
			jb[2].setText("Asynchronous JSON and XHTML");
			jb[3].setText("Ajax JavaScript and XML");
		}
		if (current == 8) {
			l.setText("9. Apa fungsi dari tag <head> dalam HTML?");
			jb[0].setText("Menyimpan konten utama halaman");
			jb[1].setText("Menyimpan tautan stylesheet dan meta-informasi");
			jb[2].setText("Menyusun bagian bawah halaman");
			jb[3].setText("Menyimpan elemen-elemen JavaScript");
		}
		if (current == 9) {
			l.setText("10. Mana yang bukan termasuk dalam jenis-jenis penyimpanan lokal di sisi klien?");
			jb[0].setText("Cookies");
			jb[1].setText("Local Storage");
			jb[2].setText("Session Storage");
			jb[3].setText("Cache Storage");
		}
		l.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	void ddp() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("1. Apa yang dimaksud dengan variabel dalam pemrograman?");
			jb[0].setText("Sebuah pernyataan");
			jb[1].setText("Sebuah nilai tetap");
			jb[2].setText("Sebuah lokasi penyimpanan yang memiliki nama");
			jb[3].setText("Sebuah parameter fungsi");
		}
		if (current == 1) {
			l.setText("2. Apa itu \"loop\" dalam pemrograman?");
			jb[0].setText("Perulangan");
			jb[1].setText("Pengkondisian");
			jb[2].setText("Function");
			jb[3].setText("Procedure");
		}
		if (current == 2) {
			l.setText("3. Apa tujuan dari statement if dalam pemrograman?");
			jb[0].setText("Mengulang sebuah blok kode");
			jb[1].setText("Menetapkan nilai pada variabel");
			jb[2].setText("Menentukan apakah suatu kondisi benar atau salah");
			jb[3].setText("Menjalankan blok kode berdasarkan kondisi");
		}
		if (current == 3) {
			l.setText("4. Apa yang dimaksud dengan fungsi dalam pemrograman?");
			jb[0].setText("Sebuah pernyataan yang selalu benar");
			jb[1].setText("Sebuah blok kode yang dapat dipanggil dan digunakan kembali");
			jb[2].setText("Sebuah komentar dalam kode");
			jb[3].setText("Sebuah algoritma pencarian");
		}
		if (current == 4) {
			l.setText("5. Apa fungsi dari operator aritmatika seperti +, -, , / dalam pemrograman?");
			jb[0].setText("Memeriksa kesetaraan");
			jb[1].setText("Melakukan operasi matematika");
			jb[2].setText("Memeriksa kondisi");
			jb[3].setText("Memanipulasi string");
		}
		if (current == 5) {
			l.setText("6. Apa yang dimaksud dengan array dalam pemrograman?");
			jb[0].setText("Sebuah algoritma pencarian");
			jb[1].setText("Sebuah tipe data yang dapat menyimpan banyak nilai dalam satu variabel");
			jb[2].setText("Sebuah bentuk struktur pengulangan");
			jb[3].setText("Sebuah metode pengurutan");
		}
		if (current == 6) {
			l.setText("7. Apa itu syntax error dalam pemrograman?");
			jb[0].setText("Kesalahan dalam logika program");
			jb[1].setText("Kesalahan dalam penulisan kode");
			jb[2].setText("Kesalahan dalam manajemen memori");
			jb[3].setText("Kesalahan dalam struktur data");
		}
		if (current == 7) {
			l.setText("8. Apa yang dimaksud dengan loop for dalam pemrograman?");
			jb[0].setText("Sebuah pernyataan untuk menghentikan eksekusi program");
			jb[1].setText("Sebuah pernyataan untuk mengulangi blok kode sejumlah kali");
			jb[2].setText("Sebuah jenis tipe data");
			jb[3].setText("Sebuah pernyataan untuk melakukan iterasi");
		}
		if (current == 8) {
			l.setText("9. Apa yang dimaksud dengan string dalam pemrograman?");
			jb[0].setText("Sebuah variabel numerik");
			jb[1].setText("Sebuah fungsi matematika");
			jb[2].setText("Sebuah tipe data yang menyimpan teks");
			jb[3].setText("Sebuah tipe data yang menyimpan karakter");
		}
		if (current == 9) {
			l.setText("10. Apa yang dimaksud dengan debugging dalam pemrograman?");
			jb[0].setText("Proses membuat program yang lebih cepat");
			jb[1].setText("Proses mengidentifikasi dan memperbaiki kesalahan dalam kode");
			jb[2].setText("Proses menyimpan versi program yang stabil");
			jb[3].setText("Proses menguji kecepatan program");
		}

		l.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	void dsk() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("1. Apa yang dimaksud dengan CPU dalam sistem komputer?");
			jb[0].setText("Central Processing Unit");
			jb[1].setText("Central Program Unit");
			jb[2].setText("Computer Processing Unit");
			jb[3].setText("Central Power Unit");
		}
		if (current == 1) {
			l.setText("2. Apa fungsi dari RAM dalam sebuah komputer?");
			jb[0].setText("Menyimpan data secara permanen");
			jb[1].setText("Menyimpan instruksi program yang sedang dieksekusi");
			jb[2].setText("Menyimpan file sistem operasi");
			jb[3].setText("Menyimpan data sementara untuk aplikasi");
		}
		if (current == 2) {
			l.setText("3. Apa perbedaan antara hardware dan software?");
			jb[0].setText("Hardware adalah komponen fisik, software adalah instruksi yang dieksekusi");
			jb[1].setText("Hardware adalah instruksi, software adalah komponen fisik");
			jb[2].setText("Keduanya sama");
			jb[3].setText("Hardware dan software tidak terkait");
		}
		if (current == 3) {
			l.setText("4. Apa yang dimaksud dengan sistem bilangan biner?");
			jb[0].setText("Sistem bilangan basis 8");
			jb[1].setText("Sistem bilangan basis 2");
			jb[2].setText("Sistem bilangan basis 10");
			jb[3].setText("Sistem bilangan basis 16");
		}
		if (current == 4) {
			l.setText("5. Apa fungsi dari hard disk dalam sistem komputer?");
			jb[0].setText("Menyimpan data secara sementara");
			jb[1].setText("Menyimpan data secara permanen");
			jb[2].setText("Menyimpan program saat komputer mati");
			jb[3].setText("Menyimpan file sistem operasi");
		}
		if (current == 5) {
			l.setText("6. Apa yang dimaksud dengan input pada sistem komputer?");
			jb[0].setText("Proses penyimpanan data");
			jb[1].setText("Proses mengeluarkan data");
			jb[2].setText("Proses memasukkan data ke dalam komputer");
			jb[3].setText("Proses pengolahan data");
		}
		if (current == 6) {
			l.setText("7. Apa fungsi dari motherboard dalam komputer?");
			jb[0].setText("Menyimpan data");
			jb[1].setText("Menghubungkan semua komponen utama");
			jb[2].setText("Menyediakan daya listrik");
			jb[3].setText("Mengontrol suhu sistem");
		}
		if (current == 7) {
			l.setText("8. Apa yang dimaksud dengan sistem operasi?");
			jb[0].setText("Program yang mengatur dan mengontrol penggunaan perangkat keras");
			jb[1].setText("Program pengolah gambar");
			jb[2].setText("Program pengolah teks");
			jb[3].setText("Program yang mengelola sumber daya komputer");
		}
		if (current == 8) {
			l.setText("9. Apa yang dimaksud dengan cache dalam CPU?");
			jb[0].setText("Tempat penyimpanan sementara untuk data dan instruksi");
			jb[1].setText("Tempat penyimpanan permanen");
			jb[2].setText("Tempat penyimpanan untuk file sistem operasi");
			jb[3].setText("Tempat penyimpanan untuk file pengguna");
		}
		if (current == 9) {
			l.setText("10. Apa yang dimaksud dengan GPU dalam sistem komputer?");
			jb[0].setText("Graphic Processing Unit");
			jb[1].setText("General Processing Unit");
			jb[2].setText("Global Processing Unit");
			jb[3].setText("Graphics Power Unit");
		}

		l.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	void basdat(){
		jb[4].setSelected(true);
		if(current==0)
		{
			l.setText("1. Apa yang dimaksud dengan basis data (database)?");
			jb[0].setText("Kumpulan perangkat keras komputer");jb[1].setText("Kumpulan program aplikasi");jb[2].setText("Kumpulan data terstruktur yang terorganisir");
		}
		if(current==1)
		{
			l.setText("2. Apa fungsi utama dari Sistem Manajemen Basis Data (DBMS)?");
			jb[0].setText("Menghasilkan laporan");jb[1].setText("Mengelola dan menyediakan akses ke data");jb[2].setText("Menyusun kode program");jb[3].setText("ActionEvent");
		}
		if(current==2)
		{
			l.setText("3. Apa yang dimaksud dengan Primary Key dalam basis data?");
			jb[0].setText("Kunci utama yang unik untuk setiap baris data");jb[1].setText("Kunci yang dapat digunakan untuk membuka database");jb[2].setText("Nama tabel utama dalam database");jb[3].setText("lang");
		}
		if(current==3)
		{
			l.setText("4. Apa perbedaan antara basis data relasional dan basis data non-relasional?");
			jb[0].setText("Basis data relasional menggunakan tabel, sedangkan non-relasional tidak");jb[1].setText("Basis data relasional hanya dapat menyimpan data teks");jb[2].setText("Keduanya sama");jb[3].setText("10");
		}
		if(current==4)
		{
			l.setText("5. Apa yang dimaksud dengan normalisasi dalam konteks basis data?");
			jb[0].setText("Proses mengurangi tingkat keamanan data");jb[1].setText("Proses mengorganisir data untuk menghindari duplikasi");jb[2].setText("Proses mengenkripsi seluruh basis data");jb[3].setText("jtek");
		}
		if(current==5)
		{
			l.setText("6. Apa kegunaan indeks dalam basis data?");
			jb[0].setText("Membuat salinan data");jb[1].setText("Mempercepat proses pencarian dan pengurutan data");jb[2].setText("Menghapus data dari tabel");jb[3].setText("if");
		}
		if(current==6)
		{
			l.setText("7. Apa yang dimaksud dengan SQL (Structured Query Language)?");
			jb[0].setText("Bahasa pemrograman tingkat tinggi");jb[1].setText("Bahasa kueri untuk berinteraksi dengan basis data");jb[2].setText("Bahasa pemrograman rendah");jb[3].setText("Button");
		}
		if(current==7)
		{
			l.setText("8. Apa perbedaan antara data bersifat unik dan data bersifat berulang dalam basis data?");
			jb[0].setText("Data bersifat unik hanya dapat muncul sekali, sedangkan data bersifat berulang dapat muncul beberapa kali");jb[1].setText("Keduanya memiliki arti yang sama");jb[2].setText("Data bersifat unik hanya dapat digunakan pada jenis data teks");jb[3].setText("getDocumentBase");
		}
		if(current==8)
		{
			l.setText("9. Apa yang dimaksud dengan transaksi dalam basis data?");
			jb[0].setText("Proses mematikan basis data");jb[1].setText("Kumpulan perintah SQL");jb[2].setText("Sekumpulan operasi yang dianggap sebagai satu unit logis");jb[3].setText("destroy");
		}
		if(current==9)
		{
			l.setText("10. Apa itu konsep \"foreign key\" dalam basis data relasional?");
			jb[0].setText("Kunci utama yang unik untuk setiap baris data");jb[1].setText("Kunci yang menghubungkan dua tabel");jb[2].setText("Nama kunci dalam basis data");jb[3].setText("Asam");
		}


		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(kode1.isEnabled()){
			if(current==0)
				return(jb[1].isSelected());
			if(current==1)
				return(jb[0].isSelected());
			if(current==2)
				return(jb[3].isSelected());
			if(current==3)
				return(jb[3].isSelected());
			if(current==4)
				return(jb[0].isSelected());
			if(current==5)
				return(jb[1].isSelected());
			if(current==6)
				return(jb[1].isSelected());
			if(current==7)
				return(jb[0].isSelected());
			if(current==8)
				return(jb[1].isSelected());
			if(current==9)
				return(jb[2].isSelected());
		}
		else if(kode2.isEnabled()){
			if(current==0)
				return(jb[2].isSelected());
			if(current==1)
				return(jb[1].isSelected());
			if(current==2)
				return(jb[2].isSelected());
			if(current==3)
				return(jb[1].isSelected());
			if(current==4)
				return(jb[1].isSelected());
			if(current==5)
				return(jb[1].isSelected());
			if(current==6)
				return(jb[1].isSelected());
			if(current==7)
				return(jb[1].isSelected());
			if(current==8)
				return(jb[2].isSelected());
			if(current==9)
				return(jb[1].isSelected());
		}
		else if(kode3.isEnabled()){
			if(current==0)
				return(jb[2].isSelected());
			if(current==1)
				return(jb[1].isSelected());
			if(current==2)
				return(jb[2].isSelected());
			if(current==3)
				return(jb[1].isSelected());
			if(current==4)
				return(jb[1].isSelected());
			if(current==5)
				return(jb[1].isSelected());
			if(current==6)
				return(jb[1].isSelected());
			if(current==7)
				return(jb[1].isSelected());
			if(current==8)
				return(jb[2].isSelected());
			if(current==9)
				return(jb[1].isSelected());
		}
		else if(kode4.isEnabled()){
			if(current==0)
				return(jb[2].isSelected());
			if(current==1)
				return(jb[1].isSelected());
			if(current==2)
				return(jb[2].isSelected());
			if(current==3)
				return(jb[1].isSelected());
			if(current==4)
				return(jb[1].isSelected());
			if(current==5)
				return(jb[1].isSelected());
			if(current==6)
				return(jb[1].isSelected());
			if(current==7)
				return(jb[1].isSelected());
			if(current==8)
				return(jb[2].isSelected());
			if(current==9)
				return(jb[1].isSelected());
		}
		    return false;

	}

	public static void main(String s[])
	{
		new OnlineTest("Online Test Of Java");
	}


}
