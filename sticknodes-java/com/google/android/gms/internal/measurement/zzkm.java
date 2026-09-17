package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public enum zzkm extends java.lang.Enum implements com.google.android.gms.internal.measurement.zzmf {
    public static final com.google.android.gms.internal.measurement.zzkm zza = null;
    public static final com.google.android.gms.internal.measurement.zzkm zzb = null;
    public static final com.google.android.gms.internal.measurement.zzkm zzc = null;
    public static final com.google.android.gms.internal.measurement.zzkm zzd = null;
    public static final com.google.android.gms.internal.measurement.zzkm zze = null;
    private static final /* synthetic */ com.google.android.gms.internal.measurement.zzkm[] zzf = null;
    private final int zzg;

    static {
            com.google.android.gms.internal.measurement.zzkm r0 = new com.google.android.gms.internal.measurement.zzkm
            java.lang.String r1 = "PURPOSE_RESTRICTION_NOT_ALLOWED"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.measurement.zzkm.zza = r0
            com.google.android.gms.internal.measurement.zzkm r1 = new com.google.android.gms.internal.measurement.zzkm
            java.lang.String r3 = "PURPOSE_RESTRICTION_REQUIRE_CONSENT"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.measurement.zzkm.zzb = r1
            com.google.android.gms.internal.measurement.zzkm r3 = new com.google.android.gms.internal.measurement.zzkm
            java.lang.String r5 = "PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.measurement.zzkm.zzc = r3
            com.google.android.gms.internal.measurement.zzkm r5 = new com.google.android.gms.internal.measurement.zzkm
            java.lang.String r7 = "PURPOSE_RESTRICTION_UNDEFINED"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.measurement.zzkm.zzd = r5
            com.google.android.gms.internal.measurement.zzkm r7 = new com.google.android.gms.internal.measurement.zzkm
            java.lang.String r9 = "UNRECOGNIZED"
            r10 = 4
            r11 = -1
            r7.<init>(r9, r10, r11)
            com.google.android.gms.internal.measurement.zzkm.zze = r7
            r9 = 5
            com.google.android.gms.internal.measurement.zzkm[] r9 = new com.google.android.gms.internal.measurement.zzkm[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.google.android.gms.internal.measurement.zzkm.zzf = r9
            return
    }

    zzkm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzg = r3
            return
    }

    public static com.google.android.gms.internal.measurement.zzkm[] values() {
            com.google.android.gms.internal.measurement.zzkm[] r0 = com.google.android.gms.internal.measurement.zzkm.zzf
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.measurement.zzkm[] r0 = (com.google.android.gms.internal.measurement.zzkm[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.zza()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    public final int zza() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzkm r0 = com.google.android.gms.internal.measurement.zzkm.zze
            if (r2 == r0) goto L7
            int r0 = r2.zzg
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
