package com.google.android.gms.ads.search;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class SearchAdRequest {
    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final java.lang.String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final com.google.android.gms.ads.internal.client.zzei zza;
    private final java.lang.String zzb;

    /* synthetic */ SearchAdRequest(com.google.android.gms.ads.search.zzb r1, com.google.android.gms.ads.search.zzc r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r2 = com.google.android.gms.ads.search.zzb.zzf(r1)
            r0.zzb = r2
            com.google.android.gms.ads.internal.client.zzei r2 = new com.google.android.gms.ads.internal.client.zzei
            com.google.android.gms.ads.internal.client.zzeh r1 = com.google.android.gms.ads.search.zzb.zza(r1)
            r2.<init>(r1, r0)
            r0.zza = r2
            return
    }

    @java.lang.Deprecated
    public int getAnchorTextColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBackgroundColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBackgroundGradientBottom() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBackgroundGradientTop() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBorderColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBorderThickness() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getBorderType() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getCallButtonColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getCustomChannels() {
            r1 = this;
            r0 = 0
            return r0
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r2 = r0.zzd(r2)
            return r2
    }

    @java.lang.Deprecated
    public int getDescriptionTextColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getFontFace() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getHeaderTextColor() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public int getHeaderTextSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.location.Location getLocation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public <T extends com.google.android.gms.ads.mediation.NetworkExtras> T getNetworkExtras(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            com.google.android.gms.ads.mediation.NetworkExtras r2 = r0.zzh(r2)
            return r2
    }

    public <T extends com.google.android.gms.ads.mediation.MediationAdapter> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            android.os.Bundle r2 = r0.zzf(r2)
            return r2
    }

    public java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public boolean isTestDevice(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            boolean r2 = r0.zzs(r2)
            return r2
    }

    final com.google.android.gms.ads.internal.client.zzei zza() {
            r1 = this;
            com.google.android.gms.ads.internal.client.zzei r0 = r1.zza
            return r0
    }
}
