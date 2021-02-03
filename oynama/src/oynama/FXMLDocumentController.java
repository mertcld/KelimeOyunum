
package oynama;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;
import javafx.scene.control.TextArea;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author mertp
 */
public class FXMLDocumentController implements Initializable {
    
    public static String isim;
    public static String soyIsim;
    public static String hedefPuan;
    public static String[] dizidrt;
    public static String[] dizibs;
    public static String[] dizialt;
    public static String [] diziydi;
    public static String [] diziskz;
    public static String [] dizidkz;
    public static String [] dizion;
    private static int puan=0;
    private static Scanner oku;
    private Label isimlabel;
    
    @FXML
    private Label mert;
    @FXML
    private Button basla;
    public static Label timers;
    @FXML
    private Label mert1;
    @FXML
    private Label mert11;
    @FXML
    private TextField isimAl;
    @FXML
    private TextField soyisimAl;
    @FXML
    private TextField hedefpuanAl;
    @FXML
    private CheckBox hazirimCheck;
    @FXML
    private Label solAltIsım;
    @FXML
    private Label solAltPuan;
    private Label soruLabel;
    @FXML
    private Button cevaplaButon;
    @FXML
    private Button harfAlButon;
    private Label soru1Label;
    @FXML
    private TextField cevap;
    @FXML
    private Label yanlisCevap;
    @FXML
    private Label soru1;
    @FXML
    private Label dogruCevap;
    @FXML
    private Button nextSoru;
    @FXML
    private Label harfAlLabel;
    @FXML
    private Label oyunsonu;
    @FXML
    private Button oyunuBitirButon;
    @FXML
    private Label hedefUlasildimi;
    @FXML
    private Label tarihlabel;
    @FXML
    private AnchorPane hosgeldinLabel;
    @FXML
    private Label hg;
    @FXML
    private Label kurallar;
    @FXML
    private Label kacHarfli;
    @FXML
    private ImageView bground;
    @FXML
    private Label yapanLabel;
    static int timer;
    @FXML
    private Label taymır;
    @FXML
    private ImageView saatResim;
    @FXML
    private PasswordField password;
    @FXML
    private Label wrongSifre;
    public void counter(final int z){
        timer=z;
        final Timer TimerA=new Timer();
        TimerTask TaskA=new TimerTask() {
            @Override
            public void run() {
                if(timer>=0){
                    System.out.println(""+timer);
                    timer--;
                }
                if(timer==-1){
                    System.out.println("süre bitti");
                 
                    TimerA.cancel();
                }
            }
        };
        TimerA.schedule(TaskA, 0,1000);
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        if(password.getText().equals("mertcloud")){
        kurallar.setVisible(true);
        kurallar.setText("BURAYA ÖNCEKİ OYUNLARDA YAPILAN PUANLAR GELECEK.");
        isim=isimAl.getText();
        soyIsim=soyisimAl.getText();
        hedefPuan=hedefpuanAl.getText();
        hg.setVisible(false);
        mert.setVisible(false);
        mert1.setVisible(false);
        mert11.setVisible(false);
        isimAl.setVisible(false);
        soyisimAl.setVisible(false);
        hedefpuanAl.setVisible(false);
        hazirimCheck.setVisible(false);
        solAltIsım.setText(isim+" "+soyIsim);
        solAltPuan.setText("Puan: "+String.valueOf(puan));
        taymır.setVisible(true);
        taymır.setText("240 saniye süre konsolda başladı.");
        
        saatResim.setVisible(true);
       int z=240;
        FXMLDocumentController C=new FXMLDocumentController();
        C.counter(z);
        
        basla.setVisible(false);
        soru1.setVisible(true);
        cevap.setVisible(true);
        cevaplaButon.setVisible(true);
        harfAlButon.setVisible(true);
        nextSoru.setVisible(true);
        soru1.setText(dizidrt[0]);
        kacHarfli.setText("4 HARFLİ");
        cevap.clear();
        cevap.setPromptText("- - - -");
        yapanLabel.setVisible(false);
        wrongSifre.setVisible(false);
        password.setVisible(false);
        }
        else{
            wrongSifre.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)  {
         try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\4harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        dizidrt=new String[5];
       
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                dizidrt[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\5harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        dizibs=new String[6];
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                dizibs[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\6harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        
        dizialt=new String[6];
        
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                dizialt[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\7harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        oku.useDelimiter(",");
       
        diziydi=new String[6];
        
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                diziydi[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\8harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        
        diziskz=new String[6];
        
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                diziskz[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\9harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        
        dizidkz=new String[6];
        
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                dizidkz[i]=oku.next();
            }           
        }
        oku.close();
        try {
            oku=new Scanner(new File("..\\oynama\\src\\oynama\\10harfliler.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        oku.useDelimiter(",");
        
        dizion=new String[6];
        
        while(oku.hasNext()){
            for(int i=0;i<=3;i++){
                dizion[i]=oku.next();
            }           
        }
        oku.close();
        /////////////////////////////////////////////////////////////////
        yapanLabel.setText("KELİME OYUNU");
    }    

    @FXML
    private void cevapla(ActionEvent event) {
        
        if(dizidrt[0].equals(soru1.getText())){
            
            if((cevap.getText().toUpperCase()).equals(dizidrt[1])){
                
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizidrt[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }}
        else if(dizidrt[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizidrt[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizidrt[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizibs[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizibs[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizibs[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
               yanlisCevap.setVisible(true);
            }
        }
        else if(dizibs[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizibs[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizibs[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizialt[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizialt[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizialt[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizialt[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizialt[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizialt[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(diziydi[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(diziydi[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+diziydi[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(diziydi[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(diziydi[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+diziydi[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(diziskz[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(diziskz[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+diziskz[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
               yanlisCevap.setVisible(true);
            }
        }
        else if(diziskz[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(diziskz[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+diziskz[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
               yanlisCevap.setVisible(true);
            }
        }
        else if(dizidkz[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizidkz[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizidkz[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizidkz[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizidkz[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizidkz[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizion[0].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizion[1].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizion[1].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
        else if(dizion[2].equals(soru1.getText())){
            if((cevap.getText().toUpperCase()).equals(dizion[3].toUpperCase())){
                dogruCevap.setVisible(true);
                yanlisCevap.setVisible(false);
                puan=puan+dizion[3].length()*100;
                solAltPuan.setText("PUAN: "+String.valueOf(puan));
                cevap.clear();
            }
            else{
                yanlisCevap.setVisible(true);
            }
        }
    }

    @FXML
    private void digersoru(ActionEvent event) {
        
        if(dizidrt[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            cevap.clear();
            cevap.setPromptText("- - - -");
            kacHarfli.setText("4 HARFLİ");
            
            harfAlLabel.setVisible(false);
            soru1.setText(dizidrt[2]);
            yanlisCevap.setVisible(false);
            dogruCevap.setVisible(false);
        }   
        else if(dizidrt[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("5 HARFLİ");
            cevap.clear();
           cevap.setPromptText("- - - - -");
           soru1.setText(dizibs[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
           harfAlLabel.setVisible(false);
        }
        else if(dizibs[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("5 HARFLİ");
            cevap.clear();
           cevap.setPromptText("- - - - -");
           harfAlLabel.setVisible(false);
           soru1.setText(dizibs[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizibs[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("6 HARFLİ");
            cevap.clear();
            
           cevap.setPromptText("- - - - -");
           harfAlLabel.setVisible(false);
           soru1.setText(dizialt[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizialt[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("6 HARFLİ");
            cevap.clear();
           cevap.setPromptText("- - - - - -");
           harfAlLabel.setVisible(false);
           soru1.setText(dizialt[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizialt[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("7 HARFLİ");
            cevap.clear();
           cevap.setPromptText("- - - - - - - -");
           harfAlLabel.setVisible(false);
           soru1.setText(diziydi[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(diziydi[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("7 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - -");
            harfAlLabel.setVisible(false);
           soru1.setText(diziydi[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(diziydi[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("8 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - - - ");
            harfAlLabel.setVisible(false);
           soru1.setText(diziskz[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(diziskz[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("8 HARFLİ");
            cevap.clear();
           cevap.setPromptText("- - - - - - - -");
           harfAlLabel.setVisible(false);
           soru1.setText(diziskz[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(diziskz[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("9 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - - - -");
            harfAlLabel.setVisible(false);
           soru1.setText(dizidkz[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizidkz[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("9 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - - - -");
            harfAlLabel.setVisible(false);
           soru1.setText(dizidkz[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizidkz[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("10 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - - - - - ");
            harfAlLabel.setVisible(false);
           soru1.setText(dizion[0]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizion[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            kacHarfli.setText("10 HARFLİ");
            cevap.clear();
            cevap.setPromptText("- - - - - - - - - - ");
            harfAlLabel.setVisible(false);
            soru1.setText(dizion[2]);
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
        }
        else if(dizion[2].toUpperCase().equals(soru1.getText().toUpperCase())){
          
           kacHarfli.setVisible(false);
           harfAlLabel.setVisible(false);
           soru1.setText("OYNADIĞIN İÇİN TEŞEKKÜR EDERİM.");
           yanlisCevap.setVisible(false);
           dogruCevap.setVisible(false);
           cevaplaButon.setVisible(false);
           harfAlButon.setVisible(false);
           nextSoru.setVisible(false);
           cevap.setVisible(false);
           oyunuBitirButon.setVisible(true);
           
           
        }
        
    }

    @FXML
    private void harfAl(ActionEvent event) {
        if(dizidrt[0].toUpperCase().equals(soru1.getText().toUpperCase())){
            int random=(int)(Math.random()*4);
            harfAlLabel.setText(random+1+". HARF: "+dizidrt[1].charAt(random));
            harfAlLabel.setVisible(true);
            puan=puan-100;
        }   
        else if(dizidrt[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random1=(int) (Math.random() * 4);
           harfAlLabel.setText(random1+1+". HARF: "+dizidrt[3].charAt(random1));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizibs[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random2=(int) (Math.random()*5);
           harfAlLabel.setText(random2+1+". HARF: "+dizibs[1].charAt(random2));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizibs[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random3=(int) (Math.random()*5);
           harfAlLabel.setText(random3+1+". HARF: "+dizibs[3].charAt(random3));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizialt[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random4=(int) (Math.random()*6);
           harfAlLabel.setText(random4+1+". HARF: "+dizialt[1].charAt(random4));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizialt[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random5=(int) (Math.random()*6);
           harfAlLabel.setText(random5+1+". HARF: "+dizialt[3].charAt(random5));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(diziydi[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random6=(int) (Math.random()*7);
           harfAlLabel.setText(random6+1+". HARF: "+diziydi[1].charAt(random6));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(diziydi[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random7=(int) (Math.random()*7);
           harfAlLabel.setText(random7+1+". HARF: "+diziydi[3].charAt(random7));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(diziskz[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random8=(int) (Math.random()*8);
           harfAlLabel.setText(random8+1+". HARF: "+diziskz[1].charAt(random8));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(diziskz[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random9=(int) (Math.random()*8);
           harfAlLabel.setText(random9+1+". HARF: "+diziskz[3].charAt(random9));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizidkz[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random10=(int) (Math.random()*9);
           harfAlLabel.setText(random10+1+". HARF: "+dizidkz[1].charAt(random10));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizidkz[2].toUpperCase().equals(soru1.getText().toUpperCase())){
            int random11=(int) (Math.random()*9);
           harfAlLabel.setText(random11+1+". HARF: "+dizidkz[3].charAt(random11));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizion[0].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random12=(int) (Math.random()*10);
           harfAlLabel.setText(random12+1+". HARF: "+dizion[1].charAt(random12));
           harfAlLabel.setVisible(true);
           puan=puan-100;
        }
        else if(dizion[2].toUpperCase().equals(soru1.getText().toUpperCase())){
           int random13=(int) (Math.random()*10);
           harfAlLabel.setText(random13+1+". HARF: "+dizion[3].charAt(random13));
           harfAlLabel.setVisible(true);
           puan=puan-100;  
        }
        else{
            soru1.setText("SORULAR BİTTİ HARF ALAMAZSIN");
        }
    }

    @FXML
    private void oyunuBitirButon(ActionEvent event) {
        saatResim.setVisible(false);
        kurallar.setVisible(false);
        SimpleDateFormat sekil = new SimpleDateFormat("dd/MM/yyyy");
        Date tarih = new Date();
        oyunsonu.setText(isim.toUpperCase()+" "+soyIsim.toUpperCase()+"\nPUAN: "+puan+"\nHEDEF PUANIN: "+hedefPuan+"\nKalan Süren: "+timer+" saniye");
        oyunsonu.setVisible(true);
        solAltIsım.setVisible(false);
        solAltPuan.setVisible(false);
        tarihlabel.setText(sekil.format(tarih));
        
        hedefUlasildimi.setVisible(true);
        if((Integer.valueOf(hedefPuan))<(Integer.valueOf(puan))){
            hedefUlasildimi.setText("TEBRİKLER HEDEFİNİ GEÇTİN.");
        } else if((Integer.valueOf(hedefPuan)).equals(Integer.valueOf(puan))){
            hedefUlasildimi.setText("TEBRİKLER, HEDEFİNİ TAM OLARAK TUTTURDUN.");
        }
        else if((Integer.valueOf(hedefPuan))>(Integer.valueOf(puan))){
            hedefUlasildimi.setText("HEDEFİNE ULAŞAMADIN.BİRAZ DİNLENİP TEKRAR DENE.");
        }
        taymır.setVisible(false);
        
        
    }
    
   
    
    
    
}
