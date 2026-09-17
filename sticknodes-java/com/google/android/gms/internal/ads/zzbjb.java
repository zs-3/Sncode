package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbjb implements com.google.android.gms.internal.ads.zzbjw {
    zzbjb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r2 = (com.google.android.gms.internal.ads.zzcfo) r2
            com.google.android.gms.internal.ads.zzbfq r3 = r2.zzK()
            java.lang.String r0 = "nativeAdViewSignalsReady"
            if (r3 == 0) goto L14
            org.json.JSONObject r3 = r3.zza()
            if (r3 == 0) goto L14
            r2.zze(r0, r3)
            return
        L14:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r2.zze(r0, r3)
            return
    }
}
