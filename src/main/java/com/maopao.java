package com;

public class maopao {

    public int[] bubbleSort(int[] arr){

        //第一个for循环是程序需要执行要走多少趟

        for(int i=0;i<arr.length-1;i++){

            //第二个for循环是每趟需要比较多少次

            for(int j=0;j<arr.length-1-i;j++){

                //此处是从大到小排列

                if(arr[j]<arr[j+1]){
                    System.out.println("arr[j]:"+arr[j]);
                    System.out.println("arr[j+1]:"+arr[j+1]);

                    //定义一个临时变量temp

                    int temp=arr[j];
                    System.out.println("temp:"+temp);

                    arr[j]=arr[j+1];
                    System.out.println("arr[j]:"+arr[j]);

                    arr[j+1]=temp;
                    System.out.println("arr[j+1]:"+arr[j+1]);
                }

            }

        }

        return arr;

    }


    public static void main(String[] args) {

        int [] i ={44,22,33,41};
        maopao maopao=new maopao();
        maopao.bubbleSort(i);

    }



}
