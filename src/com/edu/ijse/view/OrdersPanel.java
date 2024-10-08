/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.edu.ijse.view;

import com.edu.ijse.controller.CustomerController;
import com.edu.ijse.controller.ItemController;
import com.edu.ijse.controller.OrdersController;
import com.edu.ijse.dto.CustomerDto;
import com.edu.ijse.dto.ItemDto;
import com.edu.ijse.dto.OrderDetailDto;
import com.edu.ijse.dto.OrdersDto;
import com.edu.ijse.model.CustomerModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class OrdersPanel extends javax.swing.JPanel {

        private final OrdersController ordersController;
        private final CustomerController customerController;
        private final ItemController itemController;
        
        ArrayList<OrderDetailDto> orderDetailDtos = new ArrayList<>();

        
        /**
     * Creates new form OrdersPanel
     */
    public OrdersPanel() throws ClassNotFoundException, SQLException {
        this.itemController = new ItemController();
        this.customerController = new CustomerController();
        this.ordersController = new OrdersController();
        initComponents();
        getAllOrders();
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
        addTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        custidText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        discountText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        searchCustomerButton = new javax.swing.JButton();
        saerchCustomerLabel = new javax.swing.JLabel();
        searchItemButton1 = new javax.swing.JButton();
        saerchItemLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemidText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        saveButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(784, 564));

        addTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        addTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(addTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Orders View");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Date");

        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Discount");

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton.setText("place order ");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButton(evt);
            }
        });

        searchCustomerButton.setText("search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        saerchCustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saerchCustomerLabel.setText("none ");

        searchItemButton1.setText("search Item");
        searchItemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButton1ActionPerformed(evt);
            }
        });

        saerchItemLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saerchItemLabel1.setText("none ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Item ID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("qty");

        saveButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveButton1.setText("add to cart");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Order ID");

        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(itemidText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(searchItemButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(searchCustomerButton)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saerchCustomerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saerchItemLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(272, 272, 272))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustomerButton)
                    .addComponent(saerchCustomerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemidText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchItemButton1)
                    .addComponent(saerchItemLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTableMouseClicked
       
            try {
                searchOrder();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_addTableMouseClicked

    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
            try {
                searchCustomer();
            } catch (SQLException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void searchItemButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButton1ActionPerformed
            try {
                searchItem();
            } catch (SQLException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_searchItemButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        addToTable();
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void placeOrderButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButton
            try {
                try {
                    placeOrder();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ParseException ex) {
                Logger.getLogger(OrdersPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_placeOrderButton

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addTable;
    private javax.swing.JTextField custidText;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField discountText;
    private javax.swing.JTextField itemidText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JTextField qtyText;
    private javax.swing.JLabel saerchCustomerLabel;
    private javax.swing.JLabel saerchItemLabel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchItemButton1;
    // End of variables declaration//GEN-END:variables

  private void getAllOrders() throws ClassNotFoundException, SQLException {
            
        String[]columns = {"ItemID","QTY","Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns,0){
            public boolean isCellEditable(int rows,int colomn){
                return false;
            }
        };
        
        addTable.setModel(dtm);


    }
  
   private void addToTable() {
        
        OrderDetailDto odm = new OrderDetailDto("", itemidText.getText(), Integer.parseInt(qtyText.getText()), Double.parseDouble(discountText.getText()));
        orderDetailDtos.add(odm);
        
        Object[] rowData = {odm.getItemCode(), odm.getQty(), odm.getDiscount()};
        
        DefaultTableModel dtm = (DefaultTableModel) addTable.getModel();
        dtm.addRow(rowData);
        
        
 
   }

    private void searchOrder() throws ClassNotFoundException, SQLException {
        String orderID = (String) addTable.getValueAt(addTable.getSelectedRow(),0);
        OrdersDto ordersDto = ordersController.searchOrder(orderID);

        if (ordersDto != null) {
            dateText.setText(ordersDto.getO_Id());
            discountText.setText(String.valueOf(ordersDto.getDate()));
            custidText.setText(ordersDto.getCustId());
        } else {
            JOptionPane.showMessageDialog(this, "Can't find this Order");
        }
    }

     
    
    private void clearTextFields(){
        dateText.setText("");
        discountText.setText("");
        custidText.setText("");
        orderIdText.setText("");
        itemidText.setText("");
        qtyText.setText("");
        
    }

    private void searchCustomer() throws SQLException, ClassNotFoundException {
        String id  = custidText.getText();
        CustomerDto customerDto = customerController.serchCustomer(id);
        if (customerDto !=  null) {
            saerchCustomerLabel.setText(customerDto.getCustTitle()+"  "+customerDto.getCustName());
        }else{
            saerchCustomerLabel.setText("Customer Not Found");
        }
    }

    private void searchItem() throws SQLException, ClassNotFoundException {
        String id = itemidText.getText();
        ItemDto dto = itemController.searchItem(id);
        if (dto != null) {
            saerchItemLabel1.setText(dto.getDiscription());
        }else{
            saerchItemLabel1.setText("Item Not Found");
        }
    }

    private void placeOrder() throws ParseException, ClassNotFoundException, SQLException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        OrdersDto dto = new OrdersDto(orderIdText.getText(), sdf.parse(dateText.getText()), custidText.getText());
        String resp = ordersController.placeOrder(dto, orderDetailDtos);
        JOptionPane.showMessageDialog(this, resp);
        clearTextFields();
        clearAddTable();
        saerchCustomerLabel.setText("none");
        saerchItemLabel1.setText("none");
    }

    private void clearAddTable() {
        DefaultTableModel dm = (DefaultTableModel)addTable.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();
    }

}
