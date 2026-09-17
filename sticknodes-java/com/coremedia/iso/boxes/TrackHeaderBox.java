package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class TrackHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static com.googlecode.mp4parser.util.Logger LOG = null;
    public static final java.lang.String TYPE = "tkhd";
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_22 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_23 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_24 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_25 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_26 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_27 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_28 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_29 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private int alternateGroup;
    private java.util.Date creationTime;
    private long duration;
    private double height;
    private int layer;
    private com.googlecode.mp4parser.util.Matrix matrix;
    private java.util.Date modificationTime;
    private long trackId;
    private float volume;
    private double width;

    static {
            ajc$preClinit()
            java.lang.Class<com.coremedia.iso.boxes.TrackHeaderBox> r0 = com.coremedia.iso.boxes.TrackHeaderBox.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.coremedia.iso.boxes.TrackHeaderBox.LOG = r0
            return
    }

    public TrackHeaderBox() {
            r3 = this;
            java.lang.String r0 = "tkhd"
            r3.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r1 = 0
            r0.<init>(r1)
            r3.creationTime = r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r3.modificationTime = r0
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            r3.matrix = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.TrackHeaderBox> r0 = com.coremedia.iso.boxes.TrackHeaderBox.class
            java.lang.String r1 = "TrackHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 62
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 66
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getContent"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "java.nio.ByteBuffer"
            java.lang.String r5 = "byteBuffer"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 145(0x91, float:2.03E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 173(0xad, float:2.42E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "creationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 199(0xc7, float:2.79E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "modificationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 206(0xce, float:2.89E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "trackId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 214(0xd6, float:3.0E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "duration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 218(0xda, float:3.05E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLayer"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "layer"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 225(0xe1, float:3.15E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAlternateGroup"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "alternateGroup"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 229(0xe5, float:3.21E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setVolume"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "float"
            java.lang.String r5 = "volume"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 233(0xe9, float:3.27E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMatrix"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "com.googlecode.mp4parser.util.Matrix"
            java.lang.String r5 = "matrix"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 237(0xed, float:3.32E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setWidth"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "double"
            java.lang.String r5 = "width"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 241(0xf1, float:3.38E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setHeight"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "double"
            java.lang.String r5 = "height"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 245(0xf5, float:3.43E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isEnabled"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 250(0xfa, float:3.5E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_22 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isInMovie"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 254(0xfe, float:3.56E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_23 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isInPreview"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 258(0x102, float:3.62E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_24 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "isInPoster"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "boolean"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 262(0x106, float:3.67E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_25 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setEnabled"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "enabled"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 266(0x10a, float:3.73E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_26 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setInMovie"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "inMovie"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 274(0x112, float:3.84E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_27 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setInPreview"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "inPreview"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 282(0x11a, float:3.95E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_28 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setInPoster"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "inPoster"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 290(0x122, float:4.06E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_29 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLayer"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 78
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAlternateGroup"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 82
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getVolume"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "float"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 86
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMatrix"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.googlecode.mp4parser.util.Matrix"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getWidth"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "double"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 94
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getHeight"
            java.lang.String r3 = "com.coremedia.iso.boxes.TrackHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "double"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 98
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r6) {
            r5 = this;
            r5.parseVersionAndFlags(r6)
            int r0 = r5.getVersion()
            r1 = 1
            if (r0 != r1) goto L2e
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.creationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt64(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.modificationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.trackId = r0
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            long r0 = r6.getLong()
            r5.duration = r0
            goto L52
        L2e:
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.creationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            java.util.Date r0 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            r5.modificationTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.trackId = r0
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = r6.getInt()
            long r0 = (long) r0
            r5.duration = r0
        L52:
            long r0 = r5.duration
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L61
            com.googlecode.mp4parser.util.Logger r0 = com.coremedia.iso.boxes.TrackHeaderBox.LOG
            java.lang.String r1 = "tkhd duration is not in expected range"
            r0.logWarn(r1)
        L61:
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            r5.layer = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            r5.alternateGroup = r0
            float r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint88(r6)
            r5.volume = r0
            com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.fromByteBuffer(r6)
            r5.matrix = r0
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r6)
            r5.width = r0
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r6)
            r5.height = r0
            return
    }

    public int getAlternateGroup() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.alternateGroup
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(java.nio.ByteBuffer r6) {
            r5 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r5, r5, r6)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r5.writeVersionAndFlags(r6)
            int r0 = r5.getVersion()
            r1 = 0
            r3 = 1
            if (r0 != r3) goto L39
            java.util.Date r0 = r5.creationTime
            long r3 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r6, r3)
            java.util.Date r0 = r5.modificationTime
            long r3 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r6, r3)
            long r3 = r5.trackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r1)
            long r3 = r5.duration
            r6.putLong(r3)
            goto L59
        L39:
            java.util.Date r0 = r5.creationTime
            long r3 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            java.util.Date r0 = r5.modificationTime
            long r3 = com.googlecode.mp4parser.util.DateHelper.convert(r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            long r3 = r5.trackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r3)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r1)
            long r3 = r5.duration
            int r0 = (int) r3
            r6.putInt(r0)
        L59:
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r6, r1)
            int r0 = r5.layer
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r0)
            int r0 = r5.alternateGroup
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r0)
            float r0 = r5.volume
            double r0 = (double) r0
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint88(r6, r0)
            r0 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r6, r0)
            com.googlecode.mp4parser.util.Matrix r0 = r5.matrix
            r0.getContent(r6)
            double r0 = r5.width
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r6, r0)
            double r0 = r5.height
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r6, r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r4 = this;
            int r0 = r4.getVersion()
            r1 = 1
            if (r0 != r1) goto La
            r0 = 36
            goto Lc
        La:
            r0 = 24
        Lc:
            r2 = 60
            long r0 = r0 + r2
            return r0
    }

    public java.util.Date getCreationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.creationTime
            return r0
    }

    public long getDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.duration
            return r0
    }

    public double getHeight() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_9
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            double r0 = r2.height
            return r0
    }

    public int getLayer() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.layer
            return r0
    }

    public com.googlecode.mp4parser.util.Matrix getMatrix() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.util.Matrix r0 = r2.matrix
            return r0
    }

    public java.util.Date getModificationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.modificationTime
            return r0
    }

    public long getTrackId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.trackId
            return r0
    }

    public float getVolume() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            float r0 = r2.volume
            return r0
    }

    public double getWidth() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            double r0 = r2.width
            return r0
    }

    public boolean isEnabled() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_22
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r1 = 1
            r0 = r0 & r1
            if (r0 <= 0) goto L16
            return r1
        L16:
            r0 = 0
            return r0
    }

    public boolean isInMovie() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_23
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 2
            if (r0 <= 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean isInPoster() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_25
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 8
            if (r0 <= 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean isInPreview() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_24
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.getFlags()
            r0 = r0 & 4
            if (r0 <= 0) goto L17
            r0 = 1
            return r0
        L17:
            r0 = 0
            return r0
    }

    public void setAlternateGroup(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_17
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.alternateGroup = r3
            return
    }

    public void setCreationTime(java.util.Date r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r4.creationTime = r5
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L20
            r5 = 1
            r4.setVersion(r5)
        L20:
            return
    }

    public void setDuration(long r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_15
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r3.duration = r4
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L20
            r4 = 1
            r3.setFlags(r4)
        L20:
            return
    }

    public void setEnabled(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_26
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 1
            r2.setFlags(r3)
            goto L26
        L1d:
            int r3 = r2.getFlags()
            r3 = r3 & (-2)
            r2.setFlags(r3)
        L26:
            return
    }

    public void setHeight(double r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_21
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.doubleObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.height = r3
            return
    }

    public void setInMovie(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_27
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 2
            r2.setFlags(r3)
            goto L26
        L1d:
            int r3 = r2.getFlags()
            r3 = r3 & (-3)
            r2.setFlags(r3)
        L26:
            return
    }

    public void setInPoster(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_29
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 8
            r2.setFlags(r3)
            goto L26
        L1d:
            int r3 = r2.getFlags()
            r3 = r3 & (-9)
            r2.setFlags(r3)
        L26:
            return
    }

    public void setInPreview(boolean r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_28
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.booleanObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            if (r3 == 0) goto L1d
            int r3 = r2.getFlags()
            r3 = r3 | 4
            r2.setFlags(r3)
            goto L26
        L1d:
            int r3 = r2.getFlags()
            r3 = r3 & (-5)
            r2.setFlags(r3)
        L26:
            return
    }

    public void setLayer(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_16
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.layer = r3
            return
    }

    public void setMatrix(com.googlecode.mp4parser.util.Matrix r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_19
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.matrix = r3
            return
    }

    public void setModificationTime(java.util.Date r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_13
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4, r5)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r4.modificationTime = r5
            long r0 = com.googlecode.mp4parser.util.DateHelper.convert(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L20
            r5 = 1
            r4.setVersion(r5)
        L20:
            return
    }

    public void setTrackId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_14
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.trackId = r3
            return
    }

    public void setVolume(float r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_18
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.floatObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.volume = r3
            return
    }

    public void setWidth(double r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_20
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.doubleObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.width = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.TrackHeaderBox.ajc$tjp_11
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TrackHeaderBox["
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
            java.lang.String r2 = "trackId="
            r0.append(r2)
            long r2 = r4.getTrackId()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "duration="
            r0.append(r2)
            long r2 = r4.getDuration()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "layer="
            r0.append(r2)
            int r2 = r4.getLayer()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "alternateGroup="
            r0.append(r2)
            int r2 = r4.getAlternateGroup()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "volume="
            r0.append(r2)
            float r2 = r4.getVolume()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "matrix="
            r0.append(r2)
            com.googlecode.mp4parser.util.Matrix r2 = r4.matrix
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "width="
            r0.append(r2)
            double r2 = r4.getWidth()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "height="
            r0.append(r1)
            double r1 = r4.getHeight()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
