package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzfpr {
    private final java.lang.String zza;
    private com.google.android.gms.internal.ads.zzfqt zzb;
    private long zzc;
    private int zzd;

    public zzfpr(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r1.zzb()
            r1.zza = r2
            com.google.android.gms.internal.ads.zzfqt r2 = new com.google.android.gms.internal.ads.zzfqt
            r0 = 0
            r2.<init>(r0)
            r1.zzb = r2
            return
    }

    public final android.webkit.WebView zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqt r0 = r1.zzb
            java.lang.Object r0 = r0.get()
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            return r0
    }

    public final void zzb() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            r2.zzc = r0
            r0 = 1
            r2.zzd = r0
            return
    }

    public void zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqt r0 = r1.zzb
            r0.clear()
            return
    }

    public final void zzd(java.lang.String r4, long r5) {
            r3 = this;
            long r0 = r3.zzc
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L1a
            int r5 = r3.zzd
            r6 = 3
            if (r5 == r6) goto L1a
            r3.zzd = r6
            com.google.android.gms.internal.ads.zzfpk r5 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r6 = r3.zza()
            java.lang.String r0 = r3.zza
            r5.zzg(r6, r0, r4)
        L1a:
            return
    }

    public final void zze() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r3.zza()
            java.lang.String r2 = r3.zza
            r0.zzc(r1, r2)
            return
    }

    public final void zzf(com.google.android.gms.internal.ads.zzfoj r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r3.zza()
            java.lang.String r2 = r3.zza
            org.json.JSONObject r4 = r4.zzb()
            r0.zzd(r1, r2, r4)
            return
    }

    public final void zzg(java.util.Date r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            long r1 = r4.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "timestamp"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzfpk r4 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r3.zza()
            r4.zzf(r1, r0)
            return
    }

    public final void zzh(java.lang.String r4, long r5) {
            r3 = this;
            long r0 = r3.zzc
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L16
            r5 = 2
            r3.zzd = r5
            com.google.android.gms.internal.ads.zzfpk r5 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r6 = r3.zza()
            java.lang.String r0 = r3.zza
            r5.zzg(r6, r0, r4)
        L16:
            return
    }

    public void zzi(com.google.android.gms.internal.ads.zzfom r2, com.google.android.gms.internal.ads.zzfok r3) {
            r1 = this;
            r0 = 0
            r1.zzj(r2, r3, r0)
            return
    }

    protected final void zzj(com.google.android.gms.internal.ads.zzfom r7, com.google.android.gms.internal.ads.zzfok r8, org.json.JSONObject r9) {
            r6 = this;
            java.lang.String r2 = r7.zzh()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r7 = "environment"
            java.lang.String r0 = "app"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r7, r0)
            com.google.android.gms.internal.ads.zzfol r7 = r8.zzd()
            java.lang.String r1 = "adSessionType"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r1, r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r4 = android.os.Build.MODEL
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "; "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            java.lang.String r4 = "deviceType"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r4, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r4 = "osVersion"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r4, r1)
            java.lang.String r1 = "os"
            java.lang.String r4 = "Android"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r1, r4)
            java.lang.String r1 = "deviceInfo"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r1, r7)
            com.google.android.gms.internal.ads.zzfoo r7 = com.google.android.gms.internal.ads.zzfpw.zza()
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "deviceCategory"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r1, r7)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.lang.String r1 = "clid"
            r7.put(r1)
            java.lang.String r1 = "vlid"
            r7.put(r1)
            java.lang.String r1 = "supports"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r1, r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            com.google.android.gms.internal.ads.zzfov r1 = r8.zze()
            java.lang.String r1 = r1.zzb()
            java.lang.String r4 = "partnerName"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r4, r1)
            com.google.android.gms.internal.ads.zzfov r1 = r8.zze()
            java.lang.String r1 = r1.zzc()
            java.lang.String r4 = "partnerVersion"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r4, r1)
            java.lang.String r1 = "omidNativeInfo"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r1, r7)
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r1 = "libraryVersion"
            java.lang.String r4 = "1.4.10-google_20240110"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r1, r4)
            com.google.android.gms.internal.ads.zzfpi r1 = com.google.android.gms.internal.ads.zzfpi.zzb()
            android.content.Context r1 = r1.zza()
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r4 = "appId"
            com.google.android.gms.internal.ads.zzfpx.zze(r7, r4, r1)
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r0, r7)
            java.lang.String r7 = r8.zzf()
            if (r7 == 0) goto Lca
            java.lang.String r7 = r8.zzf()
            java.lang.String r0 = "contentUrl"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r0, r7)
        Lca:
            java.lang.String r7 = r8.zzg()
            if (r7 == 0) goto Ld9
            java.lang.String r7 = r8.zzg()
            java.lang.String r0 = "customReferenceData"
            com.google.android.gms.internal.ads.zzfpx.zze(r3, r0, r7)
        Ld9:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.util.List r7 = r8.zzh()
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto Lf9
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r6.zza()
            r5 = r9
            r0.zzi(r1, r2, r3, r4, r5)
            return
        Lf9:
            java.lang.Object r7 = r7.next()
            com.google.android.gms.internal.ads.zzfow r7 = (com.google.android.gms.internal.ads.zzfow) r7
            r7 = 0
            throw r7
    }

    public final void zzk(boolean r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfqt r0 = r3.zzb
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1d
            r0 = 1
            if (r0 == r4) goto Le
            java.lang.String r4 = "backgrounded"
            goto L10
        Le:
            java.lang.String r4 = "foregrounded"
        L10:
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r3.zza()
            java.lang.String r2 = r3.zza
            r0.zzh(r1, r2, r4)
        L1d:
            return
    }

    public final void zzl(float r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfpk r0 = com.google.android.gms.internal.ads.zzfpk.zza()
            android.webkit.WebView r1 = r3.zza()
            java.lang.String r2 = r3.zza
            r0.zze(r1, r2, r4)
            return
    }

    final void zzm(android.webkit.WebView r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqt r0 = new com.google.android.gms.internal.ads.zzfqt
            r0.<init>(r2)
            r1.zzb = r0
            return
    }

    public void zzn() {
            r0 = this;
            return
    }
}
