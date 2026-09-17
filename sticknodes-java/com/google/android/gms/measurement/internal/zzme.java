package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public enum zzme extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzme zza = null;
    public static final com.google.android.gms.measurement.internal.zzme zzb = null;
    public static final com.google.android.gms.measurement.internal.zzme zzc = null;
    public static final com.google.android.gms.measurement.internal.zzme zzd = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzme[] zze = null;
    private final int zzf;

    static {
            com.google.android.gms.measurement.internal.zzme r0 = new com.google.android.gms.measurement.internal.zzme
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.measurement.internal.zzme.zza = r0
            com.google.android.gms.measurement.internal.zzme r1 = new com.google.android.gms.measurement.internal.zzme
            java.lang.String r3 = "SUCCESS"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.measurement.internal.zzme.zzb = r1
            com.google.android.gms.measurement.internal.zzme r3 = new com.google.android.gms.measurement.internal.zzme
            java.lang.String r5 = "FAILURE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.measurement.internal.zzme.zzc = r3
            com.google.android.gms.measurement.internal.zzme r5 = new com.google.android.gms.measurement.internal.zzme
            java.lang.String r7 = "BACKOFF"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.measurement.internal.zzme.zzd = r5
            r7 = 4
            com.google.android.gms.measurement.internal.zzme[] r7 = new com.google.android.gms.measurement.internal.zzme[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.measurement.internal.zzme.zze = r7
            return
    }

    zzme(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.measurement.internal.zzme[] values() {
            com.google.android.gms.measurement.internal.zzme[] r0 = com.google.android.gms.measurement.internal.zzme.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzme[] r0 = (com.google.android.gms.measurement.internal.zzme[]) r0
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzf
            return r0
    }
}
