package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzgh implements com.google.android.gms.internal.auth.zzfu {
    private final com.google.android.gms.internal.auth.zzfx zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzgh(com.google.android.gms.internal.auth.zzfx r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            java.lang.String r4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            r3.zzb = r4
            r3.zzc = r6
            r5 = 0
            char r5 = r4.charAt(r5)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 >= r6) goto L18
            r3.zzd = r5
            return
        L18:
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r0 = 1
            r1 = 13
        L1d:
            int r2 = r0 + 1
            char r0 = r4.charAt(r0)
            if (r0 < r6) goto L2d
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r1
            r5 = r5 | r0
            int r1 = r1 + 13
            r0 = r2
            goto L1d
        L2d:
            int r4 = r0 << r1
            r4 = r4 | r5
            r3.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final com.google.android.gms.internal.auth.zzfx zza() {
            r1 = this;
            com.google.android.gms.internal.auth.zzfx r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzb() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final int zzc() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 2
            return r0
    }

    final java.lang.String zzd() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    final java.lang.Object[] zze() {
            r1 = this;
            java.lang.Object[] r0 = r1.zzc
            return r0
    }
}
