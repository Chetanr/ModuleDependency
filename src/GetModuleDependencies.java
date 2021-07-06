import java.util.*;

public class GetModuleDependencies {
    HashMap<String, Modules> modules = new HashMap<>();
    List<String> dependencies = new ArrayList<String>();


    public List<String> getModuleDependencies(String moduleId) {
        try {
            Modules module = modules.get(moduleId.toLowerCase());
            modules.remove(moduleId.toLowerCase());
            ArrayList<String> subModules = new ArrayList<String>();
            subModules = module.getModule();
            for (String i : subModules){
                if (modules.containsKey(i.toLowerCase())){
                    getModuleDependencies(i);
                }
                else {
                    if (!dependencies.contains(i)){
                        dependencies.add(i.toUpperCase());
                    }
                }
            }
            dependencies.add(moduleId.toUpperCase());
            return dependencies;
        }catch (Exception e) {
            throw e;
        }
        
    }

    public void addModule(String moduleId, Modules module){
        modules.put(moduleId, module);
    }
}
