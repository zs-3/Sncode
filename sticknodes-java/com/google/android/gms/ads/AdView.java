package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdView extends com.google.android.gms.ads.BaseAdView {
    public AdView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            java.lang.String r0 = "Context cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            return
    }

    public AdView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AdView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public final com.google.android.gms.ads.VideoController zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzel r0 = r1.zza
            com.google.android.gms.ads.VideoController r0 = r0.zzf()
            return r0
    }
}
