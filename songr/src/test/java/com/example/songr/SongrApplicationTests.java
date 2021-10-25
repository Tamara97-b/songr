package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SongrApplicationTests {
	@Test
	void testConstructor() {
		Album album1 = new Album("salleme", "naseif", 333, 10, "https://i.pinimg.com/originals/39/00/d1/3900d1a27f9b4c9f7ceee205de33730c.jpg");
		System.out.println(album1.getTitle());
		assertEquals("salleme",album1.getTitle());
		assertEquals("naseif",album1.getArtist());
		assertEquals(333,album1.getSongCount());
		assertEquals(10 , album1.getLength());
		assertEquals("https://i.pinimg.com/originals/39/00/d1/3900d1a27f9b4c9f7ceee205de33730c.jpg",album1.getImageUrl());
	}


}








