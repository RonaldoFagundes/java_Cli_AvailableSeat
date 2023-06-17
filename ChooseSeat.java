
import java.util.Scanner;





public class ChooseSeat{



  private static Scanner read = new Scanner(System.in);


  private static String name = "";

  
  private static String [][] bus = new String[20][5];
  
  
 
  private static int menu = 0;
  
  private static int row = 0;
  
  private static int col = 0;




  public static void main (String args[]){

     System.out.println("Informe seu nome! \n");  
     name = read.nextLine(); 
     System.out.println("Bem vindo "+name+"\n"); 
	 	 
	 model();	  
	 controller();  
       	
  }
 
 
 
 
 
 
      private static void model(){		  
		  
		 for(int i =1 ; i < 20; i++){
		   
		   for(int j =1 ; j < 5; j++){			   
			   
			   bus[i][j] = "[O]";
		    }		   
	     }		  
	  }
 





     private static void controller (){		   
		   		   
	   while(menu != 3 ){
		
		System.out.println("----------------------------\n");		
		
		System.out.println("Escolha uma opção\n");
		
		System.out.println("[ 1 ] - Reservar");
        System.out.println("[ 2 ] - Layout do Onibus ");
        System.out.println("[ 3 ] - Sair");		
		
		System.out.println("----------------------------\n");		
		
		menu = read.nextInt();		
		
		if(menu == 1){
						 
			 System.out.println("informe o corredor 'coluna' entre 1 e 4 ! ");
			  col = read.nextInt();
			  
			 System.out.println("informe a poltrona 'linha' entre 1 e 19 ! ");
			  row = read.nextInt();
			  			  
			    if( bus[row][col].equals("[O]") ){

                    bus[row][col] = "[X]" ;  

				}else{

                  System.out.println(" assento já está ocupado, escolha outro !  ");
				  
				}	
			  
		 }else if(menu == 2){
			 
		  System.out.println("  [º]                   ");
		  
		  System.out.println("  ______________________");
		  
		  System.out.println("");
		
		
		  for (int i =1; i < bus.length; i++){
		
            for(int j =1; j < bus[i].length; j++){	

                System.out.print("  "+bus[i][j]+"  "); 
		    }

             System.out.println("");		   
	     }
		 			
	  }
		
    }
	
		
	
 }


}








  /*   
 
      seat[0][0] = " [1] [2] [3] [4] [5]";	  
	  seat[0][1] = " [6] [7] [8] [9] [10] ";
	  seat[0][2] = " [11] [12] [13] [14] [15]";	  
	  seat[0][3] = " [16] [17] [18] [19] [20] ";
	  
	  seat[1][0] = " [21] [22] [23] [24] [25] ";	  
	  seat[1][1] = " [26] [27] [28] [29] [30] ";
	  seat[1][2] = " [31] [32] [33] [34] [35] ";	  
	  seat[1][3] = " [36] [37] [38 [39] [40] ";
	  
	  seat[2][0] = " [4] [42] [43] [44] [45] ";	  
	  seat[2][1] = " [46] [47] [48] [49 [50] ";
	  seat[2][2] = " [51] [52] [53] [54] [55] ";	  
	  seat[2][3] = " [56] [57] [58] [59] [60] ";
	  
      for(int i=0; i<1; i++){
		 		 
         for(int j=0; j<1; j++){
			 
			 seat[i][j] = " [1] [2] [3] [4] ";			 
		 }		 
	  }
     
      
	  
	  
     for (int i =0; i<seat.length; i++){
		
           for(int j =0; j<seat[i].length; j++){

               System.out.println(seat[i][j]+" "); 
		   }

         System.out.println();		   
	 }
	 
	 
	 
	 
	 
	 
	 
       for(int i =1 ; i < 20; i++){
		   
		 for(int j =1 ; j < 5; j++){			   
			   
			   bus[i][j] = "[O]";
		   }		   
	     }
            
		  
      while(menu != 3 ){
		
		System.out.println("----------------------------\n");
				
		System.out.println("Escolha uma opção\n");
		
		System.out.println("[ 1 ] - Reservar");
        System.out.println("[ 2 ] - Layout do Onibus ");
        System.out.println("[ 3 ] - Sair");
				
		System.out.println("----------------------------\n");
				
		menu = read.nextInt();
					
		 if(menu == 1){
			 			 
			 System.out.println("informe o corredor 'coluna' entre 1 e 4 ! ");
			  col = read.nextInt();
			  
			 System.out.println("informe a poltrona 'linha' entre 1 e 19 ! ");
			  row = read.nextInt();
			 			  
			    if( bus[row][col].equals("[O]") ){

                  bus[row][col] = "[X]" ;  

				}else{

                  System.out.println(" assento já está ocupado, escolha outro !  ");
				  
			 }					  
			  
		 }else if(menu == 2){
			 
		  System.out.println("  [º]                   ");
		  
		  System.out.println("  ______________________");
		  
		  System.out.println("");
		
		  for (int i =1; i < bus.length; i++){
		
            for(int j =1; j < bus[i].length; j++){		
			
                System.out.print("  "+bus[i][j]+"  "); 
		    }

         System.out.println("");		   
	  }
		  	 
	}
		
  }  
	 
	 
 */