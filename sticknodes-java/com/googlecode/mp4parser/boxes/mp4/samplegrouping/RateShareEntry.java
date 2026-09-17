package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

/* loaded from: classes2.dex */
public class RateShareEntry extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry {
    public static final java.lang.String TYPE = "rash";
    private short discardPriority;
    private java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry.Entry> entries;
    private int maximumBitrate;
    private int minimumBitrate;
    private short operationPointCut;
    private short targetRateShare;

    public static class Entry {
        int availableBitrate;
        short targetRateShare;

        public Entry(int r1, short r2) {
                r0 = this;
                r0.<init>()
                r0.availableBitrate = r1
                r0.targetRateShare = r2
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
                com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry.Entry) r5
                int r2 = r4.availableBitrate
                int r3 = r5.availableBitrate
                if (r2 == r3) goto L1b
                return r1
            L1b:
                short r2 = r4.targetRateShare
                short r5 = r5.targetRateShare
                if (r2 == r5) goto L22
                return r1
            L22:
                return r0
            L23:
                return r1
        }

        public int getAvailableBitrate() {
                r1 = this;
                int r0 = r1.availableBitrate
                return r0
        }

        public short getTargetRateShare() {
                r1 = this;
                short r0 = r1.targetRateShare
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.availableBitrate
                int r0 = r0 * 31
                short r1 = r2.targetRateShare
                int r0 = r0 + r1
                return r0
        }

        public void setAvailableBitrate(int r1) {
                r0 = this;
                r0.availableBitrate = r1
                return
        }

        public void setTargetRateShare(short r1) {
                r0 = this;
                r0.targetRateShare = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{availableBitrate="
                r0.<init>(r1)
                int r1 = r2.availableBitrate
                r0.append(r1)
                java.lang.String r1 = ", targetRateShare="
                r0.append(r1)
                short r1 = r2.targetRateShare
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public RateShareEntry() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L48
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L48
        L12:
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry r5 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry) r5
            short r2 = r4.discardPriority
            short r3 = r5.discardPriority
            if (r2 == r3) goto L1b
            return r1
        L1b:
            int r2 = r4.maximumBitrate
            int r3 = r5.maximumBitrate
            if (r2 == r3) goto L22
            return r1
        L22:
            int r2 = r4.minimumBitrate
            int r3 = r5.minimumBitrate
            if (r2 == r3) goto L29
            return r1
        L29:
            short r2 = r4.operationPointCut
            short r3 = r5.operationPointCut
            if (r2 == r3) goto L30
            return r1
        L30:
            short r2 = r4.targetRateShare
            short r3 = r5.targetRateShare
            if (r2 == r3) goto L37
            return r1
        L37:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r2 = r4.entries
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r5 = r5.entries
            if (r2 == 0) goto L44
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L47
            goto L46
        L44:
            if (r5 == 0) goto L47
        L46:
            return r1
        L47:
            return r0
        L48:
            return r1
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.nio.ByteBuffer get() {
            r4 = this;
            short r0 = r4.operationPointCut
            r1 = 1
            if (r0 != r1) goto L8
            r0 = 13
            goto Lc
        L8:
            int r0 = r0 * 6
            int r0 = r0 + 11
        Lc:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            short r2 = r4.operationPointCut
            r0.putShort(r2)
            short r2 = r4.operationPointCut
            if (r2 != r1) goto L1f
            short r1 = r4.targetRateShare
            r0.putShort(r1)
            goto L2b
        L1f:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r1 = r4.entries
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3e
        L2b:
            int r1 = r4.maximumBitrate
            r0.putInt(r1)
            int r1 = r4.minimumBitrate
            r0.putInt(r1)
            short r1 = r4.discardPriority
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            r0.rewind()
            return r0
        L3e:
            java.lang.Object r2 = r1.next()
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry r2 = (com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry.Entry) r2
            int r3 = r2.getAvailableBitrate()
            r0.putInt(r3)
            short r2 = r2.getTargetRateShare()
            r0.putShort(r2)
            goto L25
    }

    public short getDiscardPriority() {
            r1 = this;
            short r0 = r1.discardPriority
            return r0
    }

    public java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry.Entry> getEntries() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r0 = r1.entries
            return r0
    }

    public int getMaximumBitrate() {
            r1 = this;
            int r0 = r1.maximumBitrate
            return r0
    }

    public int getMinimumBitrate() {
            r1 = this;
            int r0 = r1.minimumBitrate
            return r0
    }

    public short getOperationPointCut() {
            r1 = this;
            short r0 = r1.operationPointCut
            return r0
    }

    public short getTargetRateShare() {
            r1 = this;
            short r0 = r1.targetRateShare
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "rash"
            return r0
    }

    public int hashCode() {
            r2 = this;
            short r0 = r2.operationPointCut
            int r0 = r0 * 31
            short r1 = r2.targetRateShare
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r1 = r2.entries
            if (r1 == 0) goto L12
            int r1 = r1.hashCode()
            goto L13
        L12:
            r1 = 0
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.maximumBitrate
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.minimumBitrate
            int r0 = r0 + r1
            int r0 = r0 * 31
            short r1 = r2.discardPriority
            int r0 = r0 + r1
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(java.nio.ByteBuffer r6) {
            r5 = this;
            short r0 = r6.getShort()
            r5.operationPointCut = r0
            r1 = 1
            if (r0 != r1) goto L10
            short r0 = r6.getShort()
            r5.targetRateShare = r0
            goto L14
        L10:
            int r1 = r0 + (-1)
            if (r0 > 0) goto L30
        L14:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            r5.maximumBitrate = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            r5.minimumBitrate = r0
            int r6 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            short r6 = (short) r6
            r5.discardPriority = r6
            return
        L30:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry> r0 = r5.entries
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry r2 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry$Entry
            long r3 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            short r4 = r6.getShort()
            r2.<init>(r3, r4)
            r0.add(r2)
            r0 = r1
            goto L10
    }

    public void setDiscardPriority(short r1) {
            r0 = this;
            r0.discardPriority = r1
            return
    }

    public void setEntries(java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.RateShareEntry.Entry> r1) {
            r0 = this;
            r0.entries = r1
            return
    }

    public void setMaximumBitrate(int r1) {
            r0 = this;
            r0.maximumBitrate = r1
            return
    }

    public void setMinimumBitrate(int r1) {
            r0 = this;
            r0.minimumBitrate = r1
            return
    }

    public void setOperationPointCut(short r1) {
            r0 = this;
            r0.operationPointCut = r1
            return
    }

    public void setTargetRateShare(short r1) {
            r0 = this;
            r0.targetRateShare = r1
            return
    }
}
