package com.google.android.gms.ads.query;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final com.google.android.gms.internal.ads.zzbuj zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class Builder {
        private final com.google.android.gms.internal.ads.zzbui zza;

        @com.google.android.gms.common.annotation.KeepForSdk
        public Builder(android.view.View r2) {
                r1 = this;
                r1.<init>()
                com.google.android.gms.internal.ads.zzbui r0 = new com.google.android.gms.internal.ads.zzbui
                r0.<init>()
                r1.zza = r0
                r0.zzb(r2)
                return
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbui zza(com.google.android.gms.ads.query.ReportingInfo.Builder r0) {
                com.google.android.gms.internal.ads.zzbui r0 = r0.zza
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.ads.query.ReportingInfo build() {
                r2 = this;
                com.google.android.gms.ads.query.ReportingInfo r0 = new com.google.android.gms.ads.query.ReportingInfo
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.ads.query.ReportingInfo.Builder setAssetViews(java.util.Map<java.lang.String, android.view.View> r2) {
                r1 = this;
                com.google.android.gms.internal.ads.zzbui r0 = r1.zza
                r0.zzc(r2)
                return r1
        }
    }

    /* synthetic */ ReportingInfo(com.google.android.gms.ads.query.ReportingInfo.Builder r1, com.google.android.gms.ads.query.zzb r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzbuj r2 = new com.google.android.gms.internal.ads.zzbuj
            com.google.android.gms.internal.ads.zzbui r1 = com.google.android.gms.ads.query.ReportingInfo.Builder.zza(r1)
            r2.<init>(r1)
            r0.zza = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void recordClick(java.util.List<android.net.Uri> r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuj r0 = r1.zza
            r0.zza(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void recordImpression(java.util.List<android.net.Uri> r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuj r0 = r1.zza
            r0.zzb(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void reportTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuj r0 = r1.zza
            r0.zzc(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void updateClickUrl(android.net.Uri r2, com.google.android.gms.ads.query.UpdateClickUrlCallback r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuj r0 = r1.zza
            r0.zzd(r2, r3)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void updateImpressionUrls(java.util.List<android.net.Uri> r2, com.google.android.gms.ads.query.UpdateImpressionUrlsCallback r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbuj r0 = r1.zza
            r0.zze(r2, r3)
            return
    }
}
