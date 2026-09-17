package com.googlecode.mp4parser.boxes;

/* loaded from: classes2.dex */
public class DTSSpecificBox extends com.googlecode.mp4parser.AbstractBox {
    public static final java.lang.String TYPE = "ddts";
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
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_30 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_31 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
            ajc$preClinit()
            return
    }

    public DTSSpecificBox() {
            r1 = this;
            java.lang.String r0 = "ddts"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.DTSSpecificBox> r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.class
            java.lang.String r1 = "DTSSpecificBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getAvgBitRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "method-execution"
            r1 = 89
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_0 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setAvgBitRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "avgBitRate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 93
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_1 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getStreamConstruction"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 129(0x81, float:1.81E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_10 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setStreamConstruction"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "streamConstruction"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 133(0x85, float:1.86E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_11 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCoreLFEPresent"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 137(0x89, float:1.92E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_12 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCoreLFEPresent"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "coreLFEPresent"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 141(0x8d, float:1.98E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_13 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCoreLayout"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 145(0x91, float:2.03E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_14 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCoreLayout"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "coreLayout"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 149(0x95, float:2.09E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_15 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getCoreSize"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 153(0x99, float:2.14E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_16 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setCoreSize"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "coreSize"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 157(0x9d, float:2.2E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_17 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getStereoDownmix"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 161(0xa1, float:2.26E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_18 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setStereoDownmix"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "stereoDownmix"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 165(0xa5, float:2.31E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_19 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getDTSSamplingFrequency"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 97
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_2 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getRepresentationType"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 169(0xa9, float:2.37E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_20 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setRepresentationType"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "representationType"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 173(0xad, float:2.42E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_21 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getChannelLayout"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 177(0xb1, float:2.48E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_22 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setChannelLayout"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "channelLayout"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 181(0xb5, float:2.54E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_23 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMultiAssetFlag"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 185(0xb9, float:2.59E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_24 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMultiAssetFlag"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "multiAssetFlag"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 189(0xbd, float:2.65E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_25 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getLBRDurationMod"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 193(0xc1, float:2.7E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_26 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setLBRDurationMod"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "LBRDurationMod"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 197(0xc5, float:2.76E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_27 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 201(0xc9, float:2.82E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_28 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReserved"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "reserved"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 205(0xcd, float:2.87E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_29 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setDTSSamplingFrequency"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "DTSSamplingFrequency"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 101(0x65, float:1.42E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_3 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getReservedBoxPresent"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 209(0xd1, float:2.93E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_30 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setReservedBoxPresent"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "reservedBoxPresent"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 213(0xd5, float:2.98E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_31 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getMaxBitRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "long"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 105(0x69, float:1.47E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_4 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setMaxBitRate"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "long"
            java.lang.String r5 = "maxBitRate"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 109(0x6d, float:1.53E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_5 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getPcmSampleDepth"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 113(0x71, float:1.58E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_6 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setPcmSampleDepth"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "pcmSampleDepth"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 117(0x75, float:1.64E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_7 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFrameDuration"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 121(0x79, float:1.7E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_8 = r0
            java.lang.String r1 = "1"
            java.lang.String r2 = "setFrameDuration"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.DTSSpecificBox"
            java.lang.String r4 = "int"
            java.lang.String r5 = "frameDuration"
            java.lang.String r6 = ""
            java.lang.String r7 = "void"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            r1 = 125(0x7d, float:1.75E-43)
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r9, r0, r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_9 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(java.nio.ByteBuffer r4) {
            r3 = this;
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.DTSSamplingFrequency = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.maxBitRate = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r4)
            r3.avgBitRate = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            r3.pcmSampleDepth = r0
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r0.<init>(r4)
            r4 = 2
            int r4 = r0.readBits(r4)
            r3.frameDuration = r4
            r4 = 5
            int r1 = r0.readBits(r4)
            r3.streamConstruction = r1
            r1 = 1
            int r2 = r0.readBits(r1)
            r3.coreLFEPresent = r2
            r2 = 6
            int r2 = r0.readBits(r2)
            r3.coreLayout = r2
            r2 = 14
            int r2 = r0.readBits(r2)
            r3.coreSize = r2
            int r2 = r0.readBits(r1)
            r3.stereoDownmix = r2
            r2 = 3
            int r2 = r0.readBits(r2)
            r3.representationType = r2
            r2 = 16
            int r2 = r0.readBits(r2)
            r3.channelLayout = r2
            int r2 = r0.readBits(r1)
            r3.multiAssetFlag = r2
            int r2 = r0.readBits(r1)
            r3.LBRDurationMod = r2
            int r1 = r0.readBits(r1)
            r3.reservedBoxPresent = r1
            int r4 = r0.readBits(r4)
            r3.reserved = r4
            return
    }

    public long getAvgBitRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.avgBitRate
            return r0
    }

    public int getChannelLayout() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_22
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.channelLayout
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(java.nio.ByteBuffer r5) {
            r4 = this;
            long r0 = r4.DTSSamplingFrequency
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            long r0 = r4.maxBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            long r0 = r4.avgBitRate
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r5, r0)
            int r0 = r4.pcmSampleDepth
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r5, r0)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer
            r0.<init>(r5)
            int r5 = r4.frameDuration
            r1 = 2
            r0.writeBits(r5, r1)
            int r5 = r4.streamConstruction
            r1 = 5
            r0.writeBits(r5, r1)
            int r5 = r4.coreLFEPresent
            r2 = 1
            r0.writeBits(r5, r2)
            int r5 = r4.coreLayout
            r3 = 6
            r0.writeBits(r5, r3)
            int r5 = r4.coreSize
            r3 = 14
            r0.writeBits(r5, r3)
            int r5 = r4.stereoDownmix
            r0.writeBits(r5, r2)
            int r5 = r4.representationType
            r3 = 3
            r0.writeBits(r5, r3)
            int r5 = r4.channelLayout
            r3 = 16
            r0.writeBits(r5, r3)
            int r5 = r4.multiAssetFlag
            r0.writeBits(r5, r2)
            int r5 = r4.LBRDurationMod
            r0.writeBits(r5, r2)
            int r5 = r4.reservedBoxPresent
            r0.writeBits(r5, r2)
            int r5 = r4.reserved
            r0.writeBits(r5, r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
            r2 = this;
            r0 = 20
            return r0
    }

    public int getCoreLFEPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_12
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.coreLFEPresent
            return r0
    }

    public int getCoreLayout() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_14
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.coreLayout
            return r0
    }

    public int getCoreSize() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_16
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.coreSize
            return r0
    }

    public long getDTSSamplingFrequency() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_2
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.DTSSamplingFrequency
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public int[] getDashAudioChannelConfiguration() {
            r11 = this;
            int r0 = r11.getChannelLayout()
            r1 = r0 & 1
            r2 = 4
            r3 = 0
            r4 = 1
            if (r1 != r4) goto Le
            r1 = 1
            r5 = 4
            goto L10
        Le:
            r1 = 0
            r5 = 0
        L10:
            r6 = r0 & 2
            r7 = 2
            if (r6 != r7) goto L1a
            int r1 = r1 + 2
            r5 = r5 | 1
            r5 = r5 | r7
        L1a:
            r6 = r0 & 4
            r8 = 32
            if (r6 != r2) goto L26
            int r1 = r1 + 2
            r2 = r5 | 16
            r5 = r2 | 32
        L26:
            r2 = r0 & 8
            r6 = 8
            if (r2 != r6) goto L30
            int r1 = r1 + 1
            r5 = r5 | 8
        L30:
            r2 = r0 & 16
            r6 = 16
            if (r2 != r6) goto L3a
            int r1 = r1 + 1
            r5 = r5 | 256(0x100, float:3.59E-43)
        L3a:
            r2 = r0 & 32
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r8) goto L46
            int r1 = r1 + 2
            r2 = r5 | 4096(0x1000, float:5.74E-42)
            r5 = r2 | 16384(0x4000, float:2.2959E-41)
        L46:
            r2 = r0 & 64
            r9 = 64
            if (r2 != r9) goto L52
            int r1 = r1 + 2
            r2 = r5 | 16
            r5 = r2 | 32
        L52:
            r2 = r0 & 128(0x80, float:1.794E-43)
            r9 = 128(0x80, float:1.794E-43)
            if (r2 != r9) goto L5c
            int r1 = r1 + 1
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L5c:
            r2 = r0 & 256(0x100, float:3.59E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r2 != r10) goto L66
            int r1 = r1 + 1
            r5 = r5 | 2048(0x800, float:2.87E-42)
        L66:
            r2 = r0 & 512(0x200, float:7.175E-43)
            r10 = 512(0x200, float:7.175E-43)
            if (r2 != r10) goto L72
            int r1 = r1 + 2
            r2 = r5 | 64
            r5 = r2 | 128(0x80, float:1.794E-43)
        L72:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            r9 = 1024(0x400, float:1.435E-42)
            if (r2 != r9) goto L7e
            int r1 = r1 + 2
            r2 = r5 | 512(0x200, float:7.175E-43)
            r5 = r2 | 1024(0x400, float:1.435E-42)
        L7e:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r2 != r9) goto L8a
            int r1 = r1 + 2
            r2 = r5 | 16
            r5 = r2 | 32
        L8a:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            r9 = 4096(0x1000, float:5.74E-42)
            if (r2 != r9) goto L94
            int r1 = r1 + 1
            r5 = r5 | 8
        L94:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            r9 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r9) goto La0
            int r1 = r1 + 2
            r2 = r5 | 16
            r5 = r2 | 32
        La0:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r2 != r6) goto La9
            int r1 = r1 + 1
            r5 = r5 | r8
        La9:
            r2 = 32768(0x8000, float:4.5918E-41)
            r6 = r0 & r2
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r6 != r2) goto Lb7
            int r1 = r1 + 2
            r2 = r2 | r5
            r5 = r2 | r9
        Lb7:
            r2 = r0 & r8
            if (r2 != r8) goto Lbd
            int r1 = r1 + 1
        Lbd:
            r0 = r0 & r9
            if (r0 != r9) goto Lc2
            int r1 = r1 + 2
        Lc2:
            int[] r0 = new int[r7]
            r0[r3] = r1
            r0[r4] = r5
            return r0
    }

    public int getFrameDuration() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_8
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.frameDuration
            return r0
    }

    public int getLBRDurationMod() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_26
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.LBRDurationMod
            return r0
    }

    public long getMaxBitRate() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_4
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            long r0 = r2.maxBitRate
            return r0
    }

    public int getMultiAssetFlag() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_24
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.multiAssetFlag
            return r0
    }

    public int getPcmSampleDepth() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_6
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.pcmSampleDepth
            return r0
    }

    public int getRepresentationType() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_20
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.representationType
            return r0
    }

    public int getReserved() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_28
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reserved
            return r0
    }

    public int getReservedBoxPresent() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_30
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.reservedBoxPresent
            return r0
    }

    public int getStereoDownmix() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_18
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.stereoDownmix
            return r0
    }

    public int getStreamConstruction() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_10
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            int r0 = r2.streamConstruction
            return r0
    }

    public void setAvgBitRate(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_1
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.avgBitRate = r3
            return
    }

    public void setChannelLayout(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_23
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.channelLayout = r3
            return
    }

    public void setCoreLFEPresent(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_13
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.coreLFEPresent = r3
            return
    }

    public void setCoreLayout(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_15
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.coreLayout = r3
            return
    }

    public void setCoreSize(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_17
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.coreSize = r3
            return
    }

    public void setDTSSamplingFrequency(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_3
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.DTSSamplingFrequency = r3
            return
    }

    public void setFrameDuration(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_9
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.frameDuration = r3
            return
    }

    public void setLBRDurationMod(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_27
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.LBRDurationMod = r3
            return
    }

    public void setMaxBitRate(long r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_5
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.longObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.maxBitRate = r3
            return
    }

    public void setMultiAssetFlag(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_25
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.multiAssetFlag = r3
            return
    }

    public void setPcmSampleDepth(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_7
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.pcmSampleDepth = r3
            return
    }

    public void setRepresentationType(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_21
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.representationType = r3
            return
    }

    public void setReserved(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_29
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reserved = r3
            return
    }

    public void setReservedBoxPresent(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_31
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.reservedBoxPresent = r3
            return
    }

    public void setStereoDownmix(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_19
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.stereoDownmix = r3
            return
    }

    public void setStreamConstruction(int r3) {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.DTSSpecificBox.ajc$tjp_11
            java.lang.Object r1 = org.mp4parser.aspectj.runtime.internal.Conversions.intObject(r3)
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2, r1)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r2.streamConstruction = r3
            return
    }
}
