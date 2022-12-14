
import java.awt.Color;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class demo extends javax.swing.JFrame {
            
    DefaultTableModel model;
    static demo demo1;
    int r = 0,g = 0,b = 0;
    
    public demo() {
        initComponents();
        model = (DefaultTableModel)tblCities.getModel();
        try {
            ArrayList<City> cities = getCities();
       
        for (City city : cities) {
            Object[] row = {
                city.getId(),
                city.getName(),
                city.getCountryCode(),
                city.getDistrict(),
                city.getPopulation()};
            model.addRow(row);
        }
        } catch (SQLException exception) {
            
        }
        
        
        DefaultComboBoxModel cbxmodel = new DefaultComboBoxModel();
        cbxCity.setModel(cbxmodel);
        cbxmodel.addElement("İstanbul");
         cbxmodel.addElement("Ankara");
          cbxmodel.addElement("Isparta");
           cbxmodel.addElement("Tokat");
            cbxmodel.addElement("Bursa");
             cbxmodel.addElement("Yalova");
              cbxmodel.addElement("Urfa");
        
              
              
          DefaultComboBoxModel cbxmodelr = new DefaultComboBoxModel();
          cbxRed.setModel(cbxmodelr);
          DefaultComboBoxModel cbxmodelg = new DefaultComboBoxModel();
          cbxGreen.setModel(cbxmodelg);
          DefaultComboBoxModel cbxmodelb = new DefaultComboBoxModel();
          cbxBlue.setModel(cbxmodelb);
          
          for (int i = 0; i<256; i++) {
              cbxmodelr.addElement(i);
                cbxmodelg.addElement(i);
                  cbxmodelb.addElement(i);
          }
          
          try {
        
          
           
 
            MaskFormatter mf = new MaskFormatter("0212 ### ####");
            ftxtTelefon.setFormatterFactory(new DefaultFormatterFactory(mf));
            // formattfiled kodu
            
        } catch (Exception e) {
              System.out.println(e.getMessage());
        }
            
              
    }

    public ArrayList<City> getCities() throws SQLException {
        DbHelper helper = new DbHelper();
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet;
        ArrayList<City> cities = null;
        
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from City");
            
            
            cities = new ArrayList<City>();
            while (resultSet.next()) {
                
                 cities.add(new City(
                         resultSet.getInt("ID"),
                         resultSet.getString("Name"),
                         resultSet.getString("CountryCode"),
                         resultSet.getString("District"),
                         resultSet.getInt("Population")
                 ));
            }
            
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
        return cities;
    }
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnGodemo2 = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        txtfield = new javax.swing.JTextField();
        cbxCity = new javax.swing.JComboBox<>();
        txtindex = new javax.swing.JTextField();
        txtValue = new javax.swing.JTextField();
        cbxRed = new javax.swing.JComboBox<>();
        cbxGreen = new javax.swing.JComboBox<>();
        cbxBlue = new javax.swing.JComboBox<>();
        lblColor = new javax.swing.JLabel();
        lblRenkadları = new javax.swing.JLabel();
        rdbJava = new javax.swing.JRadioButton();
        rdbCSHARP = new javax.swing.JRadioButton();
        btnDil = new javax.swing.JButton();
        btnYenidenac = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ftxtTelefon = new javax.swing.JFormattedTextField();
        btnLogin = new javax.swing.JButton();
        lblLoginControl = new javax.swing.JLabel();
        spnGreen = new javax.swing.JSpinner();
        spnRed = new javax.swing.JSpinner();
        spnBlue = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Country Code", "District", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCities);
        if (tblCities.getColumnModel().getColumnCount() > 0) {
            tblCities.getColumnModel().getColumn(1).setResizable(false);
            tblCities.getColumnModel().getColumn(2).setResizable(false);
            tblCities.getColumnModel().getColumn(3).setResizable(false);
            tblCities.getColumnModel().getColumn(4).setResizable(false);
        }

        lblSearch.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblSearch.setText("Arama:");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        btnGodemo2.setText("form 2'ye git");
        btnGodemo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGodemo2ActionPerformed(evt);
            }
        });

        btnTest.setText("test butonu");
        btnTest.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnTestMouseMoved(evt);
            }
        });
        btnTest.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btnTestMouseWheelMoved(evt);
            }
        });
        btnTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTestMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTestMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTestMouseReleased(evt);
            }
        });

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtfield.setEnabled(false);

        cbxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCityİtemStateChanged(evt);
            }
        });

        cbxRed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxRed.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxRedİtemStateChanged(evt);
            }
        });
        cbxRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRedActionPerformed(evt);
            }
        });

        cbxGreen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxGreen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxGreenİtemStateChanged(evt);
            }
        });

        cbxBlue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxBlue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxBlueİtemStateChanged(evt);
            }
        });

        lblColor.setOpaque(true);

        lblRenkadları.setText("Kırmızı         Yeşil         Mavi");

        rdbJava.setText("Java");

        rdbCSHARP.setText("C#");

        btnDil.setText("Dili Kaydet");
        btnDil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDilActionPerformed(evt);
            }
        });

        btnYenidenac.setText("Yeniden Başlat");
        btnYenidenac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenidenacActionPerformed(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("Telefon:");

        btnLogin.setText("Giriş");

        spnGreen.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 5));
        spnGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGreenStateChanged(evt);
            }
        });

        spnRed.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 5));
        spnRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnRedStateChanged(evt);
            }
        });

        spnBlue.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 5));
        spnBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBlueStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGodemo2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(btnTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRenkadları, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(spnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnYenidenac)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName)
                                    .addComponent(txtSoyad)
                                    .addComponent(ftxtTelefon)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbJava)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbCSHARP)
                                .addGap(18, 18, 18)
                                .addComponent(btnDil)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLoginControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnRed, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(spnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblRenkadları)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGodemo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbJava)
                            .addComponent(rdbCSHARP)
                            .addComponent(btnDil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ftxtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin)
                            .addComponent(lblLoginControl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnYenidenac)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> sorter = 
                new TableRowSorter<DefaultTableModel>(model);
        tblCities.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search));
        txtfield.setEnabled(false);
        lblArea.setText(txtSearch.getText());
       
       String x = txtSearch.getText();
       if (x.equals("yusuf")) txtfield.setEnabled(true);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnGodemo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGodemo2ActionPerformed
     demo2 demo = new demo2();
     demo.setVisible(true);
    }//GEN-LAST:event_btnGodemo2ActionPerformed

    private void btnTestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseEntered
     
        btnTest.setText("mouse üstünde");
        btnTest.setBackground(Color.YELLOW);
     
    }//GEN-LAST:event_btnTestMouseEntered

    private void btnTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseClicked
          btnTest.setText("tıklandı");
             btnTest.setBackground(Color.CYAN);
     
    }//GEN-LAST:event_btnTestMouseClicked

    private void btnTestMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btnTestMouseWheelMoved
         btnTest.setText("tekerlek hareketi");
             btnTest.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_btnTestMouseWheelMoved

    private void btnTestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMousePressed
         btnTest.setText("basılı");
             btnTest.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnTestMousePressed

    private void btnTestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseExited
         btnTest.setText("buton dısına cıkıldı ama hala basılı");
             btnTest.setBackground(Color.red);
    }//GEN-LAST:event_btnTestMouseExited

    private void btnTestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseMoved
         btnTest.setText("hareket");
             btnTest.setBackground(Color.white);
    }//GEN-LAST:event_btnTestMouseMoved

    private void btnTestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestMouseReleased
       btnTest.setText("buton bırakıldı");
             btnTest.setBackground(Color.PINK);
    }//GEN-LAST:event_btnTestMouseReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cbxCityİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCityİtemStateChanged
       txtindex.setText(Integer.toString(cbxCity.getSelectedIndex()));
         txtValue.setText(cbxCity.getSelectedItem().toString());
         
    }//GEN-LAST:event_cbxCityİtemStateChanged

    private void cbxRedİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxRedİtemStateChanged
       r = cbxRed.getSelectedIndex();
       lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_cbxRedİtemStateChanged

    private void cbxGreenİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxGreenİtemStateChanged
          g = cbxGreen.getSelectedIndex();
       lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_cbxGreenİtemStateChanged

    private void cbxBlueİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxBlueİtemStateChanged
          b = cbxBlue.getSelectedIndex();
       lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_cbxBlueİtemStateChanged

    private void btnDilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDilActionPerformed
        System.out.println("Bilinen Yazılım Dilleri: ");
        if (rdbJava.isSelected()) System.out.println("Java");
            if (rdbCSHARP.isSelected()) System.out.println("C#");
    }//GEN-LAST:event_btnDilActionPerformed

    private void btnYenidenacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenidenacActionPerformed
     demo1 = new demo();
        try {
              System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
     //demo1.setVisible(true);
    }//GEN-LAST:event_btnYenidenacActionPerformed

    private void cbxRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRedActionPerformed

    private void spnGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGreenStateChanged
          g = (int)spnGreen.getValue();
      lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_spnGreenStateChanged

    private void spnRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnRedStateChanged
      r = (int)spnRed.getValue();
      lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_spnRedStateChanged

    private void spnBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBlueStateChanged
           b = (int)spnBlue.getValue();
      lblColor.setBackground(new Color(r,g,b));
    }//GEN-LAST:event_spnBlueStateChanged
  
   
   
   
   
   
   
   
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDil;
    private javax.swing.JButton btnGodemo2;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton btnYenidenac;
    private javax.swing.JComboBox<String> cbxBlue;
    private javax.swing.JComboBox<String> cbxCity;
    private javax.swing.JComboBox<String> cbxGreen;
    private javax.swing.JComboBox<String> cbxRed;
    private javax.swing.JFormattedTextField ftxtTelefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLoginControl;
    private javax.swing.JLabel lblRenkadları;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JRadioButton rdbCSHARP;
    private javax.swing.JRadioButton rdbJava;
    private javax.swing.JSpinner spnBlue;
    private javax.swing.JSpinner spnGreen;
    private javax.swing.JSpinner spnRed;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtValue;
    private javax.swing.JTextField txtfield;
    private javax.swing.JTextField txtindex;
    // End of variables declaration//GEN-END:variables

    private void setDefaultLookAndFeelDecorated(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
