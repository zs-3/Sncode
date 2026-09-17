package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class TemporalLevelEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "tele";
    private boolean levelIndependentlyDecodable;
    private short reserved;

    public TemporalLevelEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L23
        L12:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.TemporalLevelEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.TemporalLevelEntry) r5
            boolean r2 = r4.levelIndependentlyDecodable
            boolean r3 = r5.levelIndependentlyDecodable
            if (r2 == r3) goto L1b
            return r1
        L1b:
            short r2 = r4.reserved
            short r5 = r5.reserved
            if (r2 == r5) goto L22
            return r1
        L22:
            return r0
        L23:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r2 = this;
            r0 = 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            boolean r1 = r2.levelIndependentlyDecodable
            if (r1 == 0) goto Lc
            r1 = 128(0x80, float:1.794E-43)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            byte r1 = (byte) r1
            r0.put(r1)
            r0.rewind()
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "tele"
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.levelIndependentlyDecodable
            int r0 = r0 * 31
            short r1 = r2.reserved
            int r0 = r0 + r1
            return r0
    }

    public boolean isLevelIndependentlyDecodable() {
            r1 = this;
            boolean r0 = r1.levelIndependentlyDecodable
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            byte r2 = r2.get()
            r0 = 128(0x80, float:1.794E-43)
            r2 = r2 & r0
            if (r2 != r0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.levelIndependentlyDecodable = r2
            return
    }

    public void setLevelIndependentlyDecodable(boolean r1) {
            r0 = this;
            r0.levelIndependentlyDecodable = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TemporalLevelEntry"
            r0.append(r1)
            java.lang.String r1 = "{levelIndependentlyDecodable="
            r0.append(r1)
            boolean r1 = r2.levelIndependentlyDecodable
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
