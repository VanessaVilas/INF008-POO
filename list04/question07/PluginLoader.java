package br.edu.inf008.lista4.q7;

class PluginLoader {
    public void loadAndRun(String[] names) {
        for (String str : names) {
            Class<?> class = Class.forName(str);
            Plugin.class.isAssignableFrom(class)
        }
    }
}