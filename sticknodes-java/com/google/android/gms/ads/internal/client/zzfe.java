package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfe implements com.google.android.gms.ads.MediaContent {
    private final com.google.android.gms.internal.ads.zzbfz zza;
    private final com.google.android.gms.ads.VideoController zzb;
    private final com.google.android.gms.internal.ads.zzbgw zzc;

    public zzfe(com.google.android.gms.internal.ads.zzbfz r2, com.google.android.gms.internal.ads.zzbgw r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.ads.VideoController r0 = new com.google.android.gms.ads.VideoController
            r0.<init>()
            r1.zzb = r0
            r1.zza = r2
            r1.zzc = r3
            return
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            float r0 = r0.zze()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            float r0 = r0.zzf()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            float r0 = r0.zzg()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final android.graphics.drawable.Drawable getMainImage() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> Lf
            com.google.android.gms.dynamic.IObjectWrapper r0 = r0.zzi()     // Catch: android.os.RemoteException -> Lf
            if (r0 == 0) goto L15
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)     // Catch: android.os.RemoteException -> Lf
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: android.os.RemoteException -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L15:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.ads.VideoController getVideoController() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.ads.internal.client.zzeb r0 = r0.zzh()     // Catch: android.os.RemoteException -> L14
            if (r0 == 0) goto L1a
            com.google.android.gms.ads.VideoController r0 = r2.zzb     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.internal.ads.zzbfz r1 = r2.zza     // Catch: android.os.RemoteException -> L14
            com.google.android.gms.ads.internal.client.zzeb r1 = r1.zzh()     // Catch: android.os.RemoteException -> L14
            r0.zzb(r1)     // Catch: android.os.RemoteException -> L14
            goto L1a
        L14:
            r0 = move-exception
            java.lang.String r1 = "Exception occurred while getting video controller"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        L1a:
            com.google.android.gms.ads.VideoController r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzl()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r1.zza     // Catch: android.os.RemoteException -> La
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> La
            r0.zzj(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final com.google.android.gms.internal.ads.zzbgw zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgw r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r2.zza     // Catch: android.os.RemoteException -> L7
            boolean r0 = r0.zzk()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            r0 = 0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbfz zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbfz r0 = r1.zza
            return r0
    }
}
