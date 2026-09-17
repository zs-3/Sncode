package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public enum zzjv extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzjv zza = null;
    public static final com.google.android.gms.measurement.internal.zzjv zzb = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzjv[] zzc = null;
    private final com.google.android.gms.measurement.internal.zzjw[] zzd;

    static {
            com.google.android.gms.measurement.internal.zzjv r0 = new com.google.android.gms.measurement.internal.zzjv
            r1 = 2
            com.google.android.gms.measurement.internal.zzjw[] r2 = new com.google.android.gms.measurement.internal.zzjw[r1]
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zza
            r4 = 0
            r2[r4] = r3
            com.google.android.gms.measurement.internal.zzjw r3 = com.google.android.gms.measurement.internal.zzjw.zzb
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "STORAGE"
            r0.<init>(r3, r4, r2)
            com.google.android.gms.measurement.internal.zzjv.zza = r0
            com.google.android.gms.measurement.internal.zzjv r2 = new com.google.android.gms.measurement.internal.zzjv
            com.google.android.gms.measurement.internal.zzjw[] r3 = new com.google.android.gms.measurement.internal.zzjw[r5]
            com.google.android.gms.measurement.internal.zzjw r6 = com.google.android.gms.measurement.internal.zzjw.zzc
            r3[r4] = r6
            java.lang.String r6 = "DMA"
            r2.<init>(r6, r5, r3)
            com.google.android.gms.measurement.internal.zzjv.zzb = r2
            com.google.android.gms.measurement.internal.zzjv[] r1 = new com.google.android.gms.measurement.internal.zzjv[r1]
            r1[r4] = r0
            r1[r5] = r2
            com.google.android.gms.measurement.internal.zzjv.zzc = r1
            return
    }

    zzjv(java.lang.String r1, int r2, com.google.android.gms.measurement.internal.zzjw... r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzd = r3
            return
    }

    public static com.google.android.gms.measurement.internal.zzjv[] values() {
            com.google.android.gms.measurement.internal.zzjv[] r0 = com.google.android.gms.measurement.internal.zzjv.zzc
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzjv[] r0 = (com.google.android.gms.measurement.internal.zzjv[]) r0
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzjw[] zza(com.google.android.gms.measurement.internal.zzjv r0) {
            com.google.android.gms.measurement.internal.zzjw[] r0 = r0.zzd
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzjw[] zzb() {
            r1 = this;
            com.google.android.gms.measurement.internal.zzjw[] r0 = r1.zzd
            return r0
    }
}
