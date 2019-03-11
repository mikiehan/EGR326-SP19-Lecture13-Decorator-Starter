package io;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
 
	@Override
	public int read() throws IOException {
		// you need to modify this method
		// currently it just reads a character from parent class and returns the character as it is
		int c = super.read();
		return c; 
	}
	
	@Override
	public int read(byte[] b, int offset, int len) throws IOException {
		// you need to modify this method
		// currently it just reads multiple characters from parent class and returns the characters as they are
		int result = super.read(b, offset, len);
		return result;
	}
}
