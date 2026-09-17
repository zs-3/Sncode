package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzeuj implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzgfz zza;
    private final android.view.ViewGroup zzb;
    private final android.content.Context zzc;
    private final java.util.Set zzd;

    public zzeuj(com.google.android.gms.internal.ads.zzgfz r1, android.view.ViewGroup r2, android.content.Context r3, java.util.Set r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r4
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 22
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzeui r0 = new com.google.android.gms.internal.ads.zzeui
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzgfz r1 = r2.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzb(r0)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeuk zzc() throws java.lang.Exception {
            r5 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfH
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            android.view.ViewGroup r0 = r5.zzb
            if (r0 == 0) goto L31
            java.util.Set r0 = r5.zzd
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L21
            goto L31
        L21:
            android.view.ViewGroup r0 = r5.zzb
            com.google.android.gms.internal.ads.zzeuk r1 = new com.google.android.gms.internal.ads.zzeuk
            boolean r0 = r0.isHardwareAccelerated()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r0)
            return r1
        L31:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfI
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L88
            java.util.Set r0 = r5.zzd
            java.lang.String r2 = "native"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L88
            android.content.Context r0 = r5.zzc
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L88
            com.google.android.gms.internal.ads.zzeuk r2 = new com.google.android.gms.internal.ads.zzeuk
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r3 = r0.getWindow()
            if (r3 == 0) goto L6c
            android.view.WindowManager$LayoutParams r3 = r3.getAttributes()
            int r3 = r3.flags
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L6c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L84
        L6c:
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            android.content.ComponentName r0 = r0.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            r4 = 0
            android.content.pm.ActivityInfo r0 = r3.getActivityInfo(r0, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            int r0 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L80
            r4 = 1
        L80:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L84
        L84:
            r2.<init>(r1)
            return r2
        L88:
            com.google.android.gms.internal.ads.zzeuk r0 = new com.google.android.gms.internal.ads.zzeuk
            r0.<init>(r1)
            return r0
    }
}
