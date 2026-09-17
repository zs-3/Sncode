package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class AC3TrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    static int[][][][] bitRateAndFrameSizeTable;
    private final com.googlecode.mp4parser.DataSource dataSource;
    private long[] duration;
    private com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    private com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    static {
            r0 = 4
            int[] r1 = new int[r0]
            r1 = {x0844: FILL_ARRAY_DATA , data: [19, 2, 3, 2} // fill-array
            java.lang.Class<int> r2 = int.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            int[][][][] r1 = (int[][][][]) r1
            com.googlecode.mp4parser.authoring.tracks.AC3TrackImpl.bitRateAndFrameSizeTable = r1
            r2 = 0
            r3 = r1[r2]
            r3 = r3[r2]
            r3 = r3[r2]
            r4 = 32
            r3[r2] = r4
            r3 = r1[r2]
            r4 = 1
            r3 = r3[r4]
            r3 = r3[r2]
            r5 = 32
            r3[r2] = r5
            r3 = r1[r2]
            r3 = r3[r2]
            r3 = r3[r2]
            r5 = 64
            r3[r4] = r5
            r3 = r1[r2]
            r3 = r3[r4]
            r3 = r3[r2]
            r3[r4] = r5
            r3 = r1[r4]
            r3 = r3[r2]
            r3 = r3[r2]
            r5 = 40
            r3[r2] = r5
            r3 = r1[r4]
            r3 = r3[r4]
            r3 = r3[r2]
            r3[r2] = r5
            r3 = r1[r4]
            r3 = r3[r2]
            r3 = r3[r2]
            r5 = 80
            r3[r4] = r5
            r3 = r1[r4]
            r3 = r3[r4]
            r3 = r3[r2]
            r3[r4] = r5
            r3 = 2
            r5 = r1[r3]
            r5 = r5[r2]
            r5 = r5[r2]
            r6 = 48
            r5[r2] = r6
            r5 = r1[r3]
            r5 = r5[r4]
            r5 = r5[r2]
            r5[r2] = r6
            r5 = r1[r3]
            r5 = r5[r2]
            r5 = r5[r2]
            r6 = 96
            r5[r4] = r6
            r5 = r1[r3]
            r5 = r5[r4]
            r5 = r5[r2]
            r5[r4] = r6
            r5 = 3
            r7 = r1[r5]
            r7 = r7[r2]
            r7 = r7[r2]
            r8 = 56
            r7[r2] = r8
            r7 = r1[r5]
            r7 = r7[r4]
            r7 = r7[r2]
            r7[r2] = r8
            r7 = r1[r5]
            r7 = r7[r2]
            r7 = r7[r2]
            r8 = 112(0x70, float:1.57E-43)
            r7[r4] = r8
            r7 = r1[r5]
            r7 = r7[r4]
            r7 = r7[r2]
            r7[r4] = r8
            r7 = r1[r0]
            r7 = r7[r2]
            r7 = r7[r2]
            r8 = 64
            r7[r2] = r8
            r7 = r1[r0]
            r7 = r7[r4]
            r7 = r7[r2]
            r7[r2] = r8
            r7 = r1[r0]
            r7 = r7[r2]
            r7 = r7[r2]
            r8 = 128(0x80, float:1.794E-43)
            r7[r4] = r8
            r7 = r1[r0]
            r7 = r7[r4]
            r7 = r7[r2]
            r7[r4] = r8
            r7 = 5
            r8 = r1[r7]
            r8 = r8[r2]
            r8 = r8[r2]
            r9 = 80
            r8[r2] = r9
            r8 = r1[r7]
            r8 = r8[r4]
            r8 = r8[r2]
            r8[r2] = r9
            r8 = r1[r7]
            r8 = r8[r2]
            r8 = r8[r2]
            r9 = 160(0xa0, float:2.24E-43)
            r8[r4] = r9
            r8 = r1[r7]
            r8 = r8[r4]
            r8 = r8[r2]
            r8[r4] = r9
            r8 = 6
            r9 = r1[r8]
            r9 = r9[r2]
            r9 = r9[r2]
            r9[r2] = r6
            r9 = r1[r8]
            r9 = r9[r4]
            r9 = r9[r2]
            r9[r2] = r6
            r9 = r1[r8]
            r9 = r9[r2]
            r9 = r9[r2]
            r10 = 192(0xc0, float:2.69E-43)
            r9[r4] = r10
            r9 = r1[r8]
            r9 = r9[r4]
            r9 = r9[r2]
            r9[r4] = r10
            r9 = 7
            r11 = r1[r9]
            r11 = r11[r2]
            r11 = r11[r2]
            r12 = 112(0x70, float:1.57E-43)
            r11[r2] = r12
            r11 = r1[r9]
            r11 = r11[r4]
            r11 = r11[r2]
            r11[r2] = r12
            r11 = r1[r9]
            r11 = r11[r2]
            r11 = r11[r2]
            r12 = 224(0xe0, float:3.14E-43)
            r11[r4] = r12
            r11 = r1[r9]
            r11 = r11[r4]
            r11 = r11[r2]
            r11[r4] = r12
            r11 = 8
            r12 = r1[r11]
            r12 = r12[r2]
            r12 = r12[r2]
            r13 = 128(0x80, float:1.794E-43)
            r12[r2] = r13
            r12 = r1[r11]
            r12 = r12[r4]
            r12 = r12[r2]
            r12[r2] = r13
            r12 = r1[r11]
            r12 = r12[r2]
            r12 = r12[r2]
            r13 = 256(0x100, float:3.59E-43)
            r12[r4] = r13
            r12 = r1[r11]
            r12 = r12[r4]
            r12 = r12[r2]
            r12[r4] = r13
            r12 = 9
            r13 = r1[r12]
            r13 = r13[r2]
            r13 = r13[r2]
            r14 = 160(0xa0, float:2.24E-43)
            r13[r2] = r14
            r13 = r1[r12]
            r13 = r13[r4]
            r13 = r13[r2]
            r13[r2] = r14
            r13 = r1[r12]
            r13 = r13[r2]
            r13 = r13[r2]
            r14 = 320(0x140, float:4.48E-43)
            r13[r4] = r14
            r13 = r1[r12]
            r13 = r13[r4]
            r13 = r13[r2]
            r13[r4] = r14
            r13 = 10
            r14 = r1[r13]
            r14 = r14[r2]
            r14 = r14[r2]
            r14[r2] = r10
            r14 = r1[r13]
            r14 = r14[r4]
            r14 = r14[r2]
            r14[r2] = r10
            r14 = r1[r13]
            r14 = r14[r2]
            r14 = r14[r2]
            r15 = 384(0x180, float:5.38E-43)
            r14[r4] = r15
            r14 = r1[r13]
            r14 = r14[r4]
            r14 = r14[r2]
            r14[r4] = r15
            r14 = 11
            r16 = r1[r14]
            r16 = r16[r2]
            r16 = r16[r2]
            r17 = 224(0xe0, float:3.14E-43)
            r16[r2] = r17
            r16 = r1[r14]
            r16 = r16[r4]
            r16 = r16[r2]
            r16[r2] = r17
            r16 = r1[r14]
            r16 = r16[r2]
            r16 = r16[r2]
            r17 = 448(0x1c0, float:6.28E-43)
            r16[r4] = r17
            r16 = r1[r14]
            r16 = r16[r4]
            r16 = r16[r2]
            r16[r4] = r17
            r16 = 12
            r17 = r1[r16]
            r17 = r17[r2]
            r17 = r17[r2]
            r18 = 256(0x100, float:3.59E-43)
            r17[r2] = r18
            r17 = r1[r16]
            r17 = r17[r4]
            r17 = r17[r2]
            r17[r2] = r18
            r17 = r1[r16]
            r17 = r17[r2]
            r17 = r17[r2]
            r18 = 512(0x200, float:7.175E-43)
            r17[r4] = r18
            r17 = r1[r16]
            r17 = r17[r4]
            r17 = r17[r2]
            r17[r4] = r18
            r17 = 13
            r18 = r1[r17]
            r18 = r18[r2]
            r18 = r18[r2]
            r19 = 320(0x140, float:4.48E-43)
            r18[r2] = r19
            r18 = r1[r17]
            r18 = r18[r4]
            r18 = r18[r2]
            r18[r2] = r19
            r18 = r1[r17]
            r18 = r18[r2]
            r18 = r18[r2]
            r19 = 640(0x280, float:8.97E-43)
            r18[r4] = r19
            r18 = r1[r17]
            r18 = r18[r4]
            r18 = r18[r2]
            r18[r4] = r19
            r18 = 14
            r19 = r1[r18]
            r19 = r19[r2]
            r19 = r19[r2]
            r19[r2] = r15
            r19 = r1[r18]
            r19 = r19[r4]
            r19 = r19[r2]
            r19[r2] = r15
            r19 = r1[r18]
            r19 = r19[r2]
            r19 = r19[r2]
            r20 = 768(0x300, float:1.076E-42)
            r19[r4] = r20
            r19 = r1[r18]
            r19 = r19[r4]
            r19 = r19[r2]
            r19[r4] = r20
            r19 = 15
            r20 = r1[r19]
            r20 = r20[r2]
            r20 = r20[r2]
            r21 = 448(0x1c0, float:6.28E-43)
            r20[r2] = r21
            r20 = r1[r19]
            r20 = r20[r4]
            r20 = r20[r2]
            r20[r2] = r21
            r20 = r1[r19]
            r20 = r20[r2]
            r20 = r20[r2]
            r21 = 896(0x380, float:1.256E-42)
            r20[r4] = r21
            r20 = r1[r19]
            r20 = r20[r4]
            r20 = r20[r2]
            r20[r4] = r21
            r20 = 16
            r21 = r1[r20]
            r21 = r21[r2]
            r21 = r21[r2]
            r22 = 512(0x200, float:7.175E-43)
            r21[r2] = r22
            r21 = r1[r20]
            r21 = r21[r4]
            r21 = r21[r2]
            r21[r2] = r22
            r21 = r1[r20]
            r21 = r21[r2]
            r21 = r21[r2]
            r22 = 1024(0x400, float:1.435E-42)
            r21[r4] = r22
            r21 = r1[r20]
            r21 = r21[r4]
            r21 = r21[r2]
            r21[r4] = r22
            r21 = 17
            r22 = r1[r21]
            r22 = r22[r2]
            r22 = r22[r2]
            r23 = 576(0x240, float:8.07E-43)
            r22[r2] = r23
            r22 = r1[r21]
            r22 = r22[r4]
            r22 = r22[r2]
            r22[r2] = r23
            r22 = r1[r21]
            r22 = r22[r2]
            r22 = r22[r2]
            r23 = 1152(0x480, float:1.614E-42)
            r22[r4] = r23
            r22 = r1[r21]
            r22 = r22[r4]
            r22 = r22[r2]
            r22[r4] = r23
            r22 = 18
            r23 = r1[r22]
            r23 = r23[r2]
            r23 = r23[r2]
            r24 = 640(0x280, float:8.97E-43)
            r23[r2] = r24
            r23 = r1[r22]
            r23 = r23[r4]
            r23 = r23[r2]
            r23[r2] = r24
            r23 = r1[r22]
            r23 = r23[r2]
            r23 = r23[r2]
            r24 = 1280(0x500, float:1.794E-42)
            r23[r4] = r24
            r23 = r1[r22]
            r23 = r23[r4]
            r23 = r23[r2]
            r23[r4] = r24
            r23 = r1[r2]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 32
            r23[r2] = r24
            r23 = r1[r2]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r2]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 69
            r23[r4] = r24
            r23 = r1[r2]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 70
            r23[r4] = r24
            r23 = r1[r4]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 40
            r23[r2] = r24
            r23 = r1[r4]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r4]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 87
            r23[r4] = r24
            r23 = r1[r4]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 88
            r23[r4] = r24
            r23 = r1[r3]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 48
            r23[r2] = r24
            r23 = r1[r3]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r3]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 104(0x68, float:1.46E-43)
            r23[r4] = r24
            r23 = r1[r3]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 105(0x69, float:1.47E-43)
            r23[r4] = r24
            r23 = r1[r5]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 56
            r23[r2] = r24
            r23 = r1[r5]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r5]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 121(0x79, float:1.7E-43)
            r23[r4] = r24
            r23 = r1[r5]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 122(0x7a, float:1.71E-43)
            r23[r4] = r24
            r23 = r1[r0]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 64
            r23[r2] = r24
            r23 = r1[r0]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r0]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 139(0x8b, float:1.95E-43)
            r23[r4] = r24
            r23 = r1[r0]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 140(0x8c, float:1.96E-43)
            r23[r4] = r24
            r23 = r1[r7]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 80
            r23[r2] = r24
            r23 = r1[r7]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r7]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 174(0xae, float:2.44E-43)
            r23[r4] = r24
            r23 = r1[r7]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 175(0xaf, float:2.45E-43)
            r23[r4] = r24
            r23 = r1[r8]
            r23 = r23[r2]
            r23 = r23[r4]
            r23[r2] = r6
            r23 = r1[r8]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r6
            r23 = r1[r8]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 208(0xd0, float:2.91E-43)
            r23[r4] = r24
            r23 = r1[r8]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 209(0xd1, float:2.93E-43)
            r23[r4] = r24
            r23 = r1[r9]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 112(0x70, float:1.57E-43)
            r23[r2] = r24
            r23 = r1[r9]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r9]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 243(0xf3, float:3.4E-43)
            r23[r4] = r24
            r23 = r1[r9]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 244(0xf4, float:3.42E-43)
            r23[r4] = r24
            r23 = r1[r11]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 128(0x80, float:1.794E-43)
            r23[r2] = r24
            r23 = r1[r11]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r11]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 278(0x116, float:3.9E-43)
            r23[r4] = r24
            r23 = r1[r11]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 279(0x117, float:3.91E-43)
            r23[r4] = r24
            r23 = r1[r12]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 160(0xa0, float:2.24E-43)
            r23[r2] = r24
            r23 = r1[r12]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r12]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 348(0x15c, float:4.88E-43)
            r23[r4] = r24
            r23 = r1[r12]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 349(0x15d, float:4.89E-43)
            r23[r4] = r24
            r23 = r1[r13]
            r23 = r23[r2]
            r23 = r23[r4]
            r23[r2] = r10
            r23 = r1[r13]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r10
            r23 = r1[r13]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 417(0x1a1, float:5.84E-43)
            r23[r4] = r24
            r23 = r1[r13]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 418(0x1a2, float:5.86E-43)
            r23[r4] = r24
            r23 = r1[r14]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 224(0xe0, float:3.14E-43)
            r23[r2] = r24
            r23 = r1[r14]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r14]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 487(0x1e7, float:6.82E-43)
            r23[r4] = r24
            r23 = r1[r14]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 488(0x1e8, float:6.84E-43)
            r23[r4] = r24
            r23 = r1[r16]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 256(0x100, float:3.59E-43)
            r23[r2] = r24
            r23 = r1[r16]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r16]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 557(0x22d, float:7.8E-43)
            r23[r4] = r24
            r23 = r1[r16]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 558(0x22e, float:7.82E-43)
            r23[r4] = r24
            r23 = r1[r17]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 320(0x140, float:4.48E-43)
            r23[r2] = r24
            r23 = r1[r17]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r17]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 696(0x2b8, float:9.75E-43)
            r23[r4] = r24
            r23 = r1[r17]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 697(0x2b9, float:9.77E-43)
            r23[r4] = r24
            r23 = r1[r18]
            r23 = r23[r2]
            r23 = r23[r4]
            r23[r2] = r15
            r23 = r1[r18]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r15
            r23 = r1[r18]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 835(0x343, float:1.17E-42)
            r23[r4] = r24
            r23 = r1[r18]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 836(0x344, float:1.171E-42)
            r23[r4] = r24
            r23 = r1[r19]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 448(0x1c0, float:6.28E-43)
            r23[r2] = r24
            r23 = r1[r19]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r19]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 975(0x3cf, float:1.366E-42)
            r23[r4] = r24
            r23 = r1[r19]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r4] = r24
            r23 = r1[r20]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 512(0x200, float:7.175E-43)
            r23[r2] = r24
            r23 = r1[r20]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r20]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 1114(0x45a, float:1.561E-42)
            r23[r4] = r24
            r23 = r1[r20]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 1115(0x45b, float:1.562E-42)
            r23[r4] = r24
            r23 = r1[r21]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 576(0x240, float:8.07E-43)
            r23[r2] = r24
            r23 = r1[r21]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r21]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 1253(0x4e5, float:1.756E-42)
            r23[r4] = r24
            r23 = r1[r21]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 1254(0x4e6, float:1.757E-42)
            r23[r4] = r24
            r23 = r1[r22]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 640(0x280, float:8.97E-43)
            r23[r2] = r24
            r23 = r1[r22]
            r23 = r23[r4]
            r23 = r23[r4]
            r23[r2] = r24
            r23 = r1[r22]
            r23 = r23[r2]
            r23 = r23[r4]
            r24 = 1393(0x571, float:1.952E-42)
            r23[r4] = r24
            r23 = r1[r22]
            r23 = r23[r4]
            r23 = r23[r4]
            r24 = 1394(0x572, float:1.953E-42)
            r23[r4] = r24
            r23 = r1[r2]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 32
            r23[r2] = r24
            r23 = r1[r2]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r2] = r24
            r23 = r1[r2]
            r23 = r23[r2]
            r23 = r23[r3]
            r23[r4] = r6
            r23 = r1[r2]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r4] = r6
            r23 = r1[r4]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 40
            r23[r2] = r24
            r23 = r1[r4]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r2] = r24
            r23 = r1[r4]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 120(0x78, float:1.68E-43)
            r23[r4] = r24
            r23 = r1[r4]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r4] = r24
            r23 = r1[r3]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 48
            r23[r2] = r24
            r23 = r1[r3]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r2] = r24
            r23 = r1[r3]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 144(0x90, float:2.02E-43)
            r23[r4] = r24
            r23 = r1[r3]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r4] = r24
            r23 = r1[r5]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 56
            r23[r2] = r24
            r23 = r1[r5]
            r23 = r23[r4]
            r23 = r23[r3]
            r23[r2] = r24
            r23 = r1[r5]
            r23 = r23[r2]
            r23 = r23[r3]
            r24 = 168(0xa8, float:2.35E-43)
            r23[r4] = r24
            r5 = r1[r5]
            r5 = r5[r4]
            r5 = r5[r3]
            r23 = 168(0xa8, float:2.35E-43)
            r5[r4] = r23
            r5 = r1[r0]
            r5 = r5[r2]
            r5 = r5[r3]
            r23 = 64
            r5[r2] = r23
            r5 = r1[r0]
            r5 = r5[r4]
            r5 = r5[r3]
            r5[r2] = r23
            r5 = r1[r0]
            r5 = r5[r2]
            r5 = r5[r3]
            r5[r4] = r10
            r0 = r1[r0]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r10
            r0 = r1[r7]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 80
            r0[r2] = r5
            r0 = r1[r7]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r7]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 240(0xf0, float:3.36E-43)
            r0[r4] = r5
            r0 = r1[r7]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r8]
            r0 = r0[r2]
            r0 = r0[r3]
            r0[r2] = r6
            r0 = r1[r8]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r6
            r0 = r1[r8]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 288(0x120, float:4.04E-43)
            r0[r4] = r5
            r0 = r1[r8]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r9]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 112(0x70, float:1.57E-43)
            r0[r2] = r5
            r0 = r1[r9]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r9]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 336(0x150, float:4.71E-43)
            r0[r4] = r5
            r0 = r1[r9]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r11]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 128(0x80, float:1.794E-43)
            r0[r2] = r5
            r0 = r1[r11]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r11]
            r0 = r0[r2]
            r0 = r0[r3]
            r0[r4] = r15
            r0 = r1[r11]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r15
            r0 = r1[r12]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 160(0xa0, float:2.24E-43)
            r0[r2] = r5
            r0 = r1[r12]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r12]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 480(0x1e0, float:6.73E-43)
            r0[r4] = r5
            r0 = r1[r12]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r13]
            r0 = r0[r2]
            r0 = r0[r3]
            r0[r2] = r10
            r0 = r1[r13]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r10
            r0 = r1[r13]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 576(0x240, float:8.07E-43)
            r0[r4] = r5
            r0 = r1[r13]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r14]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 224(0xe0, float:3.14E-43)
            r0[r2] = r5
            r0 = r1[r14]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r14]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 672(0x2a0, float:9.42E-43)
            r0[r4] = r5
            r0 = r1[r14]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r16]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 256(0x100, float:3.59E-43)
            r0[r2] = r5
            r0 = r1[r16]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r16]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 768(0x300, float:1.076E-42)
            r0[r4] = r5
            r0 = r1[r16]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r17]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 320(0x140, float:4.48E-43)
            r0[r2] = r5
            r0 = r1[r17]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r17]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 960(0x3c0, float:1.345E-42)
            r0[r4] = r5
            r0 = r1[r17]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r18]
            r0 = r0[r2]
            r0 = r0[r3]
            r0[r2] = r15
            r0 = r1[r18]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r15
            r0 = r1[r18]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 1152(0x480, float:1.614E-42)
            r0[r4] = r5
            r0 = r1[r18]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r19]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 448(0x1c0, float:6.28E-43)
            r0[r2] = r5
            r0 = r1[r19]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r19]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 1344(0x540, float:1.883E-42)
            r0[r4] = r5
            r0 = r1[r19]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r20]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 512(0x200, float:7.175E-43)
            r0[r2] = r5
            r0 = r1[r20]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r20]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 1536(0x600, float:2.152E-42)
            r0[r4] = r5
            r0 = r1[r20]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r21]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 576(0x240, float:8.07E-43)
            r0[r2] = r5
            r0 = r1[r21]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r21]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 1728(0x6c0, float:2.421E-42)
            r0[r4] = r5
            r0 = r1[r21]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r4] = r5
            r0 = r1[r22]
            r0 = r0[r2]
            r0 = r0[r3]
            r5 = 640(0x280, float:8.97E-43)
            r0[r2] = r5
            r0 = r1[r22]
            r0 = r0[r4]
            r0 = r0[r3]
            r0[r2] = r5
            r0 = r1[r22]
            r0 = r0[r2]
            r0 = r0[r3]
            r2 = 1920(0x780, float:2.69E-42)
            r0[r4] = r2
            r0 = r1[r22]
            r0 = r0[r4]
            r0 = r0[r3]
            r1 = 1920(0x780, float:2.69E-42)
            r0[r4] = r1
            return
    }

    public AC3TrackImpl(com.googlecode.mp4parser.DataSource r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "eng"
            r1.<init>(r2, r0)
            return
    }

    public AC3TrackImpl(com.googlecode.mp4parser.DataSource r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r2.trackMetaData = r0
            r2.dataSource = r3
            r0.setLanguage(r4)
            java.util.List r3 = r2.readSamples()
            r2.samples = r3
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r3.<init>()
            r2.sampleDescriptionBox = r3
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r3 = r2.createAudioSampleEntry()
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r2.sampleDescriptionBox
            r0.addBox(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r2.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setCreationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r2.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setModificationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r2.trackMetaData
            r0.setLanguage(r4)
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r2.trackMetaData
            long r0 = r3.getSampleRate()
            r4.setTimescale(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r2.trackMetaData
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setVolume(r4)
            return
    }

    private com.coremedia.iso.boxes.sampleentry.AudioSampleEntry createAudioSampleEntry() throws java.io.IOException {
            r14 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r14.samples
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.googlecode.mp4parser.authoring.Sample r0 = (com.googlecode.mp4parser.authoring.Sample) r0
            java.nio.ByteBuffer r0 = r0.asByteBuffer()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r2.<init>(r0)
            r0 = 16
            int r3 = r2.readBits(r0)
            r4 = 2935(0xb77, float:4.113E-42)
            if (r3 != r4) goto Lc8
            r2.readBits(r0)
            r3 = 2
            int r4 = r2.readBits(r3)
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 == r5) goto L36
            if (r4 != r3) goto L2e
            r6 = 32000(0x7d00, float:4.4842E-41)
            goto L3d
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unsupported Sample Rate"
            r0.<init>(r1)
            throw r0
        L36:
            r6 = 44100(0xac44, float:6.1797E-41)
            goto L3d
        L3a:
            r6 = 48000(0xbb80, float:6.7262E-41)
        L3d:
            r7 = 6
            int r8 = r2.readBits(r7)
            r9 = 5
            int r9 = r2.readBits(r9)
            r10 = 3
            int r11 = r2.readBits(r10)
            int r10 = r2.readBits(r10)
            if (r9 == r0) goto Lc0
            r12 = 9
            if (r9 != r12) goto L59
            int r6 = r6 / 2
            goto L68
        L59:
            r12 = 8
            if (r9 == r12) goto L68
            if (r9 != r7) goto L60
            goto L68
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unsupported bsid"
            r0.<init>(r1)
            throw r0
        L68:
            if (r10 == r5) goto L71
            r7 = r10 & 1
            if (r7 != r5) goto L71
            r2.readBits(r3)
        L71:
            r7 = r10 & 4
            if (r7 == 0) goto L78
            r2.readBits(r3)
        L78:
            if (r10 != r3) goto L7d
            r2.readBits(r3)
        L7d:
            switch(r10) {
                case 0: goto L88;
                case 1: goto L88;
                case 2: goto L88;
                case 3: goto L88;
                case 4: goto L88;
                case 5: goto L88;
                case 6: goto L88;
                case 7: goto L88;
                default: goto L80;
            }
        L80:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unsupported acmod"
            r0.<init>(r1)
            throw r0
        L88:
            int r2 = r2.readBits(r5)
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r7 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r12 = "ac-3"
            r7.<init>(r12)
            r7.setChannelCount(r3)
            long r12 = (long) r6
            r7.setSampleRate(r12)
            r7.setDataReferenceIndex(r5)
            r7.setSampleSize(r0)
            com.googlecode.mp4parser.boxes.AC3SpecificBox r0 = new com.googlecode.mp4parser.boxes.AC3SpecificBox
            r0.<init>()
            r0.setAcmod(r10)
            int r3 = r8 >> 1
            r0.setBitRateCode(r3)
            r0.setBsid(r9)
            r0.setBsmod(r11)
            r0.setFscod(r4)
            r0.setLfeon(r2)
            r0.setReserved(r1)
            r7.addBox(r0)
            return r7
        Lc0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "You cannot read E-AC-3 track with AC3TrackImpl.class - user EC3TrackImpl.class"
            r0.<init>(r1)
            throw r0
        Lc8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Stream doesn't seem to be AC3"
            r0.<init>(r1)
            throw r0
    }

    private int getFrameSize(int r5, int r6) {
            r4 = this;
            int r0 = r5 >>> 1
            r1 = 1
            r5 = r5 & r1
            r2 = 18
            if (r0 > r2) goto L1a
            if (r5 > r1) goto L1a
            r2 = 2
            if (r6 > r2) goto L1a
            int[][][][] r3 = com.googlecode.mp4parser.authoring.tracks.AC3TrackImpl.bitRateAndFrameSizeTable
            r0 = r3[r0]
            r5 = r0[r5]
            r5 = r5[r6]
            r5 = r5[r1]
            int r5 = r5 * 2
            return r5
        L1a:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Cannot determine framesize of current sample"
            r5.<init>(r6)
            throw r5
    }

    private java.util.List<com.googlecode.mp4parser.authoring.Sample> readSamples() throws java.io.IOException {
            r15 = this;
            r0 = 5
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        La:
            r2 = -1
            com.googlecode.mp4parser.DataSource r3 = r15.dataSource
            int r3 = r3.read(r0)
            if (r2 != r3) goto L21
            int r0 = r1.size()
            long[] r0 = new long[r0]
            r15.duration = r0
            r2 = 1536(0x600, double:7.59E-321)
            java.util.Arrays.fill(r0, r2)
            return r1
        L21:
            r2 = 4
            byte r3 = r0.get(r2)
            r3 = r3 & 63
            byte r2 = r0.get(r2)
            int r2 = r2 >> 6
            int r2 = r15.getFrameSize(r3, r2)
            com.googlecode.mp4parser.authoring.tracks.AC3TrackImpl$1SampleImpl r10 = new com.googlecode.mp4parser.authoring.tracks.AC3TrackImpl$1SampleImpl
            com.googlecode.mp4parser.DataSource r3 = r15.dataSource
            long r3 = r3.position()
            r11 = 5
            long r5 = r3 - r11
            long r13 = (long) r2
            com.googlecode.mp4parser.DataSource r9 = r15.dataSource
            r3 = r10
            r4 = r15
            r7 = r13
            r3.<init>(r4, r5, r7, r9)
            r1.add(r10)
            com.googlecode.mp4parser.DataSource r2 = r15.dataSource
            long r3 = r2.position()
            long r3 = r3 - r11
            long r3 = r3 + r13
            r2.position(r3)
            r0.rewind()
            goto La
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "soun"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
            r1 = this;
            monitor-enter(r1)
            long[] r0 = r1.duration     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }
}
