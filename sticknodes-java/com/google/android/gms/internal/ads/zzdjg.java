package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdjg implements com.google.android.gms.internal.ads.zzbjw {
    private final java.lang.ref.WeakReference zza;

    /* synthetic */ zzdjg(com.google.android.gms.internal.ads.zzdjl r1, com.google.android.gms.internal.ads.zzdjf r2) {
            r0 = this;
            r0.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(java.lang.Object r3, java.util.Map r4) {
            r2 = this;
            java.lang.ref.WeakReference r3 = r2.zza
            java.lang.Object r3 = r3.get()
            com.google.android.gms.internal.ads.zzdjl r3 = (com.google.android.gms.internal.ads.zzdjl) r3
            if (r3 != 0) goto Lb
            goto L50
        Lb:
            java.lang.String r0 = "eventName"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "_ac"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzcxy r0 = com.google.android.gms.internal.ads.zzdjl.zzb(r3)
            r0.onAdClicked()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkr
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            com.google.android.gms.internal.ads.zzdfy r0 = com.google.android.gms.internal.ads.zzdjl.zzd(r3)
            r0.zzdG()
            java.lang.String r0 = "sccg"
            java.lang.Object r4 = r4.get(r0)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L50
            com.google.android.gms.internal.ads.zzdfy r3 = com.google.android.gms.internal.ads.zzdjl.zzd(r3)
            r3.zzdf()
        L50:
            return
    }
}
