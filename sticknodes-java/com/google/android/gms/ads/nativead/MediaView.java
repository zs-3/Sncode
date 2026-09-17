package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class MediaView extends android.widget.FrameLayout {
    private com.google.android.gms.ads.MediaContent zza;
    private boolean zzb;
    private android.widget.ImageView.ScaleType zzc;
    private boolean zzd;
    private com.google.android.gms.ads.nativead.zzb zze;
    private com.google.android.gms.ads.nativead.zzc zzf;

    public MediaView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public MediaView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public MediaView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @android.annotation.TargetApi(21)
    public MediaView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public com.google.android.gms.ads.MediaContent getMediaContent() {
            r1 = this;
            com.google.android.gms.ads.MediaContent r0 = r1.zza
            return r0
    }

    public void setImageScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            r0 = 1
            r1.zzd = r0
            r1.zzc = r2
            com.google.android.gms.ads.nativead.zzc r0 = r1.zzf
            if (r0 == 0) goto Le
            com.google.android.gms.ads.nativead.NativeAdView r0 = r0.zza
            r0.zzc(r2)
        Le:
            return
    }

    public void setMediaContent(com.google.android.gms.ads.MediaContent r3) {
            r2 = this;
            r0 = 1
            r2.zzb = r0
            r2.zza = r3
            com.google.android.gms.ads.nativead.zzb r0 = r2.zze
            if (r0 == 0) goto Le
            com.google.android.gms.ads.nativead.NativeAdView r0 = r0.zza
            r0.zzb(r3)
        Le:
            if (r3 != 0) goto L11
            goto L39
        L11:
            com.google.android.gms.internal.ads.zzbgw r0 = r3.zza()     // Catch: android.os.RemoteException -> L3a
            if (r0 == 0) goto L39
            boolean r1 = UX.aTqO5.m0a()     // Catch: android.os.RemoteException -> L3a
            if (r1 == 0) goto L26
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3a
            boolean r3 = r0.zzs(r3)     // Catch: android.os.RemoteException -> L3a
            goto L34
        L26:
            boolean r3 = r3.zzb()     // Catch: android.os.RemoteException -> L3a
            if (r3 == 0) goto L36
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3a
            boolean r3 = r0.zzr(r3)     // Catch: android.os.RemoteException -> L3a
        L34:
            if (r3 != 0) goto L39
        L36:
            r2.removeAllViews()     // Catch: android.os.RemoteException -> L3a
        L39:
            return
        L3a:
            r3 = move-exception
            r2.removeAllViews()
            java.lang.String r0 = ""
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    protected final synchronized void zza(com.google.android.gms.ads.nativead.zzb r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zze = r2     // Catch: java.lang.Throwable -> L12
            boolean r0 = r1.zzb     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            com.google.android.gms.ads.MediaContent r0 = r1.zza     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.nativead.NativeAdView r2 = r2.zza     // Catch: java.lang.Throwable -> L12
            r2.zzb(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    protected final synchronized void zzb(com.google.android.gms.ads.nativead.zzc r2) {
            r1 = this;
            monitor-enter(r1)
            r1.zzf = r2     // Catch: java.lang.Throwable -> L12
            boolean r0 = r1.zzd     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            android.widget.ImageView$ScaleType r0 = r1.zzc     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.nativead.NativeAdView r2 = r2.zza     // Catch: java.lang.Throwable -> L12
            r2.zzc(r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
