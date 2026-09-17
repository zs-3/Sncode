package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.auth.zzhl zzb = null;

    static {
            boolean r0 = com.google.android.gms.internal.auth.zzhj.zzu()
            if (r0 == 0) goto Le
            boolean r0 = com.google.android.gms.internal.auth.zzhj.zzv()
            if (r0 == 0) goto Le
            int r0 = com.google.android.gms.internal.auth.zzds.zza
        Le:
            com.google.android.gms.internal.auth.zzhm r0 = new com.google.android.gms.internal.auth.zzhm
            r0.<init>()
            com.google.android.gms.internal.auth.zzhn.zzb = r0
            return
    }

    static /* bridge */ /* synthetic */ int zza(byte[] r6, int r7, int r8) {
            int r8 = r8 - r7
            int r0 = r7 + (-1)
            r0 = r6[r0]
            r1 = -12
            r2 = -1
            if (r8 == 0) goto L37
            r3 = 1
            r4 = -65
            if (r8 == r3) goto L2c
            r5 = 2
            if (r8 != r5) goto L26
            r8 = r6[r7]
            int r7 = r7 + r3
            r6 = r6[r7]
            if (r0 > r1) goto L39
            if (r8 > r4) goto L39
            if (r6 <= r4) goto L1e
            goto L39
        L1e:
            int r7 = r8 << 8
            int r6 = r6 << 16
            r7 = r7 ^ r0
            r0 = r7 ^ r6
            goto L3a
        L26:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L2c:
            r6 = r6[r7]
            if (r0 > r1) goto L39
            if (r6 <= r4) goto L33
            goto L39
        L33:
            int r6 = r6 << 8
            r0 = r0 ^ r6
            goto L3a
        L37:
            if (r0 <= r1) goto L3a
        L39:
            r0 = -1
        L3a:
            return r0
    }

    static boolean zzb(byte[] r3) {
            com.google.android.gms.internal.auth.zzhl r0 = com.google.android.gms.internal.auth.zzhn.zzb
            int r1 = r3.length
            r2 = 0
            boolean r3 = r0.zzb(r3, r2, r1)
            return r3
    }

    static boolean zzc(byte[] r1, int r2, int r3) {
            com.google.android.gms.internal.auth.zzhl r0 = com.google.android.gms.internal.auth.zzhn.zzb
            boolean r1 = r0.zzb(r1, r2, r3)
            return r1
    }
}
