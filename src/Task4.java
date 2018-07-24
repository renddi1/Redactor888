public class Task4 {
    public String getToyName(int id){
      String[] getToy = new String[4];
      getToy[0] = "Car";
      getToy[1] = "Lego";
      getToy[2] = "Dool";
      getToy[3] ="Puzzle";
        if (id < 0 ||id > 3 ){
            throw new IllegalArgumentException();
        }
      String result = getToy[id];
        System.out.println(result);

      return result;
    }
}
