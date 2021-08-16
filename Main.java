class Main {
  
  public static void main(String[] args) {
    // Part 1
    Image image = new Image("/Users/dfdeblasio/git_assignments/2401-f21/lab-2-acii-art-danfdeblasio/smile_small.jpeg");
    print(image.getBlackWhiteAscii()); 
    // Part 2
    print(image.getGreyAscii());
    
    // Part 3
    print(image.getRotatedGreyAscii());
    
    // Part 4
    print(image.getResizedGreyAscii(100,100));
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
