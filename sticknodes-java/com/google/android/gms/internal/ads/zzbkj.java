package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbkj implements com.google.android.gms.internal.ads.zzbjw {
    private final com.google.android.gms.internal.ads.zzdxy zza;

    public zzbkj(com.google.android.gms.internal.ads.zzdxy r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r4, java.util.Map r5) {
            r3 = this;
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zziV
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L13
            goto L67
        L13:
            java.lang.String r4 = "action"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "adUnitId"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "redirectUrl"
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L67
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L67
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L67
            java.lang.String r2 = "format"
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = "load"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L5a
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L54
            goto L5a
        L54:
            com.google.android.gms.internal.ads.zzdxy r4 = r3.zza
            r4.zzh(r0, r5, r1)
            return
        L5a:
            java.lang.String r5 = "show"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L67
            com.google.android.gms.internal.ads.zzdxy r4 = r3.zza
            r4.zzi(r0, r1)
        L67:
            return
    }
}
