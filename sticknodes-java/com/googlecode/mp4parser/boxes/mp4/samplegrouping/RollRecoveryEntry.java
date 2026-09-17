package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class RollRecoveryEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "roll";
    private short rollDistance;

    public RollRecoveryEntry() {
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
            if (r5 == 0) goto L1c
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L1c
        L12:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.RollRecoveryEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.RollRecoveryEntry) r5
            short r2 = r4.rollDistance
            short r5 = r5.rollDistance
            if (r2 == r5) goto L1b
            return r1
        L1b:
            return r0
        L1c:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r2 = this;
            r0 = 2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            short r1 = r2.rollDistance
            r0.putShort(r1)
            r0.rewind()
            return r0
    }

    public short getRollDistance() {
            r1 = this;
            short r0 = r1.rollDistance
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "roll"
            return r0
    }

    public int hashCode() {
            r1 = this;
            short r0 = r1.rollDistance
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            short r1 = r1.getShort()
            r0.rollDistance = r1
            return
    }

    public void setRollDistance(short r1) {
            r0 = this;
            r0.rollDistance = r1
            return
    }
}
