// Perform following Functionalities of the string:
// “CHARUSAT University”
// ● Find length
// ● Replace ‘H’ by ‘N’
// ● Convert all character in Uppercase
// ● Extract and print “CHARUSAT” from given string

public class exp2_7 {
    
        public static void main(String[] args) {
            String str = "CHARUSAT University";
    
            System.out.println("The length of the string : " + str.length());
            System.out.println("Replace \'H\' for \'N\' : " + str.replace('H', 'N'));
            System.out.println("Convert to upper case : " + str.toUpperCase());
            System.out.println("Extract CHARUSAT : " + str.substring(0, 8));
    
            System.out.println("This practical is made by 23CS095-Keshvi Siroya");
        }
    }

