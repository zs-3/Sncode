package com.google.android.gms.ads.admanager;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends com.google.android.gms.ads.AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder extends com.google.android.gms.ads.AbstractAdRequestBuilder<com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCategoryExclusion(java.lang.String r2) {
                r1 = this;
                com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
                r0.zzn(r2)
                return r1
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder addCustomTargeting(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.addCustomTargeting(r1, r2)
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder addCustomTargeting(java.lang.String r1, java.util.List r2) {
                r0 = this;
                r0.addCustomTargeting(r1, r2)
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCustomTargeting(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
                r0.zzp(r2, r3)
                return r1
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCustomTargeting(java.lang.String r3, java.util.List<java.lang.String> r4) {
                r2 = this;
                if (r4 == 0) goto Ld
                com.google.android.gms.ads.internal.client.zzeh r0 = r2.zza
                java.lang.String r1 = ","
                java.lang.String r4 = android.text.TextUtils.join(r1, r4)
                r0.zzp(r3, r4)
            Ld:
                return r2
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest build() {
                r2 = this;
                com.google.android.gms.ads.admanager.AdManagerAdRequest r0 = new com.google.android.gms.ads.admanager.AdManagerAdRequest
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder self() {
                r0 = this;
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder self() {
                r0 = this;
                return r0
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder setPublisherProvidedId(java.lang.String r2) {
                r1 = this;
                com.google.android.gms.ads.internal.client.zzeh r0 = r1.zza
                r0.zzB(r2)
                return r1
        }
    }

    /* synthetic */ AdManagerAdRequest(com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder r1, com.google.android.gms.ads.admanager.zza r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.ads.AdRequest
    public android.os.Bundle getCustomTargeting() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r0 = r0.zze()
            return r0
    }

    public java.lang.String getPublisherProvidedId() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.lang.String r0 = r0.zzl()
            return r0
    }
}
