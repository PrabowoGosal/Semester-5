/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswaapp;

import java.io.*; //mengambil fungsi input output pada java
/**
 *
 * @author Lenovo
 */
  class OperasiFile {
     
    public void saveData(Mahasiswa p)throws IOException{        //membuat procedure dengan fungsi throws{melempar suatu eksepsi dalam program} dengan IOexception
        File f=new File("Mahasiswa.dat");                       //membuat file baru dgn nama f dan menyimapnnya dgn nama Mahasiswa.dat                 
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(f,true)) //membuat objek dengan nama out untuk menulis data di file f dengan format non ASCII
        ) {
            out.writeUTF(p.getnim() +" ");   //menulis dalam format utf apa yang ada pada parameter
            out.writeUTF(p.getnama() +" ");     //menulis dalam format utf apa yang ada pada parameter
            out.writeUTF(p.getprodi()+"\n"); //menulis dalam format utf apa yang ada pada parameter
            //berhenti menulis
        } //menulis dalam format utf apa yang ada pada parameter
    }
    
    public String bacaData()throws IOException{//membuat method dengan fungsi throws{melempar suatu eksepsi dalam program} dengan IOexception
        File A=new File("Mahasiswa.dat" );   //mezmbuat file baru dgn nama f dan menyimapnnya dgn nama Mahasiswa.dat
        String tmp;
        try (DataInputStream in = new DataInputStream(new FileInputStream(A)) //membuat objek dengan nama in untuk membaca data di file f dengan format non ASCII
        ) {
            tmp = ""; //mendeklarasikan tmp sebagai string dgn input kosong
            do {
                //lakukan perintah dibawah ini
                tmp+=in.readUTF()+"\n";     //mengisi tmp dgn nilai dari yang dibaca dalam in yang sudah menggunakan encode UTF-8
            } while (in.available()>0); //proses akhir pengulangan , perulangan akan berhenti ketika pembacaan perhuruf lbih besar dari 0
            //berhenti membaca
        } //mendekla]asikan tmp sebagai string dgn input kosong
          return(tmp); //mengembalikan nilai tmp
    }
   }
  /*  public String bacaData()throws IOException{
        File A=new File("Mahasiswa.dat");
        FileReader lihat = new FileReader(A);
        
        BufferedReader read = new BufferedReader(lihat);
        
        String get ="";
        String tmp="";
        
        while((tmp = read.readLine())!=null){
            get += tmp+"\n";
        }
        
        lihat.close();
        read.close();
        return(get);
    }*/
  
