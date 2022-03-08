package com.facerecsytem.controller;
import com.facerecsytem.ui.*;
import com.facerecsytem.db.*;
import com.facerecsytem.db.Face;

public class Main {

	public static void main(String[] args) {
		Face face=new Face();
		
		face.addFacePixelToDb();
		
		com.facerecsytem.ui.Face face2=new com.facerecsytem.ui.Face();
		
		face2.prntFaceOnUi();
	}
}
