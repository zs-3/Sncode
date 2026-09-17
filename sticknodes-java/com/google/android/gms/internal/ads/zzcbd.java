package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzcbd {
    private final java.lang.ref.WeakReference zza;

    public zzcbd(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    protected abstract void zza(android.view.ViewTreeObserver r1);

    protected abstract void zzb(android.view.ViewTreeObserver r1);

    protected final android.view.ViewTreeObserver zzc() {
            r3 = this;
            java.lang.ref.WeakReference r0 = r3.zza
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L1a
            boolean r2 = r0.isAlive()
            if (r2 != 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
    }

    public final void zzd() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.zzc()
            if (r0 == 0) goto L9
            r1.zza(r0)
        L9:
            return
    }

    public final void zze() {
            r1 = this;
            android.view.ViewTreeObserver r0 = r1.zzc()
            if (r0 == 0) goto L9
            r1.zzb(r0)
        L9:
            return
    }
}
