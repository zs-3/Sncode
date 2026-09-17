package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdjx extends com.google.android.gms.internal.ads.zzbfy {
    private final com.google.android.gms.internal.ads.zzdkp zza;
    private com.google.android.gms.dynamic.IObjectWrapper zzb;

    public zzdjx(com.google.android.gms.internal.ads.zzdkp r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static float zzb(com.google.android.gms.dynamic.IObjectWrapper r2) {
            if (r2 != 0) goto L3
            goto L24
        L3:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r2 == 0) goto L24
            int r0 = r2.getIntrinsicWidth()
            r1 = -1
            if (r0 == r1) goto L24
            int r0 = r2.getIntrinsicHeight()
            if (r0 == r1) goto L24
            int r0 = r2.getIntrinsicWidth()
            float r0 = (float) r0
            int r2 = r2.getIntrinsicHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            return r0
        L24:
            r2 = 0
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zze() throws android.os.RemoteException {
            r4 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            float r0 = r0.zzb()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            float r0 = r0.zzb()
            return r0
        L12:
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            if (r0 == 0) goto L2c
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza     // Catch: android.os.RemoteException -> L25
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()     // Catch: android.os.RemoteException -> L25
            float r1 = r0.zze()     // Catch: android.os.RemoteException -> L25
            goto L66
        L25:
            r0 = move-exception
            java.lang.String r2 = "Remote exception getting video controller aspect ratio."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
            goto L66
        L2c:
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zzb
            if (r0 == 0) goto L35
            float r1 = zzb(r0)
            goto L66
        L35:
            com.google.android.gms.internal.ads.zzdkp r0 = r4.zza
            com.google.android.gms.internal.ads.zzbgc r0 = r0.zzm()
            if (r0 != 0) goto L3e
            goto L66
        L3e:
            int r2 = r0.zzd()
            r3 = -1
            if (r2 == r3) goto L57
            int r2 = r0.zzc()
            if (r2 == r3) goto L57
            int r2 = r0.zzd()
            float r2 = (float) r2
            int r3 = r0.zzc()
            float r3 = (float) r3
            float r2 = r2 / r3
            goto L58
        L57:
            r2 = 0
        L58:
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L65
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzf()
            float r0 = zzb(r0)
            return r0
        L65:
            r1 = r2
        L66:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zzf() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            float r0 = r0.zzf()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final float zzg() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            float r0 = r0.zzg()
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.dynamic.IObjectWrapper r0 = r1.zzb
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.internal.ads.zzbgc r0 = r0.zzm()
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final boolean zzk() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            boolean r0 = r0.zzaf()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final boolean zzl() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfz
    public final void zzm(com.google.android.gms.internal.ads.zzbhk r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.zzcgq
            if (r0 == 0) goto L15
            com.google.android.gms.internal.ads.zzdkp r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzj()
            com.google.android.gms.internal.ads.zzcgq r0 = (com.google.android.gms.internal.ads.zzcgq) r0
            r0.zzv(r2)
        L15:
            return
    }
}
