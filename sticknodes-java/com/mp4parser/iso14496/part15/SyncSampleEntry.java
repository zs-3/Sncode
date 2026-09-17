package com.mp4parser.iso14496.part15;

/* loaded from: classes2.dex */
public class SyncSampleEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "sync";
    int nalUnitType;
    int reserved;

    public SyncSampleEntry() {
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
            com.mp4parser.iso14496.part15.SyncSampleEntry r5 = (com.mp4parser.iso14496.part15.SyncSampleEntry) r5
            int r2 = r4.nalUnitType
            int r3 = r5.nalUnitType
            if (r2 == r3) goto L1b
            return r1
        L1b:
            int r2 = r4.reserved
            int r5 = r5.reserved
            if (r2 == r5) goto L22
            return r1
        L22:
            return r0
        L23:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r3 = this;
            r0 = 1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.nalUnitType
            int r2 = r3.reserved
            int r2 = r2 << 6
            int r1 = r1 + r2
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
    }

    public int getNalUnitType() {
            r1 = this;
            int r0 = r1.nalUnitType
            return r0
    }

    public int getReserved() {
            r1 = this;
            int r0 = r1.reserved
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "sync"
            return r0
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.reserved
            int r0 = r0 * 31
            int r1 = r2.nalUnitType
            int r0 = r0 + r1
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r2)
            r0 = r2 & 192(0xc0, float:2.69E-43)
            int r0 = r0 >> 6
            r1.reserved = r0
            r2 = r2 & 63
            r1.nalUnitType = r2
            return
    }

    public void setNalUnitType(int r1) {
            r0 = this;
            r0.nalUnitType = r1
            return
    }

    public void setReserved(int r1) {
            r0 = this;
            r0.reserved = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SyncSampleEntry{reserved="
            r0.<init>(r1)
            int r1 = r2.reserved
            r0.append(r1)
            java.lang.String r1 = ", nalUnitType="
            r0.append(r1)
            int r1 = r2.nalUnitType
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
