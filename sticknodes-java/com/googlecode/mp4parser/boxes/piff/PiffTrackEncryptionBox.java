package com.googlecode.mp4parser.boxes.piff;

/* loaded from: classes2.dex */
public class PiffTrackEncryptionBox extends com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox {
    private static final /* synthetic */ org.mp4parser.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0 = null;

    static {
            ajc$preClinit()
            return
    }

    public PiffTrackEncryptionBox() {
            r1 = this;
            java.lang.String r0 = "uuid"
            r1.<init>(r0)
            return
    }

    private static /* synthetic */ void ajc$preClinit() {
            org.mp4parser.aspectj.runtime.reflect.Factory r8 = new org.mp4parser.aspectj.runtime.reflect.Factory
            java.lang.Class<com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox> r0 = com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox.class
            java.lang.String r1 = "PiffTrackEncryptionBox.java"
            r8.<init>(r1, r0)
            java.lang.String r1 = "1"
            java.lang.String r2 = "getFlags"
            java.lang.String r3 = "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox"
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = "int"
            r0 = r8
            org.mp4parser.aspectj.lang.reflect.MethodSignature r0 = r0.makeMethodSig(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "method-execution"
            r2 = 29
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = r8.makeSJP(r1, r0, r2)
            com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox.ajc$tjp_0 = r0
            return
    }

    @Override // com.googlecode.mp4parser.AbstractFullBox, com.coremedia.iso.boxes.FullBox
    public int getFlags() {
            r2 = this;
            org.mp4parser.aspectj.lang.JoinPoint$StaticPart r0 = com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox.ajc$tjp_0
            org.mp4parser.aspectj.lang.JoinPoint r0 = org.mp4parser.aspectj.runtime.reflect.Factory.makeJP(r0, r2, r2)
            com.googlecode.mp4parser.RequiresParseDetailAspect r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.aspectOf()
            r1.before(r0)
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
            r1 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0008: FILL_ARRAY_DATA , data: [-119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84} // fill-array
            return r0
    }
}
