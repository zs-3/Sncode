package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzg extends com.google.android.gms.measurement.internal.zzf {
    private boolean zza;

    zzg(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            r1.zzE()
            return
    }

    protected final void zza() {
            r2 = this;
            boolean r0 = r2.zze()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized"
            r0.<init>(r1)
            throw r0
    }

    public final void zzb() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L13
            boolean r0 = r2.zzf()
            if (r0 != 0) goto L12
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            r0.zzD()
            r0 = 1
            r2.zza = r0
        L12:
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    public final void zzc() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L10
            r2.zzd()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            r0.zzD()
            r0 = 1
            r2.zza = r0
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    protected void zzd() {
            r0 = this;
            return
    }

    final boolean zze() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    protected abstract boolean zzf();
}
