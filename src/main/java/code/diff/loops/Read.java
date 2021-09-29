package code.diff.loops;

public class Read {

    public static void main(String[] args) {

        // Problem 1
        for(int i = 0; i < 6; i++){
            System.out.println(i);
        }
// 0, 1, 2,3,4,5
        // Problem 2
        for(int i = 4; i < 10; i++){
            System.out.println(i);
        }
// 4,5,6,7,8,9
        // Problem 3
        for(int i = 0; i < 10; i+=2){
            System.out.println(i);
        }
// 0, 2, 4, 6, 8
        // Problem 4
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
//10,9,8,7,6,5,4,3,2,1,0
        // Problem 5
        int count = 5;
        while(count > 0){
            System.out.println(count);
            count--;
        }
// 5,4,3,2,1
        // Problem 6
        int myCount = 0;
        for(int i = 0; i < 10; i++){
            myCount += i;
            // myCount = myCount + i
            //c = 0 0   1   3   6   10  15  21  28  36  45
            //i = 0 1   2   3   4   5   6   7   8   9
        }
        System.out.println(myCount);
// 0 0 1 3 6 10 15 21 28 36 45
        // Problem 7
        int yourCount = 1;
        while(yourCount < 6){
            System.out.println(2*yourCount);
            yourCount++;
        }
// 2,4,6,8,10
        // Problem 8
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + ":" + j);
            }
        }
//0:0
//0:1
//0:2
//0:3
//0:4
//1:0
//1:1
//1:2
//1:3
//1:4
//2:0
//2:1
//2:2
//2:3
//2:4
//3:0
//3:1
//3:2
//3:3
//3:4
//4:0
//4:1
//4:2
//4:3
//4:4
        // Problem 9
        String str = "";
        for(int i = 0; i < 5; i++){
            str += i;
        }
        System.out.println(str);
//0, 1, 2, 3, 4
        // Problem 10
        String myStr = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                myStr += j;
            }
            myStr += "\n";
        }
        System.out.println(myStr);
//01234
//01234
//01234
//01234
//01234
        // Problem 11
        int i = 0;
        while (i >= 0) {
            if (i == 2) {
                i += 2;
                continue;
            }
            i++;
            System.out.println(i);

            if (i == 6) {
                break;
                // 1 2 5 6
            }
        }

    }


}
