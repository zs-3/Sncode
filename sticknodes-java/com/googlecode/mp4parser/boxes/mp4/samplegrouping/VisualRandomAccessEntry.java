package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class VisualRandomAccessEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;

    public VisualRandomAccessEntry() {
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
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.VisualRandomAccessEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.VisualRandomAccessEntry) r5
            short r2 = r4.numLeadingSamples
            short r3 = r5.numLeadingSamples
            if (r2 == r3) goto L1b
            return r1
        L1b:
            boolean r2 = r4.numLeadingSamplesKnown
            boolean r5 = r5.numLeadingSamplesKnown
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
            boolean r1 = r3.numLeadingSamplesKnown
            if (r1 == 0) goto Lc
            r1 = 128(0x80, float:1.794E-43)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            short r2 = r3.numLeadingSamples
            r2 = r2 & 127(0x7f, float:1.78E-43)
            r1 = r1 | r2
            byte r1 = (byte) r1
            r0.put(r1)
            r0.rewind()
            return r0
    }

    public short getNumLeadingSamples() {
            r1 = this;
            short r0 = r1.numLeadingSamples
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "rap "
            return r0
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.numLeadingSamplesKnown
            int r0 = r0 * 31
            short r1 = r2.numLeadingSamples
            int r0 = r0 + r1
            return r0
    }

    public boolean isNumLeadingSamplesKnown() {
            r1 = this;
            boolean r0 = r1.numLeadingSamplesKnown
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            byte r3 = r3.get()
            r0 = r3 & 128(0x80, float:1.794E-43)
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2.numLeadingSamplesKnown = r0
            r3 = r3 & 127(0x7f, float:1.78E-43)
            short r3 = (short) r3
            r2.numLeadingSamples = r3
            return
    }

    public void setNumLeadingSamples(short r1) {
            r0 = this;
            r0.numLeadingSamples = r1
            return
    }

    public void setNumLeadingSamplesKnown(boolean r1) {
            r0 = this;
            r0.numLeadingSamplesKnown = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VisualRandomAccessEntry"
            r0.append(r1)
            java.lang.String r1 = "{numLeadingSamplesKnown="
            r0.append(r1)
            boolean r1 = r2.numLeadingSamplesKnown
            r0.append(r1)
            java.lang.String r1 = ", numLeadingSamples="
            r0.append(r1)
            short r1 = r2.numLeadingSamples
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
