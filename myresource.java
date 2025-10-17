public class myresource implements AutoCloseable{
    private String name;

    public myresource(String name){
        this.name = name;
        System.out.println("[myresource(" + name + " 열기]");
    }

    public String read1() {
        System.out.println("[myresource(" + name + " 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[myresource(" + name + " 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception{
        System.out.println("[myresource(" + name + " 닫기]");
    }
}
