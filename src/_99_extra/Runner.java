package _99_extra;

public class Runner {
	public static void main(String[] args) {
		PixelParty pxl = new PixelParty();
		pxl.drawRectangle(10,10,200,200);
		pxl.drawRectangle(60,80,512,512);
		pxl.drawCircle(10, 10, 100);
		pxl.saveImage();
		pxl.displayImage();
	}
}
