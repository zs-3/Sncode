package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class FFmpeg {
    private static final java.util.concurrent.atomic.AtomicLong executionIdCounter = null;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 3000(0xbb8, double:1.482E-320)
            r0.<init>(r1)
            com.arthenica.mobileffmpeg.FFmpeg.executionIdCounter = r0
            return
    }

    static java.lang.String argumentsToString(java.lang.String[] r3) {
            if (r3 != 0) goto L5
            java.lang.String r3 = "null"
            return r3
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lb:
            int r2 = r3.length
            if (r1 >= r2) goto L1d
            if (r1 <= 0) goto L15
            java.lang.String r2 = " "
            r0.append(r2)
        L15:
            r2 = r3[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto Lb
        L1d:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static int execute(java.lang.String r0) {
            java.lang.String[] r0 = parseArguments(r0)
            int r0 = execute(r0)
            return r0
    }

    public static int execute(java.lang.String[] r2) {
            r0 = 0
            int r2 = com.arthenica.mobileffmpeg.Config.ffmpegExecute(r0, r2)
            return r2
    }

    static java.lang.String[] parseArguments(java.lang.String r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            int r6 = r11.length()
            if (r3 >= r6) goto L7f
            if (r3 <= 0) goto L21
            int r6 = r3 + (-1)
            char r6 = r11.charAt(r6)
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            goto L22
        L21:
            r6 = 0
        L22:
            char r7 = r11.charAt(r3)
            r8 = 32
            r9 = 1
            if (r7 != r8) goto L47
            if (r4 != 0) goto L43
            if (r5 == 0) goto L30
            goto L43
        L30:
            int r6 = r1.length()
            if (r6 <= 0) goto L7c
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L7c
        L43:
            r1.append(r7)
            goto L7c
        L47:
            r8 = 39
            r10 = 92
            if (r7 != r8) goto L61
            if (r6 == 0) goto L55
            char r8 = r6.charValue()
            if (r8 == r10) goto L61
        L55:
            if (r4 == 0) goto L59
            r4 = 0
            goto L7c
        L59:
            if (r5 == 0) goto L5f
            r1.append(r7)
            goto L7c
        L5f:
            r4 = 1
            goto L7c
        L61:
            r8 = 34
            if (r7 != r8) goto L79
            if (r6 == 0) goto L6d
            char r6 = r6.charValue()
            if (r6 == r10) goto L79
        L6d:
            if (r5 == 0) goto L71
            r5 = 0
            goto L7c
        L71:
            if (r4 == 0) goto L77
            r1.append(r7)
            goto L7c
        L77:
            r5 = 1
            goto L7c
        L79:
            r1.append(r7)
        L7c:
            int r3 = r3 + 1
            goto Le
        L7f:
            int r11 = r1.length()
            if (r11 <= 0) goto L8c
            java.lang.String r11 = r1.toString()
            r0.add(r11)
        L8c:
            java.lang.String[] r11 = new java.lang.String[r2]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
    }
}
