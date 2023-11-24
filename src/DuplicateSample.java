public class DuplicateSample {

    public static void main(String[] args) {
        //solving1

        String str = "abcccc";
        char[] myArrray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.println("Duplicate Characters in above string are: ");

        for (int i = 0; i < myArrray.length; i++) {
            for (int j = i+1; j < myArrray.length; j++) {
                if(myArrray[i] == myArrray[j] ){
                    System.out.print(myArrray[j] + " ");
                    break;
                }
            }
        }
    }
}

//solving2

//        String str = "aaabcaa";
//        System.out.println(
//                str.trim().toLowerCase().chars().mapToObj(x -> (char)x)
//                        .filter(x -> Character.isWhitespace(x) == false)
//                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                        .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey()
//        );

