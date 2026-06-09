import java.lang.reflect.Field;

class ObjectInspector {
    public void inspect(Object obj) {
        Field[] f = obj.getClass().getDeclaredFields();
        for(Field field: f) {
            try {
                field.setAccessible(true);

                String type = field.getType().getSimpleName();
                String name = field.getName();
                Object value = field.get(obj);

                System.out.println("[" + type + "] " + name + " = " + value);
            } catch (IllegalAccessException e) {
                System.out.println("ERRO!");
            }
        }
    }
}