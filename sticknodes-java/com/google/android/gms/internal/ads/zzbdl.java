package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbdl extends com.google.android.gms.internal.ads.zzbdm {
    private final com.google.android.gms.ads.internal.zzg zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public zzbdl(com.google.android.gms.ads.internal.zzg r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void zzd(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            com.google.android.gms.ads.internal.zzg r0 = r1.zza
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            r0.zza(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void zze() {
            r1 = this;
            com.google.android.gms.ads.internal.zzg r0 = r1.zza
            r0.zzb()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void zzf() {
            r1 = this;
            com.google.android.gms.ads.internal.zzg r0 = r1.zza
            r0.zzc()
            return
    }
}
