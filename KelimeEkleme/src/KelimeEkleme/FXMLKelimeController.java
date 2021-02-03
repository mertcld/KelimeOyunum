/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelimeEkleme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author mertp
 */
public class FXMLKelimeController implements Initializable {
    private static PrintWriter yazici;
    private TextField sorutext;
    private TextField kelimetext;
    @FXML
    private TextField h4s1t;
    @FXML
    private TextField h4c1t;
    @FXML
    private TextField h4s2t;
    @FXML
    private TextField h4c2t;
    @FXML
    private TextField h5s1t;
    @FXML
    private TextField h5c1t;
    @FXML
    private TextField h5s2t;
    @FXML
    private TextField h5c2t;
    @FXML
    private TextField h6s1t;
    @FXML
    private TextField h6c1t;
    @FXML
    private TextField h6s2t;
    @FXML
    private TextField h6c2t;
    @FXML
    private TextField h7s1t;
    @FXML
    private TextField h7c1t;
    @FXML
    private TextField h7s2t;
    @FXML
    private TextField h7c2t;
    @FXML
    private TextField h8s1t;
    @FXML
    private TextField h8c1t;
    @FXML
    private TextField h8s2t;
    @FXML
    private TextField h8c2t;
    @FXML
    private TextField h9s1t;
    @FXML
    private TextField h9c1t;
    @FXML
    private TextField h9s2t;
    @FXML
    private TextField h9c2t;
    @FXML
    private TextField h10s1t;
    @FXML
    private TextField h10c1t;
    @FXML
    private TextField h10s2t;
    @FXML
    private TextField h10c2t;
    @FXML
    private Label tamamlandi;
    @FXML
    private Button resim;
    @FXML
    private Button senEkle;
    @FXML
    private ImageView logo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        String h4s1=h4s1t.getText();
        String h4c1=h4c1t.getText();
        String h4s2=h4s2t.getText();
        String h4c2=h4c2t.getText();
        String h5s1=h5s1t.getText();
        String h5c1=h5c1t.getText();
        String h5s2=h5s2t.getText();
        String h5c2=h5c2t.getText();
        String h6s1=h6s1t.getText();
        String h6c1=h6c1t.getText();
        String h6s2=h6s2t.getText();
        String h6c2=h6c2t.getText();
        String h7s1=h7s1t.getText();
        String h7c1=h7c1t.getText();
        String h7s2=h7s2t.getText();
        String h7c2=h7c2t.getText();
        String h8s1=h8s1t.getText();
        String h8c1=h8c1t.getText();
        String h8s2=h8s2t.getText();
        String h8c2=h8c2t.getText();
        String h9s1=h9s1t.getText();
        String h9c1=h9c1t.getText();
        String h9s2=h9s2t.getText();
        String h9c2=h9c2t.getText();
        String h10s1=h10s1t.getText();
        String h10c1=h10c1t.getText();
        String h10s2=h10s2t.getText();
        String h10c2=h10c2t.getText();
        dosyaOlustur();
        //dosyalara yazmak için ekliyoruz
        PrintWriter yazma4h = null;
        yazma4h = new PrintWriter("..\\oynama\\src\\oynama\\4harfliler.txt");
        PrintWriter yazma7h = null;
        yazma7h = new PrintWriter("..\\oynama\\src\\oynama\\7harfliler.txt");
        PrintWriter yazma5h = null;
        yazma5h = new PrintWriter("..\\oynama\\src\\oynama\\5harfliler.txt");
        PrintWriter yazma6h = null;
        yazma6h = new PrintWriter("..\\oynama\\src\\oynama\\6harfliler.txt");
        PrintWriter yazma8h = null;
        yazma8h = new PrintWriter("..\\oynama\\src\\oynama\\8harfliler.txt");
        PrintWriter yazma9h = null;
        yazma9h = new PrintWriter("..\\oynama\\src\\oynama\\9harfliler.txt");
        PrintWriter yazma10h = null;
        yazma10h = new PrintWriter("..\\oynama\\src\\oynama\\10harfliler.txt");
        
