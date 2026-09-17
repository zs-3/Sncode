package com.googlecode.mp4parser.h264;

/* loaded from: classes2.dex */
public class BTree {
    private com.googlecode.mp4parser.h264.BTree one;
    private java.lang.Object value;
    private com.googlecode.mp4parser.h264.BTree zero;

    public BTree() {
            r0 = this;
            r0.<init>()
            return
    }

    public void addString(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r3.length()
            if (r0 != 0) goto L9
            r2.value = r4
            return
        L9:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 48
            if (r0 != r1) goto L20
            com.googlecode.mp4parser.h264.BTree r0 = r2.zero
            if (r0 != 0) goto L1d
            com.googlecode.mp4parser.h264.BTree r0 = new com.googlecode.mp4parser.h264.BTree
            r0.<init>()
            r2.zero = r0
        L1d:
            com.googlecode.mp4parser.h264.BTree r0 = r2.zero
            goto L2d
        L20:
            com.googlecode.mp4parser.h264.BTree r0 = r2.one
            if (r0 != 0) goto L2b
            com.googlecode.mp4parser.h264.BTree r0 = new com.googlecode.mp4parser.h264.BTree
            r0.<init>()
            r2.one = r0
        L2b:
            com.googlecode.mp4parser.h264.BTree r0 = r2.one
        L2d:
            r1 = 1
            java.lang.String r3 = r3.substring(r1)
            r0.addString(r3, r4)
            return
    }

    public com.googlecode.mp4parser.h264.BTree down(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            com.googlecode.mp4parser.h264.BTree r1 = r0.zero
            return r1
        L5:
            com.googlecode.mp4parser.h264.BTree r1 = r0.one
            return r1
    }

    public java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }
}
