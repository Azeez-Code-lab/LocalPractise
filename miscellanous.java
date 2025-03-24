package com.br.javaPrractise.TargetHundred;

import java.util.*;

public class miscellanous {
    public void enqueue(int value) {
        Stack<Integer> si=new Stack<>();
        si.push(23);
        si.push(123);
        si.push(223);
        si.push(323);
        Stack<Integer> sl=new Stack<>();
        sl.push(423);
        sl.push(523);
        sl.push(623);
        sl.push(723);
        while (!si.isEmpty()) {
            sl.push(si.pop());
        }
        si.push(value);
        while (!sl.isEmpty()) {
            si.push(sl.pop());
        }
        System.out.println(si);
    }

    public static void main(String[] args) {
        int v=9;
        miscellanous nn=new miscellanous();
        nn.enqueue(v);
            System.out.println();
    }

}