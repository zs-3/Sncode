package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public enum zzgxf extends java.lang.Enum implements com.google.android.gms.internal.ads.zzhbi {
    public static final com.google.android.gms.internal.ads.zzgxf zza = null;
    public static final com.google.android.gms.internal.ads.zzgxf zzb = null;
    public static final com.google.android.gms.internal.ads.zzgxf zzc = null;
    public static final com.google.android.gms.internal.ads.zzgxf zzd = null;
    public static final com.google.android.gms.internal.ads.zzgxf zze = null;
    public static final com.google.android.gms.internal.ads.zzgxf zzf = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzgxf[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.internal.ads.zzgxf r0 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.ads.zzgxf.zza = r0
            com.google.android.gms.internal.ads.zzgxf r1 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r3 = "TINK"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.ads.zzgxf.zzb = r1
            com.google.android.gms.internal.ads.zzgxf r3 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r5 = "LEGACY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.ads.zzgxf.zzc = r3
            com.google.android.gms.internal.ads.zzgxf r5 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r7 = "RAW"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.ads.zzgxf.zzd = r5
            com.google.android.gms.internal.ads.zzgxf r7 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r9 = "CRUNCHY"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.ads.zzgxf.zze = r7
            com.google.android.gms.internal.ads.zzgxf r9 = new com.google.android.gms.internal.ads.zzgxf
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            com.google.android.gms.internal.ads.zzgxf.zzf = r9
            r11 = 6
            com.google.android.gms.internal.ads.zzgxf[] r11 = new com.google.android.gms.internal.ads.zzgxf[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.internal.ads.zzgxf.zzg = r11
            return
    }

    zzgxf(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgxf[] values() {
            com.google.android.gms.internal.ads.zzgxf[] r0 = com.google.android.gms.internal.ads.zzgxf.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzgxf[] r0 = (com.google.android.gms.internal.ads.zzgxf[]) r0
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgxf zzb(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zze
            return r1
        L13:
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zzd
            return r1
        L16:
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zzc
            return r1
        L19:
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zzb
            return r1
        L1c:
            com.google.android.gms.internal.ads.zzgxf r1 = com.google.android.gms.internal.ads.zzgxf.zza
            return r1
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.zza()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final int zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgxf r0 = com.google.android.gms.internal.ads.zzgxf.zzf
            if (r2 == r0) goto L7
            int r0 = r2.zzh
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