        //rastgele gelince farklı olsun diye alttaki soruları kendim seçtim.
        yazma4h.print("YANICI BİR MADDEDEN ALDIĞI İTİCİ GÜÇLE HAREKET EDEN DÜZENEK,FÜZE,");
        yazma5h.print("AYDINLATMADA KULLANILAN ARAÇ,LAMBA,");
        yazma6h.print("KIRK YADA DAHA ÇOK SAYIDA YOLCU ALABİLEN BÜYÜK MOTORLU KARA TAŞITI,OTOBÜS,");
        yazma7h.print("ESKİDEN 'MİHMAN' DENEN AĞIRLANAN KİŞİ,MİSAFİR,");
        yazma8h.print("\"KENDİ UYDUSUNU FIRLATABİLEN ÜLKELER\" ANLAMINDA BİR TABİR,UZAYLİGİ,");
        yazma9h.print("SUNİ ZEMİN ÜZERİNDE SAMİMİ MÜCADELERİN YAŞANDIĞI SPOR ALANI,HALISAHA,");
        yazma10h.print("RİZE-ARTİVN HAVALİMANINDAKİ KONTROL KULELERİNİN BENZETİLDİĞİ FİGÜR,ÇAYBARDAĞI,");
        //şimdi malesef tek tek yazdıracağız.
        yazma4h.print(h4s1);
        yazma4h.print(",");
        yazma4h.print(h4c1);
        yazma4h.close();
        yazma5h.print(h5s2);
        yazma5h.print(",");
        yazma5h.print(h5c2);
        yazma5h.close();
        yazma6h.print(h6s1);
        yazma6h.print(",");
        yazma6h.print(h6c1);
        yazma6h.close();
        yazma7h.print(h7s2);
        yazma7h.print(",");
        yazma7h.print(h7c2);
        yazma7h.close();
        yazma8h.print(h8s2);
        yazma8h.print(",");
        yazma8h.print(h8c2);
        yazma8h.close();
        yazma9h.print(h9s1);
        yazma9h.print(",");
        yazma9h.print(h9c1);
        yazma9h.close();
        yazma10h.print(h10s1);
        yazma10h.print(",");
        yazma10h.print(h10c1);
        yazma10h.close();
        
        tamamlandi.setText("SORU VE KELİMELER EKLENDİ.OYNAMA KISMINA GEÇİNİZ.");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
     private static void dosyaOlustur() throws IOException{
        File file = new File("..\\oynama\\src\\oynama\\4harfliler.txt"); // Dosya nesnesi
        if(!file.exists()) //Dosya zaten var mı
        {
           file.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }
        File file1= new File("..\\oynama\\src\\oynama\\5harfliler.txt");
         if(!file1.exists()) //Dosya zaten var mı
        {
           file1.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }    
         File file2 = new File("..\\oynama\\src\\oynama\\6harfliler.txt"); // Dosya nesnesi
        if(!file2.exists()) //Dosya zaten var mı
        {
           file2.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }
        File file3= new File("..\\oynama\\src\\oynama\\7harfliler.txt");
         if(!file3.exists()) //Dosya zaten var mı
        {
           file3.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }    
         File file4= new File("..\\oynama\\src\\oynama\\8harfliler.txt");
         if(!file4.exists()) //Dosya zaten var mı
        {
           file4.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }    
         File file5 = new File("..\\oynama\\src\\oynama\\9harfliler.txt"); // Dosya nesnesi
        if(!file5.exists()) //Dosya zaten var mı
        {
           file5.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }
        File file6= new File("..\\oynama\\src\\oynama\\10harfliler.txt");
         if(!file6.exists()) //Dosya zaten var mı
        {
           file6.createNewFile(); //Dosyayı oluştur
            System.out.println("dosya eklendi.");
        }    
    }

