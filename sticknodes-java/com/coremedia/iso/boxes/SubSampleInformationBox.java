package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SubSampleInformationBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "subs";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry> entries;

    public static class SubSampleEntry {
        private long sampleDelta;
        private java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry> subsampleEntries;

        public static class SubsampleEntry {
            private int discardable;
            private long reserved;
            private int subsamplePriority;
            private long subsampleSize;

            public SubsampleEntry() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public int getDiscardable() {
                    r1 = this;
                    int r0 = r1.discardable
                    return r0
            }

            public long getReserved() {
                    r2 = this;
                    long r0 = r2.reserved
                    return r0
            }

            public int getSubsamplePriority() {
                    r1 = this;
                    int r0 = r1.subsamplePriority
                    return r0
            }

            public long getSubsampleSize() {
                    r2 = this;
                    long r0 = r2.subsampleSize
                    return r0
            }

            public void setDiscardable(int r1) {
                    r0 = this;
                    r0.discardable = r1
                    return
            }

            public void setReserved(long r1) {
                    r0 = this;
                    r0.reserved = r1
                    return
            }

            public void setSubsamplePriority(int r1) {
                    r0 = this;
                    r0.subsamplePriority = r1
                    return
            }

            public void setSubsampleSize(long r1) {
                    r0 = this;
                    r0.subsampleSize = r1
                    return
            }

            public java.lang.String toString() {
                    r3 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "SubsampleEntry{subsampleSize="
                    r0.<init>(r1)
                    long r1 = r3.subsampleSize
                    r0.append(r1)
                    java.lang.String r1 = ", subsamplePriority="
                    r0.append(r1)
                    int r1 = r3.subsamplePriority
                    r0.append(r1)
                    java.lang.String r1 = ", discardable="
                    r0.append(r1)
                    int r1 = r3.discardable
                    r0.append(r1)
                    java.lang.String r1 = ", reserved="
                    r0.append(r1)
                    long r1 = r3.reserved
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public SubSampleEntry() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.subsampleEntries = r0
                return
        }

        public long getSampleDelta() {
                r2 = this;
                long r0 = r2.sampleDelta
                return r0
        }

        public int getSubsampleCount() {
                r1 = this;
                java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry> r0 = r1.subsampleEntries
                int r0 = r0.size()
                return r0
        }

        public java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry> getSubsampleEntries() {
                r1 = this;
                java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry> r0 = r1.subsampleEntries
                return r0
        }

        public void setSampleDelta(long r1) {
                r0 = this;
                r0.sampleDelta = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SampleEntry{sampleDelta="
                r0.<init>(r1)
                long r1 = r3.sampleDelta
                r0.append(r1)
                java.lang.String r1 = ", subsampleCount="
                r0.append(r1)
                java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry> r1 = r3.subsampleEntries
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = ", subsampleEntries="
                r0.append(r1)
                java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry> r1 = r3.subsampleEntries
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            ajc$preClinit()
            return
    }

    public SubSampleInformationBox() {
            r1 = this;
            java.lang.String r0 = "subs"
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.entries = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.SubSampleInformationBox> r0 = com.coremedia.iso.boxes.SubSampleInformationBox.class
            java.lang.String r1 = "SubSampleInformationBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SubSampleInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.List"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 50
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEntries"
            java.lang.String r3 = "com.coremedia.iso.boxes.SubSampleInformationBox"
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "entries"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 54
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.SubSampleInformationBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 124(0x7c, float:1.74E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r11) {
            r10 = this;
            r10.parseVersionAndFlags(r11)
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r11)
            r2 = 0
            r3 = 0
        L9:
            long r4 = (long) r3
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto Lf
            return
        Lf:
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r4 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry
            r4.<init>()
            long r5 = com.coremedia.iso.IsoTypeReader.readUInt32(r11)
            r4.setSampleDelta(r5)
            int r5 = com.coremedia.iso.IsoTypeReader.readUInt16(r11)
            r6 = 0
        L20:
            if (r6 < r5) goto L2a
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r5 = r10.entries
            r5.add(r4)
            int r3 = r3 + 1
            goto L9
        L2a:
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry r7 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry
            r7.<init>()
            int r8 = r10.getVersion()
            r9 = 1
            if (r8 != r9) goto L3b
            long r8 = com.coremedia.iso.IsoTypeReader.readUInt32(r11)
            goto L40
        L3b:
            int r8 = com.coremedia.iso.IsoTypeReader.readUInt16(r11)
            long r8 = (long) r8
        L40:
            r7.setSubsampleSize(r8)
            int r8 = com.coremedia.iso.IsoTypeReader.readUInt8(r11)
            r7.setSubsamplePriority(r8)
            int r8 = com.coremedia.iso.IsoTypeReader.readUInt8(r11)
            r7.setDiscardable(r8)
            long r8 = com.coremedia.iso.IsoTypeReader.readUInt32(r11)
            r7.setReserved(r8)
            java.util.List r8 = r4.getSubsampleEntries()
            r8.add(r7)
            int r6 = r6 + 1
            goto L20
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.writeVersionAndFlags(r6)
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r0 = r5.entries
            int r0 = r0.size()
            long r0 = (long) r0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r0)
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r0 = r5.entries
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1a
            return
        L1a:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r1 = (com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) r1
            long r2 = r1.getSampleDelta()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r2)
            int r2 = r1.getSubsampleCount()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r2)
            java.util.List r1 = r1.getSubsampleEntries()
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3d
            goto L13
        L3d:
            java.lang.Object r2 = r1.next()
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry r2 = (com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry) r2
            int r3 = r5.getVersion()
            r4 = 1
            if (r3 != r4) goto L52
            long r3 = r2.getSubsampleSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            goto L5d
        L52:
            long r3 = r2.getSubsampleSize()
            int r3 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r3)
        L5d:
            int r3 = r2.getSubsamplePriority()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r3)
            int r3 = r2.getDiscardable()
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r6, r3)
            long r2 = r2.getReserved()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r2)
            goto L36
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r11 = this;
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r0 = r11.entries
            java.util.Iterator r0 = r0.iterator()
            r1 = 8
        L8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r3 = (com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry) r3
            r4 = 4
            long r1 = r1 + r4
            r6 = 2
            long r1 = r1 + r6
            r8 = 0
        L1c:
            java.util.List r9 = r3.getSubsampleEntries()
            int r9 = r9.size()
            if (r8 < r9) goto L27
            goto L8
        L27:
            int r9 = r11.getVersion()
            r10 = 1
            if (r9 != r10) goto L30
            long r1 = r1 + r4
            goto L31
        L30:
            long r1 = r1 + r6
        L31:
            long r1 = r1 + r6
            long r1 = r1 + r4
            int r8 = r8 + 1
            goto L1c
    }

    public java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry> getEntries() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r0 = r2.entries
            return r0
    }

    public void setEntries(java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry> r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.entries = r3
            return
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.SubSampleInformationBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SubSampleInformationBox{entryCount="
            r0.<init>(r1)
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r1 = r2.entries
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", entries="
            r0.append(r1)
            java.util.List<com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry> r1 = r2.entries
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
