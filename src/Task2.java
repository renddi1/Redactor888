public class Task2 {
    public boolean isAge(int age){
        boolean flag = true;
        if ( age > 0 && age <= 120){
            flag = true;
        }else {
            flag = false;
        }
        System.out.println(flag);
        return flag;
    }
}
