/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswaapp;

/**
 *
 * @author Lenovo
 */
 public class Mahasiswa {
    private String nim;         //mendeklarasikan attribut menjadi private dgn menggunakan metode enkapsulasi
    private String nama;
    private String prodi;
    
    public void setnim(String stb){         //membuat procedure untuk input nim dengan menggunakan parameter
        nim=stb;    //input nim = stb
    }
    public void setnama(String name){        //membuat procedure untuk input nim dengan menggunakan parameter
        nama=name;      //input nama=name
    }
    public void setprodi(String jurus){      //membuat procedure untuk input nim dengan menggunakan parameter
        prodi=jurus;        //nilai prodi diisi oleh jurus
    }
    public String getnama(){                 //membuat function untuk input nim dengan menggunakan parameter
        return(nama);       //mengembalikan nilai dari nama
    }
    public String getnim(){                  //membuat function untuk input nim dengan menggunakan parameter
        return(nim);        //mengembalikan nilai dari nim
    }
    public String getprodi(){                //membuat function untuk input nim dengan menggunakan parameter
        return(prodi);      //mengembalikan nilai dari nim
    }
}
