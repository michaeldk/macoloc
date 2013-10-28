package com.macoloc.controller.util;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {

	 private SimpleDateFormat sdf; 
	 
	 public DateEditor() {
		 sdf = new SimpleDateFormat("yyyy/MM/dd");
	 }
	 
	 @Override
	 public void setAsText(String text) throws IllegalArgumentException {
	   if (text != null && !text.trim().equals("")) {
		   try {
			   setValue(sdf.parse(text));
		   } catch (ParseException e) {
			   throw new IllegalArgumentException(text);
		   }
	   }
	 }

	 @Override
	 public String getAsText() throws IllegalArgumentException {	
		 if (getValue() != null) {
			 return sdf.format((Date) getValue());
		 } else {
			 return "";
		 }
	 }
}
