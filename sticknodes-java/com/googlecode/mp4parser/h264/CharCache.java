package com.googlecode.mp4parser.h264;

/* loaded from: classes2.dex */
public class CharCache {
    private char[] cache;
    private int pos;

    public CharCache(int r1) {
            r0 = this;
            r0.<init>()
            char[] r1 = new char[r1]
            r0.cache = r1
            return
    }

    public void append(char r4) {
            r3 = this;
            int r0 = r3.pos
            char[] r1 = r3.cache
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r0 >= r2) goto Lf
            r1[r0] = r4
            int r0 = r0 + 1
            r3.pos = r0
        Lf:
            return
    }

    public void append(java.lang.String r5) {
            r4 = this;
            char[] r5 = r5.toCharArray()
            char[] r0 = r4.cache
            int r1 = r0.length
            int r2 = r4.pos
            int r1 = r1 - r2
            int r3 = r5.length
            if (r3 >= r1) goto Le
            int r1 = r5.length
        Le:
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r2, r1)
            int r5 = r4.pos
            int r5 = r5 + r1
            r4.pos = r5
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.pos = r0
            return
    }

    public int length() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.cache
            int r2 = r4.pos
            r3 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }
}
