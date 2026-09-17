package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public enum zzju extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzju zza = null;
    public static final com.google.android.gms.measurement.internal.zzju zzb = null;
    public static final com.google.android.gms.measurement.internal.zzju zzc = null;
    public static final com.google.android.gms.measurement.internal.zzju zzd = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzju[] zze = null;
    private final java.lang.String zzf;

    static {
            com.google.android.gms.measurement.internal.zzju r0 = new com.google.android.gms.measurement.internal.zzju
            java.lang.String r1 = "UNINITIALIZED"
            r2 = 0
            java.lang.String r3 = "uninitialized"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.measurement.internal.zzju.zza = r0
            com.google.android.gms.measurement.internal.zzju r1 = new com.google.android.gms.measurement.internal.zzju
            java.lang.String r3 = "POLICY"
            r4 = 1
            java.lang.String r5 = "eu_consent_policy"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.measurement.internal.zzju.zzb = r1
            com.google.android.gms.measurement.internal.zzju r3 = new com.google.android.gms.measurement.internal.zzju
            java.lang.String r5 = "DENIED"
            r6 = 2
            java.lang.String r7 = "denied"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.measurement.internal.zzju.zzc = r3
            com.google.android.gms.measurement.internal.zzju r5 = new com.google.android.gms.measurement.internal.zzju
            java.lang.String r7 = "GRANTED"
            r8 = 3
            java.lang.String r9 = "granted"
            r5.<init>(r7, r8, r9)
            com.google.android.gms.measurement.internal.zzju.zzd = r5
            r7 = 4
            com.google.android.gms.measurement.internal.zzju[] r7 = new com.google.android.gms.measurement.internal.zzju[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.google.android.gms.measurement.internal.zzju.zze = r7
            return
    }

    zzju(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzf = r3
            return
    }

    public static com.google.android.gms.measurement.internal.zzju[] values() {
            com.google.android.gms.measurement.internal.zzju[] r0 = com.google.android.gms.measurement.internal.zzju.zze
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzju[] r0 = (com.google.android.gms.measurement.internal.zzju[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }
}
