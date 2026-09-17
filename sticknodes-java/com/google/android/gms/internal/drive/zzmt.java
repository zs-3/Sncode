package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmt {
    static java.lang.String zzc(com.google.android.gms.internal.drive.zzjc r5) {
            com.google.android.gms.internal.drive.zzmu r0 = new com.google.android.gms.internal.drive.zzmu
            r0.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L94
            byte r2 = r0.zzs(r1)
            r3 = 34
            if (r2 == r3) goto L8b
            r3 = 39
            if (r2 == r3) goto L85
            r3 = 92
            if (r2 == r3) goto L7f
            switch(r2) {
                case 7: goto L79;
                case 8: goto L73;
                case 9: goto L6d;
                case 10: goto L67;
                case 11: goto L61;
                case 12: goto L5b;
                case 13: goto L55;
                default: goto L28;
            }
        L28:
            r4 = 32
            if (r2 < r4) goto L35
            r4 = 126(0x7e, float:1.77E-43)
            if (r2 > r4) goto L35
            char r2 = (char) r2
            r5.append(r2)
            goto L90
        L35:
            r5.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r5.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r5.append(r3)
            r2 = r2 & 7
            int r2 = r2 + 48
            char r2 = (char) r2
            r5.append(r2)
            goto L90
        L55:
            java.lang.String r2 = "\\r"
            r5.append(r2)
            goto L90
        L5b:
            java.lang.String r2 = "\\f"
            r5.append(r2)
            goto L90
        L61:
            java.lang.String r2 = "\\v"
            r5.append(r2)
            goto L90
        L67:
            java.lang.String r2 = "\\n"
            r5.append(r2)
            goto L90
        L6d:
            java.lang.String r2 = "\\t"
            r5.append(r2)
            goto L90
        L73:
            java.lang.String r2 = "\\b"
            r5.append(r2)
            goto L90
        L79:
            java.lang.String r2 = "\\a"
            r5.append(r2)
            goto L90
        L7f:
            java.lang.String r2 = "\\\\"
            r5.append(r2)
            goto L90
        L85:
            java.lang.String r2 = "\\'"
            r5.append(r2)
            goto L90
        L8b:
            java.lang.String r2 = "\\\""
            r5.append(r2)
        L90:
            int r1 = r1 + 1
            goto Lf
        L94:
            java.lang.String r5 = r5.toString()
            return r5
    }
}
