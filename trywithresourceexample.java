public class trywithresourceexample {
    public static void main(String[] args){
        try (myresource res = new myresource("A")){
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }
        System.out.println();

        try (myresource res = new myresource("A")){
            String data = res.read2();
            int value = Integer.parseInt(data);
        } catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }
        System.out.println();

        myresource res1 = new myresource("A");
        myresource res2 = new myresource("B");
        try (res1; res2;){
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }
    }
}
