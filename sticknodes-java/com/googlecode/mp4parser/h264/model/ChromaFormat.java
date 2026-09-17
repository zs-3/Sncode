package com.googlecode.mp4parser.h264.model;

/* loaded from: classes2.dex */
public class ChromaFormat {
    public static com.googlecode.mp4parser.h264.model.ChromaFormat MONOCHROME;
    public static com.googlecode.mp4parser.h264.model.ChromaFormat YUV_420;
    public static com.googlecode.mp4parser.h264.model.ChromaFormat YUV_422;
    public static com.googlecode.mp4parser.h264.model.ChromaFormat YUV_444;
    private int id;
    private int subHeight;
    private int subWidth;

    static {
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = new com.googlecode.mp4parser.h264.model.ChromaFormat
            r1 = 0
            r0.<init>(r1, r1, r1)
            com.googlecode.mp4parser.h264.model.ChromaFormat.MONOCHROME = r0
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = new com.googlecode.mp4parser.h264.model.ChromaFormat
            r1 = 1
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_420 = r0
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = new com.googlecode.mp4parser.h264.model.ChromaFormat
            r0.<init>(r2, r2, r1)
            com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_422 = r0
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = new com.googlecode.mp4parser.h264.model.ChromaFormat
            r2 = 3
            r0.<init>(r2, r1, r1)
            com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_444 = r0
            return
    }

    public ChromaFormat(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.subWidth = r2
            r0.subHeight = r3
            return
    }

    public static com.googlecode.mp4parser.h264.model.ChromaFormat fromId(int r2) {
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = com.googlecode.mp4parser.h264.model.ChromaFormat.MONOCHROME
            int r1 = r0.id
            if (r2 != r1) goto L7
            return r0
        L7:
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_420
            int r1 = r0.id
            if (r2 != r1) goto Le
            return r0
        Le:
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_422
            int r1 = r0.id
            if (r2 != r1) goto L15
            return r0
        L15:
            com.googlecode.mp4parser.h264.model.ChromaFormat r0 = com.googlecode.mp4parser.h264.model.ChromaFormat.YUV_444
            int r1 = r0.id
            if (r2 != r1) goto L1c
            return r0
        L1c:
            r2 = 0
            return r2
    }

    public int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public int getSubHeight() {
            r1 = this;
            int r0 = r1.subHeight
            return r0
    }

    public int getSubWidth() {
            r1 = this;
            int r0 = r1.subWidth
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChromaFormat{\nid="
            r0.<init>(r1)
            int r1 = r3.id
            r0.append(r1)
            java.lang.String r1 = ",\n"
            r0.append(r1)
            java.lang.String r2 = " subWidth="
            r0.append(r2)
            int r2 = r3.subWidth
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " subHeight="
            r0.append(r1)
            int r1 = r3.subHeight
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
