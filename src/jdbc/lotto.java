package jdbc;

import java.util.Arrays;
import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        Random ran = new Random();

        int[] lotto = new int[6];       //6개 공간을 가지는 배열 생성 [0, 0, 0, 0, 0, 0]

        for(int i = 0; i< lotto.length; i++){

            int k = ran.nextInt(45)+1;  //k 는 1~45 의 난수
            boolean flg = true;                 //플래그 생성

            for(int num : lotto){               //배열의 값을 순서대로 num에 담아 루프
                if(num==k){                     //배열 내부의 값과 난수 k 가 같은 수라면
                    flg =false;                 //flg를 false로 바꾸고
                    break;                      //루프는 벗어남
                }                               //flg 가 true를 유지한다면 배열 내부에 k와 같은 값이 없음.
            }
            if(flg) lotto[i] = k;               //루프를 끝까지 돌아도 배열 내부값과 k값이 겹치지 않으므로 인덱스i에 k를 할당
            else i--;                           //배열 내부의 값과 난수 k 값이 같은게 있었으므로 인덱스 값을 늘리지 않고 반복


        }
        System.out.println(Arrays.toString(lotto));


    }
}
