package com.musicg.dsp;

import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: scott
 * Date: 11/22/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class HanWindowTester {
    public static void main(String[] args) throws Exception {
        WindowFunction wf = new WindowFunction();
        wf.setWindowType("Hanning");
        double[] win = wf.generate(100);
        PrintWriter writer = new PrintWriter("han.dat");
        for (int i = 0; i < win.length; i++) {
            writer.println(win[i]);
        }
        writer.close();
        System.out.println("done");
    }
}
