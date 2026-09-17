package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhjc extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private final java.lang.ref.WeakReference zza;

    public zzhjc(com.google.android.gms.internal.ads.zzbds r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName r1, androidx.browser.customtabs.CustomTabsClient r2) {
            r0 = this;
            java.lang.ref.WeakReference r1 = r0.zza
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzbds r1 = (com.google.android.gms.internal.ads.zzbds) r1
            if (r1 == 0) goto Ld
            r1.zzc(r2)
        Ld:
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r1) {
            r0 = this;
            java.lang.ref.WeakReference r1 = r0.zza
            java.lang.Object r1 = r1.get()
            com.google.android.gms.internal.ads.zzbds r1 = (com.google.android.gms.internal.ads.zzbds) r1
            if (r1 == 0) goto Ld
            r1.zzd()
        Ld:
            return
    }
}
