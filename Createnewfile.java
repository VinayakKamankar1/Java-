import java.io.File;
public class CreateNewFile {
    public static void main (String[] args){
        File f1=new File("myfile.txt");
        try{
            boolean value=f1.createNewFile();
            if(value)
            {
                System.out.println("File is created");
            }
            else{
                System.out.println("File is Exist");
            }
        }
            catch(Exception e){
                System.out.println("Error");
        }
    }
}



