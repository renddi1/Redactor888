public class Task3 {
    public int parseAge(String ageString){
        int parseAge = Integer.parseInt(ageString);
        if (parseAge > 0 && parseAge <= 120) {
            System.out.println(parseAge);
        }else {
           throw new IllegalArgumentException();
        }

        return parseAge;
    }
}
