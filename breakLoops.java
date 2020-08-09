package com.demo.concepts;

import com.demo.customExceptions.BreakLoopException;

public class breakLoops {
    public static void main(String[] args) {
        loop1:
        for (int i=0; i<10; i++){
            for(int j = 0; j< 10; j++){
                int k = i*j;
                System.out.println(k);
                if(k == 10){
                    break loop1;
                }
            }
        }

        System.out.println("Successfully came out");

        try{
            for (int i=0; i<10; i++){
                for(int j = 0; j< 10; j++){
                    int k = i*j;
                    System.out.println(k);
                    if(k == 20){
                        throw new BreakLoopException();
                    }
                }
            }
        }catch(BreakLoopException ex){
            System.out.println("Caught an exception");
        }finally{
            //execute next logic part
            System.out.println("Success");
        }
    }
}