    @FXML
    private void senEkle(ActionEvent event) throws FileNotFoundException {
        PrintWriter yazma4h = null;
        yazma4h = new PrintWriter("..\\oynama\\src\\oynama\\4harfliler.txt");
        PrintWriter yazma7h = null;
        yazma7h = new PrintWriter("..\\oynama\\src\\oynama\\7harfliler.txt");
        PrintWriter yazma5h = null;
        yazma5h = new PrintWriter("..\\oynama\\src\\oynama\\5harfliler.txt");
        PrintWriter yazma6h = null;
        yazma6h = new PrintWriter("..\\oynama\\src\\oynama\\6harfliler.txt");
        PrintWriter yazma8h = null;
        yazma8h = new PrintWriter("..\\oynama\\src\\oynama\\8harfliler.txt");
        PrintWriter yazma9h = null;
        yazma9h = new PrintWriter("..\\oynama\\src\\oynama\\9harfliler.txt");
        PrintWriter yazma10h = null;
        yazma10h = new PrintWriter("..\\oynama\\src\\oynama\\10harfliler.txt");
        
        //rastgele gelince farklı olsun diye alttaki soruları kendim seçtim.
        yazma4h.print("YANICI BİR MADDEDEN ALDIĞI İTİCİ GÜÇLE HAREKET EDEN DÜZENEK,FÜZE,");
        yazma5h.print("AYDINLATMADA KULLANILAN ARAÇ,LAMBA,");
        yazma6h.print("KIRK YADA DAHA ÇOK SAYIDA YOLCU ALABİLEN BÜYÜK MOTORLU KARA TAŞITI,OTOBÜS,");
        yazma7h.print("ESKİDEN 'MİHMAN' DENEN AĞIRLANAN KİŞİ,MİSAFİR,");
        yazma8h.print("\"KENDİ UYDUSUNU FIRLATABİLEN ÜLKELER\" ANLAMINDA BİR TABİR,UZAYLİGİ,");
        yazma9h.print("SUNİ ZEMİN ÜZERİNDE SAMİMİ MÜCADELERİN YAŞANDIĞI SPOR ALANI,HALISAHA,");
        yazma10h.print("RİZE-ARTİVN HAVALİMANINDAKİ KONTROL KULELERİNİN BENZETİLDİĞİ FİGÜR,ÇAYBARDAĞI,");
        yazma4h.print("SİYASAL ANLAMDA AVRUPA VE KUZEY AMERİKA İÇİN KULLANILAN BİR SÖZ,BATI");
        yazma5h.print("GENELLİKLE GÜNEŞ VE YANSIMALARIN SEBEP OLDUĞU BİR TÜR GÜNDÜZ DÜŞÜ,SERAP");
        yazma6h.print("UYGUN GÖRÜLMEYEN TAVIR VE DAVRANIŞLARDA BULUNAN KİŞİ,DENSİZ");
        yazma7h.print("SEYYAR IZGARALARDA HAZIRLANAN HALK KÖFTESİNİN HALK AĞZINDAKİ ÖN ADI,TÜKÜRÜK");
        yazma8h.print("TİCARİ SÖZ DÜELLOSU,PAZARLIK");
        yazma9h.print("\"BÜYÜKŞEHİR\" ANLAMINA GELEN MELEZ BİR TABİR,MEGAKENT");
        yazma10h.print("\"UYGUN-MÜTENASİP-YARAŞAN\" ANLAMLARINDAKİ ERKEKLERE YÖNELİK BİR İLTİFAT,YAKIŞIKLI");
        yazma4h.close();
        yazma5h.close();
        yazma6h.close();
        yazma7h.close();
        yazma8h.close();
        yazma9h.close();
        yazma10h.close();
        tamamlandi.setText("SORU VE KELİMELER EKLENDİ.OYUN KISMINA GEÇİNİZ.");
    }
     
}
