package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class LiteSdkInfo extends com.google.android.gms.ads.internal.client.zzcv {
    public LiteSdkInfo(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public com.google.android.gms.internal.ads.zzbpl getAdapterCreator() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbph r0 = new com.google.android.gms.internal.ads.zzbph
            r0.<init>()
            return r0
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public com.google.android.gms.ads.internal.client.zzfc getLiteSdkVersion() {
            r4 = this;
            com.google.android.gms.ads.internal.client.zzfc r0 = new com.google.android.gms.ads.internal.client.zzfc
            r1 = 243220703(0xe7f40df, float:3.1462411E-30)
            r2 = 243220000(0xe7f3e20, float:3.1461089E-30)
            java.lang.String r3 = "23.4.0"
            r0.<init>(r1, r2, r3)
            return r0
    }
}
