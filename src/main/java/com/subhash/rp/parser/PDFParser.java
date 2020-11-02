package com.subhash.rp.parser;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFParser {

	public static void main(String[] args) throws IOException{
		
		try (PDDocument document = PDDocument.load(new File("C:\\Users\\Subhash\\eclipse-workspace\\AI-RecruiterProject\\Recruitment Portal\\Sorce Documents\\test_pdf.pdf"))) 
		{
			document.getClass();

			 if (!document.isEncrypted()) {

	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                //System.out.println("Text:" + st);

					// split by whitespace
	                String lines[] = pdfFileInText.split("\\r?\\n");
	                for (String line : lines) {
	                    System.out.println(line);
	                }

	            }
		}
	}

}
