package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
enum zzan extends java.lang.Enum {
    public static final com.google.android.gms.measurement.internal.zzan zza = null;
    public static final com.google.android.gms.measurement.internal.zzan zzb = null;
    public static final com.google.android.gms.measurement.internal.zzan zzc = null;
    public static final com.google.android.gms.measurement.internal.zzan zzd = null;
    public static final com.google.android.gms.measurement.internal.zzan zze = null;
    public static final com.google.android.gms.measurement.internal.zzan zzf = null;
    public static final com.google.android.gms.measurement.internal.zzan zzg = null;
    public static final com.google.android.gms.measurement.internal.zzan zzh = null;
    public static final com.google.android.gms.measurement.internal.zzan zzi = null;
    public static final com.google.android.gms.measurement.internal.zzan zzj = null;
    private static final /* synthetic */ com.google.android.gms.measurement.internal.zzan[] zzk = null;
    private final char zzl;

    static {
            com.google.android.gms.measurement.internal.zzan r0 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r1 = "UNSET"
            r2 = 0
            r3 = 48
            r0.<init>(r1, r2, r3)
            com.google.android.gms.measurement.internal.zzan.zza = r0
            com.google.android.gms.measurement.internal.zzan r1 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r3 = "REMOTE_DEFAULT"
            r4 = 1
            r5 = 49
            r1.<init>(r3, r4, r5)
            com.google.android.gms.measurement.internal.zzan.zzb = r1
            com.google.android.gms.measurement.internal.zzan r3 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r5 = "REMOTE_DELEGATION"
            r6 = 2
            r7 = 50
            r3.<init>(r5, r6, r7)
            com.google.android.gms.measurement.internal.zzan.zzc = r3
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r7 = "MANIFEST"
            r8 = 3
            r9 = 51
            r5.<init>(r7, r8, r9)
            com.google.android.gms.measurement.internal.zzan.zzd = r5
            com.google.android.gms.measurement.internal.zzan r7 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r9 = "INITIALIZATION"
            r10 = 4
            r11 = 52
            r7.<init>(r9, r10, r11)
            com.google.android.gms.measurement.internal.zzan.zze = r7
            com.google.android.gms.measurement.internal.zzan r9 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r11 = "API"
            r12 = 5
            r13 = 53
            r9.<init>(r11, r12, r13)
            com.google.android.gms.measurement.internal.zzan.zzf = r9
            com.google.android.gms.measurement.internal.zzan r11 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r13 = "CHILD_ACCOUNT"
            r14 = 6
            r15 = 54
            r11.<init>(r13, r14, r15)
            com.google.android.gms.measurement.internal.zzan.zzg = r11
            com.google.android.gms.measurement.internal.zzan r13 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r15 = "TCF"
            r14 = 7
            r12 = 55
            r13.<init>(r15, r14, r12)
            com.google.android.gms.measurement.internal.zzan.zzh = r13
            com.google.android.gms.measurement.internal.zzan r12 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r15 = "REMOTE_ENFORCED_DEFAULT"
            r14 = 8
            r10 = 56
            r12.<init>(r15, r14, r10)
            com.google.android.gms.measurement.internal.zzan.zzi = r12
            com.google.android.gms.measurement.internal.zzan r10 = new com.google.android.gms.measurement.internal.zzan
            java.lang.String r15 = "FAILSAFE"
            r14 = 9
            r8 = 57
            r10.<init>(r15, r14, r8)
            com.google.android.gms.measurement.internal.zzan.zzj = r10
            r8 = 10
            com.google.android.gms.measurement.internal.zzan[] r8 = new com.google.android.gms.measurement.internal.zzan[r8]
            r8[r2] = r0
            r8[r4] = r1
            r8[r6] = r3
            r0 = 3
            r8[r0] = r5
            r0 = 4
            r8[r0] = r7
            r0 = 5
            r8[r0] = r9
            r0 = 6
            r8[r0] = r11
            r0 = 7
            r8[r0] = r13
            r0 = 8
            r8[r0] = r12
            r8[r14] = r10
            com.google.android.gms.measurement.internal.zzan.zzk = r8
            return
    }

    zzan(java.lang.String r1, int r2, char r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzl = r3
            return
    }

    public static com.google.android.gms.measurement.internal.zzan[] values() {
            com.google.android.gms.measurement.internal.zzan[] r0 = com.google.android.gms.measurement.internal.zzan.zzk
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.measurement.internal.zzan[] r0 = (com.google.android.gms.measurement.internal.zzan[]) r0
            return r0
    }

    static /* bridge */ /* synthetic */ char zza(com.google.android.gms.measurement.internal.zzan r0) {
            char r0 = r0.zzl
            return r0
    }

    public static com.google.android.gms.measurement.internal.zzan zzb(char r5) {
            com.google.android.gms.measurement.internal.zzan[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            char r4 = r3.zzl
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            com.google.android.gms.measurement.internal.zzan r5 = com.google.android.gms.measurement.internal.zzan.zza
            return r5
    }
}
