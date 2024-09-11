package com.edu.ijse.controller;

import com.edu.ijse.dto.ItemDto;
import com.edu.ijse.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemController {

   private final ItemModel model;
    
   public ItemController(){
        this.model = new ItemModel();
    }
    

    public String saveItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
         String resp = model.saveItem(itemDto);
         return  resp;
    }

    public ArrayList<ItemDto> getAllItems() throws ClassNotFoundException, SQLException {
         ArrayList<ItemDto>itemDtos = model.getAllItems();
         return itemDtos;
    }

    public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException {
        ItemDto itemDto = model.searchItem(itemCode);
        return itemDto;
    }

    
    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
        String resp = model.deleteItem(itemCode);
        return resp;
    }

    public String updateItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
        String resp = model.updaeItem(itemDto);
        return resp;
    }
    
}
