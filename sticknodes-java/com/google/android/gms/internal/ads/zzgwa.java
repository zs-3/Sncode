package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public enum zzgwa extends java.lang.Enum implements com.google.android.gms.internal.ads.zzhbi {
    public static final com.google.android.gms.internal.ads.zzgwa zza = null;
    public static final com.google.android.gms.internal.ads.zzgwa zzb = null;
    public static final com.google.android.gms.internal.ads.zzgwa zzc = null;
    public static final com.google.android.gms.internal.ads.zzgwa zzd = null;
    public static final com.google.android.gms.internal.ads.zzgwa zze = null;
    public static final com.google.android.gms.internal.ads.zzgwa zzf = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzgwa[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.internal.ads.zzgwa r0 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.ads.zzgwa.zza = r0
            com.google.android.gms.internal.ads.zzgwa r1 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r3 = "SYMMETRIC"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.ads.zzgwa.zzb = r1
            com.google.android.gms.internal.ads.zzgwa r3 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r5 = "ASYMMETRIC_PRIVATE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.ads.zzgwa.zzc = r3
            com.google.android.gms.internal.ads.zzgwa r5 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r7 = "ASYMMETRIC_PUBLIC"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.ads.zzgwa.zzd = r5
            com.google.android.gms.internal.ads.zzgwa r7 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r9 = "REMOTE"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.ads.zzgwa.zze = r7
            com.google.android.gms.internal.ads.zzgwa r9 = new com.google.android.gms.internal.ads.zzgwa
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            com.google.android.gms.internal.ads.zzgwa.zzf = r9
            r11 = 6
            com.google.android.gms.internal.ads.zzgwa[] r11 = new com.google.android.gms.internal.ads.zzgwa[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.internal.ads.zzgwa.zzg = r11
            return
    }

    zzgwa(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgwa[] values() {
            com.google.android.gms.internal.ads.zzgwa[] r0 = com.google.android.gms.internal.ads.zzgwa.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzgwa[] r0 = (com.google.android.gms.internal.ads.zzgwa[]) r0
            return r0
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
            com.google.android.gms.internal.ads.zzgwa r0 = com.google.android.gms.internal.ads.zzgwa.zzf
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
