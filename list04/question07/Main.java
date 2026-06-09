package br.edu.inf008.lista4.q7;

public class Main {    
    public static void main(String[] args) throws Exception {        
        String[] classNames = {            
            "br.edu.inf008.lista4.q7.HelloPlugin",            
            "br.edu.inf008.lista4.q7.GoodbyePlugin",            
            "br.edu.inf008.lista4.q7.UnknownClass" // não implementa Plugin        
        };        
        PluginLoader loader = new PluginLoader();        
        loader.loadAndRun(classNames);    
    } 
}