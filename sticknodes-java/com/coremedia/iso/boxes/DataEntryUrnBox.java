package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class DataEntryUrnBox extends com.googlecode.mp4parser.AbstractFullBox {
    public static final java.lang.String TYPE = "urn ";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private java.lang.String location;
    private java.lang.String name;

    static {
            ajc$preClinit()
            return
    }

    public DataEntryUrnBox() {
            r1 = this;
            java.lang.String r0 = "urn "
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.DataEntryUrnBox> r0 = com.coremedia.iso.boxes.DataEntryUrnBox.class
            java.lang.String r1 = "DataEntryUrnBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getName"
            java.lang.String r3 = "com.coremedia.iso.boxes.DataEntryUrnBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 40
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLocation"
            java.lang.String r3 = "com.coremedia.iso.boxes.DataEntryUrnBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 44
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.DataEntryUrnBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 67
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_2 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = com.coremedia.iso.IsoTypeReader.readString(r2)
            r1.name = r0
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2)
            r1.location = r2
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r3) {
            r2 = this;
            java.lang.String r0 = r2.name
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            r3.put(r0)
            r0 = 0
            r3.put(r0)
            java.lang.String r1 = r2.location
            byte[] r1 = com.coremedia.iso.Utf8.convert(r1)
            r3.put(r1)
            r3.put(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            java.lang.String r0 = r2.name
            int r0 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r0)
            int r0 = r0 + 1
            java.lang.String r1 = r2.location
            int r1 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r1)
            int r0 = r0 + r1
            int r0 = r0 + 1
            long r0 = (long) r0
            return r0
    }

    public java.lang.String getLocation() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.location
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.String r0 = r2.name
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.DataEntryUrnBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DataEntryUrlBox[name="
            r0.<init>(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = ";location="
            r0.append(r1)
            java.lang.String r1 = r2.getLocation()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
