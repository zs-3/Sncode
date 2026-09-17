package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzab {
    /* synthetic */ zzab(com.google.android.gms.ads.internal.util.zzaa r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public android.webkit.CookieManager zza(android.content.Context r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public android.webkit.WebResourceResponse zzb(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.util.Map r5, java.io.InputStream r6) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public com.google.android.gms.internal.ads.zzcfw zzc(com.google.android.gms.internal.ads.zzcfo r1, com.google.android.gms.internal.ads.zzbbu r2, boolean r3, com.google.android.gms.internal.ads.zzefj r4) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public boolean zzd(android.app.Activity r1, android.content.res.Configuration r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public android.content.Intent zzf(android.app.Activity r4) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.settings.APP_NOTIFICATION_SETTINGS"
            r0.setAction(r1)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r2 = "app_package"
            r0.putExtra(r2, r1)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            int r4 = r4.uid
            java.lang.String r1 = "app_uid"
            r0.putExtra(r1, r4)
            return r0
    }

    public com.google.android.gms.internal.ads.zzbcb.zzq zzg(android.content.Context r1, android.telephony.TelephonyManager r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbcb$zzq r1 = com.google.android.gms.internal.ads.zzbcb.zzq.zzc
            return r1
    }

    public void zzh(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return
    }

    public boolean zzi(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int zzj(android.media.AudioManager r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void zzk(android.app.Activity r1) {
            r0 = this;
            return
    }

    public int zzm(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            int r2 = r2.getNetworkType()
            return r2
    }
}
