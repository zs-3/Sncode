package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzctz implements com.google.android.gms.ads.internal.overlay.zzr {
    private final com.google.android.gms.internal.ads.zzczh zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;

    public zzctz(com.google.android.gms.internal.ads.zzczh r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.zzb = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            r2.zzc = r0
            r2.zza = r3
            return
    }

    private final void zzh() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzc
            r1 = 1
            r0.set(r1)
            com.google.android.gms.internal.ads.zzczh r0 = r2.zza
            r0.zza()
        L13:
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdH() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdk() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
            r0 = this;
            r0.zzh()
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r1 = this;
            com.google.android.gms.internal.ads.zzczh r0 = r1.zza
            r0.zzc()
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.zzb
            r0 = 1
            r2.set(r0)
            r1.zzh()
            return
    }

    public final boolean zzg() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.zzb
            boolean r0 = r0.get()
            return r0
    }
}
