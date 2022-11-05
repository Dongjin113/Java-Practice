public class sd {
    
    public static void main(String[] args) {
        
        int x = 5;
        String [] arr = new String[x];

        //배열에 넣음
        for(int y=0; y < arr.length; y++) {
            arr[y] = "*";
        }

        //배열 출력
        for (String i : arr) {
            System.out.print(i);
        }
    }
    
}
