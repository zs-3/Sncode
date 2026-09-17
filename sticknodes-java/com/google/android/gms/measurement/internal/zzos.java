package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
enum zzos extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzos zza = null;
    public static final com.google.android.gms.measurement.internal.zzos zzb = null;
    public static final com.google.android.gms.measurement.internal.zzos zzc = null;
    public static final com.google.android.gms.measurement.internal.zzos zzd = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzos[] zze = null;

    static {
            com.google.android.gms.measurement.internal.zzos r0 = new com.google.android.gms.measurement.internal.zzos
            java.lang.String r1 = "CONSENT"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.measurement.internal.zzos.zza = r0
            com.google.android.gms.measurement.internal.zzos r1 = new com.google.android.gms.measurement.internal.zzos
            java.lang.String r3 = "LEGITIMATE_INTEREST"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.android.gms.measurement.internal.zzos.zzb = r1
            com.google.android.gms.measurement.internal.zzos r3 = new com.google.android.gms.measurement.internal.zzos
            java.lang.String r5 = "FLEXIBLE_CONSENT"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.android.gms.measurement.internal.zzos.zzc = r3
            com.google.android.gms.measurement.internal.zzos r5 = new com.google.android.gms.measurement.internal.zzos
            java.lang.String r7 = "FLEXIBLE_LEGITIMATE_INTEREST"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.android.gms.measurement.internal.zzos.zzd = r5
            r7 = 4
            com.google.android.gms.measurement.internal.zzos[] r7 = new com.google.android.gms.measurement.internal.zzos[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.measurement.internal.zzos.zze = r7
            return
    }

    zzos(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.measurement.internal.zzos[] values() {
            com.google.android.gms.measurement.internal.zzos[] r0 = com.google.android.gms.measurement.internal.zzos.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzos[] r0 = (com.google.android.gms.measurement.internal.zzos[]) r0
            return r0
    }
}
