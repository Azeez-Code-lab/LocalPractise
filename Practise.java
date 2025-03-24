package com.br.javaPrractise;


import com.br.javaPrractise.collectionMethods.Stack.Stack;

import java.text.ParseException;
import java.util.*;

public class Practise {
    public static int removeDuplicates(int[] a, int n) {
        if (a.length == 0) {
            return 0;
        }

        // Sorting the array to bring duplicates together
        Arrays.sort(a);

        // j is the index of the last unique element found
        int j = 0;

        for (int i = 1; i < a.length; i++) {
            // If current element is different from the last unique element
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i]; // Move the unique element to the next position
            }
        }

        return j + 1; // Return the count of unique elements
    }

    public static void main(String[] args) throws ParseException {
//        String name = "Azeez";
//        for(int i=0;i<name.length();i++){
//            int count=0;
//            for(int j=0;j<name.length();j++){
//                if(name.charAt(j)==name.charAt(i)){
//                    count++;
//                }
//            }
//        }

//        String str = "aabcccd";
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            String chr="";
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//
//            }
////            System.out.println("The count for"+str.charAt(i)+"is "+count);
//            if (!(result.contains(Character.toString(str.charAt(i))))) {
//                //result += " " + str.charAt(i);
//                result += str.charAt(i)+" : " + count+" ";
//                chr=str.charAt(i)+" : " + count+" ";
//                System.out.println(chr);
//            }
//
//        }

        //System.out.println(result);

//        Integer[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
//        int[] fr = new int[arr.length];
//        int visited=-1;
//        for(int i=0;i<arr.length;i++){
//            int count=1;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                    fr[j]=visited;
//                }
//            }
//            if(fr[i]!=visited){
//                fr[i]=count;
//            }
//        }
//        for(int i=0;i<fr.length;i++){
//            if(fr[i]!=visited){
//                System.out.println(arr[i]+" is repeated by "+fr[i]);
//            }
//
//        }
        //reversing using collections
//        String str="Azeez";
//        char[] ch=str.toCharArray();
//        List<Character> sh=new ArrayList<>();
//        for(int i=0;i<ch.length;i++){
//            sh.add(ch[i]);
//        }
//        Collections.reverse(sh);
//        System.out.println(sh);
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<sh.size();i++){
//            sb.append(sh.get(i));
//        }
//        System.out.println(sb);
//        String sti="Broadridge";
//        Stack<Character> stc=new Stack<Character>();
//        char[] ch=sti.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            stc.push(ch[i]);
//        }
//        for(int j=0;j<ch.length;j++){
//            System.out.print(stc.pop());
//        }
//     int arr[]={1,3,4,1,3,3,4,6,7,8,6,8,9};
//     Set<Integer> uniqueEle=new HashSet<>();
//     Set<Integer> duplicatedEle=new HashSet<>();
//     for(int el:arr){
//         if(uniqueEle.add(el)!=false){
//             uniqueEle.add(el);
//         }
//         else {
//             duplicatedEle.add(el);
//         }
//     }
//     System.out.println(uniqueEle);
//     System.out.println(duplicatedEle);
//        String str="Azeez",rev="";
//        String st=str.substring(0,2);
//        System.out.println(st);
//        String ks=str.substring(1,4);
//        char[] ch=ks.toCharArray();
//        rev=rev+st;
//        for(int i=0;i<ch.length;i++){
//            rev+=ch[i];
//        }

//        System.out.println(rev);
//        }
        //LeetCode Challenge for Remove elements from duplicate arrays
//        int arr[]={1,2,3,4,5,6,2,2};
//        int v=2,index=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=v){
//                arr[index]=arr[i];
//                index++;
//            }
//            else{
//                arr[i]=0;
//            }
//        }
//        System.out.println(arr);

        //Leet code challenge *removing duplicates*
//        int a[] = { 1, 1, 2, 3, 4, 5, 6,6 };
//        int n = a.length;
//
//        n = removeDuplicates(a, n);
//
//        // Printing The array elements
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//
//        String Sentence="My Name is Azeez";
//        String reverseSenetence;
//        reverseSenetence=reversing(Sentence);
//        int[] arr={1,8,9,3,4,5,6};
//        int temp=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString((arr)));
//        String st="Welcome To JAVA Clas @ 12345";
//        int nCount=0,lcount=0,ucount=0,specialCount=0;
//        for(int i=0;i<st.length();i++){
//            char ch=st.charAt(i);
//            if(Character.isDigit(ch)){
//                nCount++;
//            }
//            if(Character.isLowerCase(ch)){
//               lcount++;
//            }
//            if(Character.isUpperCase(ch)){
//                ucount++;
//            }
//            else{
//                specialCount++;
//            }
//        }
//        List<Integer> lst = Arrays.asList(arr);
//        Set se=new HashSet<Integer>(lst);
//        for(Object s:se){
//            System.out.println("The Frequency of"+s+" is "+Collections.frequency(lst,s));
//        }
//        String sr="I Love India I Love India India India India India India";
//        String[] st=sr.split(" ");
////        List<String> lisr=Arrays.asList(st);
////        Set<String> ser=new HashSet<>(lisr);
//        HashMap<String,Integer> hs=new HashMap<>();
//        for(String tt:st){
//            if(hs.containsKey(tt)){
//                int x= hs.get(tt);
//                hs.put(tt, x+1);
//            }
//            else{
//                hs.put(tt, 1);
//            }
//        }
//        System.out.println(hs);
//
//        String name="Azeez";
//        char[] nameChar=name.toCharArray();
//        List<Character> li= new ArrayList<>(Arrays.asList('A','z','e','e','z'));
//        Set<Character> ser=new HashSet(li);
//        for(Character c:ser){
//            System.out.println("the frequency of "+c+" is "+Collections.frequency(li,c));
//        }
//        String s1 = "hello";
//        String s2 = new String("hello");
//        String s3 = "hello";
//        if (s1 == s2) {
//            System.out.println("s1 and s2 equal");
//        } else {
//            System.out.println("s1 and s2 not equal");
//        }
//        if (s1 == s3) {
//            System.out.println("s1 and s3 equal");
//        } else {
//            System.out.println("s1 and s3 not equal");
//        }
        //---------------------------------------------------------------------//
//        String name="Azeez";
//        char firstChar=name.charAt(0);
//        char lastChar=name.charAt(name.length()-1);
////        System.out.println(lastChar);
//
//        String subString=name.substring(0,name.length());
//        System.out.println(lastChar+subString+firstChar);
//
//        String name = "Karen", firstRev = "", lastRev = "";
//        String firstHalf = name.substring(0, 2);
//        String secondHalf = name.substring(2, (name.length()));
//
//        for (int i = firstHalf.length() - 1; i >= 0; i--) {
//            firstRev += firstHalf.charAt(i);
//        }
//        for (int i = 0; i <= secondHalf.length() - 1; i++) {
//            lastRev += secondHalf.charAt(i);
//        }
//        System.out.println(lastRev + firstRev);
//        String str="1@2@3@4@5";
//        //char[] ch=str.toCharArray();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!='@'){
//                System.out.println(str.charAt(i));
//            }
//        }
//        System.out.println("-------------------------------------------------------------");
//        String k=str.replaceAll("@","\n");
//        System.out.println(k);
//
//        String day = "Today is wednedayday. it is a good day";
//        String[] srr=day.split("day");
//        System.out.println(srr.length);
////
////
//        int d = day.length();
//        int d1= day.replace("day","").length();
//        int d2 = "day".length();
//        int finalv = (d-d1)/d2;
//        System.out.println(finalv);

//        String[] srrr=day.split(" ");
//        for(int i =0; i<srrr.length;i++) {
//            if (srrr[i].contains("day")) {
//                System.out.println("Index : " + i + " value is :" + srrr[i]);
//            }
//        }
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int n=arr.length;
//        int[] temp=new int[arr.length];
//        for(int i=1;i<arr.length;i++){
//            temp[i-1]=arr[i];
//        }
//        temp[n-1]=arr[0];
//        for (int i = 0; i < n; i++) {
//            System.out.print(temp[i]+" ");
//        }
//        String name="Sorry, we just need to make sure you're not a robot For best results, please make sure your browser is accepting cookies.";
//        int len;
//        String[] arr=name.replaceAll(",","").replaceAll(" ","").split("make");
//        len= arr.length;
//        System.out.println(len);

//        List<Integer> se=List.of(1,2,3,12,3,4,2);
//        Set<Integer>li=new HashSet<>(se);
//        System.out.println(li);
        String name="hello";int flag=0;
        char[] ch=name.toCharArray();
       for(int i=0;i<ch.length;i++){
           for(int j=i+1;j<ch.length;j++){
               if(ch[i]==ch[j]){
                   flag=flag+1;
               }
           }
       }
       if(flag>1){
           System.out.println("false");
       }
       else{
           System.out.println("true");
       }


    }


    public static String reversing(String sentence) {
        String[] str = sentence.split(" ");
        String stri = "";
        for (int i = 0; i < str.length; i++) {
            String rev = str[i];
            for (int j = rev.length() - 1; j >= 0; j--) {
                stri += rev.charAt(j);
            }
            stri += " ";
        }
        return stri;
    }



}