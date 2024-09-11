package com.edu.ijse;

import com.edu.ijse.view.CustomerView;
import com.edu.ijse.view.ItemView;
import com.edu.ijse.view.OrdersView;
import java.sql.SQLException;


public class mvc {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      new OrdersView().setVisible(true);
    }
    
}
