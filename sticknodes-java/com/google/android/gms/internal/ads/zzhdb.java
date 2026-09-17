package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdb implements com.google.android.gms.internal.ads.zzhcm {
    private final com.google.android.gms.internal.ads.zzhcp zza;
    private final java.lang.String zzb;
    private final java.lang.Object[] zzc;
    private final int zzd;

    zzhdb(com.google.android.gms.internal.ads.zzhcp r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.zzd = r4
            return
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 1
            r1 = 13
        L1b:
            int r2 = r0 + 1
            char r0 = r5.charAt(r0)
            if (r0 < r6) goto L2b
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r1
            r4 = r4 | r0
            int r1 = r1 + 13
            r0 = r2
            goto L1b
        L2b:
            int r5 = r0 << r1
            r4 = r4 | r5
            r3.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final com.google.android.gms.internal.ads.zzhcp zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhcp r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
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

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final int zzc() {
            r2 = this;
            int r0 = r2.zzd
            r1 = r0 & 1
            if (r1 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r1 = 4
            r0 = r0 & r1
            if (r0 != r1) goto Le
            r0 = 3
            return r0
        Le:
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
