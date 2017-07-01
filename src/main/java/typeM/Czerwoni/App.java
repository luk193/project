package typeM.Czerwoni;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        Excel ss = new Excel();
//        ss.readXLS("sss");
        Menu menu = new Menu(args[0]);
        menu.printMenu();
        
    }
}
