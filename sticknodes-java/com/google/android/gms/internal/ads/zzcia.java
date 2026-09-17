package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcia implements com.google.android.gms.internal.ads.zzhii {
    public zzcia(com.google.android.gms.internal.ads.zzchr r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ java.lang.Object zzb() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            r0.setPackage(r1)
            java.lang.String r1 = "https://play.google.com/d"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            return r0
    }
}
