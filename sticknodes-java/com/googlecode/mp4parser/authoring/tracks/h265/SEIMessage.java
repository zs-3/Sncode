package com.googlecode.mp4parser.authoring.tracks.h265;

/* loaded from: classes2.dex */
public class SEIMessage {
    public SEIMessage(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r9) throws java.io.IOException {
            r8 = this;
            r8.<init>()
            r0 = 0
        L4:
            r1 = 8
            int r2 = r9.readBits(r1)
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L36
            int r2 = r9.readBits(r1)
            int r2 = r2 + r0
        L16:
            int r0 = r9.readBits(r1)
            long r6 = (long) r0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            r9.readBits(r1)
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "payloadType "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r9.println(r0)
            return
        L36:
            int r0 = r0 + 255
            goto L4
    }
}
