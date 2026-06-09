package br.edu.inf008.lista4.q7;

class PluginLoader {
    public void loadAndRun(String[] names) {
        for (String str : names) {
            try {
                Class<?> clazz = Class.forName(str);
                boolean result = Plugin.class.isAssignableFrom(clazz);

                if (!result) {
                    System.out.println("Classe NÃO implementa Plugin");
                    continue;
                }
                
                Object obj = clazz.getDeclaredConstructor().newInstance();
                Plugin p = (Plugin) obj;
                p.execute();
            } catch (ClassNotFoundException e) {
                System.out.println("Classe não encontrada!");
            } catch (Exception e) {
                System.out.println("ERRO");
            }
        }
    }
}