package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class MovieHeaderBox extends com.googlecode.mp4parser.AbstractFullBox {
    private static com.googlecode.mp4parser.util.Logger LOG = null;
    public static final java.lang.String TYPE = "mvhd";
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
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    private java.util.Date creationTime;
    private int currentTime;
    private long duration;
    private com.googlecode.mp4parser.util.Matrix matrix;
    private java.util.Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume;

    static {
            ajc$preClinit()
            java.lang.Class<com.coremedia.iso.boxes.MovieHeaderBox> r0 = com.coremedia.iso.boxes.MovieHeaderBox.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.coremedia.iso.boxes.MovieHeaderBox.LOG = r0
            return
    }

    public MovieHeaderBox() {
            r2 = this;
            java.lang.String r0 = "mvhd"
            r2.<init>(r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.rate = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.volume = r0
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            r2.matrix = r0
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.coremedia.iso.boxes.MovieHeaderBox> r0 = com.coremedia.iso.boxes.MovieHeaderBox.class
            java.lang.String r1 = "MovieHeaderBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 66
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.util.Date"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 70
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setModificationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "modificationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 212(0xd4, float:2.97E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setTimescale"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "timescale"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 220(0xdc, float:3.08E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "duration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 224(0xe0, float:3.14E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "double"
            java.lang.String r5 = "rate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 231(0xe7, float:3.24E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setVolume"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "float"
            java.lang.String r5 = "volume"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 235(0xeb, float:3.3E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMatrix"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "com.googlecode.mp4parser.util.Matrix"
            java.lang.String r5 = "matrix"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 239(0xef, float:3.35E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setNextTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "nextTrackId"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 243(0xf3, float:3.4E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPreviewTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 247(0xf7, float:3.46E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setPreviewTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "previewTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 251(0xfb, float:3.52E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPreviewDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 255(0xff, float:3.57E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getTimescale"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 74
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setPreviewDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "previewDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 259(0x103, float:3.63E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPosterTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 263(0x107, float:3.69E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setPosterTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "posterTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 267(0x10b, float:3.74E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_22 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSelectionTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 271(0x10f, float:3.8E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_23 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSelectionTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "selectionTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 275(0x113, float:3.85E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_24 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getSelectionDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 279(0x117, float:3.91E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_25 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setSelectionDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "selectionDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 283(0x11b, float:3.97E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_26 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCurrentTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 287(0x11f, float:4.02E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_27 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCurrentTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "currentTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 291(0x123, float:4.08E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_28 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDuration"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 78
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getRate"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "double"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 82
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getVolume"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "float"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 86
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMatrix"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "com.googlecode.mp4parser.util.Matrix"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 90
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getNextTrackId"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 94
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "java.lang.String"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 148(0x94, float:2.07E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCreationTime"
            java.lang.String r3 = "com.coremedia.iso.boxes.MovieHeaderBox"
            java.lang.String r4 = "java.util.Date"
            java.lang.String r5 = "creationTime"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 204(0xcc, float:2.86E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_9 = r0
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
            com.googlecode.mp4parser.util.Logger r0 = com.coremedia.iso.boxes.MovieHeaderBox.LOG
            java.lang.String r1 = "mvhd duration is not in expected range"
            r0.logWarn(r1)
        L5b:
            double r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r6)
            r5.rate = r0
            float r0 = com.coremedia.iso.IsoTypeReader.readFixedPoint88(r6)
            r5.volume = r0
            com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.fromByteBuffer(r6)
            r5.matrix = r0
            int r0 = r6.getInt()
            r5.previewTime = r0
            int r0 = r6.getInt()
            r5.previewDuration = r0
            int r0 = r6.getInt()
            r5.posterTime = r0
            int r0 = r6.getInt()
            r5.selectionTime = r0
            int r0 = r6.getInt()
            r5.selectionDuration = r0
            int r0 = r6.getInt()
            r5.currentTime = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r6)
            r5.nextTrackId = r0
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
            double r0 = r2.rate
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r3, r0)
            float r0 = r2.volume
            double r0 = (double) r0
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint88(r3, r0)
            r0 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r3, r0)
            r0 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            com.googlecode.mp4parser.util.Matrix r0 = r2.matrix
            r0.getContent(r3)
            int r0 = r2.previewTime
            r3.putInt(r0)
            int r0 = r2.previewDuration
            r3.putInt(r0)
            int r0 = r2.posterTime
            r3.putInt(r0)
            int r0 = r2.selectionTime
            r3.putInt(r0)
            int r0 = r2.selectionDuration
            r3.putInt(r0)
            int r0 = r2.currentTime
            r3.putInt(r0)
            long r0 = r2.nextTrackId
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
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
            r2 = 80
            long r0 = r0 + r2
            return r0
    }

    public java.util.Date getCreationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.creationTime
            return r0
    }

    public int getCurrentTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_27
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.currentTime
            return r0
    }

    public long getDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_3
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.duration
            return r0
    }

    public com.googlecode.mp4parser.util.Matrix getMatrix() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            com.googlecode.mp4parser.util.Matrix r0 = r2.matrix
            return r0
    }

    public java.util.Date getModificationTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_1
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.util.Date r0 = r2.modificationTime
            return r0
    }

    public long getNextTrackId() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_7
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.nextTrackId
            return r0
    }

    public int getPosterTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_21
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.posterTime
            return r0
    }

    public int getPreviewDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_19
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.previewDuration
            return r0
    }

    public int getPreviewTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_17
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.previewTime
            return r0
    }

    public double getRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            double r0 = r2.rate
            return r0
    }

    public int getSelectionDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_25
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.selectionDuration
            return r0
    }

    public int getSelectionTime() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_23
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.selectionTime
            return r0
    }

    public long getTimescale() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.timescale
            return r0
    }

    public float getVolume() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_5
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            float r0 = r2.volume
            return r0
    }

    public void setCreationTime(java.util.Date r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_9
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

    public void setCurrentTime(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_28
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.currentTime = r3
            return
    }

    public void setDuration(long r4) {
            r3 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_12
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r4)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r3, r3, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r3.duration = r4
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L20
            r4 = 1
            r3.setVersion(r4)
        L20:
            return
    }

    public void setMatrix(com.googlecode.mp4parser.util.Matrix r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_15
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r3)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.matrix = r3
            return
    }

    public void setModificationTime(java.util.Date r5) {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_10
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

    public void setNextTrackId(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_16
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.nextTrackId = r3
            return
    }

    public void setPosterTime(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_22
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.posterTime = r3
            return
    }

    public void setPreviewDuration(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_20
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.previewDuration = r3
            return
    }

    public void setPreviewTime(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_18
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.previewTime = r3
            return
    }

    public void setRate(double r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_13
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.doubleObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.rate = r3
            return
    }

    public void setSelectionDuration(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_26
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.selectionDuration = r3
            return
    }

    public void setSelectionTime(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_24
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.selectionTime = r3
            return
    }

    public void setTimescale(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.timescale = r3
            return
    }

    public void setVolume(float r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_14
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.floatObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.volume = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.coremedia.iso.boxes.MovieHeaderBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r4, r4)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MovieHeaderBox["
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
            java.lang.String r2 = "rate="
            r0.append(r2)
            double r2 = r4.getRate()
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
            java.lang.String r1 = "nextTrackId="
            r0.append(r1)
            long r1 = r4.getNextTrackId()
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
