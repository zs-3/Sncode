package com.mp4parser.iso14496.part15;

/* loaded from: classes2.dex */
public class TemporalSubLayerSampleGroup extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "tsas";
    int i;

    public TemporalSubLayerSampleGroup() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            if (r3 == 0) goto L12
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            if (r1 == r3) goto L11
            goto L12
        L11:
            return r0
        L12:
            r3 = 0
            return r3
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r1 = this;
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "tsas"
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 41
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            return
    }
}
