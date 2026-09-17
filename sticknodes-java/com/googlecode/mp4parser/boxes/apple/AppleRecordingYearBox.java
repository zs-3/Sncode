package com.googlecode.mp4parser.boxes.apple;

/* loaded from: classes2.dex */
public class AppleRecordingYearBox extends com.googlecode.mp4parser.boxes.apple.AppleDataBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    java.util.Date date;
    java.text.DateFormat df;

    static {
            ajc$preClinit()
            return
    }

    public AppleRecordingYearBox() {
            r2 = this;
            java.lang.String r0 = "©day"
            r1 = 1
            r2.<init>(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r2.date = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd'T'kk:mm:ssZ"
            r0.<init>(r1)
            r2.df = r0
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox> r0 = com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox.class
            java.lang.String r1 = "AppleRecordingYearBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 27
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "date"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 31
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox.ajc$tjp_1 = r0
            return
    }

    protected static java.lang.String iso8601toRfc822Date(java.lang.String r2) {
            java.lang.String r0 = "Z$"
            java.lang.String r1 = "+0000"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r0 = "([0-9][0-9]):([0-9][0-9])$"
            java.lang.String r1 = "$1$2"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    protected static java.lang.String rfc822toIso8601Date(java.lang.String r2) {
            java.lang.String r0 = "\\+0000$"
            java.lang.String r1 = "Z"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
            r2 = this;
            java.text.DateFormat r0 = r2.df
            java.util.Date r1 = r2.date
            java.lang.String r0 = r0.format(r1)
            java.lang.String r0 = rfc822toIso8601Date(r0)
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            int r0 = r0.length
            return r0
    }

    public java.util.Date getDate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.date
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r2.remaining()
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2, r0)
            java.text.DateFormat r0 = r1.df     // Catch: java.text.ParseException -> L15
            java.lang.String r2 = iso8601toRfc822Date(r2)     // Catch: java.text.ParseException -> L15
            java.util.Date r2 = r0.parse(r2)     // Catch: java.text.ParseException -> L15
            r1.date = r2     // Catch: java.text.ParseException -> L15
            return
        L15:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    public void setDate(java.util.Date r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.date = r3
            return
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
            r2 = this;
            java.text.DateFormat r0 = r2.df
            java.util.Date r1 = r2.date
            java.lang.String r0 = r0.format(r1)
            java.lang.String r0 = rfc822toIso8601Date(r0)
            byte[] r0 = com.coremedia.iso.Utf8.convert(r0)
            return r0
    }
}
