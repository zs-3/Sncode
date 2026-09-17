package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static final java.util.WeakHashMap zza = null;
    private com.google.android.gms.internal.ads.zzbgm zzb;
    private java.lang.ref.WeakReference zzc;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.android.gms.ads.nativead.NativeAdViewHolder.zza = r0
            return
    }

    public NativeAdViewHolder(android.view.View r3, java.util.Map<java.lang.String, android.view.View> r4, java.util.Map<java.lang.String, android.view.View> r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "ContainerView must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            boolean r0 = r3 instanceof com.google.android.gms.ads.nativead.NativeAdView
            if (r0 == 0) goto L12
            java.lang.String r3 = "The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            return
        L12:
            java.util.WeakHashMap r0 = com.google.android.gms.ads.nativead.NativeAdViewHolder.zza
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L20
            java.lang.String r3 = "The provided containerView is already in use with another NativeAdViewHolder."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r3)
            return
        L20:
            r0.put(r3, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.zzc = r0
            java.util.HashMap r4 = zza(r4)
            java.util.HashMap r5 = zza(r5)
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.internal.ads.zzbgm r3 = r0.zzk(r3, r4, r5)
            r2.zzb = r3
            return
    }

    private static final java.util.HashMap zza(java.util.Map r1) {
            if (r1 != 0) goto L8
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            return r0
    }

    public final void setClickConfirmingView(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbgm r0 = r1.zzb     // Catch: android.os.RemoteException -> La
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> La
            r0.zzb(r2)     // Catch: android.os.RemoteException -> La
            return
        La:
            r2 = move-exception
            java.lang.String r0 = "Unable to call setClickConfirmingView on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r2)
            return
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd r4) {
            r3 = this;
            java.lang.Object r4 = r4.zza()
            com.google.android.gms.dynamic.IObjectWrapper r4 = (com.google.android.gms.dynamic.IObjectWrapper) r4
            java.lang.ref.WeakReference r0 = r3.zzc
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L1a
            java.lang.String r4 = "NativeAdViewHolder.setNativeAd containerView doesn't exist, returning"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r4)
            return
        L1a:
            java.util.WeakHashMap r1 = com.google.android.gms.ads.nativead.NativeAdViewHolder.zza
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L25
            r1.put(r0, r3)
        L25:
            com.google.android.gms.internal.ads.zzbgm r0 = r3.zzb
            if (r0 == 0) goto L33
            r0.zzc(r4)     // Catch: android.os.RemoteException -> L2d
            return
        L2d:
            r4 = move-exception
            java.lang.String r0 = "Unable to call setNativeAd on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r4)
        L33:
            return
    }

    public void unregisterNativeAd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbgm r0 = r2.zzb
            if (r0 == 0) goto Le
            r0.zzd()     // Catch: android.os.RemoteException -> L8
            goto Le
        L8:
            r0 = move-exception
            java.lang.String r1 = "Unable to call unregisterNativeAd on delegate"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Le:
            java.lang.ref.WeakReference r0 = r2.zzc
            if (r0 == 0) goto L19
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L21
            java.util.WeakHashMap r1 = com.google.android.gms.ads.nativead.NativeAdViewHolder.zza
            r1.remove(r0)
        L21:
            return
    }
}
