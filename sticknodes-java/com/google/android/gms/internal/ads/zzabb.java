package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzabb implements android.hardware.display.DisplayManager.DisplayListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzabd zza;
    private final android.hardware.display.DisplayManager zzb;

    public zzabb(com.google.android.gms.internal.ads.zzabd r1, android.hardware.display.DisplayManager r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    private final android.view.Display zzc() {
            r2 = this;
            android.hardware.display.DisplayManager r0 = r2.zzb
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            return r0
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r1) {
            r0 = this;
            return
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r2) {
            r1 = this;
            if (r2 != 0) goto Lb
            com.google.android.gms.internal.ads.zzabd r2 = r1.zza
            android.view.Display r0 = r1.zzc()
            com.google.android.gms.internal.ads.zzabd.zzb(r2, r0)
        Lb:
            return
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r1) {
            r0 = this;
            return
    }

    public final void zza() {
            r2 = this;
            android.hardware.display.DisplayManager r0 = r2.zzb
            r1 = 0
            android.os.Handler r1 = com.google.android.gms.internal.ads.zzeu.zzx(r1)
            r0.registerDisplayListener(r2, r1)
            com.google.android.gms.internal.ads.zzabd r0 = r2.zza
            android.view.Display r1 = r2.zzc()
            com.google.android.gms.internal.ads.zzabd.zzb(r0, r1)
            return
    }

    public final void zzb() {
            r1 = this;
            android.hardware.display.DisplayManager r0 = r1.zzb
            r0.unregisterDisplayListener(r1)
            return
    }
}
