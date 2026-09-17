package com.googlecode.mp4parser.srt;

/* loaded from: classes2.dex */
public class SrtParser {
    public SrtParser() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long parse(java.lang.String r14) {
            java.lang.String r0 = ":"
            java.lang.String[] r1 = r14.split(r0)
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = r1.trim()
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.String[] r1 = r14.split(r0)
            r5 = 1
            r1 = r1[r5]
            java.lang.String r1 = r1.trim()
            long r6 = java.lang.Long.parseLong(r1)
            java.lang.String[] r1 = r14.split(r0)
            r8 = 2
            r1 = r1[r8]
            java.lang.String r9 = ","
            java.lang.String[] r1 = r1.split(r9)
            r1 = r1[r2]
            java.lang.String r1 = r1.trim()
            long r1 = java.lang.Long.parseLong(r1)
            java.lang.String[] r14 = r14.split(r0)
            r14 = r14[r8]
            java.lang.String[] r14 = r14.split(r9)
            r14 = r14[r5]
            java.lang.String r14 = r14.trim()
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 60
            long r3 = r3 * r10
            long r3 = r3 * r10
            r12 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r12
            long r6 = r6 * r10
            long r6 = r6 * r12
            long r3 = r3 + r6
            long r1 = r1 * r12
            long r3 = r3 + r1
            long r3 = r3 + r8
            return r3
    }

    public static com.googlecode.mp4parser.authoring.tracks.TextTrackImpl parse(java.io.InputStream r9) throws java.io.IOException {
            java.io.LineNumberReader r0 = new java.io.LineNumberReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.String r2 = "UTF-8"
            r1.<init>(r9, r2)
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.tracks.TextTrackImpl r9 = new com.googlecode.mp4parser.authoring.tracks.TextTrackImpl
            r9.<init>()
        L11:
            java.lang.String r1 = r0.readLine()
            if (r1 != 0) goto L18
            return r9
        L18:
            java.lang.String r1 = r0.readLine()
            java.lang.String r2 = ""
            r8 = r2
        L1f:
            java.lang.String r3 = r0.readLine()
            if (r3 == 0) goto L46
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L30
            goto L46
        L30:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "\n"
            r4.append(r3)
            java.lang.String r8 = r4.toString()
            goto L1f
        L46:
            java.lang.String r2 = "-->"
            java.lang.String[] r3 = r1.split(r2)
            r4 = 0
            r3 = r3[r4]
            long r4 = parse(r3)
            java.lang.String[] r1 = r1.split(r2)
            r2 = 1
            r1 = r1[r2]
            long r6 = parse(r1)
            java.util.List r1 = r9.getSubs()
            com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line r2 = new com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line
            r3 = r2
            r3.<init>(r4, r6, r8)
            r1.add(r2)
            goto L11
    }
}
