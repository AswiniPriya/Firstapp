package com.aswini.DAO;

//import com.aswini.modal.Menu;

public class TestMenuDAO {
public static void main(String[] args) {
	MenuDAO menuDAO=new MenuDAO();
	
	//Menu menu=new Menu();
	//menu.setId(1);
//	menu.setItem("vada");
	//menuDAO.update(menu);
//	menuDAO.save(menu);
	menuDAO.delete(1);
}
}
