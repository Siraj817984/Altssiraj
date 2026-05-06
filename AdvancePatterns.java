//BUTTERFLY PATTERNS

 public class AdvancePatterns {
     public static void main(String[] args){
    // int n = 5;
//     //upper half 
//     for(int i=1; i<=n; i++){
//         //1st part
//         for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }  
//     //spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }



//                      // lower half
   
//     for(int i=n; i>=1; i--){
//         //1st part
//         for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }  
//     //spaces
//     int spaces = 2 * (n-i);
//     for(int j=1; j<=spaces; j++){
//         System.out.print(" ");
//     }
//     //2nd part
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }.





//**SOLID RHOMBUS

//int i =5;

// for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//     System.out.print(" ");
// }
// //stars
// for(int j=1; j<=5; j++){
//     System.out.print("*");
// }
// System.out.println();
//    }.




//NUMBER PYRAMID
//int i = 5;
// for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//     System.out.print(" ");
// }
// //numbers ->print row no, row no times
// for(int j=1; j<=i; j++){
//     System.out.print(i + " ");
// }
// System.out.println();
//    }.




//PALINDROMIC PATTERN
 //int i=5;
// for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //1st half
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }
//     //2nd half
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }.




//DIAMOND PATTERN
int n =4;
//upper half
for(int i=1; i<=n; i++){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
//lower half

for(int i=n; i>=1; i--){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    //stars
    for(int j=1; j<=2*i-1; j++){
        System.out.print("*");
    }
    System.out.println();
}
   }
}