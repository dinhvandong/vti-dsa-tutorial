package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

public class FrequentElement {
    public static void main(String[] args) {

     int array[] =   {1,1,1,2,2,3};
     int k = 2;

     int result[] = maxFrequent(array, k);
     for(int i = 0;i< result.length;i++)
     {
         System.out.println(result[i]);
     }

    }

    static int[] maxFrequent(int [] array, int k){
        //[1,1,1,2,2,3], k = 2
        Set<Integer> integerSet = new HashSet<>();
        for(int i = 0;i< array.length;i++){
            integerSet.add(array[i]);
        }

        Set<NumFrequent> numFrequentList = new HashSet<>();

        int index = 0;
        for(Integer integer: integerSet){
            NumFrequent numFrequent = new NumFrequent(integer.intValue(), 1);//int number, int frequent
            numFrequentList.add(numFrequent);
        }

        for( int i = 0;i< array.length;i++)
        {
            boolean check = integerSet.add(array[i]);
            if(!check){

                while(numFrequentList.iterator().hasNext()){

                    NumFrequent numFrequent = numFrequentList.iterator().next();

                    if(numFrequent.getNumber() == array[i]){

                        int count =numFrequent.getFrequent()+1;

                        numFrequentList.remove(numFrequent);

                        NumFrequent numFrequent1 = new NumFrequent(array[i], count);
                        numFrequentList.add(numFrequent1);
                    }
                }

            }


        }
        int arrayResult [] = new int[k];
        int i = 0;
        numFrequentList.stream().sorted();

        for(NumFrequent numFrequent: numFrequentList){
            arrayResult[i] = numFrequent.getNumber();
        }

        return arrayResult;
    }
}


class NumFrequent{
    int number;
    int frequent;

    public NumFrequent()
    {

    }
    public NumFrequent(int number, int frequent) {
        this.number = number;
        this.frequent = frequent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFrequent() {
        return frequent;
    }

    public void setFrequent(int frequent) {
        this.frequent = frequent;
    }
}
