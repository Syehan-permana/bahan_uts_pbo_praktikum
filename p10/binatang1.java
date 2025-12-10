                    // enkapsulasi
package p10;
public class binatang1 {
protected String nama;
public String jenis;
private int umur;

void setUmur(int umur){ // untuk mengakses umur yang private
    if(umur >5){
        System.out.println("tidak di terima");   
    }else{   
     this.umur = umur;   
    }
}

 public int getUmur() { // mengambil data yang prifate 
        return umur;  // untuk mengembalikan data yang prifate 
 }



void umur (){
    System.out.println(nama+"umurnya adalah :"+umur);   
}                                                               
  void bergerak(){                                                                    
      System.out.println(nama+"sedang bergerak .......");   
  }
  void tidur(){  
      
      System.out.println(nama+"sedang tidur .....");   
      
  }    
}

class kurakura extends binatang1{  
@Override
void bergerak(){  // parameter nya sama tapi isinya berbeda satu bentuk/metode isi nya berbeda                                                                   
      System.out.println("gerakannya lambat");   
}
 void tidur(){  
      
      System.out.println(nama+"sedang tidur .....");   
      
  }    
 
void umur (){
    System.out.println("umurnya adalah :" + getUmur()); // karna umur private    

}




} 

