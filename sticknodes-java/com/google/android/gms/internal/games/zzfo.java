package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public abstract class zzfo {
    private final java.util.concurrent.atomic.AtomicReference zza;

    public zzfo() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zza = r0
            return
    }

    protected abstract com.google.android.gms.internal.games.zzfn zza();

    public final void zzb() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.games.zzfn r0 = (com.google.android.gms.internal.games.zzfn) r0
            if (r0 == 0) goto Ld
            r0.zzd()
        Ld:
            return
    }

    public final void zzc(java.lang.String r4, int r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.games.zzfn r0 = (com.google.android.gms.internal.games.zzfn) r0
            if (r0 != 0) goto L27
            com.google.android.gms.internal.games.zzfn r1 = r3.zza()
            java.util.concurrent.atomic.AtomicReference r2 = r3.zza
        L10:
            r0 = 0
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L19
            r0 = r1
            goto L27
        L19:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L10
            java.util.concurrent.atomic.AtomicReference r0 = r3.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.games.zzfn r0 = (com.google.android.gms.internal.games.zzfn) r0
        L27:
            r0.zzc(r4, r5)
            return
    }
}
