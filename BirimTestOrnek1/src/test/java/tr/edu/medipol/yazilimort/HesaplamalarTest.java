package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	/*
	@Test
	public void testFaktoriyelRec() {
	  int sonuc = Hesaplamalar.faktoriyelRec(5);
	  assertEquals(120,sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120,sonuc);
		
	}
	*/
	
	@Test
	public void testToplama() {
		int sonuc = Hesaplamalar.topla(2, 3);
		assertEquals(5,sonuc);	
	}
	
	@Test
	public void testCikarma() {
		int sonuc1 = Hesaplamalar.cikart(5, 1);
		assertEquals(4,sonuc1);	
	}
	
	@Test
	public void testCarpma() {
		int sonuc2 = Hesaplamalar.carpma(2, 3);
		assertEquals(6,sonuc2);	
	}

}
