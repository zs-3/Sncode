package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzbsw extends com.google.android.gms.internal.ads.zzbhf {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsz zza;

    /* synthetic */ zzbsw(com.google.android.gms.internal.ads.zzbsz r1, com.google.android.gms.internal.ads.zzbsv r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbhg
    public final void zze(com.google.android.gms.internal.ads.zzbgw r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbsz r0 = r2.zza
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener r1 = com.google.android.gms.internal.ads.zzbsz.zzc(r0)
            if (r1 != 0) goto L9
            return
        L9:
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener r1 = com.google.android.gms.internal.ads.zzbsz.zzc(r0)
            com.google.android.gms.ads.nativead.NativeCustomFormatAd r3 = com.google.android.gms.internal.ads.zzbsz.zze(r0, r3)
            r1.onCustomClick(r3, r4)
            return
    }
}
