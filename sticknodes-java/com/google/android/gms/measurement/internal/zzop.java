package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzop extends com.google.android.gms.measurement.internal.zzg {
    protected final com.google.android.gms.measurement.internal.zzoo zza;
    protected final com.google.android.gms.measurement.internal.zzon zzb;
    protected final com.google.android.gms.measurement.internal.zzol zzc;
    private android.os.Handler zzd;
    private boolean zze;

    zzop(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zze = r1
            com.google.android.gms.measurement.internal.zzoo r1 = new com.google.android.gms.measurement.internal.zzoo
            r1.<init>(r0)
            r0.zza = r1
            com.google.android.gms.measurement.internal.zzon r1 = new com.google.android.gms.measurement.internal.zzon
            r1.<init>(r0)
            r0.zzb = r1
            com.google.android.gms.measurement.internal.zzol r1 = new com.google.android.gms.measurement.internal.zzol
            r1.<init>(r0)
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ android.os.Handler zzh(com.google.android.gms.measurement.internal.zzop r0) {
            android.os.Handler r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ void zzi(com.google.android.gms.measurement.internal.zzop r0) {
            r0.zzq()
            return
    }

    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.measurement.internal.zzop r4, long r5) {
            r4.zzg()
            r4.zzq()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Activity paused, time"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzol r1 = r4.zzc
            r1.zza(r5)
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            boolean r0 = r0.zzz()
            if (r0 == 0) goto L2d
            com.google.android.gms.measurement.internal.zzon r4 = r4.zzb
            r4.zzb(r5)
        L2d:
            return
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.measurement.internal.zzop r4, long r5) {
            r4.zzg()
            r4.zzq()
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Activity resumed, time"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzba
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto L3a
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            boolean r0 = r0.zzz()
            if (r0 != 0) goto L34
            boolean r0 = r4.zze
            if (r0 == 0) goto L55
        L34:
            com.google.android.gms.measurement.internal.zzon r0 = r4.zzb
            r0.zzc(r5)
            goto L55
        L3a:
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            boolean r1 = r1.zzz()
            if (r1 != 0) goto L50
            com.google.android.gms.measurement.internal.zzht r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzhn r0 = r0.zzn
            boolean r0 = r0.zzb()
            if (r0 == 0) goto L55
        L50:
            com.google.android.gms.measurement.internal.zzon r0 = r4.zzb
            r0.zzc(r5)
        L55:
            com.google.android.gms.measurement.internal.zzol r5 = r4.zzc
            r5.zzb()
            com.google.android.gms.measurement.internal.zzoo r4 = r4.zza
            com.google.android.gms.measurement.internal.zzop r5 = r4.zza
            r5.zzg()
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu
            boolean r6 = r6.zzJ()
            if (r6 != 0) goto L6a
            return
        L6a:
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu
            com.google.android.gms.common.util.Clock r5 = r5.zzaU()
            long r5 = r5.currentTimeMillis()
            r0 = 0
            r4.zzb(r5, r0)
            return
    }

    private final void zzq() {
            r2 = this;
            r2.zzg()
            android.os.Handler r0 = r2.zzd
            if (r0 != 0) goto L12
            com.google.android.gms.internal.measurement.zzcr r0 = new com.google.android.gms.internal.measurement.zzcr
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.zzd = r0
        L12:
            return
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
            r1 = this;
            r0 = 0
            return r0
    }

    final void zzm(boolean r1) {
            r0 = this;
            r0.zzg()
            r0.zze = r1
            return
    }

    final boolean zzp() {
            r1 = this;
            r1.zzg()
            boolean r0 = r1.zze
            return r0
    }
}
