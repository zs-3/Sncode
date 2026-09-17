package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdlo implements com.google.android.gms.internal.ads.zzbfq {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdml zza;
    final /* synthetic */ android.view.ViewGroup zzb;

    zzdlo(com.google.android.gms.internal.ads.zzdml r1, android.view.ViewGroup r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final org.json.JSONObject zza() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdml r0 = r1.zza
            org.json.JSONObject r0 = r0.zzo()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final org.json.JSONObject zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdml r0 = r1.zza
            org.json.JSONObject r0 = r0.zzp()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzc() {
            r5 = this;
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzdll.zza
            com.google.android.gms.internal.ads.zzdml r1 = r5.zza
            java.util.Map r1 = r1.zzm()
            if (r1 != 0) goto Lb
            goto L27
        Lb:
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L27
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r1.get(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L10
            com.google.android.gms.internal.ads.zzdml r0 = r5.zza
            android.view.ViewGroup r1 = r5.zzb
            r0.onClick(r1)
        L27:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzd(android.view.MotionEvent r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzdml r0 = r2.zza
            r1 = 0
            r0.onTouch(r1, r3)
            return
    }
}
