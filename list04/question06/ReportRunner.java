import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class ReportRunner {
    public void run(Object obj) throws Exception {
        try {
            Method method = obj.getClass().getMethod("generate");
            method.invoke(obj);
        } catch (NoSuchMethodException e) {
            System.out.println("Método generate() não encontrado");
        } catch (InvocationTargetException e) {
            System.out.println("Método não acessível");
        } catch (Exception e) {
            System.out.println("Erro ao executar generate()");
        }
    }
}