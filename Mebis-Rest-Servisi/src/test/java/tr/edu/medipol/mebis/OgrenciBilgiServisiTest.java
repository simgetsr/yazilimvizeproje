package tr.edu.medipol.mebis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;
import org.junit.jupiter.api.Test;

class OgrenciBilgiServisiTest {

	  @Test 
	    public void ogrenciTest1() {
	       
	 

	    List<String> ogrenciler = new ArrayList<>();
	         {
	             String ogrenci ="simge";
	             String ogrenci1 ="halil";
	             String ogrenci2 ="kemal";
	           
	             
	           
	        ogrenciler.add(ogrenci);
	        ogrenciler.add(ogrenci1);
	        ogrenciler.add(ogrenci2);
	    
	            
	    
	            assertEquals("simge",ogrenci);
	            assertEquals("halil",ogrenci1);
	            assertEquals("kemal",ogrenci2);
	          
	        }

	 

	    }
	    @Test

	 

	    public void   ogrenciEkleme() {
	        List<String> ogrenciler = new ArrayList<>();{
	             String ogrenci ="simge";
	         }
	      
	         
	         String newname="Ali";
	         
	         ogrenciler.add(newname);
	         
	         
	     
	         
	         assertEquals(newname,"Ali");
	       
	    }
	    @Test    
	    public void OgrenciSilme() {

	            List<String> ogrenciler = new ArrayList<>();
	             {
	                 
	                 String ogrenci2 ="kemal";
	                 
	     
	                 
	                 ogrenciler.remove(ogrenci2);
	            
	        
	                 assertEquals(ogrenci2,"kemal");
	             }
	    }
	    @Test
	    public void OgrenciGuncelleme() {
	        

	        
	        List<String> ogrenciler = new ArrayList<>();
	        
	         {
	             String ogrenci1 ="halil";
	             
	             
	             ogrenciler.remove(ogrenci1);
	             
	             ogrenci1 = "Mehmet";
	    
	                 
	                ogrenciler.add(ogrenci1);
	                

	                
	                assertEquals(ogrenci1,"Mehmet");
	                
	         }
	         
	    }
	    @Test
	    public void OgrenciNotGuncelleme() {
	        

	        
	        List<String> ogrenciler = new ArrayList<>();
	        
	         {
	             String ogrenci ="simge";
	             String not ="90";
	   
	             
	             ogrenciler.remove(ogrenci);
	             ogrenciler.remove(not);
	             
	             
	             ogrenci = "simge";
	             not = "100";
	    
	                 
	                ogrenciler.add(ogrenci);
	                ogrenciler.add(not);

	                
	                assertEquals(ogrenci,"simge");
	                assertEquals(not,"100");
	                
	         }
	         
	    }



	}


