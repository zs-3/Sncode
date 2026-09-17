package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfs extends com.google.android.gms.ads.internal.client.zzdn {
    private final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zza;

    public zzfs(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws android.os.RemoteException {
            r1 = this;
            com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener r0 = r1.zza
            if (r0 == 0) goto L7
            r0.onAdMetadataChanged()
        L7:
            return
    }
}
