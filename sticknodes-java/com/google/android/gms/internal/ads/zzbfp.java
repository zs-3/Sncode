package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbfp extends com.google.android.gms.internal.ads.zzbgb {
    private final android.graphics.drawable.Drawable zza;
    private final android.net.Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbfp(android.graphics.drawable.Drawable r1, android.net.Uri r2, double r3, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            r0.zze = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final double zzb() {
            r2 = this;
            double r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final int zzc() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final int zzd() {
            r1 = this;
            int r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final android.net.Uri zze() throws android.os.RemoteException {
            r1 = this;
            android.net.Uri r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() throws android.os.RemoteException {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zza
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }
}
