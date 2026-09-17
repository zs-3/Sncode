package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzck {
    private final android.view.View zza;
    private android.app.Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzck(android.app.Activity r1, android.view.View r2, android.view.ViewTreeObserver.OnGlobalLayoutListener r3, android.view.ViewTreeObserver.OnScrollChangedListener r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zza = r2
            r0.zzf = r3
            return
    }

    private static android.view.ViewTreeObserver zzf(android.app.Activity r0) {
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L7
            goto L12
        L7:
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            return r0
        L12:
            r0 = 0
            return r0
    }

    private final void zzg() {
            r2 = this;
            boolean r0 = r2.zzc
            if (r0 != 0) goto L20
            android.app.Activity r0 = r2.zzb
            if (r0 == 0) goto L13
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.zzf
            android.view.ViewTreeObserver r0 = zzf(r0)
            if (r0 == 0) goto L13
            r0.addOnGlobalLayoutListener(r1)
        L13:
            android.view.View r0 = r2.zza
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.zzf
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zza(r0, r1)
            r0 = 1
            r2.zzc = r0
        L20:
            return
    }

    private final void zzh() {
            r2 = this;
            android.app.Activity r0 = r2.zzb
            if (r0 != 0) goto L5
            goto L17
        L5:
            boolean r1 = r2.zzc
            if (r1 == 0) goto L17
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.zzf
            android.view.ViewTreeObserver r0 = zzf(r0)
            if (r0 == 0) goto L14
            r0.removeOnGlobalLayoutListener(r1)
        L14:
            r0 = 0
            r2.zzc = r0
        L17:
            return
    }

    public final void zza() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            r1.zzh()
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 1
            r1.zze = r0
            boolean r0 = r1.zzd
            if (r0 == 0) goto La
            r1.zzg()
        La:
            return
    }

    public final void zzc() {
            r1 = this;
            r0 = 1
            r1.zzd = r0
            boolean r0 = r1.zze
            if (r0 == 0) goto La
            r1.zzg()
        La:
            return
    }

    public final void zzd() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            r1.zzh()
            return
    }

    public final void zze(android.app.Activity r1) {
            r0 = this;
            r0.zzb = r1
            return
    }
}
