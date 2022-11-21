import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
       
        System.out.println("Enter a Sentence (any English sentence)");
        String S = st.nextLine();
                System.out.println("Enter a Letter (any letter from A to Z)");
                String letter= st.nextLine();
                int index = S.indexOf(letter);
                if(index==-1)
                {
                            System.out.println("The letter does not exist in the sentence");
                }
                else
                {
                            System.out.println(S.substring(index+1));

                }

                }

    }
