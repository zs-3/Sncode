package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
abstract class zzpg extends com.google.android.gms.measurement.internal.zzoz {
    private boolean zza;

    zzpg(com.google.android.gms.measurement.internal.zzpv r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzpv r1 = r0.zzg
            r1.zzad()
            return
    }

    protected final void zzav() {
            r2 = this;
            boolean r0 = r2.zzax()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not initialized"
            r0.<init>(r1)
            throw r0
    }

    public final void zzaw() {
            r2 = this;
            boolean r0 = r2.zza
            if (r0 != 0) goto L10
            r2.zzb()
            com.google.android.gms.measurement.internal.zzpv r0 = r2.zzg
            r0.zzV()
            r0 = 1
            r2.zza = r0
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
    }

    final boolean zzax() {
            r1 = this;
            boolean r0 = r1.zza
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    protected abstract boolean zzb();
}
