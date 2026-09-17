package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbij extends com.google.android.gms.internal.ads.zzbhm {
    private final com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener zza;

    public zzbij(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener zzc(com.google.android.gms.internal.ads.zzbij r0) {
            com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener r0 = r0.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zze(com.google.android.gms.ads.internal.client.zzby r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
            r3 = this;
            java.lang.String r0 = ""
            if (r4 == 0) goto L57
            if (r5 != 0) goto L7
            goto L57
        L7:
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.content.Context r5 = (android.content.Context) r5
            com.google.android.gms.ads.admanager.AdManagerAdView r1 = new com.google.android.gms.ads.admanager.AdManagerAdView
            r1.<init>(r5)
            r5 = 0
            com.google.android.gms.ads.internal.client.zzbl r2 = r4.zzi()     // Catch: android.os.RemoteException -> L2d
            boolean r2 = r2 instanceof com.google.android.gms.ads.internal.client.zzg     // Catch: android.os.RemoteException -> L2d
            if (r2 == 0) goto L31
            com.google.android.gms.ads.internal.client.zzbl r2 = r4.zzi()     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.ads.internal.client.zzg r2 = (com.google.android.gms.ads.internal.client.zzg) r2     // Catch: android.os.RemoteException -> L2d
            if (r2 == 0) goto L28
            com.google.android.gms.ads.AdListener r2 = r2.zzb()     // Catch: android.os.RemoteException -> L2d
            goto L29
        L28:
            r2 = r5
        L29:
            r1.setAdListener(r2)     // Catch: android.os.RemoteException -> L2d
            goto L31
        L2d:
            r2 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
        L31:
            com.google.android.gms.ads.internal.client.zzcm r2 = r4.zzj()     // Catch: android.os.RemoteException -> L49
            boolean r2 = r2 instanceof com.google.android.gms.internal.ads.zzazj     // Catch: android.os.RemoteException -> L49
            if (r2 == 0) goto L4d
            com.google.android.gms.ads.internal.client.zzcm r2 = r4.zzj()     // Catch: android.os.RemoteException -> L49
            com.google.android.gms.internal.ads.zzazj r2 = (com.google.android.gms.internal.ads.zzazj) r2     // Catch: android.os.RemoteException -> L49
            if (r2 == 0) goto L45
            com.google.android.gms.ads.admanager.AppEventListener r5 = r2.zzb()     // Catch: android.os.RemoteException -> L49
        L45:
            r1.setAppEventListener(r5)     // Catch: android.os.RemoteException -> L49
            goto L4d
        L49:
            r5 = move-exception
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)
        L4d:
            android.os.Handler r5 = com.google.android.gms.ads.internal.util.client.zzf.zza
            com.google.android.gms.internal.ads.zzbii r0 = new com.google.android.gms.internal.ads.zzbii
            r0.<init>(r3, r1, r4)
            r5.post(r0)
        L57:
            return
    }
}
