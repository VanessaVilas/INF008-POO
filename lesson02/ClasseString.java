class ClasseString 
{
    public static void main(String[] args){
        String str1 = String.join(" -> ", "1", "2", "3", "4", "5");
        System.out.println(str1);

        String str2 = "coffee java";
        boolean result = str2.startsWith("java");
        System.out.println(result);
    }
}