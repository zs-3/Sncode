package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzcgw extends com.google.android.gms.internal.ads.zzcfw {
    public zzcgw(com.google.android.gms.internal.ads.zzcfo r8, com.google.android.gms.internal.ads.zzbbu r9, boolean r10, com.google.android.gms.internal.ads.zzefj r11) {
            r7 = this;
            com.google.android.gms.internal.ads.zzbso r4 = new com.google.android.gms.internal.ads.zzbso
            android.content.Context r0 = r8.zzE()
            com.google.android.gms.internal.ads.zzbcd r1 = new com.google.android.gms.internal.ads.zzbcd
            android.content.Context r2 = r8.getContext()
            r1.<init>(r2)
            r4.<init>(r8, r0, r1)
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected final android.webkit.WebResourceResponse zzT(android.webkit.WebView r3, java.lang.String r4, java.util.Map r5) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.zzcfo
            if (r0 != 0) goto Lb
            java.lang.String r3 = "Tried to intercept request from a WebView that wasn't an AdWebView."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            r3 = 0
            return r3
        Lb:
            com.google.android.gms.internal.ads.zzcfo r3 = (com.google.android.gms.internal.ads.zzcfo) r3
            com.google.android.gms.internal.ads.zzbyk r0 = r2.zza
            if (r0 == 0) goto L15
            r1 = 1
            r0.zzd(r4, r5, r1)
        L15:
            java.io.File r0 = new java.io.File
            com.google.android.gms.internal.ads.zzftl.zza()
            com.google.android.gms.internal.ads.zzftr r1 = com.google.android.gms.internal.ads.zzftr.zza
            r0.<init>(r4)
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "mraid.js"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L36
            if (r5 != 0) goto L31
            java.util.Map r5 = java.util.Collections.emptyMap()
        L31:
            android.webkit.WebResourceResponse r3 = super.zzc(r4, r5)
            return r3
        L36:
            com.google.android.gms.internal.ads.zzchg r4 = r3.zzN()
            if (r4 == 0) goto L43
            com.google.android.gms.internal.ads.zzchg r4 = r3.zzN()
            r4.zzF()
        L43:
            com.google.android.gms.internal.ads.zzchi r4 = r3.zzO()
            boolean r4 = r4.zzi()
            if (r4 == 0) goto L5a
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzU
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L79
        L5a:
            boolean r4 = r3.zzaF()
            if (r4 == 0) goto L6d
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzT
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L79
        L6d:
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzS
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.String r4 = (java.lang.String) r4
        L79:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r5 = r3.getContext()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r3.zzn()
            java.lang.String r3 = r3.afmaVersion
            android.webkit.WebResourceResponse r3 = com.google.android.gms.ads.internal.util.zzt.zzx(r5, r3, r4)
            return r3
    }
}
