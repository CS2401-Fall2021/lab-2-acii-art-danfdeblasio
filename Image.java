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
    char[][] rtn = new char[image.length][image[0].length];
    for(int i=0; i<image.length; i++){
      for(int j=0; j<image[i].length; j++){
        //System.out.print(image[i][j]);
        if(image[i][j]<= 128) rtn[i][j] = 'X';
        else rtn[i][j] = ' ';
      }
      //System.out.println();
    }
    return rtn;
  }
  // Part 2
  public char[][] getGreyAscii(){
    char[][] rtn = new char[image.length][image[0].length];
    for(int i=0; i<image.length; i++){
      for(int j=0; j<image[i].length; j++){
        //System.out.print(image[i][j]);
        if(image[i][j]<= 25) rtn[i][j] = 'M';
        else if(image[i][j]<= 50) rtn[i][j] = '$';
        else if(image[i][j]<= 76) rtn[i][j] = 'o';
        else if(image[i][j]<= 102) rtn[i][j] = '|';
        else if(image[i][j]<= 127) rtn[i][j] = '*';
        else if(image[i][j]<= 152) rtn[i][j] = ':';
        else if(image[i][j]<= 178) rtn[i][j] = '=';
        else if(image[i][j]<= 204) rtn[i][j] = '\'';
        else if(image[i][j]<= 230){
          rtn[i][j] = '.';
          //System.err.println(i + "," + j + " : " + image[i][j]);
        }  else rtn[i][j] = ' ';
      }
      //System.out.println();
    }
    return rtn;
  }
  // Part 3
  public char[][] getRotatedGreyAscii(){
    char[][] rtn = new char[image[0].length][image.length];
    for(int i=0; i<image.length; i++){
      for(int j=0; j<image[i].length; j++){
        //System.out.print(image[i][j]);
        if(image[i][j]<= 25) rtn[j][image.length-i-1] = 'M';
        else if(image[i][j]<= 50) rtn[j][image.length-i-1] = '$';
        else if(image[i][j]<= 76) rtn[j][image.length-i-1] = 'o';
        else if(image[i][j]<= 102) rtn[j][image.length-i-1] = '|';
        else if(image[i][j]<= 127) rtn[j][image.length-i-1] = '*';
        else if(image[i][j]<= 152) rtn[j][image.length-i-1] = ':';
        else if(image[i][j]<= 178) rtn[j][image.length-i-1] = '=';
        else if(image[i][j]<= 204) rtn[j][image.length-i-1] = '\'';
        else if(image[i][j]<= 230) rtn[j][image.length-i-1] = '.';
        else rtn[j][image.length-i-1] = ' ';
      }
      //System.out.println();
    }
    return rtn;
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
