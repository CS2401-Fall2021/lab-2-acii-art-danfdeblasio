import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.image.*;
import java.lang.Math;
public class Image {
  private int[][] image;
  public Image(String imageUrl){
    this.image = loadImage(imageUrl);
  }
  // Part 1
  public char[][] getBlackWhiteAscii(){
    return new char[1][1];
  }
  // Part 2
  public char[][] getGreyAscii(){
    return new char[1][1];
  }
  // Part 3
  public char[][] getRotatedGreyAscii(){
    return new char[1][1];
  } 
  // Part 4
  public char[][] getResizedGreyAscii(int newWidth,int newHeight){
    return new char[1][1];
  }


  public static int[][] loadImage(String fileName){	
     try{
    BufferedImage bufferedImage = ImageIO.read(new File(fileName));
    
    return convertTo2D(bufferedImage);
    } catch(IOException e){
       return new int[1][1];
     }
	}

   private static int[][] convertTo2D(BufferedImage image) {

      final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
      final int width = image.getWidth();
      final int height = image.getHeight();

      int[][] result = new int[width][height];

      
      for(int i = 0; i < width; i++)
          for(int j = 0; j < height; j++){
              result[i][j] = makeGrey(image.getRGB(j, i));
          }

      return result;
   }
  public static int makeGrey(int rgb)
  {
    int r = (rgb >> 16) & 0xFF;
    int g = (rgb >> 8) & 0xFF;
    int b = (rgb & 0xFF);

    
    return (r+g+b)/3;
  }
}
