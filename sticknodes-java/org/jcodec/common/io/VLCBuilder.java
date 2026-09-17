package org.jcodec.common.io;

/* loaded from: classes2.dex */
public class VLCBuilder {
    private org.jcodec.common.IntArrayList codes;
    private org.jcodec.common.IntArrayList codesSizes;
    private org.jcodec.common.IntIntMap forward;
    private org.jcodec.common.IntIntMap inverse;


    /* renamed from: -$$Nest$fgetforward, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.jcodec.common.IntIntMap m1383$$Nest$fgetforward(org.jcodec.common.io.VLCBuilder r0) {
            org.jcodec.common.IntIntMap r0 = r0.forward
            return r0
    }

    public VLCBuilder() {
            r1 = this;
            r1.<init>()
            org.jcodec.common.IntIntMap r0 = new org.jcodec.common.IntIntMap
            r0.<init>()
            r1.forward = r0
            org.jcodec.common.IntIntMap r0 = new org.jcodec.common.IntIntMap
            r0.<init>()
            r1.inverse = r0
            org.jcodec.common.IntArrayList r0 = org.jcodec.common.IntArrayList.createIntArrayList()
            r1.codes = r0
            org.jcodec.common.IntArrayList r0 = org.jcodec.common.IntArrayList.createIntArrayList()
            r1.codesSizes = r0
            return
    }

    public org.jcodec.common.io.VLC getVLC() {
            r3 = this;
            org.jcodec.common.io.VLCBuilder$1 r0 = new org.jcodec.common.io.VLCBuilder$1
            org.jcodec.common.IntArrayList r1 = r3.codes
            int[] r1 = r1.toArray()
            org.jcodec.common.IntArrayList r2 = r3.codesSizes
            int[] r2 = r2.toArray()
            r0.<init>(r3, r1, r2, r3)
            return r0
    }

    public org.jcodec.common.io.VLCBuilder set(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 2
            int r0 = java.lang.Integer.parseInt(r3, r0)
            int r3 = r3.length()
            r1.setInt(r0, r3, r2)
            return r1
    }

    public org.jcodec.common.io.VLCBuilder setInt(int r3, int r4, int r5) {
            r2 = this;
            org.jcodec.common.IntArrayList r0 = r2.codes
            int r1 = 32 - r4
            int r3 = r3 << r1
            r0.add(r3)
            org.jcodec.common.IntArrayList r3 = r2.codesSizes
            r3.add(r4)
            org.jcodec.common.IntIntMap r3 = r2.forward
            org.jcodec.common.IntArrayList r4 = r2.codes
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r3.put(r5, r4)
            org.jcodec.common.IntIntMap r3 = r2.inverse
            org.jcodec.common.IntArrayList r4 = r2.codes
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r3.put(r4, r5)
            return r2
    }
}
