package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzhdy {
    private static volatile int zza = 100;

    static {
            return
    }

    zzhdy() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract java.lang.Object zza(java.lang.Object r1);

    abstract java.lang.Object zzb();

    abstract java.lang.Object zzc(java.lang.Object r1);

    abstract void zzd(java.lang.Object r1, int r2, int r3);

    abstract void zze(java.lang.Object r1, int r2, long r3);

    abstract void zzf(java.lang.Object r1, int r2, java.lang.Object r3);

    abstract void zzg(java.lang.Object r1, int r2, com.google.android.gms.internal.ads.zzgzs r3);

    abstract void zzh(java.lang.Object r1, int r2, long r3);

    abstract void zzi(java.lang.Object r1);

    abstract void zzj(java.lang.Object r1, java.lang.Object r2);

    final boolean zzk(java.lang.Object r8, com.google.android.gms.internal.ads.zzhdc r9, int r10) throws java.io.IOException {
            r7 = this;
            int r0 = r9.zzd()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L75
            if (r0 == r2) goto L6d
            r3 = 2
            if (r0 == r3) goto L65
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L29
            r10 = 5
            if (r0 != r10) goto L21
            int r9 = r9.zzf()
            r7.zzd(r8, r1, r9)
            return r2
        L21:
            com.google.android.gms.internal.ads.zzhbs r8 = new com.google.android.gms.internal.ads.zzhbs
            java.lang.String r9 = "Protocol message tag had invalid wire type."
            r8.<init>(r9)
            throw r8
        L29:
            r8 = 0
            return r8
        L2b:
            java.lang.Object r0 = r7.zzb()
            int r4 = r1 << 3
            int r10 = r10 + r2
            int r5 = com.google.android.gms.internal.ads.zzhdy.zza
            if (r10 >= r5) goto L5d
        L36:
            int r5 = r9.zzc()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L45
            boolean r5 = r7.zzk(r0, r9, r10)
            if (r5 != 0) goto L36
        L45:
            r10 = r4 | 4
            int r9 = r9.zzd()
            if (r10 != r9) goto L55
            java.lang.Object r9 = r7.zzc(r0)
            r7.zzf(r8, r1, r9)
            return r2
        L55:
            com.google.android.gms.internal.ads.zzhbt r8 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r9 = "Protocol message end-group tag did not match expected tag."
            r8.<init>(r9)
            throw r8
        L5d:
            com.google.android.gms.internal.ads.zzhbt r8 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r9 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            r8.<init>(r9)
            throw r8
        L65:
            com.google.android.gms.internal.ads.zzgzs r9 = r9.zzp()
            r7.zzg(r8, r1, r9)
            return r2
        L6d:
            long r9 = r9.zzk()
            r7.zze(r8, r1, r9)
            return r2
        L75:
            long r9 = r9.zzl()
            r7.zzh(r8, r1, r9)
            return r2
    }
}
