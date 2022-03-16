package com.untill.driver.interfaces.posprinter;

import java.util.Arrays;

/**
 * Class is responsible for logo uploading
 */
public class PosPrinterUploadLogoRequest extends PosPrinterRequest {

	/**
	 * Number
	 */
	private int number;
	/**
	 * Image bytes
	 */
	private byte[] image;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "PosPrinterUploadLogoRequest{"
				+ "number=" + number
				+ ", image=" + Arrays.toString(image)
				+ "} " + super.toString();
	}
}
