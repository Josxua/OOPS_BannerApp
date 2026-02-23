public class OOPSBannerApp{
    public static void main(String args[]){
        String[] Lines={
            String.join("","   **    ","   **    ","*******  ","  *****  "),
            String.join("","**    ** ","**    ** ","**     **"," **      "),
            String.join("","**    ** ","**    ** ","*******  ","  *****  "),
            String.join("","**    ** ","**    ** ","**       ","      ** "),
            String.join(""," **  **  "," **  **  ","**       "," **   ** "),
            String.join("","   **    ","   **    ","**       ","  *****  ")
        };
        for(String Line : Lines)
        {
            System.out.println(Line);
        }
    }
}