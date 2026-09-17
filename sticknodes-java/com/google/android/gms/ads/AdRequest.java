package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class AdRequest {
    public static final java.lang.String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final com.google.android.gms.ads.internal.client.zzei zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static class Builder extends com.google.android.gms.ads.AbstractAdRequestBuilder<com.google.android.gms.ads.AdRequest.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.ads.AdRequest build() {
                r1 = this;
                com.google.android.gms.ads.AdRequest r0 = new com.google.android.gms.ads.AdRequest
                r0.<init>(r1)
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder self() {
                r1 = this;
                com.google.android.gms.ads.AdRequest$Builder r0 = r1.self()
                return r0
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.AdRequest.Builder self() {
                r0 = this;
                return r0
        }
    }

    protected AdRequest(com.google.android.gms.ads.AbstractAdRequestBuilder r3) {
            r2 = this;
            r2.<init>()
            com.google.android.gms.ads.internal.client.zzei r0 = new com.google.android.gms.ads.internal.client.zzei
            com.google.android.gms.ads.internal.client.zzeh r3 = r3.zza
            r1 = 0
            r0.<init>(r3, r1)
            r2.zza = r0
            return
    }

    public java.lang.String getAdString() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.lang.String r0 = r0.zzj()
            return r0
    }

    public java.lang.String getContentUrl() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.lang.String r0 = r0.zzk()
            return r0
    }

    @java.lang.Deprecated
    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r2 = r0.zzd(r2)
            return r2
    }

    public android.os.Bundle getCustomTargeting() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r0 = r0.zze()
            return r0
    }

    public java.util.Set<java.lang.String> getKeywords() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.util.Set r0 = r0.zzp()
            return r0
    }

    public java.util.List<java.lang.String> getNeighboringContentUrls() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.util.List r0 = r0.zzn()
            return r0
    }

    public <T extends com.google.android.gms.ads.mediation.MediationExtrasReceiver> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r2 = r0.zzf(r2)
            return r2
    }

    public java.lang.String getRequestAgent() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            java.lang.String r0 = r0.zzm()
            return r0
    }

    public boolean isTestDevice(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            boolean r2 = r0.zzs(r2)
            return r2
    }

    public final com.google.android.gms.ads.internal.client.zzei zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            return r0
    }
}
