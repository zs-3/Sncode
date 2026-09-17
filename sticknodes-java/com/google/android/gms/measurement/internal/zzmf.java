package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public enum zzmf extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzmf zza = null;
    public static final com.google.android.gms.measurement.internal.zzmf zzb = null;
    public static final com.google.android.gms.measurement.internal.zzmf zzc = null;
    public static final com.google.android.gms.measurement.internal.zzmf zzd = null;
    public static final com.google.android.gms.measurement.internal.zzmf zze = null;
    public static final com.google.android.gms.measurement.internal.zzmf zzf = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzmf[] zzg = null;
    private final int zzh;

    static {
            com.google.android.gms.measurement.internal.zzmf r0 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r1 = "GOOGLE_ANALYTICS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.measurement.internal.zzmf.zza = r0
            com.google.android.gms.measurement.internal.zzmf r1 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r3 = "GOOGLE_SIGNAL"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.measurement.internal.zzmf.zzb = r1
            com.google.android.gms.measurement.internal.zzmf r3 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r5 = "SGTM"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.measurement.internal.zzmf.zzc = r3
            com.google.android.gms.measurement.internal.zzmf r5 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r7 = "SGTM_CLIENT"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.measurement.internal.zzmf.zzd = r5
            com.google.android.gms.measurement.internal.zzmf r7 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r9 = "GOOGLE_SIGNAL_PENDING"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.measurement.internal.zzmf.zze = r7
            com.google.android.gms.measurement.internal.zzmf r9 = new com.google.android.gms.measurement.internal.zzmf
            java.lang.String r11 = "UNKNOWN"
            r12 = 5
            r13 = 99
            r9.<init>(r11, r12, r13)
            com.google.android.gms.measurement.internal.zzmf.zzf = r9
            r11 = 6
            com.google.android.gms.measurement.internal.zzmf[] r11 = new com.google.android.gms.measurement.internal.zzmf[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.measurement.internal.zzmf.zzg = r11
            return
    }

    zzmf(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzh = r3
            return
    }

    public static com.google.android.gms.measurement.internal.zzmf[] values() {
            com.google.android.gms.measurement.internal.zzmf[] r0 = com.google.android.gms.measurement.internal.zzmf.zzg
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzmf[] r0 = (com.google.android.gms.measurement.internal.zzmf[]) r0
            return r0
    }

    public static com.google.android.gms.measurement.internal.zzmf zzb(int r5) {
            com.google.android.gms.measurement.internal.zzmf[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.zzh
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.measurement.internal.zzmf r5 = com.google.android.gms.measurement.internal.zzmf.zzf
            return r5
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzh
            return r0
    }
}
