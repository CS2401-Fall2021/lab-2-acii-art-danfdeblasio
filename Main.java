class Main {
  
  public static void main(String[] args) {
    // Part 1
    Image image = new Image("small_pup.png");
    print(image.getBlackWhiteAscii()); 
    // Part 2
    //System.out.println(image.getGreyAscii());
    
    // Part 3
    //System.out.println(image.getRotatedGreyAscii());
    
    // Part 4
    //System.out.println(image.getResizedGreyAscii(100,100));
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
