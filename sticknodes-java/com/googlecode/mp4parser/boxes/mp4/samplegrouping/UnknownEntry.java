package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class UnknownEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    private java.nio.ByteBuffer content;
    private java.lang.String type;

    public UnknownEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L25
        L12:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.UnknownEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.UnknownEntry) r5
            java.nio.ByteBuffer r2 = r4.content
            java.nio.ByteBuffer r5 = r5.content
            if (r2 == 0) goto L21
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L24
            goto L23
        L21:
            if (r5 == 0) goto L24
        L23:
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.content
            java.nio.ByteBuffer r0 = r0.duplicate()
            return r0
    }

    public java.nio.ByteBuffer getContent() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.content
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.content
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = r1.duplicate()
            java.nio.Buffer r1 = r1.rewind()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r0.content = r1
            return
    }

    public void setContent(java.nio.ByteBuffer r1) {
            r0 = this;
            java.nio.ByteBuffer r1 = r1.duplicate()
            java.nio.Buffer r1 = r1.rewind()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r0.content = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.content
            java.nio.ByteBuffer r0 = r0.duplicate()
            r0.rewind()
            int r1 = r0.limit()
            byte[] r1 = new byte[r1]
            r0.get(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "UnknownEntry{content="
            r0.<init>(r2)
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
