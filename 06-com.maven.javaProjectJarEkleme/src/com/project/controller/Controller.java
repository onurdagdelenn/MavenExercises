package com.project.controller;

import com.project.database.Repository;

public class Controller {

	public static void main(String[] args) {
		
		Repository repository = new Repository();
		
		repository.insert("Onur");
		repository.delete("Da�delen");
		
	}
	
	
}
