package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public final class SliceType {
    public static final org.jcodec.codecs.h264.io.model.SliceType B = null;
    public static final org.jcodec.codecs.h264.io.model.SliceType I = null;
    public static final org.jcodec.codecs.h264.io.model.SliceType P = null;
    public static final org.jcodec.codecs.h264.io.model.SliceType SI = null;
    public static final org.jcodec.codecs.h264.io.model.SliceType SP = null;
    private static final org.jcodec.codecs.h264.io.model.SliceType[] _values = null;
    private java.lang.String _name;
    private int _ordinal;

    static {
            r0 = 5
            org.jcodec.codecs.h264.io.model.SliceType[] r0 = new org.jcodec.codecs.h264.io.model.SliceType[r0]
            org.jcodec.codecs.h264.io.model.SliceType._values = r0
            org.jcodec.codecs.h264.io.model.SliceType r0 = new org.jcodec.codecs.h264.io.model.SliceType
            java.lang.String r1 = "P"
            r2 = 0
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.SliceType.P = r0
            org.jcodec.codecs.h264.io.model.SliceType r0 = new org.jcodec.codecs.h264.io.model.SliceType
            java.lang.String r1 = "B"
            r2 = 1
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.SliceType.B = r0
            org.jcodec.codecs.h264.io.model.SliceType r0 = new org.jcodec.codecs.h264.io.model.SliceType
            java.lang.String r1 = "I"
            r2 = 2
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.SliceType.I = r0
            org.jcodec.codecs.h264.io.model.SliceType r0 = new org.jcodec.codecs.h264.io.model.SliceType
            java.lang.String r1 = "SP"
            r2 = 3
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.SliceType.SP = r0
            org.jcodec.codecs.h264.io.model.SliceType r0 = new org.jcodec.codecs.h264.io.model.SliceType
            java.lang.String r1 = "SI"
            r2 = 4
            r0.<init>(r1, r2)
            org.jcodec.codecs.h264.io.model.SliceType.SI = r0
            return
    }

    private SliceType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0._name = r1
            r0._ordinal = r2
            org.jcodec.codecs.h264.io.model.SliceType[] r1 = org.jcodec.codecs.h264.io.model.SliceType._values
            r1[r2] = r0
            return
    }

    public boolean isInter() {
            r1 = this;
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.I
            if (r1 == r0) goto La
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.io.model.SliceType.SI
            if (r1 == r0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public int ordinal() {
            r1 = this;
            int r0 = r1._ordinal
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1._name
            return r0
    }
}
