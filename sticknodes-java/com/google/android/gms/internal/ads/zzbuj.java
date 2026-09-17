package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbuj {
    private final android.view.View zza;
    private final java.util.Map zzb;
    private final com.google.android.gms.internal.ads.zzbzl zzc;

    public zzbuj(com.google.android.gms.internal.ads.zzbui r4) {
            r3 = this;
            r3.<init>()
            android.view.View r0 = com.google.android.gms.internal.ads.zzbui.zza(r4)
            r3.zza = r0
            java.util.Map r1 = com.google.android.gms.internal.ads.zzbui.zzd(r4)
            r3.zzb = r1
            android.view.View r4 = com.google.android.gms.internal.ads.zzbui.zza(r4)
            android.content.Context r4 = r4.getContext()
            com.google.android.gms.internal.ads.zzbzl r4 = com.google.android.gms.internal.ads.zzbud.zza(r4)
            r3.zzc = r4
            if (r4 == 0) goto L44
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L26
            goto L44
        L26:
            com.google.android.gms.internal.ads.zzbuk r2 = new com.google.android.gms.internal.ads.zzbuk     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L3f
            android.os.IBinder r0 = r0.asBinder()     // Catch: android.os.RemoteException -> L3f
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L3f
            android.os.IBinder r1 = r1.asBinder()     // Catch: android.os.RemoteException -> L3f
            r2.<init>(r0, r1)     // Catch: android.os.RemoteException -> L3f
            r4.zzg(r2)     // Catch: android.os.RemoteException -> L3f
            return
        L3f:
            java.lang.String r4 = "Failed to call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
        L44:
            return
    }

    public final void zza(java.util.List r4) {
            r3 = this;
            if (r4 == 0) goto L32
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L32
        L9:
            com.google.android.gms.internal.ads.zzbzl r0 = r3.zzc
            if (r0 != 0) goto L12
            java.lang.String r0 = "Failed to get internal reporting info generator in recordClick."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
        L12:
            com.google.android.gms.internal.ads.zzbzl r0 = r3.zzc     // Catch: android.os.RemoteException -> L23
            android.view.View r1 = r3.zza     // Catch: android.os.RemoteException -> L23
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L23
            com.google.android.gms.internal.ads.zzbuh r2 = new com.google.android.gms.internal.ads.zzbuh     // Catch: android.os.RemoteException -> L23
            r2.<init>(r3, r4)     // Catch: android.os.RemoteException -> L23
            r0.zzh(r4, r1, r2)     // Catch: android.os.RemoteException -> L23
            return
        L23:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "RemoteException recording click: "
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return
        L32:
            java.lang.String r4 = "No click urls were passed to recordClick"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
    }

    public final void zzb(java.util.List r4) {
            r3 = this;
            if (r4 == 0) goto L31
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L31
        L9:
            com.google.android.gms.internal.ads.zzbzl r0 = r3.zzc
            if (r0 == 0) goto L2b
            android.view.View r1 = r3.zza     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbug r2 = new com.google.android.gms.internal.ads.zzbug     // Catch: android.os.RemoteException -> L1c
            r2.<init>(r3, r4)     // Catch: android.os.RemoteException -> L1c
            r0.zzi(r4, r1, r2)     // Catch: android.os.RemoteException -> L1c
            return
        L1c:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "RemoteException recording impression urls: "
            java.lang.String r4 = r0.concat(r4)
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r4)
            return
        L2b:
            java.lang.String r4 = "Failed to get internal reporting info generator from recordImpression."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L31:
            java.lang.String r4 = "No impression urls were passed to recordImpression"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
    }

    public final void zzc(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbzl r0 = r1.zzc
            if (r0 == 0) goto L12
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> Lc
            r0.zzk(r2)     // Catch: android.os.RemoteException -> Lc
            return
        Lc:
            java.lang.String r2 = "Failed to call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            return
        L12:
            java.lang.String r2 = "Failed to get internal reporting info generator."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r2)
            return
    }

    public final void zzd(android.net.Uri r5, com.google.android.gms.ads.query.UpdateClickUrlCallback r6) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbzl r0 = r4.zzc
            if (r0 != 0) goto L9
            java.lang.String r0 = "Failed to get internal reporting info generator."
            r6.onFailure(r0)
        L9:
            com.google.android.gms.internal.ads.zzbzl r0 = r4.zzc     // Catch: android.os.RemoteException -> L29
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.os.RemoteException -> L29
            r2 = 1
            android.net.Uri[] r2 = new android.net.Uri[r2]     // Catch: android.os.RemoteException -> L29
            r3 = 0
            r2[r3] = r5     // Catch: android.os.RemoteException -> L29
            java.util.List r5 = java.util.Arrays.asList(r2)     // Catch: android.os.RemoteException -> L29
            r1.<init>(r5)     // Catch: android.os.RemoteException -> L29
            android.view.View r5 = r4.zza     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: android.os.RemoteException -> L29
            com.google.android.gms.internal.ads.zzbuf r2 = new com.google.android.gms.internal.ads.zzbuf     // Catch: android.os.RemoteException -> L29
            r2.<init>(r4, r6)     // Catch: android.os.RemoteException -> L29
            r0.zzl(r1, r5, r2)     // Catch: android.os.RemoteException -> L29
            return
        L29:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "Internal error: "
            java.lang.String r5 = r0.concat(r5)
            r6.onFailure(r5)
            return
    }

    public final void zze(java.util.List r4, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbzl r0 = r3.zzc
            if (r0 != 0) goto L9
            java.lang.String r0 = "Failed to get internal reporting info generator."
            r5.onFailure(r0)
        L9:
            com.google.android.gms.internal.ads.zzbzl r0 = r3.zzc     // Catch: android.os.RemoteException -> L1a
            android.view.View r1 = r3.zza     // Catch: android.os.RemoteException -> L1a
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L1a
            com.google.android.gms.internal.ads.zzbue r2 = new com.google.android.gms.internal.ads.zzbue     // Catch: android.os.RemoteException -> L1a
            r2.<init>(r3, r5)     // Catch: android.os.RemoteException -> L1a
            r0.zzm(r4, r1, r2)     // Catch: android.os.RemoteException -> L1a
            return
        L1a:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "Internal error: "
            java.lang.String r4 = r0.concat(r4)
            r5.onFailure(r4)
            return
    }
}
