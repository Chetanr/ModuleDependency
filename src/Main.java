import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static GetModuleDependencies modulesCreated = new GetModuleDependencies();
    
    public static void main(String[] args) throws Exception {     
        addModule();
        processCommand();   
    }

    public static void processCommand(){
        System.out.println("Enter the module id");
        Scanner scanner = new Scanner(System.in);
        String module = scanner.nextLine();
        scanner.close();
        getDependency(module);
  
    }

    public static void addModule(){
        Modules a = new Modules();
        a.moduleContents.add("B");
        a.moduleContents.add("C");
        a.moduleContents.add("D");
        
        modulesCreated.addModule("a", a);

        Modules c = new Modules();
        c.moduleContents.add("E");
        c.moduleContents.add("F");
        c.moduleContents.add("G");
        
        modulesCreated.addModule("c", c);

        Modules g = new Modules();
        g.moduleContents.add("H");
        g.moduleContents.add("I");
        
        modulesCreated.addModule("g", g);
    }

    public static void getDependency(String module){
        try {
            List<String> dependencies = new ArrayList<String>();
            dependencies = modulesCreated.getModuleDependencies(module.toLowerCase());
            CheckDuplicates checkDuplicates = new CheckDuplicates();
            if (checkDuplicates.check(dependencies)){
                dependencies.remove(module);
                System.out.println(dependencies);
            }
            else {
                System.out.println("error");
            }
            
        } catch(Exception e){
            System.out.println("error");
        }
        
    }
}
