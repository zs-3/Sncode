package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadf {
    public static int zza(com.google.android.gms.internal.ads.zzadc r3, byte[] r4, int r5, int r6) throws java.io.IOException {
            r0 = 0
        L1:
            if (r0 >= r6) goto L11
            int r1 = r5 + r0
            int r2 = r6 - r0
            int r1 = r3.zzb(r4, r1, r2)
            r2 = -1
            if (r1 != r2) goto Lf
            goto L11
        Lf:
            int r0 = r0 + r1
            goto L1
        L11:
            return r0
    }

    public static void zzb(boolean r0, java.lang.String r1) throws com.google.android.gms.internal.ads.zzbo {
            if (r0 == 0) goto L3
            return
        L3:
            r0 = 0
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r1, r0)
            throw r0
    }

    public static boolean zzc(com.google.android.gms.internal.ads.zzadc r0, byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException {
            r2 = 0
            boolean r0 = r0.zzm(r1, r2, r3, r4)     // Catch: java.io.EOFException -> L6
            return r0
        L6:
            r0 = move-exception
            if (r4 == 0) goto La
            return r2
        La:
            throw r0
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzadc r0, byte[] r1, int r2, int r3) throws java.io.IOException {
            r0.zzi(r1, r2, r3)     // Catch: java.io.EOFException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static boolean zze(com.google.android.gms.internal.ads.zzadc r0, int r1) throws java.io.IOException {
            r0.zzk(r1)     // Catch: java.io.EOFException -> L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }
}
