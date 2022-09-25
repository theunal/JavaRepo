import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.nio.file.spi.FileTypeDetector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;





public class selectXmlFrame extends javax.swing.JFrame {
        BufferedWriter writer = null;
    // database'e xmlden veri atıyor
 

  
    public selectXmlFrame() throws SQLException {
        initComponents();
        fileChooser.setVisible(false);
    }
 
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblForm2 = new javax.swing.JLabel();
        btnForm2 = new javax.swing.JButton();
        txtConvertTxt = new javax.swing.JButton();
        fileChooser = new javax.swing.JFileChooser();
        btnFileChoose = new javax.swing.JButton();
        lblinfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblForm2.setText("XML to TXT");

        btnForm2.setText("database'e kaydet");
        btnForm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForm2ActionPerformed(evt);
            }
        });

        txtConvertTxt.setText("TXT'e yaz");
        txtConvertTxt.setMaximumSize(new java.awt.Dimension(178, 31));
        txtConvertTxt.setMinimumSize(new java.awt.Dimension(178, 31));
        txtConvertTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvertTxtActionPerformed(evt);
            }
        });

        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        btnFileChoose.setText("Dosya Seç");
        btnFileChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnFileChoose))
                            .addComponent(btnForm2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtConvertTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblForm2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblForm2)
                        .addGap(88, 88, 88)
                        .addComponent(btnFileChoose)
                        .addGap(18, 18, 18)
                        .addComponent(btnForm2)
                        .addGap(18, 18, 18)
                        .addComponent(txtConvertTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnForm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForm2ActionPerformed
  
        try {
          setDb();
          lblinfo.setText("baglanti basarılı. "+"database'e yazıldı");
      } catch (SQLException ex) {
          System.out.println("database'e veri aktarılamadı");
          lblinfo.setText("dosya xml değil");
      } 
    }//GEN-LAST:event_btnForm2ActionPerformed

    private void txtConvertTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvertTxtActionPerformed
    
        File file2 = new File("sales.txt");
        
        if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                        System.out.println("yeni dosya olusturuldu");
                    } catch (IOException e) {
                        System.out.println("dosya olusturulamadı");
                    }
                }
            try {
                if(file2.length() == 0) {
                  writer = new BufferedWriter(new FileWriter(file2,true));
                writer.write("Z No FişNo      Fiş Tarihi    Toplam    Kdv [Oran  Tutar    Kdv; Oran  Tutar    Kdv; Oran  Tutar    Kdv; Oran  Tutar     Kdv; ]");
              
                } 
            } 
            catch (IOException ex) {
                Logger.getLogger(selectXmlFrame.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            
        
                try {
                selectDb();
                lblinfo.setText("xml'e yazıldı. "+"xml dosyası uygulama dosyasının içine atıldı.");
                } catch (SQLException ex) {
                
                }    
            
            
            
    }//GEN-LAST:event_txtConvertTxtActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        fileChooser.setVisible(false);
        lblinfo.setText("dosya seçildi: "+fileChooser.getName(fileChooser.getSelectedFile()));
    }//GEN-LAST:event_fileChooserActionPerformed

    private void btnFileChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileChooseActionPerformed
        
        fileChooser.setDialogTitle("Dosyayı seçin");
        fileChooser.setVisible(true);
    }//GEN-LAST:event_btnFileChooseActionPerformed
 public  void setDb() throws SQLException {

        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        
        DocumentBuilderFactory factory =
                DocumentBuilderFactory.newInstance();
        Document document = null;
        Element root;
        Connection connection = null;

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(new File(filePath));
            document.getDocumentElement().normalize();

            root = document.getDocumentElement();
            System.out.println(root.getNodeName());

        } catch (Exception e) {

        }
        NodeList nList = document.getElementsByTagName("Receipt");
     

        ArrayList<Sale> sales = new ArrayList<>();

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println();
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                Element element = (Element) node;

                DbHelper helper = new DbHelper();
                connection = null;
                PreparedStatement statement;
                try {
                    connection = helper.getConnection();
                    String sql = "insert into sales (zno,fisno,tarih,toplam,kdv,sifirOran,sifirTutar,sifirKdv,birOran,birTutar,birKdv,sekizOran,sekizTutar,sekizKdv,onsekizOran,onsekizTutar,onsekizKdv) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    statement = connection.prepareStatement(sql);

                    statement.setString(1, element.getElementsByTagName("ZNo").item(0).getTextContent());
                    statement.setString(2, element.getElementsByTagName("ReceiptNo").item(0).getTextContent());
                    statement.setString(3, element.getElementsByTagName("ReceiptDate").item(0).getTextContent());
                    statement.setString(4, element.getElementsByTagName("Total").item(0).getTextContent());
                    statement.setString(5, element.getElementsByTagName("Vat").item(0).getTextContent());
                    

                    statement.setString(6, element.getElementsByTagName("VatRate").item(0).getTextContent());
                    statement.setString(7, element.getElementsByTagName("SaleAmount").item(0).getTextContent());
                    statement.setString(8, element.getElementsByTagName("VatAmount").item(0).getTextContent());

                    statement.setString(9, element.getElementsByTagName("VatRate").item(1).getTextContent());
                    statement.setString(10, element.getElementsByTagName("SaleAmount").item(1).getTextContent());
                    statement.setString(11, element.getElementsByTagName("VatAmount").item(1).getTextContent());

                    statement.setString(12, element.getElementsByTagName("VatRate").item(2).getTextContent());
                    statement.setString(13, element.getElementsByTagName("SaleAmount").item(2).getTextContent());
                    statement.setString(14, element.getElementsByTagName("VatAmount").item(2).getTextContent());

                    statement.setString(15, element.getElementsByTagName("VatRate").item(3).getTextContent());
                    statement.setString(16, element.getElementsByTagName("SaleAmount").item(3).getTextContent());
                    statement.setString(17, element.getElementsByTagName("VatAmount").item(3).getTextContent());

                    statement.executeUpdate();
                   

                } catch (SQLException e) {
                    System.out.println("baglantı basarisiz");
                } finally {
                    connection.close();
                     System.out.println("baglanti basarili");
                }
            }
        }
    }
  
     public  ArrayList<Sale> selectDb() throws SQLException{
        //var filePath = fileChooserActionPerformed(fileChooser.getSelectedFile().getAbsolutePath());

        DbHelper helper = new DbHelper();
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet;
        ArrayList<Sale> sales = new ArrayList<>();
        File file = new File("C:\\Users\\UNAL\\Desktop\\sales.txt");
        
        if (!file.exists()) {
                    try {
                        file.createNewFile();
                        System.out.println("yeni dosya olusturuldu");
                    } catch (IOException e) {
                        System.out.println("dosya olusturulamadı");
                    }
                }
        
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from sales");
            sales = new ArrayList<Sale>();
            
            while (resultSet.next()) {
                
                try {
                    writer = new BufferedWriter(new FileWriter(file,true));
                    StringBuilder zsb = new StringBuilder();
                    StringBuilder fsb = new StringBuilder();
                    int i,j;
                    
                    
                    
                    String zno = resultSet.getString("zno");
                    for (i = 4; i > zno.length(); i--) {
                        zsb.append("0");
                    }
                    zsb.append(zno);
                    
                    String fisno = resultSet.getString("fisno");
                    for (j = 5; j > fisno.length(); j--) {
                        fsb.append("0");
                    }
                    fsb.append(fisno);
                    
                    String skdv = resultSet.getString("sifirKdv");
                    if(skdv.equals("0") || skdv.equals("0.0")) {
                        skdv = "0.00";
                        
                    }
                     
                    String t = resultSet.getString("toplam");
                    while (t.length() != 6) {
                         t = " "+t;
                    }
                    
                    String k = resultSet.getString("kdv");
                    while (k.length() != 5) {
                         k = " "+k;
                    }
                    
                    String st = resultSet.getString("sifirTutar");
                    while (st.length() != 5) {
                         st = " "+st;
                    }
                    
                    String bt = resultSet.getString("birTutar");
                    while (bt.length() != 5) {
                         bt = " "+bt;
                    }
                    
                    String sekizt = resultSet.getString("sekizTutar");
                    while (sekizt.length() != 5) {
                         sekizt = " "+sekizt;
                    }
                    
                    String onsekizt = resultSet.getString("onsekizTutar");
                    while (onsekizt.length() != 5) {
                         onsekizt = " "+onsekizt;
                    }
                    
                    String onsekizkdv = resultSet.getString("onsekizKdv");
                    while (onsekizkdv.length() != 5) {
                         onsekizkdv = " "+onsekizkdv;
                    }
                    
                   
                   
                    
                    
                    
                    writer.write(
                            "\n"+zsb+" "+fsb+"   "+resultSet.getString("tarih")+" "+t+"  "+k+
                                    " [ %0"+resultSet.getString("sifirOran")+"  "+st+"   "+skdv+
                                    ";  %0"+resultSet.getString("birOran")+"  "+bt+"   "+resultSet.getString("birKdv")+
                                    ";  %0"+resultSet.getString("sekizOran")+"  "+sekizt+"   "+resultSet.getString("sekizKdv")+
                                    ";  %"+resultSet.getString("onsekizOran")+"  "+onsekizt+"   "+onsekizkdv+"; ]");
                    
                } catch (IOException e) {
                    System.out.println("dosyada hata olustu");
                }finally {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }//write
                
                
                sales.add(new Sale(
                        resultSet.getInt("id"),
                        resultSet.getString("zno"),
                        resultSet.getString("fisno"),
                        resultSet.getString("tarih"),
                        resultSet.getString("toplam"),
                        resultSet.getString("kdv"),
                        
                        resultSet.getString("sifirOran"),
                        resultSet.getString("sifirTutar"),
                        resultSet.getString("sifirKdv"),
                        
                        resultSet.getString("birOran"),
                        resultSet.getString("birTutar"),
                        resultSet.getString("birKdv"),
                        
                        resultSet.getString("sekizOran"),
                        resultSet.getString("sekizTutar"),
                        resultSet.getString("sekizKdv"),
                        
                        resultSet.getString("onsekizOran"),
                        resultSet.getString("onsekizTutar"),
                        resultSet.getString("onsekizKdv")));
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        } finally {
            connection.close();
        }

        return sales;
    
       
    }
     

        
        
        
        
        
 
    
    
    
    
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new selectXmlFrame().setVisible(true);
                     
                } catch (SQLException ex) {
                    Logger.getLogger(selectXmlFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFileChoose;
    private javax.swing.JButton btnForm2;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel lblForm2;
    private javax.swing.JLabel lblinfo;
    private javax.swing.JButton txtConvertTxt;
    // End of variables declaration//GEN-END:variables
}
