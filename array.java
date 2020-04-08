public class array {

  public static void main(String[ ] argv) {

    //forma de declaracao de array
    if(argv.length == 0){
        System.out.printf("sem argumentos!\n");
    }

     else{
    System.out.println ("\nmostrando o array \n");
  
    
    for(int i = 0;i < argv.length;i++){
        System.out.printf("\narray na posiçao: %d eh %s\n ",i+1,argv[i]);
        
    }
    System.out.printf("\ntotal do array: %d\n",argv.length);
}
   
  }
}
