import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Image image = new Image("smile_small.jpeg");
    String line = scanner.nextLine();
    String[] inputs=line.split(",");
    if(inputs[0].equals("bw")){
    print(image.getBlackWhiteAscii());
    }
    if(inputs[0].equals("gs")){
    print(image.getGreyAscii());
    }
    if(inputs[0].equals("r")){
      print(image.getRotatedGreyAscii());
    }
    if(inputs[0].equals("rz")){
    
    int newWidth =Integer.parseInt(inputs[1]);
    int newHeight =Integer.parseInt(inputs[2]);
    
    print(image.getResizedGreyAscii(newWidth,newHeight));
    }
  }
  private static void print(char[][] a){		
    for(int i=0; i<a.length; i++){			
        for(int j=0; j<a[i].length; j++){
	        System.out.print(a[i][j]+ " ");	
	      }
	    System.out.println();
    }
  }
}
