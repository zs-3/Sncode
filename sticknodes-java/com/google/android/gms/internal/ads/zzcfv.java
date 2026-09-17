package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcfv implements com.google.android.gms.ads.internal.overlay.zzr {
    private final com.google.android.gms.internal.ads.zzcfo zza;
    private final com.google.android.gms.ads.internal.overlay.zzr zzb;

    public zzcfv(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.ads.internal.overlay.zzr r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
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
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzr r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.zzdq()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzr r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.zzdr()
        L7:
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zzaa()
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzr r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.zzdt()
        L7:
            return
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu(int r2) {
            r1 = this;
            com.google.android.gms.ads.internal.overlay.zzr r0 = r1.zzb
            if (r0 == 0) goto L7
            r0.zzdu(r2)
        L7:
            com.google.android.gms.internal.ads.zzcfo r2 = r1.zza
            r2.zzY()
            return
    }
}
