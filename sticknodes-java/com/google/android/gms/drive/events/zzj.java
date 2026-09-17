package com.google.android.gms.drive.events;

/* loaded from: classes.dex */
public final class zzj {
    public static boolean zza(int r3, com.google.android.gms.drive.DriveId r4) {
            r0 = 0
            r1 = 1
            if (r3 == r1) goto L13
            r2 = 4
            if (r3 == r2) goto Lf
            r2 = 7
            if (r3 == r2) goto Lf
            r2 = 8
            if (r3 == r2) goto L13
            return r0
        Lf:
            if (r4 != 0) goto L12
            return r1
        L12:
            return r0
        L13:
            if (r4 == 0) goto L16
            return r1
        L16:
            return r0
    }
}
