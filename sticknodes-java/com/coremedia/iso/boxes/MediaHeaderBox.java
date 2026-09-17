package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class MediaHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static com.googlecode.mp4parser.util.Logger LOG = null;
    public static final java.lang.String TYPE = "mdhd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private java.util.Date creationTime;
    private long duration;
    private java.lang.String language;
    private java.util.Date modificationTime;
    private long timescale;

    static {
            ajc$preClinit()
            java.lang.Class<com.coremedia.iso.boxes.MediaHeaderBox> r0 = com.coremedia.iso.boxes.MediaHeaderBox.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.coremedia.iso.boxes.MediaHeaderBox.LOG = r0
            return
    }

    public MediaHeaderBox() {
            r1 = this;
            java.lang.String r0 = "mdhd"
            r1.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.creationTime = r0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.modificationTime = r0
            java.lang.String r0 = "eng"
            r1.language = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.MediaHeaderBox> r0 = com.coremedia.iso.boxes.MediaHeaderBox.class
            java.lang.String r1 = "MediaHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 48
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 52
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 125(0x7d, float:1.75E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTimescale"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 56
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 60
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 64
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "creationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 81
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "modificationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 85
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTimescale"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "timescale"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 89
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "duration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 93
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLanguage"
            java.lang.String r3 = "com.coremedia.iso.boxes.MediaHeaderBox"
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "language"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 97
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            int r0 = r5.getVersion()
            r1 = 1
            if (r0 != r1) goto L2b
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.creationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.modificationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.timescale = r0
            long r0 = r6.getLong()
            r5.duration = r0
            goto L4c
        L2b:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.creationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.modificationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.timescale = r0
            int r0 = r6.getInt()
            long r0 = (long) r0
            r5.duration = r0
        L4c:
            long r0 = r5.duration
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L5b
            com.googlecode.mp4parser.util.Logger r0 = com.coremedia.iso.boxes.MediaHeaderBox.LOG
            java.lang.String r1 = "mdhd duration is not in expected range"
            r0.logWarn(r1)
        L5b:
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readIso639(r6)
            r5.language = r0
            com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            r2.writeVersionAndFlags(r3)
            int r0 = r2.getVersion()
            r1 = 1
            if (r0 != r1) goto L27
            java.util.Date r0 = r2.creationTime
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            java.util.Date r0 = r2.modificationTime
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
            long r0 = r2.timescale
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.duration
            r3.putLong(r0)
            goto L44
        L27:
            java.util.Date r0 = r2.creationTime
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.util.Date r0 = r2.modificationTime
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.timescale
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            long r0 = r2.duration
            int r1 = (int) r0
            r3.putInt(r1)
        L44:
            java.lang.String r0 = r2.language
            com.coremedia.iso.IsoTypeWriter.writeIso639(r3, r0)
            r0 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r4 = this;
            int r0 = r4.getVersion()
            r1 = 1
            if (r0 != r1) goto La
            r0 = 32
            goto Lc
        La:
            r0 = 20
        Lc:
            r2 = 2
            long r0 = r0 + r2
            long r0 = r0 + r2
            return r0
    }

    public java.util.Date getCreationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.creationTime
            return r0
    }

    public long getDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.duration
            return r0
    }

    public java.lang.String getLanguage() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.language
            return r0
    }

    public java.util.Date getModificationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.modificationTime
            return r0
    }

    public long getTimescale() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.timescale
            return r0
    }

    public void setCreationTime(java.util.Date r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.creationTime = r3
            return
    }

    public void setDuration(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_8
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.duration = r3
            return
    }

    public void setLanguage(java.lang.String r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.language = r3
            return
    }

    public void setModificationTime(java.util.Date r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.modificationTime = r3
            return
    }

    public void setTimescale(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.timescale = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MediaHeaderBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MediaHeaderBox["
            r0.append(r1)
            java.lang.String r1 = "creationTime="
            r0.append(r1)
            java.util.Date r1 = r4.getCreationTime()
            r0.append(r1)
            java.lang.String r1 = ";"
            r0.append(r1)
            java.lang.String r2 = "modificationTime="
            r0.append(r2)
            java.util.Date r2 = r4.getModificationTime()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "timescale="
            r0.append(r2)
            long r2 = r4.getTimescale()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "duration="
            r0.append(r2)
            long r2 = r4.getDuration()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "language="
            r0.append(r1)
            java.lang.String r1 = r4.getLanguage()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
