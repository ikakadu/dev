package com.sort;
//归并排序
public class MergeSort {
    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{'E','E','G','M','R','A','C','E','R','T'};
//        merge(a,0,4,9);
        sort(a);
        System.out.println(a);
    }

    private static Comparable[] aux = new Comparable[10];//

    //原地归并
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        int i =lo, j = mid+1;

        for (int k = lo; k <=hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <=hi ; k++) {
            if (i>mid)  a[k] = aux[j++];
            else if (j>hi)  a[k] = aux[i++];
            else if (less(aux[j],aux[i]))  a[k] = aux[j++];
            else   a[k] = aux[i++];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    //自顶向下的归并排序
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<= lo) return;
        int mid = lo + (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }
}
